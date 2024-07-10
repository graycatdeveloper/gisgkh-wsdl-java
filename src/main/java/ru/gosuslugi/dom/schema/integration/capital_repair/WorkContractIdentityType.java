
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Прикладной идентификатор работы в договоре на выполнение работ (оказание услуг) по капитальному ремонту
 * 
 * <p>Java class for WorkContractIdentityType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WorkContractIdentityType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="WorkPlanGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <sequence>
 *           <element name="WorkPlanBusinessIdentity" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkPlanIdentityType"/>
 *         </sequence>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkContractIdentityType", propOrder = {
    "workPlanGUID",
    "workPlanBusinessIdentity"
})
@XmlSeeAlso({
    WorkContractType.class
})
public class WorkContractIdentityType {

    /**
     * Идентификатор работы в КПР
     * 
     */
    @XmlElement(name = "WorkPlanGUID")
    protected String workPlanGUID;
    /**
     * Бизнес-ключ для работы в КПР
     * 
     */
    @XmlElement(name = "WorkPlanBusinessIdentity")
    protected WorkPlanIdentityType workPlanBusinessIdentity;

    /**
     * Идентификатор работы в КПР
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPlanGUID() {
        return workPlanGUID;
    }

    /**
     * Sets the value of the workPlanGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWorkPlanGUID()
     */
    public void setWorkPlanGUID(String value) {
        this.workPlanGUID = value;
    }

    /**
     * Бизнес-ключ для работы в КПР
     * 
     * @return
     *     possible object is
     *     {@link WorkPlanIdentityType }
     *     
     */
    public WorkPlanIdentityType getWorkPlanBusinessIdentity() {
        return workPlanBusinessIdentity;
    }

    /**
     * Sets the value of the workPlanBusinessIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkPlanIdentityType }
     *     
     * @see #getWorkPlanBusinessIdentity()
     */
    public void setWorkPlanBusinessIdentity(WorkPlanIdentityType value) {
        this.workPlanBusinessIdentity = value;
    }

}
