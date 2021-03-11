package com.company.task2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DataSheet {
    private Document doc;

    public DataSheet(Document doc) {
        this.doc = doc;
    }

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    public int numData(){
        return doc.getDocumentElement().getElementsByTagName("DTP").getLength();
    }

    public Element newElement(String region, String area, double LCoordinate, double WCoordinate){
        Element element = doc.createElement("DTP");
        Element elementRegion = doc.createElement("region");
        Element elementArea = doc.createElement("area");
        Element elementLCoordinate = doc.createElement("LCoordinate");
        Element elementWCoordinate = doc.createElement("WCoordinate");

        elementRegion.appendChild(doc.createTextNode(region));
        elementArea.appendChild(doc.createTextNode(area));
        elementLCoordinate.appendChild(doc.createTextNode(String.valueOf(LCoordinate)));
        elementWCoordinate.appendChild(doc.createTextNode(String.valueOf(WCoordinate)));

        element.appendChild(elementRegion);
        element.appendChild(elementArea);
        element.appendChild(elementLCoordinate);
        element.appendChild(elementWCoordinate);

        return element;
    }

    public Element newElement(Data data){
        Element element = doc.createElement("DTP");
        Element elementRegion = doc.createElement("region");
        Element elementArea = doc.createElement("area");
        Element elementLCoordinate = doc.createElement("LCoordinate");
        Element elementWCoordinate = doc.createElement("WCoordinate");

        elementRegion.appendChild(doc.createTextNode(data.getRegion()));
        elementArea.appendChild(doc.createTextNode(data.getArea()));
        elementLCoordinate.appendChild(doc.createTextNode(String.valueOf( data.getLCoordinate())));
        elementWCoordinate.appendChild(doc.createTextNode(String.valueOf(data.getWCoordinate())));

        element.appendChild(elementRegion);
        element.appendChild(elementArea);
        element.appendChild(elementLCoordinate);
        element.appendChild(elementWCoordinate);

        return element;
    }

    public void addElement(Element element){
        this.doc.getDocumentElement().appendChild(element);
    }

}
