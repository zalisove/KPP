package com.company.task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;




public class SAXHandler extends DefaultHandler {



    private int tabCount = 0;

    @Override
    public void startDocument() throws SAXException {

        System.out.println("SAX Parser Without Validation");
        System.out.println("Start Document Processing");

        super.startDocument();

    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End Document Processing");
        tabCount++;
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        tabCount++;
        for (int i = 0; i < tabCount; i++) {
            System.out.print("\t");
        }
        System.out.println("Start Element(" + qName + ") processing");

        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("\t" + attributes.getLocalName(i) + ": " + attributes.getValue(i));
        }


        super.startElement(uri, localName, qName, attributes);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        for (int i = 0; i < tabCount; i++) {
            System.out.print("\t");
        }
        tabCount--;
        System.out.println("End Element(" + qName + ") processing");



        super.endElement(uri, localName, qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        String  string = new String(ch,start,length).trim();

        if (!string.isEmpty()){
            for (int i = 0; i < tabCount; i++) {
                System.out.print("\t");
            }
            System.out.println("\tValue : " + string);
        }

        super.characters(ch, start, length);
    }
}
