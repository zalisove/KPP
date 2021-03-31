
package data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dtpCardListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dtpCardListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pog" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pokName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="posl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ran" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tab" type="{}tabType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtpCardListType", propOrder = {
    "countCard",
    "dateName",
    "pog",
    "pokName",
    "posl",
    "ran",
    "regName",
    "tab"
})
public class DtpCardListType {

    @XmlElement(required = true)
    protected String countCard;
    @XmlElement(required = true)
    protected String dateName;
    @XmlElement(required = true)
    protected String pog;
    @XmlElement(required = true)
    protected String pokName;
    @XmlElement(required = true)
    protected String posl;
    @XmlElement(required = true)
    protected String ran;
    @XmlElement(required = true)
    protected String regName;
    protected List<TabType> tab;

    /**
     * Gets the value of the countCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountCard() {
        return countCard;
    }

    /**
     * Sets the value of the countCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountCard(String value) {
        this.countCard = value;
    }

    /**
     * Gets the value of the dateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateName() {
        return dateName;
    }

    /**
     * Sets the value of the dateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateName(String value) {
        this.dateName = value;
    }

    /**
     * Gets the value of the pog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPog() {
        return pog;
    }

    /**
     * Sets the value of the pog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPog(String value) {
        this.pog = value;
    }

    /**
     * Gets the value of the pokName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPokName() {
        return pokName;
    }

    /**
     * Sets the value of the pokName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPokName(String value) {
        this.pokName = value;
    }

    /**
     * Gets the value of the posl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosl() {
        return posl;
    }

    /**
     * Sets the value of the posl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosl(String value) {
        this.posl = value;
    }

    /**
     * Gets the value of the ran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRan() {
        return ran;
    }

    /**
     * Sets the value of the ran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRan(String value) {
        this.ran = value;
    }

    /**
     * Gets the value of the regName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegName() {
        return regName;
    }

    /**
     * Sets the value of the regName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegName(String value) {
        this.regName = value;
    }

    /**
     * Gets the value of the tab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabType }
     * 
     * 
     */
    public List<TabType> getTab() {
        if (tab == null) {
            tab = new ArrayList<TabType>();
        }
        return this.tab;
    }

}
