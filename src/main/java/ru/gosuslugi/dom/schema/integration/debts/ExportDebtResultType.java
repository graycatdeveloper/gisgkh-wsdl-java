
package ru.gosuslugi.dom.schema.integration.debts;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий результат экспорта сведений о задолженности за ЖКУ
 * 
 * <p>Java class for ExportDebtResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportDebtResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Debt" type="{http://dom.gosuslugi.ru/schema/integration/debts/}ExportDebtDataType" maxOccurs="1000"/>
 *         <choice>
 *           <element name="ExportDebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="IsLastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDebtResultType", propOrder = {
    "debt",
    "exportDebtGUID",
    "isLastPage"
})
public class ExportDebtResultType {

    /**
     * Сведения о задолженности за ЖКУ
     * 
     */
    @XmlElement(name = "Debt", required = true)
    protected List<ExportDebtDataType> debt;
    /**
     * Идентификатор сведений о задолженности за ЖКУ для экспорта следующей 1000 записей
     * 
     */
    @XmlElement(name = "ExportDebtGUID")
    protected String exportDebtGUID;
    /**
     * Последняя страница экспорта
     * 
     */
    @XmlElement(name = "IsLastPage")
    protected Boolean isLastPage;

    /**
     * Сведения о задолженности за ЖКУ
     * 
     * Gets the value of the debt property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debt property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDebt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDebtDataType }
     * </p>
     * 
     * 
     * @return
     *     The value of the debt property.
     */
    public List<ExportDebtDataType> getDebt() {
        if (debt == null) {
            debt = new ArrayList<>();
        }
        return this.debt;
    }

    /**
     * Идентификатор сведений о задолженности за ЖКУ для экспорта следующей 1000 записей
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportDebtGUID() {
        return exportDebtGUID;
    }

    /**
     * Sets the value of the exportDebtGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExportDebtGUID()
     */
    public void setExportDebtGUID(String value) {
        this.exportDebtGUID = value;
    }

    /**
     * Последняя страница экспорта
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLastPage() {
        return isLastPage;
    }

    /**
     * Sets the value of the isLastPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsLastPage()
     */
    public void setIsLastPage(Boolean value) {
        this.isLastPage = value;
    }

}
