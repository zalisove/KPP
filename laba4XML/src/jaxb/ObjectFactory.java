
package jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _DTPList_QNAME = new QName("", "DTPList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTPListType }
     * 
     */
    public DTPListType createDTPListType() {
        return new DTPListType();
    }

    /**
     * Create an instance of {@link DTPType }
     * 
     */
    public DTPType createDTPType() {
        return new DTPType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTPListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DTPList")
    public JAXBElement<DTPListType> createDTPList(DTPListType value) {
        return new JAXBElement<DTPListType>(_DTPList_QNAME, DTPListType.class, null, value);
    }

}
