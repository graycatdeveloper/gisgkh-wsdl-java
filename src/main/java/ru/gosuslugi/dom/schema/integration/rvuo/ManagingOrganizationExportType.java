
package ru.gosuslugi.dom.schema.integration.rvuo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Тип данных, описывающий управляющую организацию в результатах экспорта
 * 
 * <p>Java class for ManagingOrganizationExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ManagingOrganizationExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMOType" maxOccurs="100"/>
 *         <element name="BaseForInclude">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="ProtocolNumber">
 *                     <simpleType>
 *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type">
 *                         <maxLength value="100"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="ProtocolDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="IncludeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="SerialNumber">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         <maxInclusive value="999"/>
 *                         <minInclusive value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ExclusionInfo" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Reason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
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
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagingOrganizationExportType", propOrder = {
    "orgGUID",
    "oktmo",
    "baseForInclude",
    "exclusionInfo",
    "additionalInformation",
    "infoStatus",
    "placingDate",
    "annulmentReason"
})
public class ManagingOrganizationExportType {

    /**
     * Уникальный идентификатор управляющей организации
     * 
     */
    @XmlElement(name = "OrgGUID", required = true)
    protected String orgGUID;
    /**
     * Код ОКТМО
     * 
     */
    @XmlElement(name = "OKTMO", required = true)
    protected List<String> oktmo;
    /**
     * Основание включения
     * 
     */
    @XmlElement(name = "BaseForInclude", required = true)
    protected ManagingOrganizationExportType.BaseForInclude baseForInclude;
    /**
     * Информация об исключении
     * 
     */
    @XmlElement(name = "ExclusionInfo")
    protected ManagingOrganizationExportType.ExclusionInfo exclusionInfo;
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
     * Код ОКТМО
     * 
     * Gets the value of the oktmo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oktmo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOKTMO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the oktmo property.
     */
    public List<String> getOKTMO() {
        if (oktmo == null) {
            oktmo = new ArrayList<>();
        }
        return this.oktmo;
    }

    /**
     * Основание включения
     * 
     * @return
     *     possible object is
     *     {@link ManagingOrganizationExportType.BaseForInclude }
     *     
     */
    public ManagingOrganizationExportType.BaseForInclude getBaseForInclude() {
        return baseForInclude;
    }

    /**
     * Sets the value of the baseForInclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagingOrganizationExportType.BaseForInclude }
     *     
     * @see #getBaseForInclude()
     */
    public void setBaseForInclude(ManagingOrganizationExportType.BaseForInclude value) {
        this.baseForInclude = value;
    }

    /**
     * Информация об исключении
     * 
     * @return
     *     possible object is
     *     {@link ManagingOrganizationExportType.ExclusionInfo }
     *     
     */
    public ManagingOrganizationExportType.ExclusionInfo getExclusionInfo() {
        return exclusionInfo;
    }

    /**
     * Sets the value of the exclusionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagingOrganizationExportType.ExclusionInfo }
     *     
     * @see #getExclusionInfo()
     */
    public void setExclusionInfo(ManagingOrganizationExportType.ExclusionInfo value) {
        this.exclusionInfo = value;
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="ProtocolNumber">
     *           <simpleType>
     *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type">
     *               <maxLength value="100"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="ProtocolDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="IncludeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="SerialNumber">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               <maxInclusive value="999"/>
     *               <minInclusive value="1"/>
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
    @XmlType(name = "", propOrder = {
        "type",
        "protocolNumber",
        "protocolDate",
        "includeDate",
        "serialNumber"
    })
    public static class BaseForInclude {

        /**
         * Тип основания. Ссылка на НСИ "Вид основания для включения в перечень УО" (реестровый номер 204)
         * 
         */
        @XmlElement(name = "Type", required = true)
        protected NsiRef type;
        /**
         * Номер заявления/протокола
         * 
         */
        @XmlElement(name = "ProtocolNumber", required = true)
        protected String protocolNumber;
        /**
         * Дата заявления/протокола
         * 
         */
        @XmlElement(name = "ProtocolDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar protocolDate;
        /**
         * Дата включения сведений
         * 
         */
        @XmlElement(name = "IncludeDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar includeDate;
        /**
         * Порядковый номер
         * 
         */
        @XmlElement(name = "SerialNumber")
        protected int serialNumber;

        /**
         * Тип основания. Ссылка на НСИ "Вид основания для включения в перечень УО" (реестровый номер 204)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getType()
         */
        public void setType(NsiRef value) {
            this.type = value;
        }

        /**
         * Номер заявления/протокола
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolNumber() {
            return protocolNumber;
        }

        /**
         * Sets the value of the protocolNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getProtocolNumber()
         */
        public void setProtocolNumber(String value) {
            this.protocolNumber = value;
        }

        /**
         * Дата заявления/протокола
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getProtocolDate() {
            return protocolDate;
        }

        /**
         * Sets the value of the protocolDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getProtocolDate()
         */
        public void setProtocolDate(XMLGregorianCalendar value) {
            this.protocolDate = value;
        }

        /**
         * Дата включения сведений
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getIncludeDate() {
            return includeDate;
        }

        /**
         * Sets the value of the includeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getIncludeDate()
         */
        public void setIncludeDate(XMLGregorianCalendar value) {
            this.includeDate = value;
        }

        /**
         * Порядковый номер
         * 
         */
        public int getSerialNumber() {
            return serialNumber;
        }

        /**
         * Sets the value of the serialNumber property.
         * 
         */
        public void setSerialNumber(int value) {
            this.serialNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Reason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reason",
        "date"
    })
    public static class ExclusionInfo {

        /**
         * Причина исключения. Ссылка на НСИ "Вид основания для исключения из перечня УО" (реестровый номер 205)
         * 
         */
        @XmlElement(name = "Reason", required = true)
        protected NsiRef reason;
        /**
         * Дата исключения
         * 
         */
        @XmlElement(name = "Date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;

        /**
         * Причина исключения. Ссылка на НСИ "Вид основания для исключения из перечня УО" (реестровый номер 205)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getReason()
         */
        public void setReason(NsiRef value) {
            this.reason = value;
        }

        /**
         * Дата исключения
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getDate()
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

    }

}
