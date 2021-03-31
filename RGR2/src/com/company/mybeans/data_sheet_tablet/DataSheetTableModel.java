package com.company.mybeans.data_sheet_tablet;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class DataSheetTableModel extends AbstractTableModel {

    private static final long serialVersionUID = 1L;

    private final int columnCount = 3;
    private int rowCount = 1;
    private DataSheet dataSheet = null;

    private final String[] columnNames = {"Date", "X Value", "Y Value"};

    public DataSheetTableModel(){
        dataSheet = new DataSheet();
        rowCount = dataSheet.size();
    }

    public DataSheet getDataSheet(){
        return dataSheet;
    }

    public void setDataSheet(DataSheet dataSheet){
        this.dataSheet = dataSheet;
        rowCount = this.dataSheet.size();
        fireDataSheetChange();
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex >= 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (dataSheet != null) {
            if (columnIndex == 0)
                return dataSheet.getDataItem(rowIndex).getDate();
            else if (columnIndex == 1)
                return dataSheet.getDataItem(rowIndex).getX();
            else if (columnIndex == 2)
                return dataSheet.getDataItem(rowIndex).getY();
        }
        return null;
    }


    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        try {
            double d;
            System.out.println(value);
            if (dataSheet != null) {
                if (columnIndex == 0) {
                    dataSheet.getDataItem(rowIndex).setDate((String) value);
                } else if (columnIndex == 1) {
                    d = Double.parseDouble((String) value);
                    dataSheet.getDataItem(rowIndex).setX(d);
                } else if (columnIndex == 2) {
                    d = Double.parseDouble((String) value);
                    dataSheet.getDataItem(rowIndex).setY(d);
                }
            }
            fireDataSheetChange();
        } catch (Exception ignored) {}
    }


    public  void setRowCount(int rowCount){
        if(rowCount > 0) this.rowCount = rowCount;
    }

    private ArrayList<DataSheetChangeListener> listenerList = new ArrayList<>();

    private DataSheetChangeEvent event = new DataSheetChangeEvent(this);

    public void addDataSheetChangeListener(DataSheetChangeListener l) {
        listenerList.add(l);
    }

    public void removeDataSheetChangeListener(DataSheetChangeListener l) {
        listenerList.remove(l);
    }

    protected void fireDataSheetChange() {
        for (DataSheetChangeListener dataSheetChangeListener : listenerList) dataSheetChangeListener.dataChanged(event);
    }

}
