
package ru.gosuslugi.dom.schema.integration.msp;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       <choice>
 *         <element name="ImportResult" type="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType" maxOccurs="unbounded"/>
 *         <element name="Category" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ExportCategoryType" maxOccurs="unbounded"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *         <element name="CitizenSubsidy" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ExportCitizenSubsidyType" maxOccurs="1000"/>
 *         <element name="CitizenCompensation" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ExportCitizenCompensationType" maxOccurs="1000"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.0.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importResult",
    "category",
    "errorMessage",
    "citizenSubsidy",
    "citizenCompensation"
})
@XmlRootElement(name = "getStateResult")
public class GetStateResult
    extends BaseAsyncResponseType
{

    /**
     * Результат импорта
     * 
     */
    @XmlElement(name = "ImportResult")
    protected List<CommonResultType> importResult;
    /**
     * Информация об отдельной категории граждан
     * 
     */
    @XmlElement(name = "Category")
    protected List<ExportCategoryType> category;
    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     */
    @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected ErrorMessageType errorMessage;
    /**
     * Информация о гражданах, получающих субсидии
     * 
     */
    @XmlElement(name = "CitizenSubsidy")
    protected List<ExportCitizenSubsidyType> citizenSubsidy;
    /**
     * Информация о гражданах, получающих компенсации расходов
     * 
     */
    @XmlElement(name = "CitizenCompensation")
    protected List<ExportCitizenCompensationType> citizenCompensation;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Результат импорта
     * 
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

    /**
     * Информация об отдельной категории граждан
     * 
     * Gets the value of the category property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportCategoryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the category property.
     */
    public List<ExportCategoryType> getCategory() {
        if (category == null) {
            category = new ArrayList<>();
        }
        return this.category;
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
     * Информация о гражданах, получающих субсидии
     * 
     * Gets the value of the citizenSubsidy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenSubsidy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCitizenSubsidy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportCitizenSubsidyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the citizenSubsidy property.
     */
    public List<ExportCitizenSubsidyType> getCitizenSubsidy() {
        if (citizenSubsidy == null) {
            citizenSubsidy = new ArrayList<>();
        }
        return this.citizenSubsidy;
    }

    /**
     * Информация о гражданах, получающих компенсации расходов
     * 
     * Gets the value of the citizenCompensation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenCompensation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCitizenCompensation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportCitizenCompensationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the citizenCompensation property.
     */
    public List<ExportCitizenCompensationType> getCitizenCompensation() {
        if (citizenCompensation == null) {
            citizenCompensation = new ArrayList<>();
        }
        return this.citizenCompensation;
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
            return "11.0.0.1";
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
