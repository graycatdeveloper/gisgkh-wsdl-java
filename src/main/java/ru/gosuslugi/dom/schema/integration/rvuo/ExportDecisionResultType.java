
package ru.gosuslugi.dom.schema.integration.rvuo;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Результат выполнения запроса на Результат экспорта информации о решении об определении управляющей организации
 * 
 * <p>Java class for exportDecisionResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportDecisionResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Decision" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}DecisionExportType" maxOccurs="1000"/>
 *         <choice>
 *           <element name="ExportDecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
@XmlType(name = "exportDecisionResultType", propOrder = {
    "decision",
    "exportDecisionGUID",
    "isLastPage"
})
public class ExportDecisionResultType {

    @XmlElement(name = "Decision", required = true)
    protected List<DecisionExportType> decision;
    /**
     * Идентификатор решения об определении управляющей организации для экспорта следующей 1000 решении об определении управляющей организации
     * 
     */
    @XmlElement(name = "ExportDecisionGUID")
    protected String exportDecisionGUID;
    /**
     * Последняя страница экспорта
     * 
     */
    @XmlElement(name = "IsLastPage")
    protected Boolean isLastPage;

    /**
     * Gets the value of the decision property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decision property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionExportType }
     * </p>
     * 
     * 
     * @return
     *     The value of the decision property.
     */
    public List<DecisionExportType> getDecision() {
        if (decision == null) {
            decision = new ArrayList<>();
        }
        return this.decision;
    }

    /**
     * Идентификатор решения об определении управляющей организации для экспорта следующей 1000 решении об определении управляющей организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportDecisionGUID() {
        return exportDecisionGUID;
    }

    /**
     * Sets the value of the exportDecisionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExportDecisionGUID()
     */
    public void setExportDecisionGUID(String value) {
        this.exportDecisionGUID = value;
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
