
package data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoDtpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoDtpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHOM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u0414\u0432\u0438\u0436\u0435\u043d\u0438\u0435 \u0447\u0430\u0441\u0442\u0438\u0447\u043d\u043e \u043f\u0435\u0440\u0435\u043a\u0440\u044b\u0442\u043e"/>
 *               &lt;enumeration value="\u0420\u0435\u0436\u0438\u043c \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u043d\u0435 \u0438\u0437\u043c\u0435\u043d\u044f\u043b\u0441\u044f"/>
 *               &lt;enumeration value="\u0414\u0432\u0438\u0436\u0435\u043d\u0438\u0435 \u043f\u043e\u043b\u043d\u043e\u0441\u0442\u044c\u044e \u043f\u0435\u0440\u0435\u043a\u0440\u044b\u0442\u043e"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COORD_L" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COORD_W" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="\u0417\u0430\u043f\u0430\u0434\u043d\u044b\u0439 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u043d\u043e\u0439 \u0434\u0438\u0430\u043c\u0435\u0442\u0440"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dor_k">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dor_z">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u041c\u0435\u0441\u0442\u043d\u043e\u0433\u043e \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f (\u0434\u043e\u0440\u043e\u0433\u0430 \u043c\u0435\u0441\u0442\u043d\u043e\u0433\u043e \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f, \u0432\u043a\u043b\u044e\u0447\u0430\u044f \u043e\u0442\u043d\u043e\u0441\u044f\u0449\u0438\u0435\u0441\u044f \u043a \u0441\u043e\u0431\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0441\u0442\u0438 \u043f\u043e\u0441\u0435\u043b\u0435\u043d\u0438\u0439, \u043c\u0443\u043d\u0438\u0446\u0438\u043f\u0430\u043b\u044c\u043d\u044b\u0445 \u0440\u0430\u0439\u043e\u043d\u043e\u0432, \u0433\u043e\u0440\u043e\u0434\u0441\u043a\u0438\u0445 \u043e\u043a\u0440\u0443\u0433\u043e\u0432)"/>
 *               &lt;enumeration value="\u041d\u0435 \u0443\u043a\u0430\u0437\u0430\u043d\u043e"/>
 *               &lt;enumeration value="\u0427\u0430\u0441\u0442\u043d\u0430\u044f (\u0434\u043e\u0440\u043e\u0433\u0430, \u043e\u0442\u043d\u043e\u0441\u044f\u0449\u0438\u0435\u0441\u044f \u043a \u0447\u0430\u0441\u0442\u043d\u043e\u0439 \u0438 \u0438\u043d\u044b\u043c \u0444\u043e\u0440\u043c\u0430\u043c \u0441\u043e\u0431\u0441\u0442\u0432\u0435\u043d\u043d\u043e\u0441\u0442\u0438)"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="factor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u0421\u0432\u0435\u0434\u0435\u043d\u0438\u044f \u043e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u044e\u0442"/>
 *               &lt;enumeration value="\u0421\u0443\u0436\u0435\u043d\u0438\u0435 \u043f\u0440\u043e\u0435\u0437\u0436\u0435\u0439 \u0447\u0430\u0441\u0442\u0438 \u0432\u0441\u043b\u0435\u0434\u0441\u0442\u0432\u0438\u0435 \u043f\u0440\u043e\u0432\u0435\u0434\u0435\u043d\u0438\u044f \u0440\u0430\u0431\u043e\u0442"/>
 *               &lt;enumeration value="\u0423\u0447\u0430\u0441\u0442\u043e\u043a, \u043e\u0431\u043e\u0440\u0443\u0434\u043e\u0432\u0430\u043d\u043d\u044b\u0439 \u0438\u0441\u043a\u0443\u0441\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u043c\u0438 \u043d\u0435\u0440\u043e\u0432\u043d\u043e\u0441\u0442\u044f\u043c\u0438 \u0438 \u043e\u0431\u043e\u0437\u043d\u0430\u0447\u0435\u043d\u043d\u044b\u0439 \u0441\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0443\u044e\u0449\u0438\u043c\u0438 \u0434\u043e\u0440\u043e\u0436\u043d\u044b\u043c\u0438 \u0437\u043d\u0430\u043a\u0430\u043c\u0438 \u0438 \u0440\u0430\u0437\u043c\u0435\u0442\u043a\u043e\u0439"/>
 *               &lt;enumeration value="\u0420\u0435\u0436\u0438\u043c \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u043d\u0430\u0440\u0443\u0448\u0435\u043d \u0432\u0441\u043b\u0435\u0434\u0441\u0442\u0432\u0438\u0435 \u0440\u0430\u043d\u0435\u0435 \u043f\u0440\u043e\u0438\u0437\u043e\u0448\u0435\u0434\u0448\u0435\u0433\u043e \u0414\u0422\u041f"/>
 *               &lt;enumeration value="\u0423\u0447\u0430\u0441\u0442\u043e\u043a, \u043e\u0431\u043e\u0440\u0443\u0434\u043e\u0432\u0430\u043d\u043d\u044b\u0439 \u0448\u0443\u043c\u043e\u0432\u044b\u043c\u0438 \u043f\u043e\u043b\u043e\u0441\u0430\u043c\u0438"/>
 *               &lt;enumeration value="\u0421\u0443\u0436\u0435\u043d\u0438\u0435 \u043f\u0440\u043e\u0435\u0437\u0436\u0435\u0439 \u0447\u0430\u0441\u0442\u0438 \u043f\u0440\u0438\u043f\u0430\u0440\u043a\u043e\u0432\u0430\u043d\u043d\u044b\u043c \u0442\u0440\u0430\u043d\u0441\u043f\u043e\u0440\u0442\u043e\u043c"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="house" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="k_ul">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u041c\u0430\u0433\u0438\u0441\u0442\u0440\u0430\u043b\u044c\u043d\u044b\u0435 \u0443\u043b\u0438\u0446\u044b \u0440\u0430\u0439\u043e\u043d\u043d\u043e\u0433\u043e \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f"/>
 *               &lt;enumeration value="\u041c\u0430\u0433\u0438\u0441\u0442\u0440\u0430\u043b\u044c\u043d\u044b\u0435 \u0443\u043b\u0438\u0446\u044b \u043e\u0431\u0449\u0435\u0433\u043e\u0440\u043e\u0434\u0441\u043a\u043e\u0433\u043e \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f"/>
 *               &lt;enumeration value="\u0423\u043b\u0438\u0446\u044b \u0438 \u0434\u043e\u0440\u043e\u0433\u0438 \u043c\u0435\u0441\u0442\u043d\u043e\u0433\u043e \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f \u0432 \u0436\u0438\u043b\u043e\u0439 \u0437\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0435"/>
 *               &lt;enumeration value="\u0418\u043d\u044b\u0435 \u043c\u0435\u0441\u0442\u0430"/>
 *               &lt;enumeration value="\u041c\u0430\u0433\u0438\u0441\u0442\u0440\u0430\u043b\u044c\u043d\u044b\u0435 \u0434\u043e\u0440\u043e\u0433\u0438"/>
 *               &lt;enumeration value="\u0423\u043b\u0438\u0446\u044b \u0438 \u0434\u043e\u0440\u043e\u0433\u0438 \u043c\u0435\u0441\u0442\u043d\u043e\u0433\u043e \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f \u043d\u0430\u0443\u0447\u043d\u043e-\u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0445 \u043f\u0440\u043e\u043c\u044b\u0448\u043b\u0435\u043d\u043d\u044b\u0445 \u0438 \u043a\u043e\u043c\u043c\u0443\u043d\u0430\u043b\u044c\u043d\u043e-\u0441\u043a\u043b\u0430\u0434\u0441\u043a\u0438\u0445 \u0440\u0430\u0439\u043e\u043d\u043e\u0432"/>
 *               &lt;enumeration value="\u0413\u043b\u0430\u0432\u043d\u044b\u0435 \u0443\u043b\u0438\u0446\u044b"/>
 *               &lt;enumeration value="\u041f\u0440\u043e\u0435\u0437\u0434\u044b"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="km">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="36"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="m">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="300"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ndu" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u041d\u0435 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u044b"/>
 *               &lt;enumeration value="\u041d\u0435\u0434\u043e\u0441\u0442\u0430\u0442\u043a\u0438 \u0437\u0438\u043c\u043d\u0435\u0433\u043e \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u043d\u0438\u044f"/>
 *               &lt;enumeration value="\u041e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0438\u0435 \u043f\u0435\u0448\u0435\u0445\u043e\u0434\u043d\u044b\u0445 \u043e\u0433\u0440\u0430\u0436\u0434\u0435\u043d\u0438\u0439 \u0432 \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u044b\u0445 \u043c\u0435\u0441\u0442\u0430\u0445"/>
 *               &lt;enumeration value="\u041e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0438\u0435, \u043f\u043b\u043e\u0445\u0430\u044f \u0440\u0430\u0437\u043b\u0438\u0447\u0438\u043c\u043e\u0441\u0442\u044c \u0433\u043e\u0440\u0438\u0437\u043e\u043d\u0442\u0430\u043b\u044c\u043d\u043e\u0439 \u0440\u0430\u0437\u043c\u0435\u0442\u043a\u0438 \u043f\u0440\u043e\u0435\u0437\u0436\u0435\u0439 \u0447\u0430\u0441\u0442\u0438"/>
 *               &lt;enumeration value="\u041e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0438\u0435 \u0434\u043e\u0440\u043e\u0436\u043d\u044b\u0445 \u0437\u043d\u0430\u043a\u043e\u0432 \u0432 \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u044b\u0445 \u043c\u0435\u0441\u0442\u0430\u0445"/>
 *               &lt;enumeration value="\u041d\u0435\u043f\u0440\u0430\u0432\u0438\u043b\u044c\u043d\u043e\u0435 \u043f\u0440\u0438\u043c\u0435\u043d\u0435\u043d\u0438\u0435, \u043f\u043b\u043e\u0445\u0430\u044f \u0432\u0438\u0434\u0438\u043c\u043e\u0441\u0442\u044c \u0434\u043e\u0440\u043e\u0436\u043d\u044b\u0445 \u0437\u043d\u0430\u043a\u043e\u0432"/>
 *               &lt;enumeration value="\u041d\u0438\u0437\u043a\u0438\u0435 \u0441\u0446\u0435\u043f\u043d\u044b\u0435 \u043a\u0430\u0447\u0435\u0441\u0442\u0432\u0430 \u043f\u043e\u043a\u0440\u044b\u0442\u0438\u044f"/>
 *               &lt;enumeration value="\u041d\u0435\u0440\u043e\u0432\u043d\u043e\u0435 \u043f\u043e\u043a\u0440\u044b\u0442\u0438\u0435"/>
 *               &lt;enumeration value="\u041f\u043b\u043e\u0445\u0430\u044f \u0432\u0438\u0434\u0438\u043c\u043e\u0441\u0442\u044c \u0441\u0432\u0435\u0442\u043e\u0444\u043e\u0440\u0430"/>
 *               &lt;enumeration value="\u041d\u0435\u0438\u0441\u043f\u0440\u0430\u0432\u043d\u043e\u0441\u0442\u044c \u0441\u0432\u0435\u0442\u043e\u0444\u043e\u0440\u0430"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBJ_DTP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="osv">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u0412 \u0442\u0435\u043c\u043d\u043e\u0435 \u0432\u0440\u0435\u043c\u044f \u0441\u0443\u0442\u043e\u043a, \u043e\u0441\u0432\u0435\u0449\u0435\u043d\u0438\u0435 \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u043e"/>
 *               &lt;enumeration value="\u0421\u0432\u0435\u0442\u043b\u043e\u0435 \u0432\u0440\u0435\u043c\u044f \u0441\u0443\u0442\u043e\u043a"/>
 *               &lt;enumeration value="\u0421\u0443\u043c\u0435\u0440\u043a\u0438"/>
 *               &lt;enumeration value="\u0412 \u0442\u0435\u043c\u043d\u043e\u0435 \u0432\u0440\u0435\u043c\u044f \u0441\u0443\u0442\u043e\u043a, \u043e\u0441\u0432\u0435\u0449\u0435\u043d\u0438\u0435 \u043e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u0435\u0442"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="s_dtp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="s_pch">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u041c\u043e\u043a\u0440\u043e\u0435"/>
 *               &lt;enumeration value="\u041e\u0431\u0440\u0430\u0431\u043e\u0442\u0430\u043d\u043d\u043e\u0435 \u043f\u0440\u043e\u0442\u0438\u0432\u043e\u0433\u043e\u043b\u043e\u043b\u0435\u0434\u043d\u044b\u043c\u0438 \u043c\u0430\u0442\u0435\u0440\u0438\u0430\u043b\u0430\u043c\u0438"/>
 *               &lt;enumeration value="\u0421\u043e \u0441\u043d\u0435\u0436\u043d\u044b\u043c \u043d\u0430\u043a\u0430\u0442\u043e\u043c"/>
 *               &lt;enumeration value="\u0417\u0430\u0441\u043d\u0435\u0436\u0435\u043d\u043d\u043e\u0435"/>
 *               &lt;enumeration value="\u0413\u043e\u043b\u043e\u043b\u0435\u0434\u0438\u0446\u0430"/>
 *               &lt;enumeration value="\u0417\u0430\u0433\u0440\u044f\u0437\u043d\u0435\u043d\u043d\u043e\u0435"/>
 *               &lt;enumeration value="\u0421\u0443\u0445\u043e\u0435"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sdor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spog" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="\u041f\u0430\u0441\u043c\u0443\u0440\u043d\u043e"/>
 *               &lt;enumeration value="\u0421\u043d\u0435\u0433\u043e\u043f\u0430\u0434"/>
 *               &lt;enumeration value="\u042f\u0441\u043d\u043e"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ts_info" type="{}ts_infoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uchInfo" type="{}uchInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoDtpType", propOrder = {
    "chom",
    "coordl",
    "coordw",
    "dor",
    "dorK",
    "dorZ",
    "factor",
    "house",
    "kUl",
    "km",
    "m",
    "np",
    "ndu",
    "objdtp",
    "osv",
    "sDtp",
    "sPch",
    "sdor",
    "spog",
    "street",
    "tsInfo",
    "uchInfo"
})
public class InfoDtpType {

    @XmlElement(name = "CHOM", required = true)
    protected String chom;
    @XmlElement(name = "COORD_L", required = true)
    protected String coordl;
    @XmlElement(name = "COORD_W", required = true)
    protected String coordw;
    @XmlElement(required = true)
    protected String dor;
    @XmlElement(name = "dor_k", required = true)
    protected String dorK;
    @XmlElement(name = "dor_z", required = true)
    protected String dorZ;
    @XmlElement(required = true)
    protected String factor;
    @XmlElement(required = true)
    protected String house;
    @XmlElement(name = "k_ul", required = true)
    protected String kUl;
    @XmlElement(required = true)
    protected String km;
    @XmlElement(required = true)
    protected String m;
    @XmlElement(name = "NP", required = true)
    protected String np;
    protected List<String> ndu;
    @XmlElement(name = "OBJ_DTP")
    protected List<String> objdtp;
    @XmlElement(required = true)
    protected String osv;
    @XmlElement(name = "s_dtp", required = true)
    protected String sDtp;
    @XmlElement(name = "s_pch", required = true)
    protected String sPch;
    protected List<String> sdor;
    protected List<String> spog;
    @XmlElement(required = true)
    protected String street;
    @XmlElement(name = "ts_info")
    protected List<TsInfoType> tsInfo;
    protected List<UchInfoType> uchInfo;

    /**
     * Gets the value of the chom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHOM() {
        return chom;
    }

    /**
     * Sets the value of the chom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHOM(String value) {
        this.chom = value;
    }

    /**
     * Gets the value of the coordl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOORDL() {
        return coordl;
    }

    /**
     * Sets the value of the coordl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOORDL(String value) {
        this.coordl = value;
    }

    /**
     * Gets the value of the coordw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOORDW() {
        return coordw;
    }

    /**
     * Sets the value of the coordw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOORDW(String value) {
        this.coordw = value;
    }

    /**
     * Gets the value of the dor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDor() {
        return dor;
    }

    /**
     * Sets the value of the dor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDor(String value) {
        this.dor = value;
    }

    /**
     * Gets the value of the dorK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDorK() {
        return dorK;
    }

    /**
     * Sets the value of the dorK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDorK(String value) {
        this.dorK = value;
    }

    /**
     * Gets the value of the dorZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDorZ() {
        return dorZ;
    }

    /**
     * Sets the value of the dorZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDorZ(String value) {
        this.dorZ = value;
    }

    /**
     * Gets the value of the factor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactor(String value) {
        this.factor = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the kUl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKUl() {
        return kUl;
    }

    /**
     * Sets the value of the kUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKUl(String value) {
        this.kUl = value;
    }

    /**
     * Gets the value of the km property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKm() {
        return km;
    }

    /**
     * Sets the value of the km property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKm(String value) {
        this.km = value;
    }

    /**
     * Gets the value of the m property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM() {
        return m;
    }

    /**
     * Sets the value of the m property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM(String value) {
        this.m = value;
    }

    /**
     * Gets the value of the np property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNP() {
        return np;
    }

    /**
     * Sets the value of the np property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNP(String value) {
        this.np = value;
    }

    /**
     * Gets the value of the ndu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ndu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNdu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNdu() {
        if (ndu == null) {
            ndu = new ArrayList<String>();
        }
        return this.ndu;
    }

    /**
     * Gets the value of the objdtp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objdtp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOBJDTP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOBJDTP() {
        if (objdtp == null) {
            objdtp = new ArrayList<String>();
        }
        return this.objdtp;
    }

    /**
     * Gets the value of the osv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsv() {
        return osv;
    }

    /**
     * Sets the value of the osv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsv(String value) {
        this.osv = value;
    }

    /**
     * Gets the value of the sDtp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDtp() {
        return sDtp;
    }

    /**
     * Sets the value of the sDtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDtp(String value) {
        this.sDtp = value;
    }

    /**
     * Gets the value of the sPch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPch() {
        return sPch;
    }

    /**
     * Sets the value of the sPch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPch(String value) {
        this.sPch = value;
    }

    /**
     * Gets the value of the sdor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSdor() {
        if (sdor == null) {
            sdor = new ArrayList<String>();
        }
        return this.sdor;
    }

    /**
     * Gets the value of the spog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpog() {
        if (spog == null) {
            spog = new ArrayList<String>();
        }
        return this.spog;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the tsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TsInfoType }
     * 
     * 
     */
    public List<TsInfoType> getTsInfo() {
        if (tsInfo == null) {
            tsInfo = new ArrayList<TsInfoType>();
        }
        return this.tsInfo;
    }

    /**
     * Gets the value of the uchInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uchInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUchInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UchInfoType }
     * 
     * 
     */
    public List<UchInfoType> getUchInfo() {
        if (uchInfo == null) {
            uchInfo = new ArrayList<UchInfoType>();
        }
        return this.uchInfo;
    }

}
