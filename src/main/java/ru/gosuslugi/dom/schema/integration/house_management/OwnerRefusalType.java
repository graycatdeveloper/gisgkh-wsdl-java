
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Письменный отказ собственника
 * 
 * <p>Java class for OwnerRefusalType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OwnerRefusalType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Owner"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}PropertyDetails" maxOccurs="unbounded"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Representative" minOccurs="0"/>
 *         <element name="RefusalAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerRefusalType", propOrder = {
    "owner",
    "propertyDetails",
    "representative",
    "refusalAttachments"
})
public class OwnerRefusalType {

    /**
     * Сведения о собственнике
     * 
     */
    @XmlElement(name = "Owner", required = true)
    protected Owner owner;
    /**
     * Сведения о собственности
     * 
     */
    @XmlElement(name = "PropertyDetails", required = true)
    protected List<PropertyDetails> propertyDetails;
    /**
     * Сведения о представителе. Заполняется, если отказ внесён представителем собственника
     * 
     */
    @XmlElement(name = "Representative")
    protected Representative representative;
    /**
     * Электронный образ отказа собственника
     * 
     */
    @XmlElement(name = "RefusalAttachments")
    protected List<AttachmentType> refusalAttachments;

    /**
     * Сведения о собственнике
     * 
     * @return
     *     possible object is
     *     {@link Owner }
     *     
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Owner }
     *     
     * @see #getOwner()
     */
    public void setOwner(Owner value) {
        this.owner = value;
    }

    /**
     * Сведения о собственности
     * 
     * Gets the value of the propertyDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPropertyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the propertyDetails property.
     */
    public List<PropertyDetails> getPropertyDetails() {
        if (propertyDetails == null) {
            propertyDetails = new ArrayList<>();
        }
        return this.propertyDetails;
    }

    /**
     * Сведения о представителе. Заполняется, если отказ внесён представителем собственника
     * 
     * @return
     *     possible object is
     *     {@link Representative }
     *     
     */
    public Representative getRepresentative() {
        return representative;
    }

    /**
     * Sets the value of the representative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Representative }
     *     
     * @see #getRepresentative()
     */
    public void setRepresentative(Representative value) {
        this.representative = value;
    }

    /**
     * Электронный образ отказа собственника
     * 
     * Gets the value of the refusalAttachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refusalAttachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRefusalAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the refusalAttachments property.
     */
    public List<AttachmentType> getRefusalAttachments() {
        if (refusalAttachments == null) {
            refusalAttachments = new ArrayList<>();
        }
        return this.refusalAttachments;
    }

}
