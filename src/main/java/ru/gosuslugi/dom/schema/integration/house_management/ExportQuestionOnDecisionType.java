
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемое решение по вопросу
 * 
 * <p>Java class for exportQuestionOnDecisionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportQuestionOnDecisionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <sequence>
 *           <element name="QuestionNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}QuestionNumberType"/>
 *           <element name="QuestionName">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <minLength value="1"/>
 *                 <maxLength value="3000"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *         </sequence>
 *         <choice>
 *           <element name="OwnerAgree" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           <element name="OwnerAgainst" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           <element name="OwnerAbstent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "exportQuestionOnDecisionType", propOrder = {
    "questionNumber",
    "questionName",
    "ownerAgree",
    "ownerAgainst",
    "ownerAbstent",
    "isDigitalDecision"
})
public class ExportQuestionOnDecisionType {

    /**
     * Номер вопроса
     * 
     */
    @XmlElement(name = "QuestionNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int questionNumber;
    /**
     * Вопрос
     * 
     */
    @XmlElement(name = "QuestionName", required = true)
    protected String questionName;
    /**
     * Решение собственника «За»
     * 
     */
    @XmlElement(name = "OwnerAgree")
    protected BigDecimal ownerAgree;
    /**
     * Решение собственника  «Против»
     * 
     */
    @XmlElement(name = "OwnerAgainst")
    protected BigDecimal ownerAgainst;
    /**
     * Решение собственника «Воздержался»
     * 
     */
    @XmlElement(name = "OwnerAbstent")
    protected BigDecimal ownerAbstent;
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
     * Вопрос
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionName() {
        return questionName;
    }

    /**
     * Sets the value of the questionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getQuestionName()
     */
    public void setQuestionName(String value) {
        this.questionName = value;
    }

    /**
     * Решение собственника «За»
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnerAgree() {
        return ownerAgree;
    }

    /**
     * Sets the value of the ownerAgree property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getOwnerAgree()
     */
    public void setOwnerAgree(BigDecimal value) {
        this.ownerAgree = value;
    }

    /**
     * Решение собственника  «Против»
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnerAgainst() {
        return ownerAgainst;
    }

    /**
     * Sets the value of the ownerAgainst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getOwnerAgainst()
     */
    public void setOwnerAgainst(BigDecimal value) {
        this.ownerAgainst = value;
    }

    /**
     * Решение собственника «Воздержался»
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnerAbstent() {
        return ownerAbstent;
    }

    /**
     * Sets the value of the ownerAbstent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getOwnerAbstent()
     */
    public void setOwnerAbstent(BigDecimal value) {
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
