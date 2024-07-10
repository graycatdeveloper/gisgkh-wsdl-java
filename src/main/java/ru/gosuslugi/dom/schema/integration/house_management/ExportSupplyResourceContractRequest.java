
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


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <choice>
 *         <sequence>
 *           <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *         </sequence>
 *         <sequence>
 *           <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *         </sequence>
 *         <sequence>
 *           <element name="ExportContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *           <element name="ContractNumber" minOccurs="0">
 *             <simpleType>
 *               <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                 <maxLength value="100"/>
 *                 <minLength value="1"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="SigningDateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           <element name="SigningDateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *           <element name="ContractSubject" maxOccurs="100" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="ServiceType">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="MunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </sequence>
 *       </choice>
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
    "contractRootGUID",
    "contractGUID",
    "exportContractRootGUID",
    "contractNumber",
    "signingDateStart",
    "signingDateEnd",
    "fiasHouseGuid",
    "contractSubject"
})
@XmlRootElement(name = "exportSupplyResourceContractRequest")
public class ExportSupplyResourceContractRequest
    extends BaseType
{

    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractRootGUID")
    protected List<String> contractRootGUID;
    /**
     * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractGUID")
    protected List<String> contractGUID;
    /**
     * Корневой идентификатор договора ресурсоснабжения в ГИС ЖКХ для установки  экспорта следующей  1000 договоров                               При первичном экспорте  не заполняется
     * 
     */
    @XmlElement(name = "ExportContractRootGUID")
    protected String exportContractRootGUID;
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
     * Адрес дома
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Предмет договора
     * 
     */
    @XmlElement(name = "ContractSubject")
    protected List<ExportSupplyResourceContractRequest.ContractSubject> contractSubject;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     * Gets the value of the contractRootGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractRootGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContractRootGUID().add(newItem);
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
     *     The value of the contractRootGUID property.
     */
    public List<String> getContractRootGUID() {
        if (contractRootGUID == null) {
            contractRootGUID = new ArrayList<>();
        }
        return this.contractRootGUID;
    }

    /**
     * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
     * 
     * Gets the value of the contractGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContractGUID().add(newItem);
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
     *     The value of the contractGUID property.
     */
    public List<String> getContractGUID() {
        if (contractGUID == null) {
            contractGUID = new ArrayList<>();
        }
        return this.contractGUID;
    }

    /**
     * Корневой идентификатор договора ресурсоснабжения в ГИС ЖКХ для установки  экспорта следующей  1000 договоров                               При первичном экспорте  не заполняется
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportContractRootGUID() {
        return exportContractRootGUID;
    }

    /**
     * Sets the value of the exportContractRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExportContractRootGUID()
     */
    public void setExportContractRootGUID(String value) {
        this.exportContractRootGUID = value;
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
     * {@link ExportSupplyResourceContractRequest.ContractSubject }
     * </p>
     * 
     * 
     * @return
     *     The value of the contractSubject property.
     */
    public List<ExportSupplyResourceContractRequest.ContractSubject> getContractSubject() {
        if (contractSubject == null) {
            contractSubject = new ArrayList<>();
        }
        return this.contractSubject;
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
        protected ExportSupplyResourceContractRequest.ContractSubject.ServiceType serviceType;
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
         *     {@link ExportSupplyResourceContractRequest.ContractSubject.ServiceType }
         *     
         */
        public ExportSupplyResourceContractRequest.ContractSubject.ServiceType getServiceType() {
            return serviceType;
        }

        /**
         * Sets the value of the serviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportSupplyResourceContractRequest.ContractSubject.ServiceType }
         *     
         * @see #getServiceType()
         */
        public void setServiceType(ExportSupplyResourceContractRequest.ContractSubject.ServiceType value) {
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
