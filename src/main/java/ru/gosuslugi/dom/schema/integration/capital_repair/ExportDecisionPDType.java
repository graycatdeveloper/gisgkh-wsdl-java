
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных для Решение/информация о порядке представления платежных документов
 * 
 * <p>Java class for ExportDecisionPDType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportDecisionPDType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DecisionPDType">
 *       <sequence>
 *         <element name="DecisionGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}StatusType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDecisionPDType", propOrder = {
    "decisionGuid",
    "status"
})
public class ExportDecisionPDType
    extends DecisionPDType
{

    /**
     * Идентификатор решения о выборе способа формирования фонда капитального ремонта
     * 
     */
    @XmlElement(name = "DecisionGuid", required = true)
    protected String decisionGuid;
    /**
     * Статус решения
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "token")
    protected StatusType status;

    /**
     * Идентификатор решения о выборе способа формирования фонда капитального ремонта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionGuid() {
        return decisionGuid;
    }

    /**
     * Sets the value of the decisionGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDecisionGuid()
     */
    public void setDecisionGuid(String value) {
        this.decisionGuid = value;
    }

    /**
     * Статус решения
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

}
