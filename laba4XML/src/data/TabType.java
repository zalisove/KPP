
package data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tabType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tabType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DTPV">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u041d\u0430\u0435\u0437\u0434 \u043d\u0430 \u043f\u0435\u0448\u0435\u0445\u043e\u0434\u0430"/>
 *               &lt;enumeration value="\u041f\u0430\u0434\u0435\u043d\u0438\u0435 \u043f\u0430\u0441\u0441\u0430\u0436\u0438\u0440\u0430"/>
 *               &lt;enumeration value="\u0421\u0442\u043e\u043b\u043a\u043d\u043e\u0432\u0435\u043d\u0438\u0435"/>
 *               &lt;enumeration value="\u041d\u0430\u0435\u0437\u0434 \u043d\u0430 \u0441\u0442\u043e\u044f\u0449\u0435\u0435 \u0422\u0421"/>
 *               &lt;enumeration value="\u041d\u0430\u0435\u0437\u0434 \u043d\u0430 \u043f\u0440\u0435\u043f\u044f\u0442\u0441\u0442\u0432\u0438\u0435"/>
 *               &lt;enumeration value="\u0418\u043d\u043e\u0439 \u0432\u0438\u0434 \u0414\u0422\u041f"/>
 *               &lt;enumeration value="\u0421\u044a\u0435\u0437\u0434 \u0441 \u0434\u043e\u0440\u043e\u0433\u0438"/>
 *               &lt;enumeration value="\u041e\u043f\u0440\u043e\u043a\u0438\u0434\u044b\u0432\u0430\u043d\u0438\u0435"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="infoDtp" type="{}infoDtpType"/>
 *         &lt;element name="KTS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KUCH">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kartId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RAN">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="rowNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tabType", propOrder = {
    "dtpv",
    "date",
    "district",
    "infoDtp",
    "kts",
    "kuch",
    "kartId",
    "pog",
    "ran",
    "rowNum",
    "time"
})
public class TabType {

    @XmlElement(name = "DTPV", required = true)
    protected String dtpv;
    @XmlElement(required = true)
    protected String date;
    @XmlElement(required = true)
    protected String district;
    @XmlElement(required = true)
    protected InfoDtpType infoDtp;
    @XmlElement(name = "KTS", required = true)
    protected String kts;
    @XmlElement(name = "KUCH", required = true)
    protected String kuch;
    @XmlElement(required = true)
    protected String kartId;
    @XmlElement(name = "POG", required = true)
    protected String pog;
    @XmlElement(name = "RAN", required = true)
    protected String ran;
    @XmlElement(required = true)
    protected String rowNum;
    @XmlElement(required = true)
    protected String time;

    /**
     * Gets the value of the dtpv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTPV() {
        return dtpv;
    }

    /**
     * Sets the value of the dtpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTPV(String value) {
        this.dtpv = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the infoDtp property.
     * 
     * @return
     *     possible object is
     *     {@link InfoDtpType }
     *     
     */
    public InfoDtpType getInfoDtp() {
        return infoDtp;
    }

    /**
     * Sets the value of the infoDtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoDtpType }
     *     
     */
    public void setInfoDtp(InfoDtpType value) {
        this.infoDtp = value;
    }

    /**
     * Gets the value of the kts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKTS() {
        return kts;
    }

    /**
     * Sets the value of the kts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKTS(String value) {
        this.kts = value;
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
     * Gets the value of the kartId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKartId() {
        return kartId;
    }

    /**
     * Sets the value of the kartId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKartId(String value) {
        this.kartId = value;
    }

    /**
     * Gets the value of the pog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOG() {
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
    public void setPOG(String value) {
        this.pog = value;
    }

    /**
     * Gets the value of the ran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAN() {
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
    public void setRAN(String value) {
        this.ran = value;
    }

    /**
     * Gets the value of the rowNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowNum() {
        return rowNum;
    }

    /**
     * Sets the value of the rowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowNum(String value) {
        this.rowNum = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

}
