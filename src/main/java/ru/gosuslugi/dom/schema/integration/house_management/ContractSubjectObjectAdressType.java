
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * КУ и КР для ОЖФ в договоре ресурсоснабжения
 * 
 * <p>Java class for ContractSubjectObjectAdressType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContractSubjectObjectAdressType">
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
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractSubjectObjectAdressType", propOrder = {
    "serviceType",
    "municipalResource",
    "startSupplyDate",
    "endSupplyDate"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportSupplyResourceContractObjectAddressResultType.Pair.class,
    ru.gosuslugi.dom.schema.integration.house_management.ObjectAddressBriefType.Pair.class
})
public class ContractSubjectObjectAdressType {

    /**
     * Вид КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
     * 
     */
    @XmlElement(name = "ServiceType", required = true)
    protected ContractSubjectObjectAdressType.ServiceType serviceType;
    /**
     * Коммунальный ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239)
     * 
     */
    @XmlElement(name = "MunicipalResource", required = true)
    protected ContractSubjectObjectAdressType.MunicipalResource municipalResource;
    /**
     * Дата начала поставки ресурса
     * 
     */
    @XmlElement(name = "StartSupplyDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startSupplyDate;
    /**
     * Дата окончания поставки ресурса. Является обязательным, если указано значение в AutomaticRollOverOneYear
     * 
     */
    @XmlElement(name = "EndSupplyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endSupplyDate;

    /**
     * Вид КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
     * 
     * @return
     *     possible object is
     *     {@link ContractSubjectObjectAdressType.ServiceType }
     *     
     */
    public ContractSubjectObjectAdressType.ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSubjectObjectAdressType.ServiceType }
     *     
     * @see #getServiceType()
     */
    public void setServiceType(ContractSubjectObjectAdressType.ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Коммунальный ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239)
     * 
     * @return
     *     possible object is
     *     {@link ContractSubjectObjectAdressType.MunicipalResource }
     *     
     */
    public ContractSubjectObjectAdressType.MunicipalResource getMunicipalResource() {
        return municipalResource;
    }

    /**
     * Sets the value of the municipalResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSubjectObjectAdressType.MunicipalResource }
     *     
     * @see #getMunicipalResource()
     */
    public void setMunicipalResource(ContractSubjectObjectAdressType.MunicipalResource value) {
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
     * Дата окончания поставки ресурса. Является обязательным, если указано значение в AutomaticRollOverOneYear
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
