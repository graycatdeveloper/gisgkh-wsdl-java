
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемая информация о совершенных операциях и остатках по счету
 * 
 * <p>Java class for ExportOperationAndBalanceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportOperationAndBalanceType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}OperationAndBalanceInfoType">
 *       <sequence>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="PeriodEnrollment" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *         <element name="PeriodWritingDown" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *         <element name="Status">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Published"/>
 *               <enumeration value="Canceled"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="OperationAndBalanceGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportOperationAndBalanceType", propOrder = {
    "fiasHouseGuid",
    "periodEnrollment",
    "periodWritingDown",
    "status",
    "operationAndBalanceGuid"
})
public class ExportOperationAndBalanceType
    extends OperationAndBalanceInfoType
{

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Зачислено за период
     * 
     */
    @XmlElement(name = "PeriodEnrollment", required = true)
    protected BigDecimal periodEnrollment;
    /**
     * Списано за период
     * 
     */
    @XmlElement(name = "PeriodWritingDown", required = true)
    protected BigDecimal periodWritingDown;
    /**
     * Статус
     * 
     */
    @XmlElement(name = "Status", required = true)
    protected String status;
    /**
     * Идентификатор информации о совершенных операциях и остатках по счету
     * 
     */
    @XmlElement(name = "OperationAndBalanceGuid", required = true)
    protected String operationAndBalanceGuid;

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGuid() {
        return fiasHouseGuid;
    }

    /**
     * Sets the value of the fiasHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGuid()
     */
    public void setFIASHouseGuid(String value) {
        this.fiasHouseGuid = value;
    }

    /**
     * Зачислено за период
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodEnrollment() {
        return periodEnrollment;
    }

    /**
     * Sets the value of the periodEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPeriodEnrollment()
     */
    public void setPeriodEnrollment(BigDecimal value) {
        this.periodEnrollment = value;
    }

    /**
     * Списано за период
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodWritingDown() {
        return periodWritingDown;
    }

    /**
     * Sets the value of the periodWritingDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPeriodWritingDown()
     */
    public void setPeriodWritingDown(BigDecimal value) {
        this.periodWritingDown = value;
    }

    /**
     * Статус
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Идентификатор информации о совершенных операциях и остатках по счету
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationAndBalanceGuid() {
        return operationAndBalanceGuid;
    }

    /**
     * Sets the value of the operationAndBalanceGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperationAndBalanceGuid()
     */
    public void setOperationAndBalanceGuid(String value) {
        this.operationAndBalanceGuid = value;
    }

}
