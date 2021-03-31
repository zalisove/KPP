package com.company.mybeans.data_sheet_graph;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class DataSheetGraphBeanInfo extends SimpleBeanInfo {
    private PropertyDescriptor[] propertyDescriptors;

    public DataSheetGraphBeanInfo() {
        try {
            propertyDescriptors = new PropertyDescriptor[]
                    {
                            new PropertyDescriptor("color", DataSheetGraph.class),
                            new PropertyDescriptor("filled", DataSheetGraph.class),
                            new PropertyDescriptor("deltaX", DataSheetGraph.class),
                            new PropertyDescriptor("deltaY", DataSheetGraph.class)
                    };
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return propertyDescriptors;
    }

}