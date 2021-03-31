package com.company;

import com.company.mybeans.data_sheet_tablet.Data;
import com.company.mybeans.data_sheet_tablet.DataSheet;
import com.company.mybeans.data_sheet_tablet.DataSheetSaveToXML;
import com.company.mybeans.data_sheet_graph.DataSheetGraph;
import com.company.mybeans.data_sheet_tablet.DataSheetTablet;

import javax.swing.*;
import javax.xml.bind.JAXBException;
import java.awt.*;
import java.awt.event.*;

public class Application extends JFrame {

    private final JFileChooser fileChooser = new JFileChooser();
    private JPanel contentPane;
    private DataSheet dataSheet;
    private DataSheetGraph dataSheetGraph;
    private DataSheetTablet dataSheetTable;
    private JButton readButton;
    private JButton saveButton;
    private JButton clearButton;
    private JButton exitButton;

    public Application() {
        setContentPane(contentPane);
        dataSheet = new DataSheet();
        dataSheet.addDataItem(new Data());
        dataSheetGraph.setDataSheet(dataSheet);
        dataSheetTable.getTableModel().setDataSheet(dataSheet);
        fileChooser.setCurrentDirectory(new java.io.File("."));



        exitButton.addActionListener(e -> {
            dispose();
        });

        clearButton.addActionListener(e -> {
            dataSheet = new DataSheet();
            dataSheet.addDataItem(new Data());
            dataSheetTable.getTableModel().setDataSheet(dataSheet);
            dataSheetTable.revalidate();
            dataSheetGraph.setDataSheet(dataSheet);
        });

        saveButton.addActionListener(e -> {
            if (JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(null)) {
                String fileName = fileChooser.getSelectedFile().getPath();
                try {
                    DataSheetSaveToXML.marshalDataToXML(fileName,dataSheet);
                    JOptionPane.showMessageDialog(null,
                            "File " + fileName.trim() + " saved!", "Результаты сохранены",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (JAXBException jaxbException) {
                    JOptionPane.showMessageDialog(null,
                            "File " + fileName.trim() + "not saved, error!!", "Результаты не сохранены",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        readButton.addActionListener(e -> {
            if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(null)) {
                String fileName = fileChooser.getSelectedFile().getPath();
                try {
                    dataSheet = DataSheetSaveToXML.unmarshalOutXMLs(fileName);
                } catch (JAXBException jaxbException) {
                    jaxbException.printStackTrace();
                }
                dataSheetTable.getTableModel().setDataSheet(dataSheet);
                dataSheetTable.revalidate();
                dataSheetTable.revalidate();
                dataSheetGraph.setDataSheet(dataSheet);
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        dataSheetTable.getTableModel().addDataSheetChangeListener(e -> {
                    dataSheetGraph.revalidate();
                    dataSheetGraph.repaint();
                });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Application frame = new Application();
                frame.pack();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
