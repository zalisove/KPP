package com.company.task1;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task1 {

    public static void main(String[] args) throws SAXException {

        SAXParserFactory factory = SAXParserFactory.newInstance();

        try {
            SAXParser parser = factory.newSAXParser();
            DefaultHandler handler = new SAXHandler();
            InputStream stream = new FileInputStream("èáaG«t¬¿ äÆÅ (Å¿GÑa).xml");

            parser.parse(stream,handler);
            

        } catch (ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }


    }
}
