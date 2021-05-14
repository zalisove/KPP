import pupbic_interfase.Participant;
import server.RegisteredParticipant;
import server.RegisteredParticipateSaveToXml;

import javax.xml.bind.JAXBException;

public class Demo {

    public static void main(String[] args) throws JAXBException {
        RegisteredParticipant participant = new RegisteredParticipant();
        participant.addDRegisteredParticipantChangeListener(e->{
            System.out.println("Change");
        });
        participant.add(new Participant("Иван","Иванов","ФТФ","Название","www@sdsd.com"));
        participant.add(new Participant("Иван","Иванов","ФТФ","Название","www@sdsd.com"));
        participant.add(new Participant("Иван","Иванов","ФТФ","Название","www@sdsd.com"));

        RegisteredParticipateSaveToXml.marshalDataToXML("blablabla.xml",participant);
        System.out.println(RegisteredParticipateSaveToXml.unmarshalOutXMLs("blablabla.xml"));
    }
}
