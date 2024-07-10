
package ru.gosuslugi.dom.schema.integration.msp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Расчеты и перерасчеты для гражданина, получающего компенсации расходов
 * 
 * <p>Java class for ExportCitizenCompensationCalculationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportCitizenCompensationCalculationType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenCompensationCalculationType">
 *       <sequence>
 *         <element name="CalculationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/msp/}Status"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportCitizenCompensationCalculationType", propOrder = {
    "calculationGuid",
    "status"
})
public class ExportCitizenCompensationCalculationType
    extends CitizenCompensationCalculationType
{

    /**
     * Идентификатор информации о расчетах и перерасчетах гражданина в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "CalculationGuid", required = true)
    protected String calculationGuid;
    /**
     * Статус размещения объекта. Возможные значения: Published - Размещено в ГИС ЖКХ, Canceled - Аннулировано, Draft - Проект
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

    /**
     * Идентификатор информации о расчетах и перерасчетах гражданина в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationGuid() {
        return calculationGuid;
    }

    /**
     * Sets the value of the calculationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCalculationGuid()
     */
    public void setCalculationGuid(String value) {
        this.calculationGuid = value;
    }

    /**
     * Статус размещения объекта. Возможные значения: Published - Размещено в ГИС ЖКХ, Canceled - Аннулировано, Draft - Проект
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

}
