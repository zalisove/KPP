/**
 * Sample Skeleton for 'Application.fxml' Controller Class
 */

import java.io.IOException;
import java.net.URL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javax.swing.*;

public class ApplicationController {

    @FXML
    private ComboBox<String> fromComboBox;

    private ObservableList<String> comboBoxList;

    @FXML
    private ComboBox<String> toComboBox;

    @FXML
    private TextField fromTextField;

    @FXML
    private TextField toTextField;

    private Currencies currencies;

    @FXML
    void initialize() throws IOException {
        currencies = Requests.getCurrencies(new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json"));
        comboBoxList = FXCollections.observableArrayList();
        refreshComboBoxes(currencies);
        fromComboBox.setItems(comboBoxList);
        toComboBox.setItems(comboBoxList);


        toComboBox.valueProperty().addListener( (observable, oldValue, newValue) -> convertCurrencies());
        fromTextField.textProperty().addListener((observable, oldValue, newValue) -> convertCurrencies());
        toTextField.textProperty().addListener((observable, oldValue, newValue) -> convertCurrencies());
    }


    public void refreshComboBoxes(Currencies currencies) {
        comboBoxList.clear();
        for (CurrencyItem item : currencies) {
            comboBoxList.add(item.getCc() + " (" + item.getTxt() + ")");
        }
        fromComboBox.setValue(comboBoxList.get(0));
        toComboBox.setValue(comboBoxList.get(0));
    }

    @FXML
    public void swapSelectedItemsInComboBox() {
        int selectedIndex = fromComboBox.getSelectionModel().getSelectedIndex();
        fromComboBox.getSelectionModel().select(toComboBox.getSelectionModel().getSelectedIndex());
        toComboBox.getSelectionModel().select(selectedIndex);
    }

    @FXML
    private void convertCurrencies() throws NumberFormatException {
        int indexFrom = fromComboBox.getSelectionModel().getSelectedIndex();
        int indexTo = toComboBox.getSelectionModel().getSelectedIndex();

        if (!fromTextField.getText().equals("")) {
            try {
                double convertibleValue = Double.parseDouble(fromTextField.getText());
                double convertedValue = currencies.convertCurrency(indexFrom, indexTo, convertibleValue);
                toTextField.setText(String.format("%.4f", convertedValue));
            } catch (NumberFormatException ignore) {
                toTextField.setText("");
            }

        } else {
            toTextField.setText("");
        }
    }

    @FXML
    private void refreshCurrenciesInfo() {
        try {
            URL jsonUrl = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
            currencies = Requests.getCurrencies(jsonUrl);
            currencies.sortByCC();
            refreshComboBoxes(currencies);
        } catch (IOException exception) {
            currencies = new Currencies();
            JOptionPane.showMessageDialog(null, "Cannot get currencies info...", "Request error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


