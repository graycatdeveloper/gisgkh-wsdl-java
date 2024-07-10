
package ru.gosuslugi.dom.schema.integration.inspection;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="ImportExamination" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="ExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   </sequence>
 *                   <element name="SendToURI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <choice>
 *                     <sequence>
 *                       <choice>
 *                         <element name="Examination" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationType" minOccurs="0"/>
 *                         <element name="ResultsInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ResultsInfoType" minOccurs="0"/>
 *                       </choice>
 *                       <element name="ExaminationChangeInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationChangeInfoType" minOccurs="0"/>
 *                       <element name="ImportPrecept" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <sequence>
 *                                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                   <element name="PreceptGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                                 </sequence>
 *                                 <choice>
 *                                   <element name="Precept" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PreceptType"/>
 *                                   <element name="CancelPrecept" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
 *                                   <element name="FulfilePrecept" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}FulfilePreceptType"/>
 *                                   <element name="DeletePrecept" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                 </choice>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="ImportOffence" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <sequence>
 *                                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                   <element name="OffenceGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                                 </sequence>
 *                                 <choice>
 *                                   <element name="Offence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}OffenceType"/>
 *                                   <element name="AddSubmittedInformation" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}AddSubmittedInformationType"/>
 *                                   <element name="DeleteSubmittedInformation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                   <element name="CancelOffence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
 *                                   <element name="FulfileOffence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}FulfileOffenceType"/>
 *                                   <element name="DeleteOffence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                 </choice>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </sequence>
 *                     <element name="CancelExamination" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
 *                     <element name="AnnulExamination" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="CancelExaminationResults" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
 *                     <element name="AnnulExaminationResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.3.0.8""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importExamination"
})
@XmlRootElement(name = "importExaminationsRequest")
public class ImportExaminationsRequest
    extends BaseType
{

    /**
     * Импорт проверки
     * 
     */
    @XmlElement(name = "ImportExamination", required = true)
    protected List<ImportExaminationsRequest.ImportExamination> importExamination;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импорт проверки
     * 
     * Gets the value of the importExamination property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importExamination property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportExamination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportExaminationsRequest.ImportExamination }
     * </p>
     * 
     * 
     * @return
     *     The value of the importExamination property.
     */
    public List<ImportExaminationsRequest.ImportExamination> getImportExamination() {
        if (importExamination == null) {
            importExamination = new ArrayList<>();
        }
        return this.importExamination;
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
            return "11.3.0.8";
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
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *           <element name="ExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         </sequence>
     *         <element name="SendToURI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <choice>
     *           <sequence>
     *             <choice>
     *               <element name="Examination" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationType" minOccurs="0"/>
     *               <element name="ResultsInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ResultsInfoType" minOccurs="0"/>
     *             </choice>
     *             <element name="ExaminationChangeInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationChangeInfoType" minOccurs="0"/>
     *             <element name="ImportPrecept" maxOccurs="unbounded" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                     <sequence>
     *                       <sequence>
     *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                         <element name="PreceptGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                       </sequence>
     *                       <choice>
     *                         <element name="Precept" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PreceptType"/>
     *                         <element name="CancelPrecept" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
     *                         <element name="FulfilePrecept" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}FulfilePreceptType"/>
     *                         <element name="DeletePrecept" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                       </choice>
     *                     </sequence>
     *                   </restriction>
     *                 </complexContent>
     *               </complexType>
     *             </element>
     *             <element name="ImportOffence" maxOccurs="unbounded" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                     <sequence>
     *                       <sequence>
     *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                         <element name="OffenceGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                       </sequence>
     *                       <choice>
     *                         <element name="Offence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}OffenceType"/>
     *                         <element name="AddSubmittedInformation" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}AddSubmittedInformationType"/>
     *                         <element name="DeleteSubmittedInformation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                         <element name="CancelOffence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
     *                         <element name="FulfileOffence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}FulfileOffenceType"/>
     *                         <element name="DeleteOffence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                       </choice>
     *                     </sequence>
     *                   </restriction>
     *                 </complexContent>
     *               </complexType>
     *             </element>
     *           </sequence>
     *           <element name="CancelExamination" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
     *           <element name="AnnulExamination" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="CancelExaminationResults" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
     *           <element name="AnnulExaminationResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    @XmlType(name = "", propOrder = {
        "transportGUID",
        "examinationGuid",
        "sendToURI",
        "examination",
        "resultsInfo",
        "examinationChangeInfo",
        "importPrecept",
        "importOffence",
        "cancelExamination",
        "annulExamination",
        "cancelExaminationResults",
        "annulExaminationResults"
    })
    public static class ImportExamination {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор проверки в ГИС ЖКХ.
         * 
         */
        @XmlElement(name = "ExaminationGuid")
        protected String examinationGuid;
        /**
         * Отправить в ЕРП. (Выполняется отправка в ЕРП всех ранее не размещенных в ЕРП сведений о проверке и её результате)                                                     Отправка в ЕРП доступна для следующих сценариев: 1. Добавление проверки   2. Изменение проверки       3. Добавление результата проверки                            4. Отмена результата проверки                             5. Изменение результата проверки                         6. Создание предписания    7. Исполнение предписания 8. Удаление предписания                                            Для остальных сценариев отправка в ЕРП не осуществляется, значение признака будет проигнорировано Системой.
         * 
         */
        @XmlElement(name = "SendToURI")
        protected Boolean sendToURI;
        /**
         * Проверка. Не заполняется при импорте предписаний и протоколов к существующей проверке
         * 
         */
        @XmlElement(name = "Examination")
        protected ExaminationType examination;
        /**
         * Добавление сведений о результатах проверки. Заполняется, если сведения о самой проверке не изменяются
         * 
         */
        @XmlElement(name = "ResultsInfo")
        protected ResultsInfoType resultsInfo;
        /**
         * Информация об изменении проверки.
         * 
         */
        @XmlElement(name = "ExaminationChangeInfo")
        protected ExaminationChangeInfoType examinationChangeInfo;
        /**
         * Предписание
         * 
         */
        @XmlElement(name = "ImportPrecept")
        protected List<ImportExaminationsRequest.ImportExamination.ImportPrecept> importPrecept;
        /**
         * Протокол
         * 
         */
        @XmlElement(name = "ImportOffence")
        protected List<ImportExaminationsRequest.ImportExamination.ImportOffence> importOffence;
        /**
         * Отмена проверки.
         * 
         */
        @XmlElement(name = "CancelExamination")
        protected CancelledInfoWithAttachmentsType cancelExamination;
        /**
         * Аннулирование проверки.
         * 
         */
        @XmlElement(name = "AnnulExamination")
        protected Boolean annulExamination;
        /**
         * Информация об отмене результата.
         * 
         */
        @XmlElement(name = "CancelExaminationResults")
        protected CancelledInfoWithAttachmentsType cancelExaminationResults;
        /**
         * Аннулировать результат проверки.
         * 
         */
        @XmlElement(name = "AnnulExaminationResults")
        protected Boolean annulExaminationResults;

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
        }

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
         * Отправить в ЕРП. (Выполняется отправка в ЕРП всех ранее не размещенных в ЕРП сведений о проверке и её результате)                                                     Отправка в ЕРП доступна для следующих сценариев: 1. Добавление проверки   2. Изменение проверки       3. Добавление результата проверки                            4. Отмена результата проверки                             5. Изменение результата проверки                         6. Создание предписания    7. Исполнение предписания 8. Удаление предписания                                            Для остальных сценариев отправка в ЕРП не осуществляется, значение признака будет проигнорировано Системой.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSendToURI() {
            return sendToURI;
        }

        /**
         * Sets the value of the sendToURI property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isSendToURI()
         */
        public void setSendToURI(Boolean value) {
            this.sendToURI = value;
        }

        /**
         * Проверка. Не заполняется при импорте предписаний и протоколов к существующей проверке
         * 
         * @return
         *     possible object is
         *     {@link ExaminationType }
         *     
         */
        public ExaminationType getExamination() {
            return examination;
        }

        /**
         * Sets the value of the examination property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExaminationType }
         *     
         * @see #getExamination()
         */
        public void setExamination(ExaminationType value) {
            this.examination = value;
        }

        /**
         * Добавление сведений о результатах проверки. Заполняется, если сведения о самой проверке не изменяются
         * 
         * @return
         *     possible object is
         *     {@link ResultsInfoType }
         *     
         */
        public ResultsInfoType getResultsInfo() {
            return resultsInfo;
        }

        /**
         * Sets the value of the resultsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultsInfoType }
         *     
         * @see #getResultsInfo()
         */
        public void setResultsInfo(ResultsInfoType value) {
            this.resultsInfo = value;
        }

        /**
         * Информация об изменении проверки.
         * 
         * @return
         *     possible object is
         *     {@link ExaminationChangeInfoType }
         *     
         */
        public ExaminationChangeInfoType getExaminationChangeInfo() {
            return examinationChangeInfo;
        }

        /**
         * Sets the value of the examinationChangeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExaminationChangeInfoType }
         *     
         * @see #getExaminationChangeInfo()
         */
        public void setExaminationChangeInfo(ExaminationChangeInfoType value) {
            this.examinationChangeInfo = value;
        }

        /**
         * Предписание
         * 
         * Gets the value of the importPrecept property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the importPrecept property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getImportPrecept().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportExaminationsRequest.ImportExamination.ImportPrecept }
         * </p>
         * 
         * 
         * @return
         *     The value of the importPrecept property.
         */
        public List<ImportExaminationsRequest.ImportExamination.ImportPrecept> getImportPrecept() {
            if (importPrecept == null) {
                importPrecept = new ArrayList<>();
            }
            return this.importPrecept;
        }

        /**
         * Протокол
         * 
         * Gets the value of the importOffence property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the importOffence property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getImportOffence().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportExaminationsRequest.ImportExamination.ImportOffence }
         * </p>
         * 
         * 
         * @return
         *     The value of the importOffence property.
         */
        public List<ImportExaminationsRequest.ImportExamination.ImportOffence> getImportOffence() {
            if (importOffence == null) {
                importOffence = new ArrayList<>();
            }
            return this.importOffence;
        }

        /**
         * Отмена проверки.
         * 
         * @return
         *     possible object is
         *     {@link CancelledInfoWithAttachmentsType }
         *     
         */
        public CancelledInfoWithAttachmentsType getCancelExamination() {
            return cancelExamination;
        }

        /**
         * Sets the value of the cancelExamination property.
         * 
         * @param value
         *     allowed object is
         *     {@link CancelledInfoWithAttachmentsType }
         *     
         * @see #getCancelExamination()
         */
        public void setCancelExamination(CancelledInfoWithAttachmentsType value) {
            this.cancelExamination = value;
        }

        /**
         * Аннулирование проверки.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAnnulExamination() {
            return annulExamination;
        }

        /**
         * Sets the value of the annulExamination property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isAnnulExamination()
         */
        public void setAnnulExamination(Boolean value) {
            this.annulExamination = value;
        }

        /**
         * Информация об отмене результата.
         * 
         * @return
         *     possible object is
         *     {@link CancelledInfoWithAttachmentsType }
         *     
         */
        public CancelledInfoWithAttachmentsType getCancelExaminationResults() {
            return cancelExaminationResults;
        }

        /**
         * Sets the value of the cancelExaminationResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link CancelledInfoWithAttachmentsType }
         *     
         * @see #getCancelExaminationResults()
         */
        public void setCancelExaminationResults(CancelledInfoWithAttachmentsType value) {
            this.cancelExaminationResults = value;
        }

        /**
         * Аннулировать результат проверки.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAnnulExaminationResults() {
            return annulExaminationResults;
        }

        /**
         * Sets the value of the annulExaminationResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isAnnulExaminationResults()
         */
        public void setAnnulExaminationResults(Boolean value) {
            this.annulExaminationResults = value;
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
         *         <sequence>
         *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *           <element name="OffenceGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         </sequence>
         *         <choice>
         *           <element name="Offence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}OffenceType"/>
         *           <element name="AddSubmittedInformation" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}AddSubmittedInformationType"/>
         *           <element name="DeleteSubmittedInformation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *           <element name="CancelOffence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
         *           <element name="FulfileOffence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}FulfileOffenceType"/>
         *           <element name="DeleteOffence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        @XmlType(name = "", propOrder = {
            "transportGUID",
            "offenceGuid",
            "offence",
            "addSubmittedInformation",
            "deleteSubmittedInformation",
            "cancelOffence",
            "fulfileOffence",
            "deleteOffence"
        })
        public static class ImportOffence {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Идентификатор протокола в ГИС ЖКХ. Заполняется:
             * *при отмене/исполнении протокола; 
             * *при добавлении/ изменении/ удаления сведений о передаче материалов по делу об административном правонарушении в суд.
             * 
             */
            @XmlElement(name = "OffenceGuid")
            protected String offenceGuid;
            /**
             * Создание протокола
             * 
             */
            @XmlElement(name = "Offence")
            protected OffenceType offence;
            /**
             * Протокол. Добавить сведения о передаче материалов по делу об административном правонарушении в суд.
             * 
             */
            @XmlElement(name = "AddSubmittedInformation")
            protected AddSubmittedInformationType addSubmittedInformation;
            /**
             * Протокол. Удалить сведения о передаче материалов по делу об административном правонарушении в суд.
             * 
             */
            @XmlElement(name = "DeleteSubmittedInformation")
            protected Boolean deleteSubmittedInformation;
            /**
             * Отмена протокола
             * 
             */
            @XmlElement(name = "CancelOffence")
            protected CancelledInfoWithAttachmentsType cancelOffence;
            /**
             * Сведения об исполнении протокола
             * 
             */
            @XmlElement(name = "FulfileOffence")
            protected FulfileOffenceType fulfileOffence;
            /**
             * Удаление протокола
             * 
             */
            @XmlElement(name = "DeleteOffence")
            protected Boolean deleteOffence;

            /**
             * Транспортный идентификатор
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransportGUID() {
                return transportGUID;
            }

            /**
             * Sets the value of the transportGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getTransportGUID()
             */
            public void setTransportGUID(String value) {
                this.transportGUID = value;
            }

            /**
             * Идентификатор протокола в ГИС ЖКХ. Заполняется:
             * *при отмене/исполнении протокола; 
             * *при добавлении/ изменении/ удаления сведений о передаче материалов по делу об административном правонарушении в суд.
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
             * Создание протокола
             * 
             * @return
             *     possible object is
             *     {@link OffenceType }
             *     
             */
            public OffenceType getOffence() {
                return offence;
            }

            /**
             * Sets the value of the offence property.
             * 
             * @param value
             *     allowed object is
             *     {@link OffenceType }
             *     
             * @see #getOffence()
             */
            public void setOffence(OffenceType value) {
                this.offence = value;
            }

            /**
             * Протокол. Добавить сведения о передаче материалов по делу об административном правонарушении в суд.
             * 
             * @return
             *     possible object is
             *     {@link AddSubmittedInformationType }
             *     
             */
            public AddSubmittedInformationType getAddSubmittedInformation() {
                return addSubmittedInformation;
            }

            /**
             * Sets the value of the addSubmittedInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddSubmittedInformationType }
             *     
             * @see #getAddSubmittedInformation()
             */
            public void setAddSubmittedInformation(AddSubmittedInformationType value) {
                this.addSubmittedInformation = value;
            }

            /**
             * Протокол. Удалить сведения о передаче материалов по делу об административном правонарушении в суд.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDeleteSubmittedInformation() {
                return deleteSubmittedInformation;
            }

            /**
             * Sets the value of the deleteSubmittedInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isDeleteSubmittedInformation()
             */
            public void setDeleteSubmittedInformation(Boolean value) {
                this.deleteSubmittedInformation = value;
            }

            /**
             * Отмена протокола
             * 
             * @return
             *     possible object is
             *     {@link CancelledInfoWithAttachmentsType }
             *     
             */
            public CancelledInfoWithAttachmentsType getCancelOffence() {
                return cancelOffence;
            }

            /**
             * Sets the value of the cancelOffence property.
             * 
             * @param value
             *     allowed object is
             *     {@link CancelledInfoWithAttachmentsType }
             *     
             * @see #getCancelOffence()
             */
            public void setCancelOffence(CancelledInfoWithAttachmentsType value) {
                this.cancelOffence = value;
            }

            /**
             * Сведения об исполнении протокола
             * 
             * @return
             *     possible object is
             *     {@link FulfileOffenceType }
             *     
             */
            public FulfileOffenceType getFulfileOffence() {
                return fulfileOffence;
            }

            /**
             * Sets the value of the fulfileOffence property.
             * 
             * @param value
             *     allowed object is
             *     {@link FulfileOffenceType }
             *     
             * @see #getFulfileOffence()
             */
            public void setFulfileOffence(FulfileOffenceType value) {
                this.fulfileOffence = value;
            }

            /**
             * Удаление протокола
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDeleteOffence() {
                return deleteOffence;
            }

            /**
             * Sets the value of the deleteOffence property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isDeleteOffence()
             */
            public void setDeleteOffence(Boolean value) {
                this.deleteOffence = value;
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
         *         <sequence>
         *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *           <element name="PreceptGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         </sequence>
         *         <choice>
         *           <element name="Precept" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PreceptType"/>
         *           <element name="CancelPrecept" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
         *           <element name="FulfilePrecept" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}FulfilePreceptType"/>
         *           <element name="DeletePrecept" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        @XmlType(name = "", propOrder = {
            "transportGUID",
            "preceptGuid",
            "precept",
            "cancelPrecept",
            "fulfilePrecept",
            "deletePrecept"
        })
        public static class ImportPrecept {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Идентификатор предписания в ГИС ЖКХ. Заполняется только при отмене или исполнении предписания
             * 
             */
            @XmlElement(name = "PreceptGuid")
            protected String preceptGuid;
            /**
             * Создание предписания
             * 
             */
            @XmlElement(name = "Precept")
            protected PreceptType precept;
            /**
             * Отмена (отзыв) предписания
             * 
             */
            @XmlElement(name = "CancelPrecept")
            protected CancelledInfoWithAttachmentsType cancelPrecept;
            /**
             * Сведения об исполнении предписания
             * 
             */
            @XmlElement(name = "FulfilePrecept")
            protected FulfilePreceptType fulfilePrecept;
            /**
             * Удаление предписания
             * 
             */
            @XmlElement(name = "DeletePrecept")
            protected Boolean deletePrecept;

            /**
             * Транспортный идентификатор
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransportGUID() {
                return transportGUID;
            }

            /**
             * Sets the value of the transportGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getTransportGUID()
             */
            public void setTransportGUID(String value) {
                this.transportGUID = value;
            }

            /**
             * Идентификатор предписания в ГИС ЖКХ. Заполняется только при отмене или исполнении предписания
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
             * Создание предписания
             * 
             * @return
             *     possible object is
             *     {@link PreceptType }
             *     
             */
            public PreceptType getPrecept() {
                return precept;
            }

            /**
             * Sets the value of the precept property.
             * 
             * @param value
             *     allowed object is
             *     {@link PreceptType }
             *     
             * @see #getPrecept()
             */
            public void setPrecept(PreceptType value) {
                this.precept = value;
            }

            /**
             * Отмена (отзыв) предписания
             * 
             * @return
             *     possible object is
             *     {@link CancelledInfoWithAttachmentsType }
             *     
             */
            public CancelledInfoWithAttachmentsType getCancelPrecept() {
                return cancelPrecept;
            }

            /**
             * Sets the value of the cancelPrecept property.
             * 
             * @param value
             *     allowed object is
             *     {@link CancelledInfoWithAttachmentsType }
             *     
             * @see #getCancelPrecept()
             */
            public void setCancelPrecept(CancelledInfoWithAttachmentsType value) {
                this.cancelPrecept = value;
            }

            /**
             * Сведения об исполнении предписания
             * 
             * @return
             *     possible object is
             *     {@link FulfilePreceptType }
             *     
             */
            public FulfilePreceptType getFulfilePrecept() {
                return fulfilePrecept;
            }

            /**
             * Sets the value of the fulfilePrecept property.
             * 
             * @param value
             *     allowed object is
             *     {@link FulfilePreceptType }
             *     
             * @see #getFulfilePrecept()
             */
            public void setFulfilePrecept(FulfilePreceptType value) {
                this.fulfilePrecept = value;
            }

            /**
             * Удаление предписания
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDeletePrecept() {
                return deletePrecept;
            }

            /**
             * Sets the value of the deletePrecept property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isDeletePrecept()
             */
            public void setDeletePrecept(Boolean value) {
                this.deletePrecept = value;
            }

        }

    }

}
