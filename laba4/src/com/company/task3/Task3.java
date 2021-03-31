package com.company.task3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        try {

            Schema schema = schemaFactory.newSchema(new File("file.xsd"));
            File xmlFile = new File("file.xml");
            dbf.setSchema(schema);
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);
            System.out.println("Successful!!!");
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
    
    public static  void step(Node start){
        System.out.println(start.getNodeName()+ " = "+ start.getNodeValue());
        if(start instanceof Element){
            NamedNodeMap startAttr = start.getAttributes();
            for (int i = 0; i < startAttr.getLength(); i++) {
                Node attr = startAttr.item(i);
                System.out.println("Attribute: " + attr.getNodeName() + " = " + attr.getNodeValue());
            }
            for(Node child = start.getFirstChild(); child!=null;child = child.getNextSibling() ){
                step(child);
            }
        }
    }

}
