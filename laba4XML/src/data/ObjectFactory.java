
package data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DtpCardList_QNAME = new QName("", "dtpCardList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DtpCardListType }
     * 
     */
    public DtpCardListType createDtpCardListType() {
        return new DtpCardListType();
    }

    /**
     * Create an instance of {@link InfoDtpType }
     * 
     */
    public InfoDtpType createInfoDtpType() {
        return new InfoDtpType();
    }

    /**
     * Create an instance of {@link TsInfoType }
     * 
     */
    public TsInfoType createTsInfoType() {
        return new TsInfoType();
    }

    /**
     * Create an instance of {@link TabType }
     * 
     */
    public TabType createTabType() {
        return new TabType();
    }

    /**
     * Create an instance of {@link TsUchType }
     * 
     */
    public TsUchType createTsUchType() {
        return new TsUchType();
    }

    /**
     * Create an instance of {@link UchInfoType }
     * 
     */
    public UchInfoType createUchInfoType() {
        return new UchInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtpCardListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dtpCardList")
    public JAXBElement<DtpCardListType> createDtpCardList(DtpCardListType value) {
        return new JAXBElement<DtpCardListType>(_DtpCardList_QNAME, DtpCardListType.class, null, value);
    }

}
