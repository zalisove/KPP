package com.company;

import data.DtpCardListType;
import jaxb.DTPListType;
import javax.xml.bind.JAXBException;


public class Main {

    public static void main(String[] args) {
        try {
            JAXBFilterDTP jaxbFilterDTP = new JAXBFilterDTP("data","jaxb");
            DtpCardListType inputData = jaxbFilterDTP.unmarshalDataXMLs("src/data/xml_data/data1.xml");
            DTPListType outData = jaxbFilterDTP.filterDTPDataFromAllData(inputData);
            jaxbFilterDTP.marshalOutDataToXML("outData.xml",outData);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
