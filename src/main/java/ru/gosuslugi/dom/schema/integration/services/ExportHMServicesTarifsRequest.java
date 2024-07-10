
package ru.gosuslugi.dom.schema.integration.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.base.RegionType;


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
 *         <element name="ServiceType">
 *           <simpleType>
 *             <restriction>
 *               <simpleType>
 *                 <list>
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       <enumeration value="M"/>
 *                       <enumeration value="O"/>
 *                       <enumeration value="S"/>
 *                       <enumeration value="R"/>
 *                       <enumeration value="C"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </list>
 *               </simpleType>
 *               <minLength value="1"/>
 *               <maxLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <choice>
 *           <element name="Municipalities" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/base/}RegionType"/>
 *         </choice>
 *         <sequence minOccurs="0">
 *           <element name="EffectivePeriodTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           <element name="EffectivePeriodFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         </sequence>
 *         <element name="IsPublished" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceType",
    "municipalities",
    "region",
    "effectivePeriodTo",
    "effectivePeriodFrom",
    "isPublished"
})
@XmlRootElement(name = "exportHMServicesTarifsRequest")
public class ExportHMServicesTarifsRequest
    extends BaseType
{

    /**
     * Вид жилищно-коммунальной услуги
     * (M)unicipal - Коммунальные услуги
     * (O)verhaul - Капитальный ремонт
     * (S)ocial hiring - Социальный наем
     * (R)epair and maintenance - Содержание и ремонт жилого помещения
     * (C)ommunal resourses - коммунальные ресурсы
     * 
     */
    @XmlList
    @XmlElement(name = "ServiceType", required = true)
    protected List<String> serviceType;
    /**
     * Муниципальные образования
     * 
     */
    @XmlElement(name = "Municipalities")
    protected List<OKTMORefType> municipalities;
    /**
     * Субъект РФ
     * 
     */
    @XmlElement(name = "Region")
    protected RegionType region;
    /**
     * Дата окончания действия тарифа
     * 
     */
    @XmlElement(name = "EffectivePeriodTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectivePeriodTo;
    /**
     * Дата начала действия тарифа
     * 
     */
    @XmlElement(name = "EffectivePeriodFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectivePeriodFrom;
    /**
     * Экспортируются только опубликованные документы.
     * 
     */
    @XmlElement(name = "IsPublished")
    protected boolean isPublished;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Вид жилищно-коммунальной услуги
     * (M)unicipal - Коммунальные услуги
     * (O)verhaul - Капитальный ремонт
     * (S)ocial hiring - Социальный наем
     * (R)epair and maintenance - Содержание и ремонт жилого помещения
     * (C)ommunal resourses - коммунальные ресурсы
     * 
     * Gets the value of the serviceType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceType().add(newItem);
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
     *     The value of the serviceType property.
     */
    public List<String> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<>();
        }
        return this.serviceType;
    }

    /**
     * Муниципальные образования
     * 
     * Gets the value of the municipalities property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the municipalities property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMunicipalities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OKTMORefType }
     * </p>
     * 
     * 
     * @return
     *     The value of the municipalities property.
     */
    public List<OKTMORefType> getMunicipalities() {
        if (municipalities == null) {
            municipalities = new ArrayList<>();
        }
        return this.municipalities;
    }

    /**
     * Субъект РФ
     * 
     * @return
     *     possible object is
     *     {@link RegionType }
     *     
     */
    public RegionType getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionType }
     *     
     * @see #getRegion()
     */
    public void setRegion(RegionType value) {
        this.region = value;
    }

    /**
     * Дата окончания действия тарифа
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectivePeriodTo() {
        return effectivePeriodTo;
    }

    /**
     * Sets the value of the effectivePeriodTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEffectivePeriodTo()
     */
    public void setEffectivePeriodTo(XMLGregorianCalendar value) {
        this.effectivePeriodTo = value;
    }

    /**
     * Дата начала действия тарифа
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectivePeriodFrom() {
        return effectivePeriodFrom;
    }

    /**
     * Sets the value of the effectivePeriodFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEffectivePeriodFrom()
     */
    public void setEffectivePeriodFrom(XMLGregorianCalendar value) {
        this.effectivePeriodFrom = value;
    }

    /**
     * Экспортируются только опубликованные документы.
     * 
     */
    public boolean isIsPublished() {
        return isPublished;
    }

    /**
     * Sets the value of the isPublished property.
     * 
     */
    public void setIsPublished(boolean value) {
        this.isPublished = value;
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
            return "10.0.1.1";
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

}
