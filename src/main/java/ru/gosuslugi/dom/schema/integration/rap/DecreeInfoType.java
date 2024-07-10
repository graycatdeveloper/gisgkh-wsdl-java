
package ru.gosuslugi.dom.schema.integration.rap;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Данные постановления
 * 
 * <p>Java class for DecreeInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DecreeInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Offender">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <sequence>
 *                     <element name="Organization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *                     <element name="OfficialName" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/rap/}DecreeIndType">
 *                             <sequence>
 *                               <element name="Position">
 *                                 <simpleType>
 *                                   <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String300Type">
 *                                     <minLength value="1"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="ControlRoleCode" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded" minOccurs="0"/>
 *                   </sequence>
 *                   <element name="Person" type="{http://dom.gosuslugi.ru/schema/integration/rap/}DecreeIndType"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ReviewResult">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ResultKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="DecreeDocument" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ProceduralDocumentType"/>
 *                   <element name="PunishmentKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="100" minOccurs="0"/>
 *                   <element name="TakingDecisionAuthority" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="TakingDecisionAuthorityName" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="0"/>
 *                         <maxLength value="2500"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="PositionOfAcceptedPerson">
 *                     <simpleType>
 *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type">
 *                         <minLength value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="ViolationObject" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="100"/>
 *                   <element name="ProceedingDate" type="{http://dom.gosuslugi.ru/schema/integration/rap/}LimitedDateType"/>
 *                   <element name="Fine" type="{http://dom.gosuslugi.ru/schema/integration/rap/}FineType" minOccurs="0"/>
 *                   <element name="FinePaymentDate" type="{http://dom.gosuslugi.ru/schema/integration/rap/}LimitedDateType" minOccurs="0"/>
 *                   <element name="DisqualificationPeriod" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="Months">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   <minExclusive value="0"/>
 *                                   <maxExclusive value="1000"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="Years">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   <minExclusive value="0"/>
 *                                   <maxExclusive value="1000"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="AdministrativeSuspensionPeriod" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="Months">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   <minExclusive value="0"/>
 *                                   <maxExclusive value="1000"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="Years">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   <minExclusive value="0"/>
 *                                   <maxExclusive value="1000"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ViolationShortDescription" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
 *                   <element name="TakenAction" type="{http://dom.gosuslugi.ru/schema/integration/base/}String1500Type" minOccurs="0"/>
 *                   <element name="Executed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "DecreeInfoType", propOrder = {
    "offender",
    "reviewResult"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.rap.ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.Decree.DecreeInfo.class
})
public class DecreeInfoType {

    /**
     * Правонарушитель
     * 
     */
    @XmlElement(name = "Offender", required = true)
    protected DecreeInfoType.Offender offender;
    /**
     * Результат рассмотрения дела об административном правонарушении
     * 
     */
    @XmlElement(name = "ReviewResult", required = true)
    protected DecreeInfoType.ReviewResult reviewResult;

    /**
     * Правонарушитель
     * 
     * @return
     *     possible object is
     *     {@link DecreeInfoType.Offender }
     *     
     */
    public DecreeInfoType.Offender getOffender() {
        return offender;
    }

    /**
     * Sets the value of the offender property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecreeInfoType.Offender }
     *     
     * @see #getOffender()
     */
    public void setOffender(DecreeInfoType.Offender value) {
        this.offender = value;
    }

    /**
     * Результат рассмотрения дела об административном правонарушении
     * 
     * @return
     *     possible object is
     *     {@link DecreeInfoType.ReviewResult }
     *     
     */
    public DecreeInfoType.ReviewResult getReviewResult() {
        return reviewResult;
    }

    /**
     * Sets the value of the reviewResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecreeInfoType.ReviewResult }
     *     
     * @see #getReviewResult()
     */
    public void setReviewResult(DecreeInfoType.ReviewResult value) {
        this.reviewResult = value;
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
     *       <choice>
     *         <sequence>
     *           <element name="Organization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
     *           <element name="OfficialName" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/rap/}DecreeIndType">
     *                   <sequence>
     *                     <element name="Position">
     *                       <simpleType>
     *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String300Type">
     *                           <minLength value="1"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="ControlRoleCode" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded" minOccurs="0"/>
     *         </sequence>
     *         <element name="Person" type="{http://dom.gosuslugi.ru/schema/integration/rap/}DecreeIndType"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "organization",
        "officialName",
        "controlRoleCode",
        "person"
    })
    public static class Offender {

        /**
         * Организация
         * 
         */
        @XmlElement(name = "Organization")
        protected RegOrgType organization;
        /**
         * Должностное лицо
         * 
         */
        @XmlElement(name = "OfficialName")
        protected DecreeInfoType.Offender.OfficialName officialName;
        /**
         * Регулируемые виды деятельности по поставке ресурсов (НСИ 270)           (поле доступно и обязательно для заполнения только для организации пользователя с функцией ФСТ или "ОИВ субъекта РФ по регулированию тарифов")
         * 
         */
        @XmlElement(name = "ControlRoleCode")
        protected List<NsiRef> controlRoleCode;
        /**
         * Физическое лицо
         * 
         */
        @XmlElement(name = "Person")
        protected DecreeIndType person;

        /**
         * Организация
         * 
         * @return
         *     possible object is
         *     {@link RegOrgType }
         *     
         */
        public RegOrgType getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegOrgType }
         *     
         * @see #getOrganization()
         */
        public void setOrganization(RegOrgType value) {
            this.organization = value;
        }

        /**
         * Должностное лицо
         * 
         * @return
         *     possible object is
         *     {@link DecreeInfoType.Offender.OfficialName }
         *     
         */
        public DecreeInfoType.Offender.OfficialName getOfficialName() {
            return officialName;
        }

        /**
         * Sets the value of the officialName property.
         * 
         * @param value
         *     allowed object is
         *     {@link DecreeInfoType.Offender.OfficialName }
         *     
         * @see #getOfficialName()
         */
        public void setOfficialName(DecreeInfoType.Offender.OfficialName value) {
            this.officialName = value;
        }

        /**
         * Регулируемые виды деятельности по поставке ресурсов (НСИ 270)           (поле доступно и обязательно для заполнения только для организации пользователя с функцией ФСТ или "ОИВ субъекта РФ по регулированию тарифов")
         * 
         * Gets the value of the controlRoleCode property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the controlRoleCode property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getControlRoleCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NsiRef }
         * </p>
         * 
         * 
         * @return
         *     The value of the controlRoleCode property.
         */
        public List<NsiRef> getControlRoleCode() {
            if (controlRoleCode == null) {
                controlRoleCode = new ArrayList<>();
            }
            return this.controlRoleCode;
        }

        /**
         * Физическое лицо
         * 
         * @return
         *     possible object is
         *     {@link DecreeIndType }
         *     
         */
        public DecreeIndType getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link DecreeIndType }
         *     
         * @see #getPerson()
         */
        public void setPerson(DecreeIndType value) {
            this.person = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/rap/}DecreeIndType">
         *       <sequence>
         *         <element name="Position">
         *           <simpleType>
         *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String300Type">
         *               <minLength value="1"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
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
            "position"
        })
        public static class OfficialName
            extends DecreeIndType
        {

            /**
             * Должность
             * 
             */
            @XmlElement(name = "Position", required = true)
            protected String position;

            /**
             * Должность
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPosition() {
                return position;
            }

            /**
             * Sets the value of the position property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPosition()
             */
            public void setPosition(String value) {
                this.position = value;
            }

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
     *         <element name="ResultKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="DecreeDocument" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ProceduralDocumentType"/>
     *         <element name="PunishmentKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="100" minOccurs="0"/>
     *         <element name="TakingDecisionAuthority" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="TakingDecisionAuthorityName" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="0"/>
     *               <maxLength value="2500"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="PositionOfAcceptedPerson">
     *           <simpleType>
     *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type">
     *               <minLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="ViolationObject" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="100"/>
     *         <element name="ProceedingDate" type="{http://dom.gosuslugi.ru/schema/integration/rap/}LimitedDateType"/>
     *         <element name="Fine" type="{http://dom.gosuslugi.ru/schema/integration/rap/}FineType" minOccurs="0"/>
     *         <element name="FinePaymentDate" type="{http://dom.gosuslugi.ru/schema/integration/rap/}LimitedDateType" minOccurs="0"/>
     *         <element name="DisqualificationPeriod" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="Months">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         <minExclusive value="0"/>
     *                         <maxExclusive value="1000"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="Years">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         <minExclusive value="0"/>
     *                         <maxExclusive value="1000"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="AdministrativeSuspensionPeriod" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="Months">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         <minExclusive value="0"/>
     *                         <maxExclusive value="1000"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="Years">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         <minExclusive value="0"/>
     *                         <maxExclusive value="1000"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ViolationShortDescription" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
     *         <element name="TakenAction" type="{http://dom.gosuslugi.ru/schema/integration/base/}String1500Type" minOccurs="0"/>
     *         <element name="Executed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "resultKind",
        "decreeDocument",
        "punishmentKind",
        "takingDecisionAuthority",
        "takingDecisionAuthorityName",
        "positionOfAcceptedPerson",
        "violationObject",
        "proceedingDate",
        "fine",
        "finePaymentDate",
        "disqualificationPeriod",
        "administrativeSuspensionPeriod",
        "violationShortDescription",
        "takenAction",
        "executed"
    })
    public static class ReviewResult {

        /**
         * Вид результата по делу об административном правонарушении (НСИ-227)
         * 
         */
        @XmlElement(name = "ResultKind", required = true)
        protected NsiRef resultKind;
        /**
         * Постановление
         * 
         */
        @XmlElement(name = "DecreeDocument", required = true)
        protected ProceduralDocumentType decreeDocument;
        /**
         * Вид административного наказания (НСИ-225). Обязательно для заполнения, если в tns:ResultKind указано «Назначение административного наказания».
         * 
         * Для Организаций:
         * -Административный штраф;
         * -Предупреждение;
         * -Административное приостановление деятельности.
         * 
         * Для физических лиц:
         * -Административный штраф;
         * -Предупреждение;
         * -Дисквалификация.
         * 
         */
        @XmlElement(name = "PunishmentKind")
        protected List<NsiRef> punishmentKind;
        /**
         * Орган, которым вынесено решение по делу об административном правонарушении (НСИ 332)
         * 
         */
        @XmlElement(name = "TakingDecisionAuthority", required = true)
        protected NsiRef takingDecisionAuthority;
        /**
         * Название органа, принявшего решение о применении мер административного воздействия. НЕ заполняется, если в tns:TakingDecisionAuthority указано значение "Организация, разместившая постановление"
         * 
         */
        @XmlElement(name = "TakingDecisionAuthorityName")
        protected String takingDecisionAuthorityName;
        /**
         * Должность лица, принявшего документ о применении административного воздействия
         * 
         */
        @XmlElement(name = "PositionOfAcceptedPerson", required = true)
        protected String positionOfAcceptedPerson;
        /**
         * Предмет нарушения (НСИ-229)
         * 
         */
        @XmlElement(name = "ViolationObject", required = true)
        protected List<NsiRef> violationObject;
        /**
         * Дата привлечения к административной ответственности
         * 
         */
        @XmlElement(name = "ProceedingDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar proceedingDate;
        /**
         * Размер штрафа (доступно при указании вида административного наказания "Административный штраф"; иначе - не заполняется)
         * 
         */
        @XmlElement(name = "Fine")
        protected BigDecimal fine;
        /**
         * Дата уплаты штрафа (может заполняться только, если в поле в tns:Executed указано true (Исполнено)       И в поле PunishmentKind указан "Административный штраф" И поле Fine заполнено)
         * 
         */
        @XmlElement(name = "FinePaymentDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar finePaymentDate;
        /**
         * Срок дисквалификации (доступен и обязателен, если Вид административного наказания = "Дисквалификация")
         * 
         */
        @XmlElement(name = "DisqualificationPeriod")
        protected DecreeInfoType.ReviewResult.DisqualificationPeriod disqualificationPeriod;
        /**
         * Срок приостановления деятельности (доступен и обязателен, если Вид административного наказания = "Административное приостановление деятельности")
         * 
         */
        @XmlElement(name = "AdministrativeSuspensionPeriod")
        protected DecreeInfoType.ReviewResult.AdministrativeSuspensionPeriod administrativeSuspensionPeriod;
        /**
         * Краткое описание нарушения
         * 
         */
        @XmlElement(name = "ViolationShortDescription")
        protected String violationShortDescription;
        /**
         * Меры, принятые для устранения нарушений
         * 
         */
        @XmlElement(name = "TakenAction")
        protected String takenAction;
        /**
         * Информация об исполнении (true - Исполнено; false - Не исполнено; при незаполнении устанавливается значение по умолчанию - Не заполнено)
         * 
         */
        @XmlElement(name = "Executed")
        protected Boolean executed;

        /**
         * Вид результата по делу об административном правонарушении (НСИ-227)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getResultKind() {
            return resultKind;
        }

        /**
         * Sets the value of the resultKind property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getResultKind()
         */
        public void setResultKind(NsiRef value) {
            this.resultKind = value;
        }

        /**
         * Постановление
         * 
         * @return
         *     possible object is
         *     {@link ProceduralDocumentType }
         *     
         */
        public ProceduralDocumentType getDecreeDocument() {
            return decreeDocument;
        }

        /**
         * Sets the value of the decreeDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProceduralDocumentType }
         *     
         * @see #getDecreeDocument()
         */
        public void setDecreeDocument(ProceduralDocumentType value) {
            this.decreeDocument = value;
        }

        /**
         * Вид административного наказания (НСИ-225). Обязательно для заполнения, если в tns:ResultKind указано «Назначение административного наказания».
         * 
         * Для Организаций:
         * -Административный штраф;
         * -Предупреждение;
         * -Административное приостановление деятельности.
         * 
         * Для физических лиц:
         * -Административный штраф;
         * -Предупреждение;
         * -Дисквалификация.
         * 
         * Gets the value of the punishmentKind property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the punishmentKind property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPunishmentKind().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NsiRef }
         * </p>
         * 
         * 
         * @return
         *     The value of the punishmentKind property.
         */
        public List<NsiRef> getPunishmentKind() {
            if (punishmentKind == null) {
                punishmentKind = new ArrayList<>();
            }
            return this.punishmentKind;
        }

        /**
         * Орган, которым вынесено решение по делу об административном правонарушении (НСИ 332)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getTakingDecisionAuthority() {
            return takingDecisionAuthority;
        }

        /**
         * Sets the value of the takingDecisionAuthority property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getTakingDecisionAuthority()
         */
        public void setTakingDecisionAuthority(NsiRef value) {
            this.takingDecisionAuthority = value;
        }

        /**
         * Название органа, принявшего решение о применении мер административного воздействия. НЕ заполняется, если в tns:TakingDecisionAuthority указано значение "Организация, разместившая постановление"
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTakingDecisionAuthorityName() {
            return takingDecisionAuthorityName;
        }

        /**
         * Sets the value of the takingDecisionAuthorityName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTakingDecisionAuthorityName()
         */
        public void setTakingDecisionAuthorityName(String value) {
            this.takingDecisionAuthorityName = value;
        }

        /**
         * Должность лица, принявшего документ о применении административного воздействия
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionOfAcceptedPerson() {
            return positionOfAcceptedPerson;
        }

        /**
         * Sets the value of the positionOfAcceptedPerson property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPositionOfAcceptedPerson()
         */
        public void setPositionOfAcceptedPerson(String value) {
            this.positionOfAcceptedPerson = value;
        }

        /**
         * Предмет нарушения (НСИ-229)
         * 
         * Gets the value of the violationObject property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the violationObject property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getViolationObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NsiRef }
         * </p>
         * 
         * 
         * @return
         *     The value of the violationObject property.
         */
        public List<NsiRef> getViolationObject() {
            if (violationObject == null) {
                violationObject = new ArrayList<>();
            }
            return this.violationObject;
        }

        /**
         * Дата привлечения к административной ответственности
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getProceedingDate() {
            return proceedingDate;
        }

        /**
         * Sets the value of the proceedingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getProceedingDate()
         */
        public void setProceedingDate(XMLGregorianCalendar value) {
            this.proceedingDate = value;
        }

        /**
         * Размер штрафа (доступно при указании вида административного наказания "Административный штраф"; иначе - не заполняется)
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFine() {
            return fine;
        }

        /**
         * Sets the value of the fine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getFine()
         */
        public void setFine(BigDecimal value) {
            this.fine = value;
        }

        /**
         * Дата уплаты штрафа (может заполняться только, если в поле в tns:Executed указано true (Исполнено)       И в поле PunishmentKind указан "Административный штраф" И поле Fine заполнено)
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFinePaymentDate() {
            return finePaymentDate;
        }

        /**
         * Sets the value of the finePaymentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getFinePaymentDate()
         */
        public void setFinePaymentDate(XMLGregorianCalendar value) {
            this.finePaymentDate = value;
        }

        /**
         * Срок дисквалификации (доступен и обязателен, если Вид административного наказания = "Дисквалификация")
         * 
         * @return
         *     possible object is
         *     {@link DecreeInfoType.ReviewResult.DisqualificationPeriod }
         *     
         */
        public DecreeInfoType.ReviewResult.DisqualificationPeriod getDisqualificationPeriod() {
            return disqualificationPeriod;
        }

        /**
         * Sets the value of the disqualificationPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DecreeInfoType.ReviewResult.DisqualificationPeriod }
         *     
         * @see #getDisqualificationPeriod()
         */
        public void setDisqualificationPeriod(DecreeInfoType.ReviewResult.DisqualificationPeriod value) {
            this.disqualificationPeriod = value;
        }

        /**
         * Срок приостановления деятельности (доступен и обязателен, если Вид административного наказания = "Административное приостановление деятельности")
         * 
         * @return
         *     possible object is
         *     {@link DecreeInfoType.ReviewResult.AdministrativeSuspensionPeriod }
         *     
         */
        public DecreeInfoType.ReviewResult.AdministrativeSuspensionPeriod getAdministrativeSuspensionPeriod() {
            return administrativeSuspensionPeriod;
        }

        /**
         * Sets the value of the administrativeSuspensionPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DecreeInfoType.ReviewResult.AdministrativeSuspensionPeriod }
         *     
         * @see #getAdministrativeSuspensionPeriod()
         */
        public void setAdministrativeSuspensionPeriod(DecreeInfoType.ReviewResult.AdministrativeSuspensionPeriod value) {
            this.administrativeSuspensionPeriod = value;
        }

        /**
         * Краткое описание нарушения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getViolationShortDescription() {
            return violationShortDescription;
        }

        /**
         * Sets the value of the violationShortDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getViolationShortDescription()
         */
        public void setViolationShortDescription(String value) {
            this.violationShortDescription = value;
        }

        /**
         * Меры, принятые для устранения нарушений
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTakenAction() {
            return takenAction;
        }

        /**
         * Sets the value of the takenAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTakenAction()
         */
        public void setTakenAction(String value) {
            this.takenAction = value;
        }

        /**
         * Информация об исполнении (true - Исполнено; false - Не исполнено; при незаполнении устанавливается значение по умолчанию - Не заполнено)
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExecuted() {
            return executed;
        }

        /**
         * Sets the value of the executed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isExecuted()
         */
        public void setExecuted(Boolean value) {
            this.executed = value;
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
         *       <choice>
         *         <element name="Months">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               <minExclusive value="0"/>
         *               <maxExclusive value="1000"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="Years">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               <minExclusive value="0"/>
         *               <maxExclusive value="1000"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *       </choice>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "months",
            "years"
        })
        public static class AdministrativeSuspensionPeriod {

            /**
             * Месяцев
             * 
             */
            @XmlElement(name = "Months")
            protected Integer months;
            /**
             * Лет
             * 
             */
            @XmlElement(name = "Years")
            protected Integer years;

            /**
             * Месяцев
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMonths() {
                return months;
            }

            /**
             * Sets the value of the months property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             * @see #getMonths()
             */
            public void setMonths(Integer value) {
                this.months = value;
            }

            /**
             * Лет
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getYears() {
                return years;
            }

            /**
             * Sets the value of the years property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             * @see #getYears()
             */
            public void setYears(Integer value) {
                this.years = value;
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
         *       <choice>
         *         <element name="Months">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               <minExclusive value="0"/>
         *               <maxExclusive value="1000"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="Years">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               <minExclusive value="0"/>
         *               <maxExclusive value="1000"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *       </choice>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "months",
            "years"
        })
        public static class DisqualificationPeriod {

            /**
             * Месяцев
             * 
             */
            @XmlElement(name = "Months")
            protected Integer months;
            /**
             * Лет
             * 
             */
            @XmlElement(name = "Years")
            protected Integer years;

            /**
             * Месяцев
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMonths() {
                return months;
            }

            /**
             * Sets the value of the months property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             * @see #getMonths()
             */
            public void setMonths(Integer value) {
                this.months = value;
            }

            /**
             * Лет
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getYears() {
                return years;
            }

            /**
             * Sets the value of the years property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             * @see #getYears()
             */
            public void setYears(Integer value) {
                this.years = value;
            }

        }

    }

}
