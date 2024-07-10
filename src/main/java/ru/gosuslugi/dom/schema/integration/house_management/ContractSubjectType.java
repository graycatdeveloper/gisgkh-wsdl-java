
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Предмет договора
 * 
 * <p>Java class for ContractSubjectType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContractSubjectType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ServiceType">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MunicipalResource">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="StartSupplyDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EndSupplyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="PlannedVolume" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Volume" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOVolumeType"/>
 *                   <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKEIType"/>
 *                   <element name="FeedingMode">
 *                     <simpleType>
 *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String250Type">
 *                         <maxLength value="250"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
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
@XmlType(name = "ContractSubjectType", propOrder = {
    "serviceType",
    "municipalResource",
    "startSupplyDate",
    "endSupplyDate",
    "plannedVolume"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.SupplyResourceContractType.ContractSubject.class,
    ru.gosuslugi.dom.schema.integration.house_management.SupplyResourceContractProjectType.ContractSubject.class
})
public class ContractSubjectType {

    /**
     * Вид КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
     * 
     */
    @XmlElement(name = "ServiceType", required = true)
    protected ContractSubjectType.ServiceType serviceType;
    /**
     * Коммунальный ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239)
     * 
     */
    @XmlElement(name = "MunicipalResource", required = true)
    protected ContractSubjectType.MunicipalResource municipalResource;
    /**
     * Дата начала поставки ресурса
     * 
     */
    @XmlElement(name = "StartSupplyDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startSupplyDate;
    /**
     * Дата окончания поставки ресурса. Не заполняется, если указано, что договор заключен на неопределенный срок (IndefiniteTerm = true)
     * 
     */
    @XmlElement(name = "EndSupplyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endSupplyDate;
    /**
     * Плановый объем и режим подачи за год
     * 
     */
    @XmlElement(name = "PlannedVolume")
    protected ContractSubjectType.PlannedVolume plannedVolume;

    /**
     * Вид КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
     * 
     * @return
     *     possible object is
     *     {@link ContractSubjectType.ServiceType }
     *     
     */
    public ContractSubjectType.ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSubjectType.ServiceType }
     *     
     * @see #getServiceType()
     */
    public void setServiceType(ContractSubjectType.ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Коммунальный ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239)
     * 
     * @return
     *     possible object is
     *     {@link ContractSubjectType.MunicipalResource }
     *     
     */
    public ContractSubjectType.MunicipalResource getMunicipalResource() {
        return municipalResource;
    }

    /**
     * Sets the value of the municipalResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSubjectType.MunicipalResource }
     *     
     * @see #getMunicipalResource()
     */
    public void setMunicipalResource(ContractSubjectType.MunicipalResource value) {
        this.municipalResource = value;
    }

    /**
     * Дата начала поставки ресурса
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartSupplyDate() {
        return startSupplyDate;
    }

    /**
     * Sets the value of the startSupplyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartSupplyDate()
     */
    public void setStartSupplyDate(XMLGregorianCalendar value) {
        this.startSupplyDate = value;
    }

    /**
     * Дата окончания поставки ресурса. Не заполняется, если указано, что договор заключен на неопределенный срок (IndefiniteTerm = true)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndSupplyDate() {
        return endSupplyDate;
    }

    /**
     * Sets the value of the endSupplyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndSupplyDate()
     */
    public void setEndSupplyDate(XMLGregorianCalendar value) {
        this.endSupplyDate = value;
    }

    /**
     * Плановый объем и режим подачи за год
     * 
     * @return
     *     possible object is
     *     {@link ContractSubjectType.PlannedVolume }
     *     
     */
    public ContractSubjectType.PlannedVolume getPlannedVolume() {
        return plannedVolume;
    }

    /**
     * Sets the value of the plannedVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSubjectType.PlannedVolume }
     *     
     * @see #getPlannedVolume()
     */
    public void setPlannedVolume(ContractSubjectType.PlannedVolume value) {
        this.plannedVolume = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MunicipalResource
        extends NsiRef
    {


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
     *         <element name="Volume" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOVolumeType"/>
     *         <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKEIType"/>
     *         <element name="FeedingMode">
     *           <simpleType>
     *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String250Type">
     *               <maxLength value="250"/>
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
        "volume",
        "unit",
        "feedingMode"
    })
    public static class PlannedVolume {

        /**
         * Плановый объем
         * 
         */
        @XmlElement(name = "Volume", required = true)
        protected BigDecimal volume;
        /**
         * Единица измерения.
         * справочника НСИ №236 "Связь вида коммунальной услуги, тарифицируемого ресурса и единиц измерения ставки тарифа"
         * 
         */
        @XmlElement(name = "Unit", required = true)
        protected String unit;
        /**
         * Режим подачи
         * 
         */
        @XmlElement(name = "FeedingMode", required = true)
        protected String feedingMode;

        /**
         * Плановый объем
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVolume() {
            return volume;
        }

        /**
         * Sets the value of the volume property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getVolume()
         */
        public void setVolume(BigDecimal value) {
            this.volume = value;
        }

        /**
         * Единица измерения.
         * справочника НСИ №236 "Связь вида коммунальной услуги, тарифицируемого ресурса и единиц измерения ставки тарифа"
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getUnit()
         */
        public void setUnit(String value) {
            this.unit = value;
        }

        /**
         * Режим подачи
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeedingMode() {
            return feedingMode;
        }

        /**
         * Sets the value of the feedingMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFeedingMode()
         */
        public void setFeedingMode(String value) {
            this.feedingMode = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ServiceType
        extends NsiRef
    {


    }

}
