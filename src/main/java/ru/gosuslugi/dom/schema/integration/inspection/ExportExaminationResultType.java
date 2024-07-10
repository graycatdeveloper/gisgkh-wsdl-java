
package ru.gosuslugi.dom.schema.integration.inspection;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемая проверка.
 * 
 * <p>Java class for exportExaminationResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportExaminationResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="RegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type" minOccurs="0"/>
 *         <element name="ExaminationState" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationStateType"/>
 *         <element name="ExaminationVersionState" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationVersionStateType"/>
 *         <element name="AnnulledResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Examination" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}exportExaminationType"/>
 *         <element name="ExportPrecept" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PreceptGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="PreceptState" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PreceptStateType"/>
 *                   <element name="Precept" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}exportPreceptType"/>
 *                   <element name="CancelledInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportCancelledInfoWithAttachmentsType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ExportOffence" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="OffenceGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="OffenceState" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}OffenceStateType"/>
 *                   <element name="Offence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}exportOffenceType"/>
 *                   <element name="CancelledInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportCancelledInfoWithAttachmentsType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportExaminationResultType", propOrder = {
    "examinationGuid",
    "registryNumber",
    "examinationState",
    "examinationVersionState",
    "annulledResult",
    "examination",
    "exportPrecept",
    "exportOffence"
})
public class ExportExaminationResultType {

    /**
     * Идентификатор проверки в ГИС ЖКХ.
     * 
     */
    @XmlElement(name = "ExaminationGuid", required = true)
    protected String examinationGuid;
    /**
     * Реестровый номер проверки.
     * 
     */
    @XmlElement(name = "RegistryNumber")
    protected String registryNumber;
    /**
     * Статус проверки:                Planned - Запланировна         Assigned - Назначена
     * Cancelled - Отменена
     * Finished - Завершена
     * Annulled - Аннулирована
     * 
     */
    @XmlElement(name = "ExaminationState", required = true)
    @XmlSchemaType(name = "token")
    protected ExaminationStateType examinationState;
    /**
     * Статус версии проверки 
     * Active - Действующая
     * 
     */
    @XmlElement(name = "ExaminationVersionState", required = true)
    @XmlSchemaType(name = "token")
    protected ExaminationVersionStateType examinationVersionState;
    /**
     * У проверки установлен признак "Аннулирован результат"
     * 
     */
    @XmlElement(name = "AnnulledResult")
    protected Boolean annulledResult;
    /**
     * Проверка.
     * 
     */
    @XmlElement(name = "Examination", required = true)
    protected ExportExaminationType examination;
    /**
     * Предписание.
     * 
     */
    @XmlElement(name = "ExportPrecept")
    protected List<ExportExaminationResultType.ExportPrecept> exportPrecept;
    /**
     * Протокол.
     * 
     */
    @XmlElement(name = "ExportOffence")
    protected List<ExportExaminationResultType.ExportOffence> exportOffence;

    /**
     * Идентификатор проверки в ГИС ЖКХ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationGuid() {
        return examinationGuid;
    }

    /**
     * Sets the value of the examinationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExaminationGuid()
     */
    public void setExaminationGuid(String value) {
        this.examinationGuid = value;
    }

    /**
     * Реестровый номер проверки.
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
     * Статус проверки:                Planned - Запланировна         Assigned - Назначена
     * Cancelled - Отменена
     * Finished - Завершена
     * Annulled - Аннулирована
     * 
     * @return
     *     possible object is
     *     {@link ExaminationStateType }
     *     
     */
    public ExaminationStateType getExaminationState() {
        return examinationState;
    }

    /**
     * Sets the value of the examinationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminationStateType }
     *     
     * @see #getExaminationState()
     */
    public void setExaminationState(ExaminationStateType value) {
        this.examinationState = value;
    }

    /**
     * Статус версии проверки 
     * Active - Действующая
     * 
     * @return
     *     possible object is
     *     {@link ExaminationVersionStateType }
     *     
     */
    public ExaminationVersionStateType getExaminationVersionState() {
        return examinationVersionState;
    }

    /**
     * Sets the value of the examinationVersionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminationVersionStateType }
     *     
     * @see #getExaminationVersionState()
     */
    public void setExaminationVersionState(ExaminationVersionStateType value) {
        this.examinationVersionState = value;
    }

    /**
     * У проверки установлен признак "Аннулирован результат"
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnulledResult() {
        return annulledResult;
    }

    /**
     * Sets the value of the annulledResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAnnulledResult()
     */
    public void setAnnulledResult(Boolean value) {
        this.annulledResult = value;
    }

    /**
     * Проверка.
     * 
     * @return
     *     possible object is
     *     {@link ExportExaminationType }
     *     
     */
    public ExportExaminationType getExamination() {
        return examination;
    }

    /**
     * Sets the value of the examination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportExaminationType }
     *     
     * @see #getExamination()
     */
    public void setExamination(ExportExaminationType value) {
        this.examination = value;
    }

    /**
     * Предписание.
     * 
     * Gets the value of the exportPrecept property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportPrecept property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportPrecept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportExaminationResultType.ExportPrecept }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportPrecept property.
     */
    public List<ExportExaminationResultType.ExportPrecept> getExportPrecept() {
        if (exportPrecept == null) {
            exportPrecept = new ArrayList<>();
        }
        return this.exportPrecept;
    }

    /**
     * Протокол.
     * 
     * Gets the value of the exportOffence property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportOffence property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportOffence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportExaminationResultType.ExportOffence }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportOffence property.
     */
    public List<ExportExaminationResultType.ExportOffence> getExportOffence() {
        if (exportOffence == null) {
            exportOffence = new ArrayList<>();
        }
        return this.exportOffence;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="OffenceGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="OffenceState" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}OffenceStateType"/>
     *         <element name="Offence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}exportOffenceType"/>
     *         <element name="CancelledInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportCancelledInfoWithAttachmentsType" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offenceGuid",
        "offenceState",
        "offence",
        "cancelledInfo"
    })
    public static class ExportOffence {

        /**
         * Идентификатор протокола в ГИС ЖКХ.
         * 
         */
        @XmlElement(name = "OffenceGuid", required = true)
        protected String offenceGuid;
        /**
         * Статус протокола.
         * 
         */
        @XmlElement(name = "OffenceState", required = true)
        @XmlSchemaType(name = "token")
        protected OffenceStateType offenceState;
        /**
         * Реквизиты протокола.
         * 
         */
        @XmlElement(name = "Offence", required = true)
        protected ExportOffenceType offence;
        /**
         * Сведения об отмене протокола.
         * 
         */
        @XmlElement(name = "CancelledInfo")
        protected ExportCancelledInfoWithAttachmentsType cancelledInfo;

        /**
         * Идентификатор протокола в ГИС ЖКХ.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffenceGuid() {
            return offenceGuid;
        }

        /**
         * Sets the value of the offenceGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOffenceGuid()
         */
        public void setOffenceGuid(String value) {
            this.offenceGuid = value;
        }

        /**
         * Статус протокола.
         * 
         * @return
         *     possible object is
         *     {@link OffenceStateType }
         *     
         */
        public OffenceStateType getOffenceState() {
            return offenceState;
        }

        /**
         * Sets the value of the offenceState property.
         * 
         * @param value
         *     allowed object is
         *     {@link OffenceStateType }
         *     
         * @see #getOffenceState()
         */
        public void setOffenceState(OffenceStateType value) {
            this.offenceState = value;
        }

        /**
         * Реквизиты протокола.
         * 
         * @return
         *     possible object is
         *     {@link ExportOffenceType }
         *     
         */
        public ExportOffenceType getOffence() {
            return offence;
        }

        /**
         * Sets the value of the offence property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportOffenceType }
         *     
         * @see #getOffence()
         */
        public void setOffence(ExportOffenceType value) {
            this.offence = value;
        }

        /**
         * Сведения об отмене протокола.
         * 
         * @return
         *     possible object is
         *     {@link ExportCancelledInfoWithAttachmentsType }
         *     
         */
        public ExportCancelledInfoWithAttachmentsType getCancelledInfo() {
            return cancelledInfo;
        }

        /**
         * Sets the value of the cancelledInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportCancelledInfoWithAttachmentsType }
         *     
         * @see #getCancelledInfo()
         */
        public void setCancelledInfo(ExportCancelledInfoWithAttachmentsType value) {
            this.cancelledInfo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="PreceptGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="PreceptState" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PreceptStateType"/>
     *         <element name="Precept" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}exportPreceptType"/>
     *         <element name="CancelledInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportCancelledInfoWithAttachmentsType" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "preceptGuid",
        "preceptState",
        "precept",
        "cancelledInfo"
    })
    public static class ExportPrecept {

        /**
         * Идентификатор предписания в ГИС ЖКХ.
         * 
         */
        @XmlElement(name = "PreceptGuid", required = true)
        protected String preceptGuid;
        /**
         * Статус предписания
         * 
         */
        @XmlElement(name = "PreceptState", required = true)
        @XmlSchemaType(name = "token")
        protected PreceptStateType preceptState;
        /**
         * Реквизиты предписания.
         * 
         */
        @XmlElement(name = "Precept", required = true)
        protected ExportPreceptType precept;
        /**
         * Сведения об отмене предписания.
         * 
         */
        @XmlElement(name = "CancelledInfo")
        protected ExportCancelledInfoWithAttachmentsType cancelledInfo;

        /**
         * Идентификатор предписания в ГИС ЖКХ.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreceptGuid() {
            return preceptGuid;
        }

        /**
         * Sets the value of the preceptGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPreceptGuid()
         */
        public void setPreceptGuid(String value) {
            this.preceptGuid = value;
        }

        /**
         * Статус предписания
         * 
         * @return
         *     possible object is
         *     {@link PreceptStateType }
         *     
         */
        public PreceptStateType getPreceptState() {
            return preceptState;
        }

        /**
         * Sets the value of the preceptState property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreceptStateType }
         *     
         * @see #getPreceptState()
         */
        public void setPreceptState(PreceptStateType value) {
            this.preceptState = value;
        }

        /**
         * Реквизиты предписания.
         * 
         * @return
         *     possible object is
         *     {@link ExportPreceptType }
         *     
         */
        public ExportPreceptType getPrecept() {
            return precept;
        }

        /**
         * Sets the value of the precept property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportPreceptType }
         *     
         * @see #getPrecept()
         */
        public void setPrecept(ExportPreceptType value) {
            this.precept = value;
        }

        /**
         * Сведения об отмене предписания.
         * 
         * @return
         *     possible object is
         *     {@link ExportCancelledInfoWithAttachmentsType }
         *     
         */
        public ExportCancelledInfoWithAttachmentsType getCancelledInfo() {
            return cancelledInfo;
        }

        /**
         * Sets the value of the cancelledInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportCancelledInfoWithAttachmentsType }
         *     
         * @see #getCancelledInfo()
         */
        public void setCancelledInfo(ExportCancelledInfoWithAttachmentsType value) {
            this.cancelledInfo = value;
        }

    }

}
