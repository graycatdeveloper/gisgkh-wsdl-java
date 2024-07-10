
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.ErrorMessageType;


/**
 * Тип статуса размещения устава в ГИС ЖКХ
 * 
 * <p>Java class for importCharterResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="importCharterResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportStatusCAChResultType">
 *       <sequence>
 *         <element name="Error" type="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessageType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importCharterResultType", propOrder = {
    "error"
})
public class ImportCharterResultType
    extends ExportStatusCAChResultType
{

    /**
     * Описание ошибки
     * 
     */
    @XmlElement(name = "Error")
    protected ErrorMessageType error;

    /**
     * Описание ошибки
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageType }
     *     
     */
    public ErrorMessageType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageType }
     *     
     * @see #getError()
     */
    public void setError(ErrorMessageType value) {
        this.error = value;
    }

}
