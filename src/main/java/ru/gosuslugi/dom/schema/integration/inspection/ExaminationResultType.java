
package ru.gosuslugi.dom.schema.integration.inspection;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Результат проверки.
 * 
 * <p>Java class for ExaminationResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExaminationResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocumentType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="InformationResultType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type"/>
 *         <element name="Date" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateTimeType"/>
 *         <choice>
 *           <element name="HasNoOffence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <sequence>
 *             <element name="HasOffence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             <element name="IdentifiedOffencesInfo" minOccurs="0">
 *               <complexType>
 *                 <complexContent>
 *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     <sequence>
 *                       <element name="NatureOffence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                       <element name="DetailsMismatch" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                       <element name="RegulationOffencedLegalAct" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String1024Type" minOccurs="0"/>
 *                       <element name="OtherMismatch" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String1024Type" minOccurs="0"/>
 *                       <element name="PersonsOffenceList" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String1024Type" minOccurs="0"/>
 *                       <choice minOccurs="0">
 *                         <element name="MaterialsDirectionAgency" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                         <element name="MaterialsDirectionAgencyRegistry" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
 *                       </choice>
 *                       <element name="MaterialsDirectionDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType" minOccurs="0"/>
 *                       <element name="ApplyingMeasures" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                       <element name="PersonsAdministrativeResponsibilityInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                       <element name="PermittingDocumensAnnulmentInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                       <element name="AppealInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                     </sequence>
 *                   </restriction>
 *                 </complexContent>
 *               </complexType>
 *             </element>
 *           </sequence>
 *         </choice>
 *         <element name="From" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateTimeType"/>
 *         <element name="To" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
 *         <element name="Duration">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Days" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}TimeUnitCountType" minOccurs="0"/>
 *                   <element name="Hours" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}TimeUnitCountType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Place" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
 *         <element name="ERPExecutiveResultType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="InspectionPersons" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
 *         <element name="InspectionPersonsPosition" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *         <element name="AbsentRepresentatives" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ERPRepresentativesType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="RepresentativesRegionPersons" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *         <element name="RepresentativesRegionPersonsPosition" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *         <element name="SettlingDocumentPlaceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="SettlingDocumentPlace" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
 *         <element name="AdditionalInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String4000Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExaminationResultType", propOrder = {
    "documentType",
    "informationResultType",
    "number",
    "date",
    "hasNoOffence",
    "hasOffence",
    "identifiedOffencesInfo",
    "from",
    "to",
    "duration",
    "place",
    "erpExecutiveResultType",
    "inspectionPersons",
    "inspectionPersonsPosition",
    "absentRepresentatives",
    "erpRepresentativesType",
    "representativesRegionPersons",
    "representativesRegionPersonsPosition",
    "settlingDocumentPlaceType",
    "settlingDocumentPlace",
    "additionalInfo"
})
public class ExaminationResultType {

    /**
     * Вид документа результата проверки. НСИ "Вид документа по результатам проверки" (реестровый номер 64).
     * 
     */
    @XmlElement(name = "DocumentType", required = true)
    protected NsiRef documentType;
    /**
     * Тип сведений о результатах.
     * 
     * НСИ "Тип сведений о результатах ФГИС ЕРП".
     * 
     */
    @XmlElement(name = "InformationResultType")
    protected NsiRef informationResultType;
    /**
     * Номер документа результата проверки.
     * 
     */
    @XmlElement(name = "Number", required = true)
    protected String number;
    /**
     * Дата и время составления документа результата проверки.
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    /**
     * Нарушений не выявлено.
     * 
     */
    @XmlElement(name = "HasNoOffence")
    protected Boolean hasNoOffence;
    /**
     * Выявлены нарушения
     * 
     */
    @XmlElement(name = "HasOffence")
    protected Boolean hasOffence;
    /**
     * Информация о выявленных нарушениях
     * 
     */
    @XmlElement(name = "IdentifiedOffencesInfo")
    protected ExaminationResultType.IdentifiedOffencesInfo identifiedOffencesInfo;
    /**
     * Дата и время начала проведения проверки.
     * 
     */
    @XmlElement(name = "From", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar from;
    /**
     * Дата окончания проведения проверки.
     * 
     */
    @XmlElement(name = "To", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar to;
    /**
     * Продолжительность проведения проверки.         Должно быть обязательно заполнено хотя бы одно из полей tns:Days или tns:Hours
     * 
     */
    @XmlElement(name = "Duration", required = true)
    protected ExaminationResultType.Duration duration;
    /**
     * Место проведения проверки
     * 
     */
    @XmlElement(name = "Place", required = true)
    protected String place;
    /**
     * Тип должностных лиц, уполномоченных на проведение.
     * 
     * НСИ "Тип уполномоченного лица на проведение проверки ФГИС ЕРП"
     * 
     */
    @XmlElement(name = "ERPExecutiveResultType")
    protected NsiRef erpExecutiveResultType;
    /**
     * ФИО лиц, проводивших проверку
     * 
     */
    @XmlElement(name = "InspectionPersons", required = true)
    protected String inspectionPersons;
    /**
     * Должность лиц, проводивших проверку
     * 
     */
    @XmlElement(name = "InspectionPersonsPosition")
    protected String inspectionPersonsPosition;
    /**
     * Представители субъекта проверки отсутствовали при проведении проверки
     * 
     */
    @XmlElement(name = "AbsentRepresentatives")
    protected Boolean absentRepresentatives;
    /**
     * Тип представителя субъекта проверки.
     * 
     * НСИ "Тип представителя организации ФГИС ЕРП"
     * 
     * Обязательно к заполнению, если tns:AbsentRepresentatives не присылается
     * 
     */
    @XmlElement(name = "ERPRepresentativesType")
    protected NsiRef erpRepresentativesType;
    /**
     * ФИО представителей субъекта проверки, присутствовавших при проведении проверки.
     * 
     * Обязательно к заполнению, если tns:AbsentRepresentatives не присылается
     * 
     */
    @XmlElement(name = "RepresentativesRegionPersons")
    protected String representativesRegionPersons;
    /**
     * Должность представителей субъекта проверки, присутствовавших при проведении проверки.
     * 
     * Обязательно к заполнению, если tns:AbsentRepresentatives не присылается
     * 
     */
    @XmlElement(name = "RepresentativesRegionPersonsPosition")
    protected String representativesRegionPersonsPosition;
    /**
     * Тип адреса места составления акта о проведении проверки.
     * 
     * НСИ "Типы адресов объекта"
     * 
     */
    @XmlElement(name = "SettlingDocumentPlaceType")
    protected NsiRef settlingDocumentPlaceType;
    /**
     * Место составления документа результата проверки
     * 
     */
    @XmlElement(name = "SettlingDocumentPlace", required = true)
    protected String settlingDocumentPlace;
    /**
     * Дополнительная информация о результате проверки.
     * 
     */
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;

    /**
     * Вид документа результата проверки. НСИ "Вид документа по результатам проверки" (реестровый номер 64).
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getDocumentType()
     */
    public void setDocumentType(NsiRef value) {
        this.documentType = value;
    }

    /**
     * Тип сведений о результатах.
     * 
     * НСИ "Тип сведений о результатах ФГИС ЕРП".
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getInformationResultType() {
        return informationResultType;
    }

    /**
     * Sets the value of the informationResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getInformationResultType()
     */
    public void setInformationResultType(NsiRef value) {
        this.informationResultType = value;
    }

    /**
     * Номер документа результата проверки.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Дата и время составления документа результата проверки.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Нарушений не выявлено.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNoOffence() {
        return hasNoOffence;
    }

    /**
     * Sets the value of the hasNoOffence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasNoOffence()
     */
    public void setHasNoOffence(Boolean value) {
        this.hasNoOffence = value;
    }

    /**
     * Выявлены нарушения
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOffence() {
        return hasOffence;
    }

    /**
     * Sets the value of the hasOffence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasOffence()
     */
    public void setHasOffence(Boolean value) {
        this.hasOffence = value;
    }

    /**
     * Информация о выявленных нарушениях
     * 
     * @return
     *     possible object is
     *     {@link ExaminationResultType.IdentifiedOffencesInfo }
     *     
     */
    public ExaminationResultType.IdentifiedOffencesInfo getIdentifiedOffencesInfo() {
        return identifiedOffencesInfo;
    }

    /**
     * Sets the value of the identifiedOffencesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminationResultType.IdentifiedOffencesInfo }
     *     
     * @see #getIdentifiedOffencesInfo()
     */
    public void setIdentifiedOffencesInfo(ExaminationResultType.IdentifiedOffencesInfo value) {
        this.identifiedOffencesInfo = value;
    }

    /**
     * Дата и время начала проведения проверки.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFrom()
     */
    public void setFrom(XMLGregorianCalendar value) {
        this.from = value;
    }

    /**
     * Дата окончания проведения проверки.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTo()
     */
    public void setTo(XMLGregorianCalendar value) {
        this.to = value;
    }

    /**
     * Продолжительность проведения проверки.         Должно быть обязательно заполнено хотя бы одно из полей tns:Days или tns:Hours
     * 
     * @return
     *     possible object is
     *     {@link ExaminationResultType.Duration }
     *     
     */
    public ExaminationResultType.Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminationResultType.Duration }
     *     
     * @see #getDuration()
     */
    public void setDuration(ExaminationResultType.Duration value) {
        this.duration = value;
    }

    /**
     * Место проведения проверки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlace()
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Тип должностных лиц, уполномоченных на проведение.
     * 
     * НСИ "Тип уполномоченного лица на проведение проверки ФГИС ЕРП"
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getERPExecutiveResultType() {
        return erpExecutiveResultType;
    }

    /**
     * Sets the value of the erpExecutiveResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getERPExecutiveResultType()
     */
    public void setERPExecutiveResultType(NsiRef value) {
        this.erpExecutiveResultType = value;
    }

    /**
     * ФИО лиц, проводивших проверку
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionPersons() {
        return inspectionPersons;
    }

    /**
     * Sets the value of the inspectionPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInspectionPersons()
     */
    public void setInspectionPersons(String value) {
        this.inspectionPersons = value;
    }

    /**
     * Должность лиц, проводивших проверку
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionPersonsPosition() {
        return inspectionPersonsPosition;
    }

    /**
     * Sets the value of the inspectionPersonsPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInspectionPersonsPosition()
     */
    public void setInspectionPersonsPosition(String value) {
        this.inspectionPersonsPosition = value;
    }

    /**
     * Представители субъекта проверки отсутствовали при проведении проверки
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbsentRepresentatives() {
        return absentRepresentatives;
    }

    /**
     * Sets the value of the absentRepresentatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAbsentRepresentatives()
     */
    public void setAbsentRepresentatives(Boolean value) {
        this.absentRepresentatives = value;
    }

    /**
     * Тип представителя субъекта проверки.
     * 
     * НСИ "Тип представителя организации ФГИС ЕРП"
     * 
     * Обязательно к заполнению, если tns:AbsentRepresentatives не присылается
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getERPRepresentativesType() {
        return erpRepresentativesType;
    }

    /**
     * Sets the value of the erpRepresentativesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getERPRepresentativesType()
     */
    public void setERPRepresentativesType(NsiRef value) {
        this.erpRepresentativesType = value;
    }

    /**
     * ФИО представителей субъекта проверки, присутствовавших при проведении проверки.
     * 
     * Обязательно к заполнению, если tns:AbsentRepresentatives не присылается
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativesRegionPersons() {
        return representativesRegionPersons;
    }

    /**
     * Sets the value of the representativesRegionPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRepresentativesRegionPersons()
     */
    public void setRepresentativesRegionPersons(String value) {
        this.representativesRegionPersons = value;
    }

    /**
     * Должность представителей субъекта проверки, присутствовавших при проведении проверки.
     * 
     * Обязательно к заполнению, если tns:AbsentRepresentatives не присылается
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativesRegionPersonsPosition() {
        return representativesRegionPersonsPosition;
    }

    /**
     * Sets the value of the representativesRegionPersonsPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRepresentativesRegionPersonsPosition()
     */
    public void setRepresentativesRegionPersonsPosition(String value) {
        this.representativesRegionPersonsPosition = value;
    }

    /**
     * Тип адреса места составления акта о проведении проверки.
     * 
     * НСИ "Типы адресов объекта"
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getSettlingDocumentPlaceType() {
        return settlingDocumentPlaceType;
    }

    /**
     * Sets the value of the settlingDocumentPlaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getSettlingDocumentPlaceType()
     */
    public void setSettlingDocumentPlaceType(NsiRef value) {
        this.settlingDocumentPlaceType = value;
    }

    /**
     * Место составления документа результата проверки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlingDocumentPlace() {
        return settlingDocumentPlace;
    }

    /**
     * Sets the value of the settlingDocumentPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSettlingDocumentPlace()
     */
    public void setSettlingDocumentPlace(String value) {
        this.settlingDocumentPlace = value;
    }

    /**
     * Дополнительная информация о результате проверки.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalInfo()
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
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
     *         <element name="Days" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}TimeUnitCountType" minOccurs="0"/>
     *         <element name="Hours" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}TimeUnitCountType" minOccurs="0"/>
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
        "days",
        "hours"
    })
    public static class Duration {

        /**
         * Продолжительность проведения проверки, дней
         * 
         */
        @XmlElement(name = "Days")
        protected Double days;
        /**
         * Продолжительность проведения проверки,часов                            Обязательно для заполнения , если  Вид проверки = внеплановая И указан признак ShouldBeRegistered
         * 
         */
        @XmlElement(name = "Hours")
        protected Double hours;

        /**
         * Продолжительность проведения проверки, дней
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getDays() {
            return days;
        }

        /**
         * Sets the value of the days property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         * @see #getDays()
         */
        public void setDays(Double value) {
            this.days = value;
        }

        /**
         * Продолжительность проведения проверки,часов                            Обязательно для заполнения , если  Вид проверки = внеплановая И указан признак ShouldBeRegistered
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getHours() {
            return hours;
        }

        /**
         * Sets the value of the hours property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         * @see #getHours()
         */
        public void setHours(Double value) {
            this.hours = value;
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
     *         <element name="NatureOffence" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
     *         <element name="DetailsMismatch" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
     *         <element name="RegulationOffencedLegalAct" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String1024Type" minOccurs="0"/>
     *         <element name="OtherMismatch" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String1024Type" minOccurs="0"/>
     *         <element name="PersonsOffenceList" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String1024Type" minOccurs="0"/>
     *         <choice minOccurs="0">
     *           <element name="MaterialsDirectionAgency" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
     *           <element name="MaterialsDirectionAgencyRegistry" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
     *         </choice>
     *         <element name="MaterialsDirectionDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType" minOccurs="0"/>
     *         <element name="ApplyingMeasures" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
     *         <element name="PersonsAdministrativeResponsibilityInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
     *         <element name="PermittingDocumensAnnulmentInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
     *         <element name="AppealInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
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
        "natureOffence",
        "detailsMismatch",
        "regulationOffencedLegalAct",
        "otherMismatch",
        "personsOffenceList",
        "materialsDirectionAgency",
        "materialsDirectionAgencyRegistry",
        "materialsDirectionDate",
        "applyingMeasures",
        "personsAdministrativeResponsibilityInfo",
        "permittingDocumensAnnulmentInfo",
        "appealInfo"
    })
    public static class IdentifiedOffencesInfo {

        /**
         * Характер нарушения
         * 
         */
        @XmlElement(name = "NatureOffence")
        protected String natureOffence;
        /**
         * Несоответствие поданных сведений о начале осуществления предпринимательской деятельности
         * 
         */
        @XmlElement(name = "DetailsMismatch")
        protected String detailsMismatch;
        /**
         * Положение нарушенного правового акта
         * 
         */
        @XmlElement(name = "RegulationOffencedLegalAct")
        protected String regulationOffencedLegalAct;
        /**
         * Другие несоответствия поданных сведений
         * 
         */
        @XmlElement(name = "OtherMismatch")
        protected String otherMismatch;
        /**
         * Список лиц, допустивших нарушение
         * 
         */
        @XmlElement(name = "PersonsOffenceList")
        protected String personsOffenceList;
        /**
         * Орган, в который направлены материалы о выявленных нарушениях
         * 
         */
        @XmlElement(name = "MaterialsDirectionAgency")
        protected String materialsDirectionAgency;
        /**
         * Идентификатор органа, в который направлены материалы о выявленных нарушениях.
         * 
         * Заполняется, если организация зарегистрирована в Системе
         * 
         */
        @XmlElement(name = "MaterialsDirectionAgencyRegistry")
        protected RegOrgType materialsDirectionAgencyRegistry;
        /**
         * Дата направления материалов о выявленных нарушениях в органы государственной власти
         * 
         */
        @XmlElement(name = "MaterialsDirectionDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar materialsDirectionDate;
        /**
         * Перечень примененных мер обеспечения производства по делу об административном правонарушении
         * 
         */
        @XmlElement(name = "ApplyingMeasures")
        protected String applyingMeasures;
        /**
         * Информация о привлечении проверяемых лиц к административной ответственности
         * 
         */
        @XmlElement(name = "PersonsAdministrativeResponsibilityInfo")
        protected String personsAdministrativeResponsibilityInfo;
        /**
         * Информация о приостановлении или об аннулировании документов, имеющих разрешительный характер
         * 
         */
        @XmlElement(name = "PermittingDocumensAnnulmentInfo")
        protected String permittingDocumensAnnulmentInfo;
        /**
         * Информация об обжаловании решений органа контроля
         * 
         */
        @XmlElement(name = "AppealInfo")
        protected String appealInfo;

        /**
         * Характер нарушения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNatureOffence() {
            return natureOffence;
        }

        /**
         * Sets the value of the natureOffence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNatureOffence()
         */
        public void setNatureOffence(String value) {
            this.natureOffence = value;
        }

        /**
         * Несоответствие поданных сведений о начале осуществления предпринимательской деятельности
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetailsMismatch() {
            return detailsMismatch;
        }

        /**
         * Sets the value of the detailsMismatch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDetailsMismatch()
         */
        public void setDetailsMismatch(String value) {
            this.detailsMismatch = value;
        }

        /**
         * Положение нарушенного правового акта
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegulationOffencedLegalAct() {
            return regulationOffencedLegalAct;
        }

        /**
         * Sets the value of the regulationOffencedLegalAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRegulationOffencedLegalAct()
         */
        public void setRegulationOffencedLegalAct(String value) {
            this.regulationOffencedLegalAct = value;
        }

        /**
         * Другие несоответствия поданных сведений
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherMismatch() {
            return otherMismatch;
        }

        /**
         * Sets the value of the otherMismatch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOtherMismatch()
         */
        public void setOtherMismatch(String value) {
            this.otherMismatch = value;
        }

        /**
         * Список лиц, допустивших нарушение
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersonsOffenceList() {
            return personsOffenceList;
        }

        /**
         * Sets the value of the personsOffenceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPersonsOffenceList()
         */
        public void setPersonsOffenceList(String value) {
            this.personsOffenceList = value;
        }

        /**
         * Орган, в который направлены материалы о выявленных нарушениях
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaterialsDirectionAgency() {
            return materialsDirectionAgency;
        }

        /**
         * Sets the value of the materialsDirectionAgency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMaterialsDirectionAgency()
         */
        public void setMaterialsDirectionAgency(String value) {
            this.materialsDirectionAgency = value;
        }

        /**
         * Идентификатор органа, в который направлены материалы о выявленных нарушениях.
         * 
         * Заполняется, если организация зарегистрирована в Системе
         * 
         * @return
         *     possible object is
         *     {@link RegOrgType }
         *     
         */
        public RegOrgType getMaterialsDirectionAgencyRegistry() {
            return materialsDirectionAgencyRegistry;
        }

        /**
         * Sets the value of the materialsDirectionAgencyRegistry property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegOrgType }
         *     
         * @see #getMaterialsDirectionAgencyRegistry()
         */
        public void setMaterialsDirectionAgencyRegistry(RegOrgType value) {
            this.materialsDirectionAgencyRegistry = value;
        }

        /**
         * Дата направления материалов о выявленных нарушениях в органы государственной власти
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMaterialsDirectionDate() {
            return materialsDirectionDate;
        }

        /**
         * Sets the value of the materialsDirectionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getMaterialsDirectionDate()
         */
        public void setMaterialsDirectionDate(XMLGregorianCalendar value) {
            this.materialsDirectionDate = value;
        }

        /**
         * Перечень примененных мер обеспечения производства по делу об административном правонарушении
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplyingMeasures() {
            return applyingMeasures;
        }

        /**
         * Sets the value of the applyingMeasures property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getApplyingMeasures()
         */
        public void setApplyingMeasures(String value) {
            this.applyingMeasures = value;
        }

        /**
         * Информация о привлечении проверяемых лиц к административной ответственности
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersonsAdministrativeResponsibilityInfo() {
            return personsAdministrativeResponsibilityInfo;
        }

        /**
         * Sets the value of the personsAdministrativeResponsibilityInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPersonsAdministrativeResponsibilityInfo()
         */
        public void setPersonsAdministrativeResponsibilityInfo(String value) {
            this.personsAdministrativeResponsibilityInfo = value;
        }

        /**
         * Информация о приостановлении или об аннулировании документов, имеющих разрешительный характер
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPermittingDocumensAnnulmentInfo() {
            return permittingDocumensAnnulmentInfo;
        }

        /**
         * Sets the value of the permittingDocumensAnnulmentInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPermittingDocumensAnnulmentInfo()
         */
        public void setPermittingDocumensAnnulmentInfo(String value) {
            this.permittingDocumensAnnulmentInfo = value;
        }

        /**
         * Информация об обжаловании решений органа контроля
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppealInfo() {
            return appealInfo;
        }

        /**
         * Sets the value of the appealInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAppealInfo()
         */
        public void setAppealInfo(String value) {
            this.appealInfo = value;
        }

    }

}
