
package ru.gosuslugi.dom.schema.integration.base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Базовый тип ошибки контроля или бизнес-процесса
 * 
 * <p>Java class for ErrorMessageType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ErrorMessageType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="StackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorMessageType", propOrder = {
    "errorCode",
    "description",
    "stackTrace"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.base.CommonResultType.Error.class
})
public class ErrorMessageType {

    /**
     * Код ошибки
     * 
     */
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    /**
     * Описание ошибки
     * 
     */
    @XmlElement(name = "Description", required = true)
    protected String description;
    /**
     * StackTrace в случае возникновения исключения
     * 
     */
    @XmlElement(name = "StackTrace")
    protected String stackTrace;

    /**
     * Код ошибки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getErrorCode()
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Описание ошибки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * StackTrace в случае возникновения исключения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Sets the value of the stackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStackTrace()
     */
    public void setStackTrace(String value) {
        this.stackTrace = value;
    }

}
