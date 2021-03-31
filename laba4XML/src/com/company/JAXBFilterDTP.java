package com.company;

import data.DtpCardListType;
import data.TabType;
import jaxb.DTPListType;
import jaxb.DTPType;
import javax.xml.bind.*;
import java.io.File;

public class JAXBFilterDTP {
    private String inputPath;
    private String outputPath;
    private jaxb.ObjectFactory jaxbFactory;
    private data.ObjectFactory dataFactory;
    private JAXBContext jaxbContext;
    private JAXBContext dataContext;

    public JAXBFilterDTP(String inputPath, String outputPath) throws JAXBException {
        this.inputPath = inputPath;
        this.outputPath = outputPath;

        this.dataContext = JAXBContext.newInstance(inputPath);
        this.jaxbContext = JAXBContext.newInstance(outputPath);

        this.dataFactory = new data.ObjectFactory();
        this.jaxbFactory = new jaxb.ObjectFactory();
    }

    public DtpCardListType unmarshalDataXMLs(String filePath) throws JAXBException {
        Unmarshaller unmarshaller = dataContext.createUnmarshaller();

        Object tmp = unmarshaller.unmarshal(new File(filePath));
        if (tmp instanceof JAXBElement<?>) {
            JAXBElement<?> element = (JAXBElement<?>) tmp;
            if (element.getValue() instanceof  DtpCardListType) {
                return (DtpCardListType) element.getValue();
            }else System.out.println("is not DtpCardListType, check your filePath!!");
        }
        return null;
    }

    public DTPListType unmarshalOutXMLs(String filePath) throws JAXBException {
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Object tmp = unmarshaller.unmarshal(new File(filePath));
        if (tmp instanceof JAXBElement<?>) {
            JAXBElement<?> element = (JAXBElement<?>) tmp;
            if (element.getValue() instanceof  DTPListType) {
                return (DTPListType) element.getValue();
            }else System.out.println("is not DTPListType, check your filePath!!");
        }
        return new DTPListType();
    }

    public boolean marshalDataToXML(String fileName, DtpCardListType dtpCardListType) {
        try {
            Marshaller marshaller = dataContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(dataFactory.createDtpCardList(dtpCardListType),new File(fileName));
            return true;
        } catch (JAXBException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean marshalOutDataToXML(String fileName, DTPListType dtpListType) {
        try {
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(jaxbFactory.createDTPList(dtpListType),new File(fileName));
            return true;
        } catch (JAXBException e) {
            e.printStackTrace();
            return false;
        }
    }

    public DTPListType filterDTPDataFromAllData(DtpCardListType dtpCardListType){
        DTPListType rootElement = jaxbFactory.createDTPListType();
        String region;
        String area;
        String lCoordinate;
        String wCoordinate;

        region = dtpCardListType.getRegName();
        for (TabType tabType : dtpCardListType.getTab()) {
            area = tabType.getDistrict();
            lCoordinate = tabType.getInfoDtp().getCOORDL();
            wCoordinate = tabType.getInfoDtp().getCOORDW();
            rootElement.getDTP().add(initDTPType(region,area,lCoordinate,wCoordinate));
        }
        return rootElement;
    }

    private DTPType initDTPType(String region, String area, String lCoordinate, String wCoordinate){
        DTPType tmpDTPType = jaxbFactory.createDTPType();
        tmpDTPType.setArea(area);
        tmpDTPType.setLCoordinate(lCoordinate);
        tmpDTPType.setRegion(region);
        tmpDTPType.setWCoordinate(wCoordinate);
        return tmpDTPType;
    }

    public String getInputPath() {
        return inputPath;
    }

    public String getOutputPath() {
        return outputPath;
    }

}
