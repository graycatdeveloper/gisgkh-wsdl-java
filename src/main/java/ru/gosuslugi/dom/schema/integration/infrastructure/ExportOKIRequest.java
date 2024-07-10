
package ru.gosuslugi.dom.schema.integration.infrastructure;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
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
 *       <sequence>
 *         <element name="OKIType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ExpiredManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" minOccurs="0"/>
 *         <element name="RSOOrganizationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
    "okiType",
    "expiredManagement",
    "oktmo",
    "rsoOrganizationGUID"
})
@XmlRootElement(name = "exportOKIRequest")
public class ExportOKIRequest
    extends BaseType
{

    /**
     * Вид ОКИ
     * 
     */
    @XmlElement(name = "OKIType")
    protected List<NsiRef> okiType;
    /**
     * ОКИ только с истекшим сроком управления
     * 
     */
    @XmlElement(name = "ExpiredManagement")
    protected Boolean expiredManagement;
    /**
     * ОКТМО
     * 
     */
    @XmlElement(name = "OKTMO")
    protected OKTMORefType oktmo;
    /**
     * Заполняется только ОМС      Идентификатор РСО
     * 
     */
    @XmlElement(name = "RSOOrganizationGUID")
    protected String rsoOrganizationGUID;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Вид ОКИ
     * 
     * Gets the value of the okiType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the okiType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOKIType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsiRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the okiType property.
     */
    public List<NsiRef> getOKIType() {
        if (okiType == null) {
            okiType = new ArrayList<>();
        }
        return this.okiType;
    }

    /**
     * ОКИ только с истекшим сроком управления
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpiredManagement() {
        return expiredManagement;
    }

    /**
     * Sets the value of the expiredManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExpiredManagement()
     */
    public void setExpiredManagement(Boolean value) {
        this.expiredManagement = value;
    }

    /**
     * ОКТМО
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getOKTMO()
     */
    public void setOKTMO(OKTMORefType value) {
        this.oktmo = value;
    }

    /**
     * Заполняется только ОМС      Идентификатор РСО
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSOOrganizationGUID() {
        return rsoOrganizationGUID;
    }

    /**
     * Sets the value of the rsoOrganizationGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRSOOrganizationGUID()
     */
    public void setRSOOrganizationGUID(String value) {
        this.rsoOrganizationGUID = value;
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
