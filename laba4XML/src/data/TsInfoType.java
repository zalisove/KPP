
package data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ts_infoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ts_infoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="f_sob">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="\u0427\u0430\u0441\u0442\u043d\u0430\u044f \u0441\u043e\u0431\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0441\u0442\u044c"/>
 *               &lt;enumeration value="\u0418\u043d\u043e\u0435"/>
 *               &lt;enumeration value="\u0421\u043e\u0431\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0441\u0442\u044c \u0441\u0443\u0431\u044a\u0435\u043a\u0442\u043e\u0432 \u0420\u043e\u0441\u0441\u0438\u0439\u0441\u043a\u043e\u0439 \u0424\u0435\u0434\u0435\u0440\u0430\u0446\u0438\u0438"/>
 *               &lt;enumeration value="\u041a\u043e\u043b\u043b\u0435\u043a\u0442\u0438\u0432\u043d\u0430\u044f \u0441\u043e\u0431\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0441\u0442\u044c (\u043e\u0431\u0449\u0435\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0445 \u043e\u0431\u044a\u0435\u0434\u0438\u043d\u0435\u043d\u0438\u0439, \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0439, \u0442\u043e\u0432\u0430\u0440\u0438\u0449\u0435\u0441\u0442\u0432 \u0438 \u0434\u0440.)"/>
 *               &lt;enumeration value="\u0424\u0435\u0434\u0435\u0440\u0430\u043b\u044c\u043d\u0430\u044f \u0441\u043e\u0431\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0441\u0442\u044c"/>
 *               &lt;enumeration value="\u041c\u0443\u043d\u0438\u0446\u0438\u043f\u0430\u043b\u044c\u043d\u0430\u044f \u0441\u043e\u0431\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0441\u0442\u044c"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="g_v" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="m_pov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="m_ts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marka_ts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="n_ts">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="o_pf">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="\u0424\u0438\u0437\u0438\u0447\u0435\u0441\u043a\u0438\u0435 \u043b\u0438\u0446\u0430"/>
 *               &lt;enumeration value="\u042e\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043a\u0438\u0435 \u043b\u0438\u0446\u0430, \u044f\u0432\u043b\u044f\u044e\u0449\u0438\u0435\u0441\u044f \u043a\u043e\u043c\u043c\u0435\u0440\u0447\u0435\u0441\u043a\u0438\u043c\u0438 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f\u043c\u0438"/>
 *               &lt;enumeration value="\u042e\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043a\u0438\u0435 \u043b\u0438\u0446\u0430, \u044f\u0432\u043b\u044f\u044e\u0449\u0438\u0435\u0441\u044f \u043d\u0435\u043a\u043e\u043c\u043c\u0435\u0440\u0447\u0435\u0441\u043a\u0438\u043c\u0438 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f\u043c\u0438"/>
 *               &lt;enumeration value="\u041f\u0440\u043e\u0447\u0438\u0435 \u043d\u0435\u043a\u043e\u043c\u043c\u0435\u0440\u0447\u0435\u0441\u043a\u0438\u0435 \u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u0438"/>
 *               &lt;enumeration value="\u0418\u043d\u0434\u0438\u0432\u0438\u0434\u0443\u0430\u043b\u044c\u043d\u044b\u0435 \u043f\u0440\u0435\u0434\u043f\u0440\u0438\u043d\u0438\u043c\u0430\u0442\u0435\u043b\u0438 \u0431\u0435\u0437 \u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u044e\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043a\u043e\u0433\u043e \u043b\u0438\u0446\u0430"/>
 *               &lt;enumeration value="\u0418\u043d\u044b\u0435 \u043d\u0435\u044e\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043a\u0438\u0435 \u043b\u0438\u0446\u0430"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="r_rul">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="\u041f\u043e\u043b\u043d\u043e\u043f\u0440\u0438\u0432\u043e\u0434\u043d\u044b\u0435"/>
 *               &lt;enumeration value="\u041d\u0435 \u0437\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u043e"/>
 *               &lt;enumeration value="\u0421 \u043f\u0435\u0440\u0435\u0434\u043d\u0438\u043c \u043f\u0440\u0438\u0432\u043e\u0434\u043e\u043c"/>
 *               &lt;enumeration value="\u0421 \u0437\u0430\u0434\u043d\u0438\u043c \u043f\u0440\u0438\u0432\u043e\u0434\u043e\u043c"/>
 *               &lt;enumeration value="\u0418\u043d\u043e\u0435 \u0440\u0430\u0441\u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0435 \u0440\u0443\u043b\u0435\u0432\u043e\u0433\u043e \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="t_n">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u0422\u0435\u0445\u043d\u0438\u0447\u0435\u0441\u043a\u0438\u0435 \u043d\u0435\u0438\u0441\u043f\u0440\u0430\u0432\u043d\u043e\u0441\u0442\u0438 \u043e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u044e\u0442"/>
 *               &lt;enumeration value="\u041d\u0435\u0438\u0441\u043f\u0440\u0430\u0432\u043d\u043e\u0441\u0442\u044c \u0432\u043d\u0435\u0448\u043d\u0438\u0445 \u0441\u0432\u0435\u0442\u043e\u0432\u044b\u0445 \u043f\u0440\u0438\u0431\u043e\u0440\u043e\u0432"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="t_ts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ts_s">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u0421\u043a\u0440\u044b\u043b\u043e\u0441\u044c \u0441 \u043c\u0435\u0441\u0442\u0430 \u0414\u0422\u041f"/>
 *               &lt;enumeration value="\u041e\u0441\u0442\u0430\u043b\u043e\u0441\u044c \u043d\u0430 \u043c\u0435\u0441\u0442\u0435 \u0414\u0422\u041f"/>
 *               &lt;enumeration value="\u0421\u043a\u0440\u044b\u043b\u043e\u0441\u044c \u0438 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u043e \u0432 \u0441\u0440\u043e\u043a \u0441\u0432\u044b\u0448\u0435 10 \u0441\u0443\u0442\u043e\u043a"/>
 *               &lt;enumeration value="\u0421\u043a\u0440\u044b\u043b\u043e\u0441\u044c \u0438 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u043e \u0432 \u0441\u0440\u043e\u043a \u0434\u043e 1 \u0441\u0443\u0442\u043e\u043a"/>
 *               &lt;enumeration value="\u0421\u043a\u0440\u044b\u043b\u043e\u0441\u044c \u0438 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u043e \u0432 \u0441\u0440\u043e\u043a \u043e\u0442 3 \u0434\u043e 10 \u0441\u0443\u0442\u043e\u043a"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ts_uch" type="{}ts_uchType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ts_infoType", propOrder = {
    "color",
    "fSob",
    "gv",
    "mPov",
    "mTs",
    "markaTs",
    "nTs",
    "oPf",
    "rRul",
    "tn",
    "tTs",
    "tsS",
    "tsUch"
})
public class TsInfoType {

    @XmlElement(required = true)
    protected String color;
    @XmlElement(name = "f_sob", required = true)
    protected String fSob;
    @XmlElement(name = "g_v", required = true)
    protected String gv;
    @XmlElement(name = "m_pov", required = true)
    protected String mPov;
    @XmlElement(name = "m_ts", required = true)
    protected String mTs;
    @XmlElement(name = "marka_ts", required = true)
    protected String markaTs;
    @XmlElement(name = "n_ts", required = true)
    protected String nTs;
    @XmlElement(name = "o_pf", required = true)
    protected String oPf;
    @XmlElement(name = "r_rul", required = true)
    protected String rRul;
    @XmlElement(name = "t_n", required = true)
    protected String tn;
    @XmlElement(name = "t_ts", required = true)
    protected String tTs;
    @XmlElement(name = "ts_s", required = true)
    protected String tsS;
    @XmlElement(name = "ts_uch")
    protected List<TsUchType> tsUch;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the fSob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSob() {
        return fSob;
    }

    /**
     * Sets the value of the fSob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSob(String value) {
        this.fSob = value;
    }

    /**
     * Gets the value of the gv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGV() {
        return gv;
    }

    /**
     * Sets the value of the gv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGV(String value) {
        this.gv = value;
    }

    /**
     * Gets the value of the mPov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPov() {
        return mPov;
    }

    /**
     * Sets the value of the mPov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPov(String value) {
        this.mPov = value;
    }

    /**
     * Gets the value of the mTs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTs() {
        return mTs;
    }

    /**
     * Sets the value of the mTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTs(String value) {
        this.mTs = value;
    }

    /**
     * Gets the value of the markaTs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkaTs() {
        return markaTs;
    }

    /**
     * Sets the value of the markaTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkaTs(String value) {
        this.markaTs = value;
    }

    /**
     * Gets the value of the nTs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTs() {
        return nTs;
    }

    /**
     * Sets the value of the nTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTs(String value) {
        this.nTs = value;
    }

    /**
     * Gets the value of the oPf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPf() {
        return oPf;
    }

    /**
     * Sets the value of the oPf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPf(String value) {
        this.oPf = value;
    }

    /**
     * Gets the value of the rRul property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRRul() {
        return rRul;
    }

    /**
     * Sets the value of the rRul property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRRul(String value) {
        this.rRul = value;
    }

    /**
     * Gets the value of the tn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN() {
        return tn;
    }

    /**
     * Sets the value of the tn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN(String value) {
        this.tn = value;
    }

    /**
     * Gets the value of the tTs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTs() {
        return tTs;
    }

    /**
     * Sets the value of the tTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTs(String value) {
        this.tTs = value;
    }

    /**
     * Gets the value of the tsS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsS() {
        return tsS;
    }

    /**
     * Sets the value of the tsS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsS(String value) {
        this.tsS = value;
    }

    /**
     * Gets the value of the tsUch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tsUch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTsUch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TsUchType }
     * 
     * 
     */
    public List<TsUchType> getTsUch() {
        if (tsUch == null) {
            tsUch = new ArrayList<TsUchType>();
        }
        return this.tsUch;
    }

}
