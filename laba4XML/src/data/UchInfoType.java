
package data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uchInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uchInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ALCO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="k_UCH">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u041f\u0435\u0448\u0435\u0445\u043e\u0434"/>
 *               &lt;enumeration value="\u041f\u0435\u0448\u0435\u0445\u043e\u0434, \u043f\u0435\u0440\u0435\u0434 \u0414\u0422\u041f \u043d\u0430\u0445\u043e\u0434\u0438\u0432\u0448\u0438\u0439\u0441\u044f \u0432 (\u043d\u0430) \u0422\u0421 \u0432 \u043a\u0430\u0447\u0435\u0441\u0442\u0432\u0435 \u0432\u043e\u0434\u0438\u0442\u0435\u043b\u044f \u0438\u043b\u0438 \u043f\u0435\u0448\u0435\u0445\u043e\u0434, \u043f\u0435\u0440\u0435\u0434 \u0414\u0422\u041f \u043d\u0430\u0445\u043e\u0434\u0438\u0432\u0448\u0438\u0439\u0441\u044f \u0432 (\u043d\u0430) \u0422\u0421 \u0432 \u043a\u0430\u0447\u0435\u0441\u0442\u0432\u0435 \u043f\u0430\u0441\u0441\u0430\u0436\u0438\u0440\u0430"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NPDD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u041d\u0435\u0442 \u043d\u0430\u0440\u0443\u0448\u0435\u043d\u0438\u0439"/>
 *               &lt;enumeration value="\u041f\u0435\u0440\u0435\u0445\u043e\u0434 \u0447\u0435\u0440\u0435\u0437 \u043f\u0440\u043e\u0435\u0437\u0436\u0443\u044e \u0447\u0430\u0441\u0442\u044c \u0432\u043d\u0435 \u043f\u0435\u0448\u0435\u0445\u043e\u0434\u043d\u043e\u0433\u043e \u043f\u0435\u0440\u0435\u0445\u043e\u0434\u0430 \u0432 \u0437\u043e\u043d\u0435 \u0435\u0433\u043e \u0432\u0438\u0434\u0438\u043c\u043e\u0441\u0442\u0438 \u043b\u0438\u0431\u043e \u043f\u0440\u0438 \u043d\u0430\u043b\u0438\u0447\u0438\u0438 \u0432 \u043d\u0435\u043f\u043e\u0441\u0440\u0435\u0434\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0439 \u0431\u043b\u0438\u0437\u043e\u0441\u0442\u0438 \u043f\u043e\u0434\u0437\u0435\u043c\u043d\u043e\u0433\u043e (\u043d\u0430\u0434\u0437\u0435\u043c\u043d\u043e\u0433\u043e) \u043f\u0435\u0448\u0435\u0445\u043e\u0434\u043d\u043e\u0433\u043e \u043f\u0435\u0440\u0435\u0445\u043e\u0434\u0430"/>
 *               &lt;enumeration value="\u041d\u0435\u043e\u0436\u0438\u0434\u0430\u043d\u043d\u044b\u0439 \u0432\u044b\u0445\u043e\u0434 \u0438\u0437-\u0437\u0430 \u0422\u0421"/>
 *               &lt;enumeration value="\u041f\u0435\u0440\u0435\u0445\u043e\u0434 \u043f\u0440\u043e\u0435\u0437\u0436\u0435\u0439 \u0447\u0430\u0441\u0442\u0438 \u0432 \u0437\u0430\u043f\u0440\u0435\u0449\u0451\u043d\u043d\u043e\u043c \u043c\u0435\u0441\u0442\u0435 (\u043e\u0431\u043e\u0440\u0443\u0434\u043e\u0432\u0430\u043d\u043d\u043e\u043c \u043f\u0435\u0448\u0435\u0445\u043e\u0434\u043d\u044b\u043c\u0438  \u043e\u0433\u0440\u0430\u0436\u0434\u0435\u043d\u0438\u044f\u043c\u0438)"/>
 *               &lt;enumeration value="\u041d\u0435\u043f\u043e\u0434\u0447\u0438\u043d\u0435\u043d\u0438\u0435 \u0441\u0438\u0433\u043d\u0430\u043b\u0430\u043c \u0440\u0435\u0433\u0443\u043b\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f"/>
 *               &lt;enumeration value="\u041f\u0435\u0440\u0435\u0445\u043e\u0434 \u0447\u0435\u0440\u0435\u0437 \u043f\u0440\u043e\u0435\u0437\u0436\u0443\u044e \u0447\u0430\u0441\u0442\u044c \u0432 \u043d\u0435\u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u043d\u043e\u043c \u043c\u0435\u0441\u0442\u0435 (\u043f\u0440\u0438 \u043d\u0430\u043b\u0438\u0447\u0438\u0438 \u0432 \u0437\u043e\u043d\u0435 \u0432\u0438\u0434\u0438\u043c\u043e\u0441\u0442\u0438 \u043f\u0435\u0440\u0435\u043a\u0440\u0451\u0441\u0442\u043a\u0430)"/>
 *               &lt;enumeration value="\u0414\u0432\u0438\u0436\u0435\u043d\u0438\u0435 \u0432\u0434\u043e\u043b\u044c \u043f\u0440\u043e\u0435\u0437\u0436\u0435\u0439 \u0447\u0430\u0441\u0442\u0438 \u043f\u0440\u0438 \u043d\u0430\u043b\u0438\u0447\u0438\u0438 \u0438 \u0443\u0434\u043e\u0432\u043b\u0435\u0442\u0432\u043e\u0440\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u043c \u0441\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u0438 \u0442\u0440\u043e\u0442\u0443\u0430\u0440\u0430"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="n_UCH">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POL">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u041c\u0443\u0436\u0441\u043a\u043e\u0439"/>
 *               &lt;enumeration value="\u0416\u0435\u043d\u0441\u043a\u0438\u0439"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOP_NPDD" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u041d\u0435\u0442 \u043d\u0430\u0440\u0443\u0448\u0435\u043d\u0438\u0439"/>
 *               &lt;enumeration value="\u041d\u0435\u043e\u0436\u0438\u0434\u0430\u043d\u043d\u044b\u0439 \u0432\u044b\u0445\u043e\u0434 \u0438\u0437-\u0437\u0430 \u0441\u0442\u043e\u044f\u0449\u0435\u0433\u043e \u0422\u0421"/>
 *               &lt;enumeration value="\u041f\u0435\u0448\u0435\u0445\u043e\u0434 \u0432 \u0441\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u0438 \u0430\u043b\u043a\u043e\u0433\u043e\u043b\u044c\u043d\u043e\u0433\u043e \u043e\u043f\u044c\u044f\u043d\u0435\u043d\u0438\u044f"/>
 *               &lt;enumeration value="\u041d\u0430\u0445\u043e\u0436\u0434\u0435\u043d\u0438\u0435 \u043d\u0430 \u043f\u0440\u043e\u0435\u0437\u0436\u0435\u0439 \u0447\u0430\u0441\u0442\u0438 \u0431\u0435\u0437 \u0446\u0435\u043b\u0438 \u0435\u0451 \u043f\u0435\u0440\u0435\u0445\u043e\u0434\u0430"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="s_SM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u041d\u0435\u0442 (\u043d\u0435 \u0441\u043a\u0440\u044b\u0432\u0430\u043b\u0441\u044f)"/>
 *               &lt;enumeration value="\u041d\u0435 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="s_T">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u0420\u0430\u043d\u0435\u043d\u044b\u0439, \u043d\u0430\u0445\u043e\u0434\u044f\u0449\u0438\u0439\u0441\u044f (\u043d\u0430\u0445\u043e\u0434\u0438\u0432\u0448\u0438\u0439\u0441\u044f) \u043d\u0430 \u0441\u0442\u0430\u0446\u0438\u043e\u043d\u0430\u0440\u043d\u043e\u043c \u043b\u0435\u0447\u0435\u043d\u0438\u0438"/>
 *               &lt;enumeration value="\u0420\u0430\u043d\u0435\u043d\u044b\u0439, \u043d\u0430\u0445\u043e\u0434\u044f\u0449\u0438\u0439\u0441\u044f (\u043d\u0430\u0445\u043e\u0434\u0438\u0432\u0448\u0438\u0439\u0441\u044f)  \u043d\u0430 \u0430\u043c\u0431\u0443\u043b\u0430\u0442\u043e\u0440\u043d\u043e\u043c \u043b\u0435\u0447\u0435\u043d\u0438\u0438, \u043b\u0438\u0431\u043e \u043a\u043e\u0442\u043e\u0440\u043e\u043c\u0443 \u043f\u043e \u0445\u0430\u0440\u0430\u043a\u0442\u0435\u0440\u0443 \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u043d\u044b\u0445 \u0442\u0440\u0430\u0432\u043c \u043e\u0431\u043e\u0437\u043d\u0430\u0447\u0435\u043d\u0430 \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e\u0441\u0442\u044c \u0430\u043c\u0431\u0443\u043b\u0430\u0442\u043e\u0440\u043d\u043e\u0433\u043e \u043b\u0435\u0447\u0435\u043d\u0438\u044f (\u0432\u043d\u0435 \u0437\u0430\u0432\u0438\u0441\u0438\u043c\u043e\u0441\u0442\u0438 \u043e\u0442 \u0435\u0433\u043e \u0444\u0430\u043a\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0433\u043e \u043f\u0440\u043e\u0445\u043e\u0436\u0434\u0435\u043d\u0438\u044f)"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="v_ST" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uchInfoType", propOrder = {
    "alco",
    "kuch",
    "npdd",
    "nuch",
    "pol",
    "sopnpdd",
    "ssm",
    "st",
    "vst"
})
public class UchInfoType {

    @XmlElement(name = "ALCO", required = true)
    protected String alco;
    @XmlElement(name = "k_UCH", required = true)
    protected String kuch;
    @XmlElement(name = "NPDD", required = true)
    protected String npdd;
    @XmlElement(name = "n_UCH", required = true)
    protected String nuch;
    @XmlElement(name = "POL", required = true)
    protected String pol;
    @XmlElement(name = "SOP_NPDD")
    protected List<String> sopnpdd;
    @XmlElement(name = "s_SM", required = true)
    protected String ssm;
    @XmlElement(name = "s_T", required = true)
    protected String st;
    @XmlElement(name = "v_ST", required = true)
    protected String vst;

    /**
     * Gets the value of the alco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALCO() {
        return alco;
    }

    /**
     * Sets the value of the alco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALCO(String value) {
        this.alco = value;
    }

    /**
     * Gets the value of the kuch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKUCH() {
        return kuch;
    }

    /**
     * Sets the value of the kuch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKUCH(String value) {
        this.kuch = value;
    }

    /**
     * Gets the value of the npdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPDD() {
        return npdd;
    }

    /**
     * Sets the value of the npdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPDD(String value) {
        this.npdd = value;
    }

    /**
     * Gets the value of the nuch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUCH() {
        return nuch;
    }

    /**
     * Sets the value of the nuch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUCH(String value) {
        this.nuch = value;
    }

    /**
     * Gets the value of the pol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOL() {
        return pol;
    }

    /**
     * Sets the value of the pol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOL(String value) {
        this.pol = value;
    }

    /**
     * Gets the value of the sopnpdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sopnpdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPNPDD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSOPNPDD() {
        if (sopnpdd == null) {
            sopnpdd = new ArrayList<String>();
        }
        return this.sopnpdd;
    }

    /**
     * Gets the value of the ssm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSM() {
        return ssm;
    }

    /**
     * Sets the value of the ssm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSM(String value) {
        this.ssm = value;
    }

    /**
     * Gets the value of the st property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getST() {
        return st;
    }

    /**
     * Sets the value of the st property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setST(String value) {
        this.st = value;
    }

    /**
     * Gets the value of the vst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVST() {
        return vst;
    }

    /**
     * Sets the value of the vst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVST(String value) {
        this.vst = value;
    }

}
