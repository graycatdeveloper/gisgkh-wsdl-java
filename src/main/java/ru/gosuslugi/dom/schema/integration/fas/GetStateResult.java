
package ru.gosuslugi.dom.schema.integration.fas;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseAsyncResponseType;
import ru.gosuslugi.dom.schema.integration.base.CommonResultType;
import ru.gosuslugi.dom.schema.integration.base.ErrorMessageType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseAsyncResponseType">
 *       <choice minOccurs="0">
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *         <element name="ImportResult" type="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType" maxOccurs="unbounded"/>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorMessage",
    "importResult"
})
@XmlRootElement(name = "getStateResult")
public class GetStateResult
    extends BaseAsyncResponseType
{

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     */
    @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected ErrorMessageType errorMessage;
    @XmlElement(name = "ImportResult")
    protected List<CommonResultType> importResult;

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageType }
     *     
     */
    public ErrorMessageType getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageType }
     *     
     * @see #getErrorMessage()
     */
    public void setErrorMessage(ErrorMessageType value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the importResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the importResult property.
     */
    public List<CommonResultType> getImportResult() {
        if (importResult == null) {
            importResult = new ArrayList<>();
        }
        return this.importResult;
    }

}
