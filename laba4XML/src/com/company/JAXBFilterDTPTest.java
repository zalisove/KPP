package com.company;

import data.DtpCardListType;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBException;


class JAXBFilterDTPTest {

    @Test
    void unmarshalDataXMLs_NOT_NULL() throws JAXBException {
        JAXBFilterDTP jaxbFilterDTP = new JAXBFilterDTP("data","jaxb");
        DtpCardListType dtpCardListType = jaxbFilterDTP.unmarshalDataXMLs("src/data/xml_data/data1.xml");
        Assertions.assertNotNull(dtpCardListType);
    }

    @Test
    void unmarshalDataXMLs_CORECT_DATA() throws JAXBException {
        JAXBFilterDTP jaxbFilterDTP = new JAXBFilterDTP("data","jaxb");
        DtpCardListType dtpCardListType = jaxbFilterDTP.unmarshalDataXMLs("src/data/xml_data/data1.xml");
        Assertions.assertEquals(dtpCardListType.getRegName(),"Российская Федерация, г. Санкт-Петербург");
    }

    @Test
    void unmarshalOutXMLs() {

    }

    @Test
    void marshalDataToXML() {
    }

    @Test
    void marshalOutDataToXML() {
    }

    @Test
    void filterDTPDataFromAllData() {
    }

    @Test
    void getInputPath() {
    }

    @Test
    void getOutputPath() {
    }
}