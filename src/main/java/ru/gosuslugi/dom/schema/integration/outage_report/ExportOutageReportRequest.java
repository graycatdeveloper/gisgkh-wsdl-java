
package ru.gosuslugi.dom.schema.integration.outage_report;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="ExportCriteria" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}ExportCriteriaOutageReportType"/>
 *         <element name="NextPageExportRequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.2.2.0""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exportCriteria",
    "nextPageExportRequestGUID"
})
@XmlRootElement(name = "exportOutageReportRequest")
public class ExportOutageReportRequest
    extends BaseType
{

    /**
     * Критерии экспорта сведений о перерывах в предоставлении коммунальных услуг
     * 
     */
    @XmlElement(name = "ExportCriteria", required = true)
    protected ExportCriteriaOutageReportType exportCriteria;
    /**
     * Идентификатор, используемый для экспорта 2-го и последующих блоков данных.
     * 
     * Если в элементе exportOutageReportRequest указаны условия отбора по атрибутам запроса, то экспорт осуществляется блоками по 1000 записей в каждом блоке (последний блок может содержать меньшее число записей).
     * Элемент NextPageExportRequestGUID не указывается для экспорта первого блока данных. Для экспорта каждого следующего блока данных в элементе NextPageExportRequestGUID должно указываться значение элемента tns:getStateResult/tns:ExportOutageReport/tns:ExportOutageReportGUID, полученное при экспорте предыдущего блока данных
     * 
     */
    @XmlElement(name = "NextPageExportRequestGUID")
    protected String nextPageExportRequestGUID;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Критерии экспорта сведений о перерывах в предоставлении коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link ExportCriteriaOutageReportType }
     *     
     */
    public ExportCriteriaOutageReportType getExportCriteria() {
        return exportCriteria;
    }

    /**
     * Sets the value of the exportCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCriteriaOutageReportType }
     *     
     * @see #getExportCriteria()
     */
    public void setExportCriteria(ExportCriteriaOutageReportType value) {
        this.exportCriteria = value;
    }

    /**
     * Идентификатор, используемый для экспорта 2-го и последующих блоков данных.
     * 
     * Если в элементе exportOutageReportRequest указаны условия отбора по атрибутам запроса, то экспорт осуществляется блоками по 1000 записей в каждом блоке (последний блок может содержать меньшее число записей).
     * Элемент NextPageExportRequestGUID не указывается для экспорта первого блока данных. Для экспорта каждого следующего блока данных в элементе NextPageExportRequestGUID должно указываться значение элемента tns:getStateResult/tns:ExportOutageReport/tns:ExportOutageReportGUID, полученное при экспорте предыдущего блока данных
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPageExportRequestGUID() {
        return nextPageExportRequestGUID;
    }

    /**
     * Sets the value of the nextPageExportRequestGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNextPageExportRequestGUID()
     */
    public void setNextPageExportRequestGUID(String value) {
        this.nextPageExportRequestGUID = value;
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
            return "13.2.2.0";
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