package com.company.task2;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class Task2 {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();

        try {

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document doc = documentBuilder.newDocument();
            doc.appendChild(doc.createElement("DTPList"));

            SAXParser parser = factory.newSAXParser();

            DefaultHandler handler = new SAXHandler(new DataSheet(doc));

            File dir = new File(".");
            for (File f: Objects.requireNonNull(dir.listFiles())) {
                if(f.isFile()){
                    InputStream stream = new FileInputStream(f.getAbsolutePath());
                    parser.parse(stream,handler);
                }
            }



            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE,"yes");
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.setOutputProperty("http://xml.apache.org/xslt}indent-amount", "4");



            doc.setXmlStandalone(true);

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("file.xml"));
            transformer.transform(source,result);


        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
