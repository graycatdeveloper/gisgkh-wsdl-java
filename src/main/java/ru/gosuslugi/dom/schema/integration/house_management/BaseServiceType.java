
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * <p>Java class for BaseServiceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseServiceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CurrentDoc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Agreement" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceType", propOrder = {
    "currentDoc",
    "agreement"
})
public class BaseServiceType {

    /**
     * Текущий ДУ
     * 
     */
    @XmlElement(name = "CurrentDoc")
    protected Boolean currentDoc;
    /**
     * Ссылка на дополнительное соглашение
     * 
     */
    @XmlElement(name = "Agreement")
    protected AttachmentType agreement;

    /**
     * Текущий ДУ
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentDoc() {
        return currentDoc;
    }

    /**
     * Sets the value of the currentDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCurrentDoc()
     */
    public void setCurrentDoc(Boolean value) {
        this.currentDoc = value;
    }

    /**
     * Ссылка на дополнительное соглашение
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getAgreement() {
        return agreement;
    }

    /**
     * Sets the value of the agreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     * @see #getAgreement()
     */
    public void setAgreement(AttachmentType value) {
        this.agreement = value;
    }

}
