
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="Criteria" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                   <choice>
 *                     <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <sequence>
 *                       <element name="ContractNumber" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                             <maxLength value="255"/>
 *                             <minLength value="1"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="SigningDateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                       <element name="SigningDateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                       <element name="Type" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             <length value="1"/>
 *                             <enumeration value="D"/>
 *                             <enumeration value="M"/>
 *                             <enumeration value="S"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                     </sequence>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.14.0.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "criteria"
})
@XmlRootElement(name = "exportBriefSocialHireContractRequest")
public class ExportBriefSocialHireContractRequest
    extends BaseType
{

    /**
     * поиск по
     * 
     */
    @XmlElement(name = "Criteria", required = true)
    protected List<ExportBriefSocialHireContractRequest.Criteria> criteria;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * поиск по
     * 
     * Gets the value of the criteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportBriefSocialHireContractRequest.Criteria }
     * </p>
     * 
     * 
     * @return
     *     The value of the criteria property.
     */
    public List<ExportBriefSocialHireContractRequest.Criteria> getCriteria() {
        if (criteria == null) {
            criteria = new ArrayList<>();
        }
        return this.criteria;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "11.14.0.2";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *         <choice>
     *           <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <sequence>
     *             <element name="ContractNumber" minOccurs="0">
     *               <simpleType>
     *                 <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
     *                   <maxLength value="255"/>
     *                   <minLength value="1"/>
     *                 </restriction>
     *               </simpleType>
     *             </element>
     *             <element name="SigningDateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *             <element name="SigningDateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *             <element name="Type" minOccurs="0">
     *               <simpleType>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                   <length value="1"/>
     *                   <enumeration value="D"/>
     *                   <enumeration value="M"/>
     *                   <enumeration value="S"/>
     *                 </restriction>
     *               </simpleType>
     *             </element>
     *           </sequence>
     *         </choice>
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
        "fiasHouseGuid",
        "contractRootGUID",
        "contractGUID",
        "contractNumber",
        "signingDateStart",
        "signingDateEnd",
        "type"
    })
    public static class Criteria {

        /**
         * Адрес дома
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         */
        @XmlElement(name = "FIASHouseGuid", required = true)
        protected String fiasHouseGuid;
        /**
         * Идентификатор договора социального наймам в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ContractRootGUID")
        protected String contractRootGUID;
        /**
         * Идентификатор версии договора социального наймам в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ContractGUID")
        protected String contractGUID;
        /**
         * Номер договора
         * 
         */
        @XmlElement(name = "ContractNumber")
        protected String contractNumber;
        /**
         * Дата заключения "С"
         * 
         */
        @XmlElement(name = "SigningDateStart")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signingDateStart;
        /**
         * Дата заключения "По"
         * 
         */
        @XmlElement(name = "SigningDateEnd")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signingDateEnd;
        /**
         * Тип:
         * (D)WELLING_APARTMENT - Договор социального найма жилого помещения
         * STATE_(M)UNICIPAL_FUND - Договор найма жилого помещения государственного или муниципального жилищного фонда
         * (S)OCIAL_FUND - Договор найма жилого помещения жилищного фонда социального использования
         * 
         */
        @XmlElement(name = "Type")
        protected String type;

        /**
         * Адрес дома
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIASHouseGuid() {
            return fiasHouseGuid;
        }

        /**
         * Sets the value of the fiasHouseGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFIASHouseGuid()
         */
        public void setFIASHouseGuid(String value) {
            this.fiasHouseGuid = value;
        }

        /**
         * Идентификатор договора социального наймам в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractRootGUID() {
            return contractRootGUID;
        }

        /**
         * Sets the value of the contractRootGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractRootGUID()
         */
        public void setContractRootGUID(String value) {
            this.contractRootGUID = value;
        }

        /**
         * Идентификатор версии договора социального наймам в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractGUID() {
            return contractGUID;
        }

        /**
         * Sets the value of the contractGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractGUID()
         */
        public void setContractGUID(String value) {
            this.contractGUID = value;
        }

        /**
         * Номер договора
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractNumber() {
            return contractNumber;
        }

        /**
         * Sets the value of the contractNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractNumber()
         */
        public void setContractNumber(String value) {
            this.contractNumber = value;
        }

        /**
         * Дата заключения "С"
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSigningDateStart() {
            return signingDateStart;
        }

        /**
         * Sets the value of the signingDateStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getSigningDateStart()
         */
        public void setSigningDateStart(XMLGregorianCalendar value) {
            this.signingDateStart = value;
        }

        /**
         * Дата заключения "По"
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSigningDateEnd() {
            return signingDateEnd;
        }

        /**
         * Sets the value of the signingDateEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getSigningDateEnd()
         */
        public void setSigningDateEnd(XMLGregorianCalendar value) {
            this.signingDateEnd = value;
        }

        /**
         * Тип:
         * (D)WELLING_APARTMENT - Договор социального найма жилого помещения
         * STATE_(M)UNICIPAL_FUND - Договор найма жилого помещения государственного или муниципального жилищного фонда
         * (S)OCIAL_FUND - Договор найма жилого помещения жилищного фонда социального использования
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getType()
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
