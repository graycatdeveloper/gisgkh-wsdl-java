
package ru.gosuslugi.dom.schema.integration.rvuo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий решение об определении управляющей организации в результатах экспорта
 * 
 * <p>Java class for DecisionExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DecisionExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
 *         <element name="DecisionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="PaymentSize">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AdditionalInformation" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="InfoStatus" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}InfoStatusExportType"/>
 *         <element name="PlacingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type" minOccurs="0"/>
 *         <element name="House" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}HouseType" maxOccurs="100"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionExportType", propOrder = {
    "decisionGUID",
    "orgGUID",
    "number",
    "decisionDate",
    "paymentSize",
    "additionalInformation",
    "infoStatus",
    "placingDate",
    "annulmentReason",
    "house"
})
public class DecisionExportType {

    /**
     * Уникальный идентификатор решения об определении управляющей организации
     * 
     */
    @XmlElement(name = "DecisionGUID", required = true)
    protected String decisionGUID;
    /**
     * Уникальный идентификатор управляющей организации
     * 
     */
    @XmlElement(name = "OrgGUID", required = true)
    protected String orgGUID;
    /**
     * Номер решения
     * 
     */
    @XmlElement(name = "Number", required = true)
    protected String number;
    /**
     * Дата решения
     * 
     */
    @XmlElement(name = "DecisionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar decisionDate;
    /**
     * Размер платы за содержание
     * 
     */
    @XmlElement(name = "PaymentSize", required = true)
    protected String paymentSize;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInformation")
    protected String additionalInformation;
    /**
     * Статус размещаемой информации. Возможные значения: Project - Проект; Placed - Размещена; Annulled - Аннулирована.
     * 
     */
    @XmlElement(name = "InfoStatus", required = true)
    @XmlSchemaType(name = "string")
    protected InfoStatusExportType infoStatus;
    /**
     * Дата и время размещения
     * 
     */
    @XmlElement(name = "PlacingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar placingDate;
    /**
     * Причина аннулирования
     * 
     */
    @XmlElement(name = "AnnulmentReason")
    protected String annulmentReason;
    /**
     * Дом в решении об определении управляющей организации
     * 
     */
    @XmlElement(name = "House", required = true)
    protected List<HouseType> house;

    /**
     * Уникальный идентификатор решения об определении управляющей организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionGUID() {
        return decisionGUID;
    }

    /**
     * Sets the value of the decisionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDecisionGUID()
     */
    public void setDecisionGUID(String value) {
        this.decisionGUID = value;
    }

    /**
     * Уникальный идентификатор управляющей организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgGUID() {
        return orgGUID;
    }

    /**
     * Sets the value of the orgGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgGUID()
     */
    public void setOrgGUID(String value) {
        this.orgGUID = value;
    }

    /**
     * Номер решения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Дата решения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDecisionDate()
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * Размер платы за содержание
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSize() {
        return paymentSize;
    }

    /**
     * Sets the value of the paymentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentSize()
     */
    public void setPaymentSize(String value) {
        this.paymentSize = value;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalInformation()
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Статус размещаемой информации. Возможные значения: Project - Проект; Placed - Размещена; Annulled - Аннулирована.
     * 
     * @return
     *     possible object is
     *     {@link InfoStatusExportType }
     *     
     */
    public InfoStatusExportType getInfoStatus() {
        return infoStatus;
    }

    /**
     * Sets the value of the infoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoStatusExportType }
     *     
     * @see #getInfoStatus()
     */
    public void setInfoStatus(InfoStatusExportType value) {
        this.infoStatus = value;
    }

    /**
     * Дата и время размещения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlacingDate() {
        return placingDate;
    }

    /**
     * Sets the value of the placingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getPlacingDate()
     */
    public void setPlacingDate(XMLGregorianCalendar value) {
        this.placingDate = value;
    }

    /**
     * Причина аннулирования
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnulmentReason() {
        return annulmentReason;
    }

    /**
     * Sets the value of the annulmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnnulmentReason()
     */
    public void setAnnulmentReason(String value) {
        this.annulmentReason = value;
    }

    /**
     * Дом в решении об определении управляющей организации
     * 
     * Gets the value of the house property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the house property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHouse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the house property.
     */
    public List<HouseType> getHouse() {
        if (house == null) {
            house = new ArrayList<>();
        }
        return this.house;
    }

}
