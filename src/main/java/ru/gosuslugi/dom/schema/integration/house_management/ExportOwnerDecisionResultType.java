
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Ответ на запрос экспорта решений собственника по вопросу голосования
 * 
 * <p>Java class for exportOwnerDecisionResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportOwnerDecisionResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RootOwnerDecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Owner"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportPropertyDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Representative" minOccurs="0"/>
 *         <element name="QuestionOnDecision" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}QuestionOnDecisionType"/>
 *         <element name="Attachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DecisionAnnuled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportOwnerDecisionResultType", propOrder = {
    "rootOwnerDecisionGUID",
    "owner",
    "exportPropertyDetails",
    "representative",
    "questionOnDecision",
    "attachments",
    "decisionAnnuled"
})
public class ExportOwnerDecisionResultType {

    /**
     * Корневой идентификатор решения собственника по вопросам голосования
     * 
     */
    @XmlElement(name = "RootOwnerDecisionGUID", required = true)
    protected String rootOwnerDecisionGUID;
    /**
     * Сведения о собственнике
     * 
     */
    @XmlElement(name = "Owner", required = true)
    protected Owner owner;
    /**
     * Экспортируемые сведения о собственности
     * 
     */
    protected List<ExportPropertyDetails> exportPropertyDetails;
    /**
     * Сведения о представителе
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
    @XmlElement(name = "Attachments")
    protected List<AttachmentType> attachments;
    /**
     * Решение аннулировано
     * 
     */
    @XmlElement(name = "DecisionAnnuled")
    protected Boolean decisionAnnuled;

    /**
     * Корневой идентификатор решения собственника по вопросам голосования
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootOwnerDecisionGUID() {
        return rootOwnerDecisionGUID;
    }

    /**
     * Sets the value of the rootOwnerDecisionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRootOwnerDecisionGUID()
     */
    public void setRootOwnerDecisionGUID(String value) {
        this.rootOwnerDecisionGUID = value;
    }

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
     * Экспортируемые сведения о собственности
     * 
     * Gets the value of the exportPropertyDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportPropertyDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportPropertyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportPropertyDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportPropertyDetails property.
     */
    public List<ExportPropertyDetails> getExportPropertyDetails() {
        if (exportPropertyDetails == null) {
            exportPropertyDetails = new ArrayList<>();
        }
        return this.exportPropertyDetails;
    }

    /**
     * Сведения о представителе
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
     * Gets the value of the attachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachments().add(newItem);
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
     *     The value of the attachments property.
     */
    public List<AttachmentType> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        return this.attachments;
    }

    /**
     * Решение аннулировано
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDecisionAnnuled() {
        return decisionAnnuled;
    }

    /**
     * Sets the value of the decisionAnnuled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDecisionAnnuled()
     */
    public void setDecisionAnnuled(Boolean value) {
        this.decisionAnnuled = value;
    }

}
