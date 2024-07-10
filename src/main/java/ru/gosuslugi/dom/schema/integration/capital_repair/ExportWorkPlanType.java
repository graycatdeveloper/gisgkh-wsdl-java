
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемая работа в КПР
 * 
 * <p>Java class for ExportWorkPlanType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportWorkPlanType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkPlanType">
 *       <sequence>
 *         <element name="WorkGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportWorkPlanType", propOrder = {
    "workGUID"
})
public class ExportWorkPlanType
    extends WorkPlanType
{

    /**
     * Идентификатор работы в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "WorkGUID", required = true)
    protected String workGUID;

    /**
     * Идентификатор работы в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkGUID() {
        return workGUID;
    }

    /**
     * Sets the value of the workGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWorkGUID()
     */
    public void setWorkGUID(String value) {
        this.workGUID = value;
    }

}
