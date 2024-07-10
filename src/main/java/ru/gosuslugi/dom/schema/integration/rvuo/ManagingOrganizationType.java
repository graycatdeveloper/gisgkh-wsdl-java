
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
 * Тип данных, описывающий управляющую организацию
 * 
 * <p>Java class for ManagingOrganizationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ManagingOrganizationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMOType" maxOccurs="100"/>
 *         <element name="BaseForInclude">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="ProtocolNumber" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
 *                   <element name="ProtocolDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="IncludeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="SerialNumber">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         <minInclusive value="1"/>
 *                         <maxInclusive value="999"/>
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
 *         <element name="InfoStatus" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}InfoStatusType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagingOrganizationType", propOrder = {
    "oktmo",
    "baseForInclude",
    "exclusionInfo",
    "additionalInformation",
    "infoStatus"
})
public class ManagingOrganizationType {

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
    protected ManagingOrganizationType.BaseForInclude baseForInclude;
    /**
     * Информация об исключении
     * 
     */
    @XmlElement(name = "ExclusionInfo")
    protected ManagingOrganizationType.ExclusionInfo exclusionInfo;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInformation")
    protected String additionalInformation;
    /**
     * Статус размещаемой информации. Возможные значения: Project - Проект; Placed - Размещена.
     * 
     */
    @XmlElement(name = "InfoStatus", required = true)
    @XmlSchemaType(name = "string")
    protected InfoStatusType infoStatus;

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
     *     {@link ManagingOrganizationType.BaseForInclude }
     *     
     */
    public ManagingOrganizationType.BaseForInclude getBaseForInclude() {
        return baseForInclude;
    }

    /**
     * Sets the value of the baseForInclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagingOrganizationType.BaseForInclude }
     *     
     * @see #getBaseForInclude()
     */
    public void setBaseForInclude(ManagingOrganizationType.BaseForInclude value) {
        this.baseForInclude = value;
    }

    /**
     * Информация об исключении
     * 
     * @return
     *     possible object is
     *     {@link ManagingOrganizationType.ExclusionInfo }
     *     
     */
    public ManagingOrganizationType.ExclusionInfo getExclusionInfo() {
        return exclusionInfo;
    }

    /**
     * Sets the value of the exclusionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagingOrganizationType.ExclusionInfo }
     *     
     * @see #getExclusionInfo()
     */
    public void setExclusionInfo(ManagingOrganizationType.ExclusionInfo value) {
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
     * Статус размещаемой информации. Возможные значения: Project - Проект; Placed - Размещена.
     * 
     * @return
     *     possible object is
     *     {@link InfoStatusType }
     *     
     */
    public InfoStatusType getInfoStatus() {
        return infoStatus;
    }

    /**
     * Sets the value of the infoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoStatusType }
     *     
     * @see #getInfoStatus()
     */
    public void setInfoStatus(InfoStatusType value) {
        this.infoStatus = value;
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
     *         <element name="ProtocolNumber" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
     *         <element name="ProtocolDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="IncludeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="SerialNumber">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               <minInclusive value="1"/>
     *               <maxInclusive value="999"/>
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
