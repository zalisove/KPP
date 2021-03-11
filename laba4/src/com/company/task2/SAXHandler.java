package com.company.task2;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class SAXHandler extends DefaultHandler {

    private Data tmpDate = new Data();

    private DataSheet dataSheet;

    public boolean isRegion = false;
    public boolean isArea = false;
    public boolean isLCoordinate = false;
    public boolean isWCoordinate = false;


    public SAXHandler(DataSheet dataSheet) {
        this.dataSheet = dataSheet;
    }

    public DataSheet getDataSheet() {
        return dataSheet;
    }

    public void setDataSheet(DataSheet dataSheet) {
        this.dataSheet = dataSheet;
    }

    @Override
    public void startDocument() throws SAXException {

        System.out.println("SAX Parser Without Validation");
        System.out.println("Start Document Processing");

        super.startDocument();

    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End Document Processing");

        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equals("regName")){
            isRegion = true;
        }else if (qName.equals("district")){
            isArea = true;
        }else if (qName.equals("COORD_L")){
            isLCoordinate = true;
        }else if (qName.equals("COORD_W")){
            isWCoordinate = true;
        }

        super.startElement(uri, localName, qName, attributes);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("regName")){
            isRegion = false;
        }else if (qName.equals("district")){
            isArea = false;
        }else if (qName.equals("COORD_L")){
            isLCoordinate = false;
        }else if (qName.equals("COORD_W")){
            isWCoordinate = false;
            dataSheet.addElement(dataSheet.newElement(tmpDate));
        }

        super.endElement(uri, localName, qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        String  string = new String(ch,start,length).trim();

        if (!string.isEmpty()){
            if (isRegion){
                tmpDate.setRegion(string);
            }else if (isArea){
                tmpDate.setArea(string);
            }else if (isLCoordinate){
                tmpDate.setLCoordinate(Double.parseDouble(string));
            }else if (isWCoordinate){
                tmpDate.setWCoordinate(Double.parseDouble(string));
            }
        }

        super.characters(ch, start, length);
    }
}
