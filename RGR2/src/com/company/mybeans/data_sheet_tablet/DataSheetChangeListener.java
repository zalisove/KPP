package com.company.mybeans.data_sheet_tablet;

import java.util.EventListener;

public interface DataSheetChangeListener extends EventListener {
    public void dataChanged(DataSheetChangeEvent e);
}

