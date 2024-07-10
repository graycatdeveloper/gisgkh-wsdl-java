
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
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


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
 *         <sequence>
 *           <element name="NextPageContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *           <element name="NextPageObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </sequence>
 *         <choice>
 *           <element name="Criteria" maxOccurs="10">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                     <choice>
 *                       <sequence>
 *                         <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                       </sequence>
 *                       <sequence>
 *                         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                       </sequence>
 *                       <sequence>
 *                         <element name="ContractNumber" minOccurs="0">
 *                           <simpleType>
 *                             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                               <maxLength value="100"/>
 *                               <minLength value="1"/>
 *                             </restriction>
 *                           </simpleType>
 *                         </element>
 *                         <element name="SigningDateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                         <element name="SigningDateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                         <element name="ContractSubject" maxOccurs="100" minOccurs="0">
 *                           <complexType>
 *                             <complexContent>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                 <sequence>
 *                                   <element name="ServiceType">
 *                                     <complexType>
 *                                       <complexContent>
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                                         </extension>
 *                                       </complexContent>
 *                                     </complexType>
 *                                   </element>
 *                                   <element name="MunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                 </sequence>
 *                               </restriction>
 *                             </complexContent>
 *                           </complexType>
 *                         </element>
 *                       </sequence>
 *                     </choice>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="Organization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *         </choice>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nextPageContractRootGUID",
    "nextPageObjectGUID",
    "criteria",
    "organization"
})
@XmlRootElement(name = "exportBriefSupplyResourceContractRequest")
public class ExportBriefSupplyResourceContractRequest
    extends BaseType
{

    /**
     * Корневой идентификатор договора ресурсоснабжения в ГИС ЖКХ для установки  экспорта следующей страницы с договорами.  При первичном экспорте  не заполняется
     * 
     */
    @XmlElement(name = "NextPageContractRootGUID")
    protected String nextPageContractRootGUID;
    /**
     * Идентификатор объекта жилищного фонда в ГИС ЖКХ для установки экспорта следующей страницы с ОЖФ внутри договора с идентиифкатором, указанным в  NextPageContractRootGUID.        При первичном экспорте не заполняется
     * 
     */
    @XmlElement(name = "NextPageObjectGUID")
    protected String nextPageObjectGUID;
    @XmlElement(name = "Criteria")
    protected List<ExportBriefSupplyResourceContractRequest.Criteria> criteria;
    /**
     * Организация, заключившая договор
     * 
     */
    @XmlElement(name = "Organization")
    protected RegOrgType organization;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Корневой идентификатор договора ресурсоснабжения в ГИС ЖКХ для установки  экспорта следующей страницы с договорами.  При первичном экспорте  не заполняется
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPageContractRootGUID() {
        return nextPageContractRootGUID;
    }

    /**
     * Sets the value of the nextPageContractRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNextPageContractRootGUID()
     */
    public void setNextPageContractRootGUID(String value) {
        this.nextPageContractRootGUID = value;
    }

    /**
     * Идентификатор объекта жилищного фонда в ГИС ЖКХ для установки экспорта следующей страницы с ОЖФ внутри договора с идентиифкатором, указанным в  NextPageContractRootGUID.        При первичном экспорте не заполняется
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPageObjectGUID() {
        return nextPageObjectGUID;
    }

    /**
     * Sets the value of the nextPageObjectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNextPageObjectGUID()
     */
    public void setNextPageObjectGUID(String value) {
        this.nextPageObjectGUID = value;
    }

    /**
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
     * {@link ExportBriefSupplyResourceContractRequest.Criteria }
     * </p>
     * 
     * 
     * @return
     *     The value of the criteria property.
     */
    public List<ExportBriefSupplyResourceContractRequest.Criteria> getCriteria() {
        if (criteria == null) {
            criteria = new ArrayList<>();
        }
        return this.criteria;
    }

    /**
     * Организация, заключившая договор
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getOrganization()
     */
    public void setOrganization(RegOrgType value) {
        this.organization = value;
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
        return version;
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
     *           <sequence>
     *             <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           </sequence>
     *           <sequence>
     *             <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           </sequence>
     *           <sequence>
     *             <element name="ContractNumber" minOccurs="0">
     *               <simpleType>
     *                 <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
     *                   <maxLength value="100"/>
     *                   <minLength value="1"/>
     *                 </restriction>
     *               </simpleType>
     *             </element>
     *             <element name="SigningDateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *             <element name="SigningDateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *             <element name="ContractSubject" maxOccurs="100" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                     <sequence>
     *                       <element name="ServiceType">
     *                         <complexType>
     *                           <complexContent>
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *                             </extension>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                       <element name="MunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                     </sequence>
     *                   </restriction>
     *                 </complexContent>
     *               </complexType>
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
        "contractGUID",
        "contractRootGUID",
        "contractNumber",
        "signingDateStart",
        "signingDateEnd",
        "contractSubject"
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
         * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ContractGUID")
        protected String contractGUID;
        /**
         * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ContractRootGUID")
        protected String contractRootGUID;
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
         * Предмет договора
         * 
         */
        @XmlElement(name = "ContractSubject")
        protected List<ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject> contractSubject;

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
         * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
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
         * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
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
         * Предмет договора
         * 
         * Gets the value of the contractSubject property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractSubject property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getContractSubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject }
         * </p>
         * 
         * 
         * @return
         *     The value of the contractSubject property.
         */
        public List<ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject> getContractSubject() {
            if (contractSubject == null) {
                contractSubject = new ArrayList<>();
            }
            return this.contractSubject;
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
         *         <element name="ServiceType">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="MunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
            "serviceType",
            "municipalResource"
        })
        public static class ContractSubject {

            /**
             * Предмет договора 
             * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
             * 
             */
            @XmlElement(name = "ServiceType", required = true)
            protected ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject.ServiceType serviceType;
            /**
             * Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239)
             * 
             */
            @XmlElement(name = "MunicipalResource", required = true)
            protected NsiRef municipalResource;

            /**
             * Предмет договора 
             * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
             * 
             * @return
             *     possible object is
             *     {@link ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject.ServiceType }
             *     
             */
            public ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject.ServiceType getServiceType() {
                return serviceType;
            }

            /**
             * Sets the value of the serviceType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject.ServiceType }
             *     
             * @see #getServiceType()
             */
            public void setServiceType(ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject.ServiceType value) {
                this.serviceType = value;
            }

            /**
             * Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239)
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getMunicipalResource() {
                return municipalResource;
            }

            /**
             * Sets the value of the municipalResource property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getMunicipalResource()
             */
            public void setMunicipalResource(NsiRef value) {
                this.municipalResource = value;
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

    }

}
