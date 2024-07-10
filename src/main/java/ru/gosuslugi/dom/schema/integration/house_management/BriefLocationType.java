
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Краткая информация о расположении дома
 * 
 * <p>Java class for BriefLocationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BriefLocationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HCSHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="FIASHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="Address">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="2500"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AOGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="HOUSENUM" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="20"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="BUILDNUM" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="10"/>
 *               <minLength value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="STRUCNUM" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="10"/>
 *               <minLength value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ESTSTATUS">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               <enumeration value="0"/>
 *               <enumeration value="1"/>
 *               <enumeration value="2"/>
 *               <enumeration value="3"/>
 *               <enumeration value="4"/>
 *               <enumeration value="5"/>
 *               <enumeration value="6"/>
 *               <enumeration value="7"/>
 *               <enumeration value="8"/>
 *               <enumeration value="9"/>
 *               <enumeration value="10"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="STRSTATUS" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               <enumeration value="0"/>
 *               <enumeration value="1"/>
 *               <enumeration value="2"/>
 *               <enumeration value="3"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BriefLocationType", propOrder = {
    "hcsHouseGUID",
    "fiasHouseGUID",
    "address",
    "aoguid",
    "housenum",
    "buildnum",
    "strucnum",
    "eststatus",
    "strstatus"
})
public class BriefLocationType {

    /**
     * Уникальный идентификатор адреса дома, присвоенный ГИС ЖКХ
     * 
     */
    @XmlElement(name = "HCSHouseGUID", required = true)
    protected String hcsHouseGUID;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGUID")
    protected String fiasHouseGUID;
    /**
     * Неформализованное описание адреса
     * 
     */
    @XmlElement(name = "Address", required = true)
    protected String address;
    /**
     * Guid записи родительского объекта (улицы)
     * 
     */
    @XmlElement(name = "AOGUID", required = true)
    protected String aoguid;
    /**
     * Номер дома
     * 
     */
    @XmlElement(name = "HOUSENUM")
    protected String housenum;
    /**
     * Номер корпуса
     * 
     */
    @XmlElement(name = "BUILDNUM")
    protected String buildnum;
    /**
     * Номер строения
     * 
     */
    @XmlElement(name = "STRUCNUM")
    protected String strucnum;
    /**
     * Признак владения:
     *  0 – не определено;
     *  1 – владение;
     *  2 – дом;
     *  3 – домовладение;
     *  4 - участок;
     *  5 - здание;
     *  6 - шахта;
     *  7 - подвал;
     *  8 - котельная;
     *  9 - погреб;
     *  10 - объект незавершенного строительства.
     * 
     */
    @XmlElement(name = "ESTSTATUS")
    protected byte eststatus;
    /**
     * Признак строения:
     *  0 – не определено;
     *  1 – строение;
     *  2 – сооружение;
     *  3 – литер.
     * 
     */
    @XmlElement(name = "STRSTATUS")
    protected Byte strstatus;

    /**
     * Уникальный идентификатор адреса дома, присвоенный ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHCSHouseGUID() {
        return hcsHouseGUID;
    }

    /**
     * Sets the value of the hcsHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHCSHouseGUID()
     */
    public void setHCSHouseGUID(String value) {
        this.hcsHouseGUID = value;
    }

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGUID() {
        return fiasHouseGUID;
    }

    /**
     * Sets the value of the fiasHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGUID()
     */
    public void setFIASHouseGUID(String value) {
        this.fiasHouseGUID = value;
    }

    /**
     * Неформализованное описание адреса
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddress()
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Guid записи родительского объекта (улицы)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAOGUID() {
        return aoguid;
    }

    /**
     * Sets the value of the aoguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAOGUID()
     */
    public void setAOGUID(String value) {
        this.aoguid = value;
    }

    /**
     * Номер дома
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOUSENUM() {
        return housenum;
    }

    /**
     * Sets the value of the housenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHOUSENUM()
     */
    public void setHOUSENUM(String value) {
        this.housenum = value;
    }

    /**
     * Номер корпуса
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUILDNUM() {
        return buildnum;
    }

    /**
     * Sets the value of the buildnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBUILDNUM()
     */
    public void setBUILDNUM(String value) {
        this.buildnum = value;
    }

    /**
     * Номер строения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRUCNUM() {
        return strucnum;
    }

    /**
     * Sets the value of the strucnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSTRUCNUM()
     */
    public void setSTRUCNUM(String value) {
        this.strucnum = value;
    }

    /**
     * Признак владения:
     *  0 – не определено;
     *  1 – владение;
     *  2 – дом;
     *  3 – домовладение;
     *  4 - участок;
     *  5 - здание;
     *  6 - шахта;
     *  7 - подвал;
     *  8 - котельная;
     *  9 - погреб;
     *  10 - объект незавершенного строительства.
     * 
     */
    public byte getESTSTATUS() {
        return eststatus;
    }

    /**
     * Sets the value of the eststatus property.
     * 
     */
    public void setESTSTATUS(byte value) {
        this.eststatus = value;
    }

    /**
     * Признак строения:
     *  0 – не определено;
     *  1 – строение;
     *  2 – сооружение;
     *  3 – литер.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSTRSTATUS() {
        return strstatus;
    }

    /**
     * Sets the value of the strstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     * @see #getSTRSTATUS()
     */
    public void setSTRSTATUS(Byte value) {
        this.strstatus = value;
    }

}
