
package ru.gosuslugi.dom.schema.integration.outage_report;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий результат экспорта сведений о перерыве в предоставлении коммунальных услуг
 * 
 * <p>Java class for ExportOutageReportResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportOutageReportResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OutageReport" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}ExportOutageReportType" maxOccurs="1000"/>
 *         <choice>
 *           <element name="ExportOutageReportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
@XmlType(name = "ExportOutageReportResultType", propOrder = {
    "outageReport",
    "exportOutageReportGUID",
    "isLastPage"
})
public class ExportOutageReportResultType {

    /**
     * Сведения о перерыве в предоставлении коммунальных услуг
     * 
     */
    @XmlElement(name = "OutageReport", required = true)
    protected List<ExportOutageReportType> outageReport;
    /**
     * Идентификатор сведений о перерыве в предоставлении коммунальных услуг следующей 1000 записей
     * 
     */
    @XmlElement(name = "ExportOutageReportGUID")
    protected String exportOutageReportGUID;
    /**
     * Последняя страница экспорта
     * 
     */
    @XmlElement(name = "IsLastPage")
    protected Boolean isLastPage;

    /**
     * Сведения о перерыве в предоставлении коммунальных услуг
     * 
     * Gets the value of the outageReport property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageReport property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOutageReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportOutageReportType }
     * </p>
     * 
     * 
     * @return
     *     The value of the outageReport property.
     */
    public List<ExportOutageReportType> getOutageReport() {
        if (outageReport == null) {
            outageReport = new ArrayList<>();
        }
        return this.outageReport;
    }

    /**
     * Идентификатор сведений о перерыве в предоставлении коммунальных услуг следующей 1000 записей
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportOutageReportGUID() {
        return exportOutageReportGUID;
    }

    /**
     * Sets the value of the exportOutageReportGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExportOutageReportGUID()
     */
    public void setExportOutageReportGUID(String value) {
        this.exportOutageReportGUID = value;
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
