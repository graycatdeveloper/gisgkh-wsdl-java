
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Решение собственника по вопросам, переданным в письменной форме
 * 
 * <p>Java class for OwnerDecisionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OwnerDecisionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Owner"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}PropertyDetails" maxOccurs="unbounded"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Representative" minOccurs="0"/>
 *         <element name="QuestionOnDecision" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}QuestionOnDecisionType"/>
 *         <element name="DecisionAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerDecisionType", propOrder = {
    "owner",
    "propertyDetails",
    "representative",
    "questionOnDecision",
    "decisionAttachments"
})
public class OwnerDecisionType {

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
     * Сведения о представителе.
     * 
     * Заполняется, если в голосании участвует представитель собственника
     * 
     */
    @XmlElement(name = "Representative")
    protected Representative representative;
    /**
     * Вопрос повестки
     * 
     */
    @XmlElement(name = "QuestionOnDecision", required = true)
    protected QuestionOnDecisionType questionOnDecision;
    /**
     * Электронный образ решения собственника
     * 
     */
    @XmlElement(name = "DecisionAttachments", required = true)
    protected List<AttachmentType> decisionAttachments;

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
     * Сведения о представителе.
     * 
     * Заполняется, если в голосании участвует представитель собственника
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
     * Вопрос повестки
     * 
     * @return
     *     possible object is
     *     {@link QuestionOnDecisionType }
     *     
     */
    public QuestionOnDecisionType getQuestionOnDecision() {
        return questionOnDecision;
    }

    /**
     * Sets the value of the questionOnDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionOnDecisionType }
     *     
     * @see #getQuestionOnDecision()
     */
    public void setQuestionOnDecision(QuestionOnDecisionType value) {
        this.questionOnDecision = value;
    }

    /**
     * Электронный образ решения собственника
     * 
     * Gets the value of the decisionAttachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisionAttachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDecisionAttachments().add(newItem);
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
     *     The value of the decisionAttachments property.
     */
    public List<AttachmentType> getDecisionAttachments() {
        if (decisionAttachments == null) {
            decisionAttachments = new ArrayList<>();
        }
        return this.decisionAttachments;
    }

}
