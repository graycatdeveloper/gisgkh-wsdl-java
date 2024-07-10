
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.ErrorMessageType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <choice>
 *         <element name="exportConnectionPossibilityApplicationResult" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}exportConnectionPossibilityApplicationType" maxOccurs="unbounded"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.2.5.0""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exportConnectionPossibilityApplicationResult",
    "errorMessage"
})
@XmlRootElement(name = "exportConnectionPossibilityApplicationResult")
public class ExportConnectionPossibilityApplicationResult
    extends BaseType
{

    /**
     * Результат запроса на экспорт заявлений на предоставление информации о возможности подключения к сетям теплоснабжения
     * 
     */
    protected List<ExportConnectionPossibilityApplicationType> exportConnectionPossibilityApplicationResult;
    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     */
    @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected ErrorMessageType errorMessage;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Результат запроса на экспорт заявлений на предоставление информации о возможности подключения к сетям теплоснабжения
     * 
     * Gets the value of the exportConnectionPossibilityApplicationResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportConnectionPossibilityApplicationResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportConnectionPossibilityApplicationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportConnectionPossibilityApplicationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportConnectionPossibilityApplicationResult property.
     */
    public List<ExportConnectionPossibilityApplicationType> getExportConnectionPossibilityApplicationResult() {
        if (exportConnectionPossibilityApplicationResult == null) {
            exportConnectionPossibilityApplicationResult = new ArrayList<>();
        }
        return this.exportConnectionPossibilityApplicationResult;
    }

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
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "13.2.5.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
