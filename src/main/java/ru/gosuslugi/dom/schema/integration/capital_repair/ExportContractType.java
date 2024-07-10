
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемый договор на выполнение работ (оказание услуг) по капитальному ремонту
 * 
 * <p>Java class for exportContractType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportContractType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ShortExportContractType">
 *       <sequence>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}StatusType"/>
 *         <element name="ExecutionStatus" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String500Type"/>
 *         <element name="ContractGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="PlanGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportContractType", propOrder = {
    "status",
    "executionStatus",
    "contractGuid",
    "planGUID"
})
public class ExportContractType
    extends ShortExportContractType
{

    /**
     * Статус договора
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "token")
    protected StatusType status;
    /**
     * Статус исполнения договора
     * 
     */
    @XmlElement(name = "ExecutionStatus", required = true)
    protected String executionStatus;
    /**
     * Идентификатор договора в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractGuid", required = true)
    protected String contractGuid;
    /**
     * Идентификатор КПР в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "PlanGUID", required = true)
    protected String planGUID;

    /**
     * Статус договора
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

    /**
     * Статус исполнения договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionStatus() {
        return executionStatus;
    }

    /**
     * Sets the value of the executionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExecutionStatus()
     */
    public void setExecutionStatus(String value) {
        this.executionStatus = value;
    }

    /**
     * Идентификатор договора в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractGuid() {
        return contractGuid;
    }

    /**
     * Sets the value of the contractGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractGuid()
     */
    public void setContractGuid(String value) {
        this.contractGuid = value;
    }

    /**
     * Идентификатор КПР в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanGUID() {
        return planGUID;
    }

    /**
     * Sets the value of the planGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlanGUID()
     */
    public void setPlanGUID(String value) {
        this.planGUID = value;
    }

}
