
package ru.gosuslugi.dom.schema.integration.rap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Экспортируемое постановление и процессуальные документы
 * 
 * <p>Java class for ExportDecreeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportDecreeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DecreeGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="RegistryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ControlOrganization">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="DecreeInfo" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ExportDecreeInfoType"/>
 *         <element name="ProceduralDocuments" maxOccurs="1000" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/rap/}ExportProceduralDocumentType">
 *                 <sequence>
 *                   <element name="ProceduralDocumentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/rap/}DecreeStatusType"/>
 *         <element name="ChangeReason" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ExportChangeReasonType" minOccurs="0"/>
 *         <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ExportCancelReasonType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDecreeType", propOrder = {
    "decreeGUID",
    "registryNumber",
    "controlOrganization",
    "decreeInfo",
    "proceduralDocuments",
    "status",
    "changeReason",
    "cancelReason"
})
public class ExportDecreeType {

    /**
     * Идентификатор постановления в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "DecreeGUID", required = true)
    protected String decreeGUID;
    /**
     * Реестровый номер постановления
     * 
     */
    @XmlElement(name = "RegistryNumber")
    protected String registryNumber;
    /**
     * Организация, рассмотревшая дело
     * 
     */
    @XmlElement(name = "ControlOrganization", required = true)
    protected ExportDecreeType.ControlOrganization controlOrganization;
    /**
     * Данные постановления
     * 
     */
    @XmlElement(name = "DecreeInfo", required = true)
    protected ExportDecreeInfoType decreeInfo;
    /**
     * Процессуальные документы
     * 
     */
    @XmlElement(name = "ProceduralDocuments")
    protected List<ExportDecreeType.ProceduralDocuments> proceduralDocuments;
    /**
     * Статус в ГИС ЖКХ
     * Допустимые значения:
     * Published- размещено в ГИС ЖКХ.           Cancelled-отменено Annulled-аннулировано
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected DecreeStatusType status;
    /**
     * Причина последнего изменнения постановления
     * 
     */
    @XmlElement(name = "ChangeReason")
    protected ExportChangeReasonType changeReason;
    /**
     * Причина отмены постановления
     * 
     */
    @XmlElement(name = "CancelReason")
    protected ExportCancelReasonType cancelReason;

    /**
     * Идентификатор постановления в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecreeGUID() {
        return decreeGUID;
    }

    /**
     * Sets the value of the decreeGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDecreeGUID()
     */
    public void setDecreeGUID(String value) {
        this.decreeGUID = value;
    }

    /**
     * Реестровый номер постановления
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryNumber() {
        return registryNumber;
    }

    /**
     * Sets the value of the registryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegistryNumber()
     */
    public void setRegistryNumber(String value) {
        this.registryNumber = value;
    }

    /**
     * Организация, рассмотревшая дело
     * 
     * @return
     *     possible object is
     *     {@link ExportDecreeType.ControlOrganization }
     *     
     */
    public ExportDecreeType.ControlOrganization getControlOrganization() {
        return controlOrganization;
    }

    /**
     * Sets the value of the controlOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDecreeType.ControlOrganization }
     *     
     * @see #getControlOrganization()
     */
    public void setControlOrganization(ExportDecreeType.ControlOrganization value) {
        this.controlOrganization = value;
    }

    /**
     * Данные постановления
     * 
     * @return
     *     possible object is
     *     {@link ExportDecreeInfoType }
     *     
     */
    public ExportDecreeInfoType getDecreeInfo() {
        return decreeInfo;
    }

    /**
     * Sets the value of the decreeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDecreeInfoType }
     *     
     * @see #getDecreeInfo()
     */
    public void setDecreeInfo(ExportDecreeInfoType value) {
        this.decreeInfo = value;
    }

    /**
     * Процессуальные документы
     * 
     * Gets the value of the proceduralDocuments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proceduralDocuments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProceduralDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDecreeType.ProceduralDocuments }
     * </p>
     * 
     * 
     * @return
     *     The value of the proceduralDocuments property.
     */
    public List<ExportDecreeType.ProceduralDocuments> getProceduralDocuments() {
        if (proceduralDocuments == null) {
            proceduralDocuments = new ArrayList<>();
        }
        return this.proceduralDocuments;
    }

    /**
     * Статус в ГИС ЖКХ
     * Допустимые значения:
     * Published- размещено в ГИС ЖКХ.           Cancelled-отменено Annulled-аннулировано
     * 
     * @return
     *     possible object is
     *     {@link DecreeStatusType }
     *     
     */
    public DecreeStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecreeStatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(DecreeStatusType value) {
        this.status = value;
    }

    /**
     * Причина последнего изменнения постановления
     * 
     * @return
     *     possible object is
     *     {@link ExportChangeReasonType }
     *     
     */
    public ExportChangeReasonType getChangeReason() {
        return changeReason;
    }

    /**
     * Sets the value of the changeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportChangeReasonType }
     *     
     * @see #getChangeReason()
     */
    public void setChangeReason(ExportChangeReasonType value) {
        this.changeReason = value;
    }

    /**
     * Причина отмены постановления
     * 
     * @return
     *     possible object is
     *     {@link ExportCancelReasonType }
     *     
     */
    public ExportCancelReasonType getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCancelReasonType }
     *     
     * @see #getCancelReason()
     */
    public void setCancelReason(ExportCancelReasonType value) {
        this.cancelReason = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ControlOrganization
        extends RegOrgType
    {


    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/rap/}ExportProceduralDocumentType">
     *       <sequence>
     *         <element name="ProceduralDocumentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "proceduralDocumentGUID"
    })
    public static class ProceduralDocuments
        extends ExportProceduralDocumentType
    {

        /**
         * Идентификатор процессуального документа
         * 
         */
        @XmlElement(name = "ProceduralDocumentGUID", required = true)
        protected String proceduralDocumentGUID;

        /**
         * Идентификатор процессуального документа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProceduralDocumentGUID() {
            return proceduralDocumentGUID;
        }

        /**
         * Sets the value of the proceduralDocumentGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getProceduralDocumentGUID()
         */
        public void setProceduralDocumentGUID(String value) {
            this.proceduralDocumentGUID = value;
        }

    }

}
