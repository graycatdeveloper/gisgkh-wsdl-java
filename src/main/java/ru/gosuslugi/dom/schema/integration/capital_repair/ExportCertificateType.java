
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемый акт выполненных работ (оказанных услуг)
 * 
 * <p>Java class for exportCertificateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportCertificateType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ExportShortCertificateType">
 *       <sequence>
 *         <element name="Work" maxOccurs="1000" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkCertificateType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}StatusType"/>
 *         <element name="CertificateGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportCertificateType", propOrder = {
    "work",
    "status",
    "certificateGuid"
})
public class ExportCertificateType
    extends ExportShortCertificateType
{

    /**
     * Работа в акте
     * 
     */
    @XmlElement(name = "Work")
    protected List<ExportCertificateType.Work> work;
    /**
     * Статус акта
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "token")
    protected StatusType status;
    /**
     * Идентификатор акта в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "CertificateGuid", required = true)
    protected String certificateGuid;

    /**
     * Работа в акте
     * 
     * Gets the value of the work property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the work property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportCertificateType.Work }
     * </p>
     * 
     * 
     * @return
     *     The value of the work property.
     */
    public List<ExportCertificateType.Work> getWork() {
        if (work == null) {
            work = new ArrayList<>();
        }
        return this.work;
    }

    /**
     * Статус акта
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Идентификатор акта в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateGuid() {
        return certificateGuid;
    }

    /**
     * Sets the value of the certificateGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCertificateGuid()
     */
    public void setCertificateGuid(String value) {
        this.certificateGuid = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkCertificateType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Work
        extends WorkCertificateType
    {


    }

}
