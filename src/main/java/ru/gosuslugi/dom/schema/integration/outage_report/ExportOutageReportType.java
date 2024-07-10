
package ru.gosuslugi.dom.schema.integration.outage_report;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий экспортируемые сведения о перерыве в предоставлении коммунальных услуг
 * 
 * <p>Java class for ExportOutageReportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportOutageReportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OutageReportData" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}ExportOutageReportDataType"/>
 *         <element name="OutageReportObjects" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}ExportOutageReportObjectResultType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportOutageReportType", propOrder = {
    "outageReportData",
    "outageReportObjects"
})
public class ExportOutageReportType {

    /**
     * Cведения о перерыве в предоставлении коммунальных услуг
     * 
     */
    @XmlElement(name = "OutageReportData", required = true)
    protected ExportOutageReportDataType outageReportData;
    /**
     * Список объектов жилого фонда, по которым планируется перерыв в предоставлении коммунальных услуг
     * 
     */
    @XmlElement(name = "OutageReportObjects", required = true)
    protected List<ExportOutageReportObjectResultType> outageReportObjects;

    /**
     * Cведения о перерыве в предоставлении коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link ExportOutageReportDataType }
     *     
     */
    public ExportOutageReportDataType getOutageReportData() {
        return outageReportData;
    }

    /**
     * Sets the value of the outageReportData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportOutageReportDataType }
     *     
     * @see #getOutageReportData()
     */
    public void setOutageReportData(ExportOutageReportDataType value) {
        this.outageReportData = value;
    }

    /**
     * Список объектов жилого фонда, по которым планируется перерыв в предоставлении коммунальных услуг
     * 
     * Gets the value of the outageReportObjects property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageReportObjects property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOutageReportObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportOutageReportObjectResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the outageReportObjects property.
     */
    public List<ExportOutageReportObjectResultType> getOutageReportObjects() {
        if (outageReportObjects == null) {
            outageReportObjects = new ArrayList<>();
        }
        return this.outageReportObjects;
    }

}
