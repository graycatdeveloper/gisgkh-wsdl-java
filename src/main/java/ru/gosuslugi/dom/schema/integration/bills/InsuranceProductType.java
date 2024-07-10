
package ru.gosuslugi.dom.schema.integration.bills;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Страховой продукт
 * 
 * <p>Java class for InsuranceProductType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InsuranceProductType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Description" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
 *         <element name="InsuranceOrg" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceProductType", propOrder = {
    "description",
    "insuranceOrg"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.bills.ImportInsuranceProductRequest.InsuranceProduct.CreateOrUpdate.class
})
public class InsuranceProductType {

    /**
     * Условия страхования
     * 
     */
    @XmlElement(name = "Description", required = true)
    protected AttachmentType description;
    /**
     * Корневой идентификатор страховой компании из реестра организаций
     * 
     */
    @XmlElement(name = "InsuranceOrg", required = true)
    protected String insuranceOrg;

    /**
     * Условия страхования
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     * @see #getDescription()
     */
    public void setDescription(AttachmentType value) {
        this.description = value;
    }

    /**
     * Корневой идентификатор страховой компании из реестра организаций
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceOrg() {
        return insuranceOrg;
    }

    /**
     * Sets the value of the insuranceOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInsuranceOrg()
     */
    public void setInsuranceOrg(String value) {
        this.insuranceOrg = value;
    }

}
