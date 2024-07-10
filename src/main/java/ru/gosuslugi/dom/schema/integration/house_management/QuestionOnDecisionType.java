
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Решение по вопросу
 * 
 * <p>Java class for QuestionOnDecisionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="QuestionOnDecisionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QuestionNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}QuestionNumberType"/>
 *         <choice>
 *           <element name="OwnerAgree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="OwnerAgainst" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="OwnerAbstent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="IsDigitalDecision" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuestionOnDecisionType", propOrder = {
    "questionNumber",
    "ownerAgree",
    "ownerAgainst",
    "ownerAbstent",
    "isDigitalDecision"
})
public class QuestionOnDecisionType {

    /**
     * Номер вопроса
     * 
     */
    @XmlElement(name = "QuestionNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int questionNumber;
    /**
     * Решение собственника «За»
     * 
     */
    @XmlElement(name = "OwnerAgree")
    protected Boolean ownerAgree;
    /**
     * Решение собственника  «Против»
     * 
     */
    @XmlElement(name = "OwnerAgainst")
    protected Boolean ownerAgainst;
    /**
     * Решение собственника «Воздержался»
     * 
     */
    @XmlElement(name = "OwnerAbstent")
    protected Boolean ownerAbstent;
    /**
     * Признак "Собственник проголосовал с использованием системы". Может быть равно true только для голосований с формой проведения "Заочное голосование с использованием системы"
     * 
     */
    @XmlElement(name = "IsDigitalDecision")
    protected Boolean isDigitalDecision;

    /**
     * Номер вопроса
     * 
     */
    public int getQuestionNumber() {
        return questionNumber;
    }

    /**
     * Sets the value of the questionNumber property.
     * 
     */
    public void setQuestionNumber(int value) {
        this.questionNumber = value;
    }

    /**
     * Решение собственника «За»
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerAgree() {
        return ownerAgree;
    }

    /**
     * Sets the value of the ownerAgree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOwnerAgree()
     */
    public void setOwnerAgree(Boolean value) {
        this.ownerAgree = value;
    }

    /**
     * Решение собственника  «Против»
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerAgainst() {
        return ownerAgainst;
    }

    /**
     * Sets the value of the ownerAgainst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOwnerAgainst()
     */
    public void setOwnerAgainst(Boolean value) {
        this.ownerAgainst = value;
    }

    /**
     * Решение собственника «Воздержался»
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerAbstent() {
        return ownerAbstent;
    }

    /**
     * Sets the value of the ownerAbstent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOwnerAbstent()
     */
    public void setOwnerAbstent(Boolean value) {
        this.ownerAbstent = value;
    }

    /**
     * Признак "Собственник проголосовал с использованием системы". Может быть равно true только для голосований с формой проведения "Заочное голосование с использованием системы"
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDigitalDecision() {
        return isDigitalDecision;
    }

    /**
     * Sets the value of the isDigitalDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsDigitalDecision()
     */
    public void setIsDigitalDecision(Boolean value) {
        this.isDigitalDecision = value;
    }

}
