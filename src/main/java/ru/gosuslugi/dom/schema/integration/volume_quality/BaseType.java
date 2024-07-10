
package ru.gosuslugi.dom.schema.integration.volume_quality;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Основание
 * 
 * <p>Java class for BaseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaseKind" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ContractType"/>
 *         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseType", propOrder = {
    "baseKind",
    "contractRootGUID"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.volume_quality.ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.Base.class
})
public class BaseType {

    /**
     * Вид основания
     * 
     */
    @XmlElement(name = "BaseKind", required = true)
    @XmlSchemaType(name = "string")
    protected ContractType baseKind;
    /**
     * Идентификатор договора-основания
     * 
     */
    @XmlElement(name = "ContractRootGUID", required = true)
    protected String contractRootGUID;

    /**
     * Вид основания
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getBaseKind() {
        return baseKind;
    }

    /**
     * Sets the value of the baseKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     * @see #getBaseKind()
     */
    public void setBaseKind(ContractType value) {
        this.baseKind = value;
    }

    /**
     * Идентификатор договора-основания
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

}
