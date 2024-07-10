
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * ДУ (для экспорта)
 * 
 * <p>Java class for ContractExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContractExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocNum">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *               <maxLength value="255"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="PlanDateComptetion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Validity" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Month" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         <totalDigits value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="Year" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         <totalDigits value="4"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <choice>
 *           <element name="Owners" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="Cooperative" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *           <element name="MunicipalHousing" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *           <element name="BuildingOwner" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *           <element name="CompetentAuthority" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *         </choice>
 *         <element name="Protocol" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence minOccurs="0">
 *                   <element name="ProtocolAdd" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <sequence>
 *                               <sequence minOccurs="0">
 *                                 <element name="PurchaseNumber" minOccurs="0">
 *                                   <simpleType>
 *                                     <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                                       <maxLength value="60"/>
 *                                     </restriction>
 *                                   </simpleType>
 *                                 </element>
 *                                 <element name="ProtocolOK" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                               </sequence>
 *                               <element name="ProtocolMeetingOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                             </sequence>
 *                             <element name="ProtocolMeetingBoard" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                             <element name="ProtocolBuildingOwner" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="VotingProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ContractBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="DateDetails" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DateDetailsExportType" minOccurs="0"/>
 *         <element name="ContractAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AgreementAttachment" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType">
 *                 <sequence>
 *                   <element name="ImprintAgreement" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ImprintAgreementExportType"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="SignedOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CommissioningPermitAgreement" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Charter" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LocalGovernmentDecision" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RegistryDecisionID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="AutomaticRollOverOneYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IndicationsAnyDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractExportType", propOrder = {
    "docNum",
    "signingDate",
    "effectiveDate",
    "planDateComptetion",
    "validity",
    "owners",
    "cooperative",
    "municipalHousing",
    "buildingOwner",
    "competentAuthority",
    "protocol",
    "contractBase",
    "dateDetails",
    "contractAttachment",
    "agreementAttachment",
    "signedOwners",
    "commissioningPermitAgreement",
    "charter",
    "localGovernmentDecision",
    "registryDecisionID",
    "automaticRollOverOneYear",
    "indicationsAnyDay"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Contract.class
})
public class ContractExportType {

    /**
     * Номер документа
     * 
     */
    @XmlElement(name = "DocNum", required = true)
    protected String docNum;
    /**
     * Дата заключения
     * 
     */
    @XmlElement(name = "SigningDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signingDate;
    /**
     * Дата вступления в силу
     * 
     */
    @XmlElement(name = "EffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    /**
     * Планируемая дата окончания
     * 
     */
    @XmlElement(name = "PlanDateComptetion", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar planDateComptetion;
    /**
     * Срок действия (заполняется при экспорте)
     * 
     */
    @XmlElement(name = "Validity")
    protected ContractExportType.Validity validity;
    /**
     * Собственник объекта жилищного фонда  (можно указать только один действущий управляемый объект)
     * 
     */
    @XmlElement(name = "Owners")
    protected Boolean owners;
    /**
     * ТСЖ/Кооператив
     * 
     */
    @XmlElement(name = "Cooperative")
    protected RegOrgType cooperative;
    /**
     * Собственник муниципального жилья
     * 
     */
    @XmlElement(name = "MunicipalHousing")
    protected RegOrgType municipalHousing;
    /**
     * Застройщик
     * 
     */
    @XmlElement(name = "BuildingOwner")
    protected RegOrgType buildingOwner;
    /**
     * Орган, уполномоченный на принятие решения об определении управляющей организации
     * 
     */
    @XmlElement(name = "CompetentAuthority")
    protected RegOrgType competentAuthority;
    /**
     * Сведения о протоколе открытого конкурса/собрания собственников
     * 
     */
    @XmlElement(name = "Protocol")
    protected ContractExportType.Protocol protocol;
    /**
     * Ссылка на НСИ "Основание заключения договора" (реестровый номер 58).
     * 
     */
    @XmlElement(name = "ContractBase", required = true)
    protected NsiRef contractBase;
    /**
     * Сведения о сроках. Для EditContract допускается указывать пустым, сведения будут скопированы из предыдущей версии.
     * 
     */
    @XmlElement(name = "DateDetails")
    protected DateDetailsExportType dateDetails;
    /**
     * Договор на управление и приложения
     * 
     */
    @XmlElement(name = "ContractAttachment")
    protected List<AttachmentType> contractAttachment;
    /**
     * Дополнительное соглашение
     * 
     */
    @XmlElement(name = "AgreementAttachment")
    protected List<ContractExportType.AgreementAttachment> agreementAttachment;
    /**
     * Реестр собственников, подписавших договор.
     * 
     */
    @XmlElement(name = "SignedOwners")
    protected List<AttachmentType> signedOwners;
    /**
     * Разрешение на ввод в эксплуатацию. Обязателен, если в "Основание заключения договора" указано "Разрешение на ввод в эксплуатацию".
     * 
     */
    @XmlElement(name = "CommissioningPermitAgreement")
    protected List<AttachmentType> commissioningPermitAgreement;
    /**
     * Устав. Обязателен, если в "Основание заключения договора" указано "Устав".
     * 
     */
    @XmlElement(name = "Charter")
    protected List<AttachmentType> charter;
    /**
     * Решение органа местного самоуправления.
     * 
     */
    @XmlElement(name = "LocalGovernmentDecision")
    protected List<AttachmentType> localGovernmentDecision;
    /**
     * Идентификатор решения из Реестра решений об определении управляющей организации.
     * 
     */
    @XmlElement(name = "RegistryDecisionID")
    protected String registryDecisionID;
    /**
     * Автоматически пролонгировать договор на один год при наступлении даты окончания действия договора. Для автоматического пролонгирования указывается значение true.
     * 
     */
    @XmlElement(name = "AutomaticRollOverOneYear")
    protected Boolean automaticRollOverOneYear;
    /**
     * Разрешить (true) или запретить (false) передачу гражданам текущих показаний по индивидуальным приборам учета в любой день месяца.
     * 
     */
    @XmlElement(name = "IndicationsAnyDay")
    protected Boolean indicationsAnyDay;

    /**
     * Номер документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * Sets the value of the docNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocNum()
     */
    public void setDocNum(String value) {
        this.docNum = value;
    }

    /**
     * Дата заключения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSigningDate() {
        return signingDate;
    }

    /**
     * Sets the value of the signingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getSigningDate()
     */
    public void setSigningDate(XMLGregorianCalendar value) {
        this.signingDate = value;
    }

    /**
     * Дата вступления в силу
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEffectiveDate()
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Планируемая дата окончания
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanDateComptetion() {
        return planDateComptetion;
    }

    /**
     * Sets the value of the planDateComptetion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getPlanDateComptetion()
     */
    public void setPlanDateComptetion(XMLGregorianCalendar value) {
        this.planDateComptetion = value;
    }

    /**
     * Срок действия (заполняется при экспорте)
     * 
     * @return
     *     possible object is
     *     {@link ContractExportType.Validity }
     *     
     */
    public ContractExportType.Validity getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractExportType.Validity }
     *     
     * @see #getValidity()
     */
    public void setValidity(ContractExportType.Validity value) {
        this.validity = value;
    }

    /**
     * Собственник объекта жилищного фонда  (можно указать только один действущий управляемый объект)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwners() {
        return owners;
    }

    /**
     * Sets the value of the owners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOwners()
     */
    public void setOwners(Boolean value) {
        this.owners = value;
    }

    /**
     * ТСЖ/Кооператив
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getCooperative() {
        return cooperative;
    }

    /**
     * Sets the value of the cooperative property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getCooperative()
     */
    public void setCooperative(RegOrgType value) {
        this.cooperative = value;
    }

    /**
     * Собственник муниципального жилья
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getMunicipalHousing() {
        return municipalHousing;
    }

    /**
     * Sets the value of the municipalHousing property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getMunicipalHousing()
     */
    public void setMunicipalHousing(RegOrgType value) {
        this.municipalHousing = value;
    }

    /**
     * Застройщик
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getBuildingOwner() {
        return buildingOwner;
    }

    /**
     * Sets the value of the buildingOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getBuildingOwner()
     */
    public void setBuildingOwner(RegOrgType value) {
        this.buildingOwner = value;
    }

    /**
     * Орган, уполномоченный на принятие решения об определении управляющей организации
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getCompetentAuthority() {
        return competentAuthority;
    }

    /**
     * Sets the value of the competentAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getCompetentAuthority()
     */
    public void setCompetentAuthority(RegOrgType value) {
        this.competentAuthority = value;
    }

    /**
     * Сведения о протоколе открытого конкурса/собрания собственников
     * 
     * @return
     *     possible object is
     *     {@link ContractExportType.Protocol }
     *     
     */
    public ContractExportType.Protocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractExportType.Protocol }
     *     
     * @see #getProtocol()
     */
    public void setProtocol(ContractExportType.Protocol value) {
        this.protocol = value;
    }

    /**
     * Ссылка на НСИ "Основание заключения договора" (реестровый номер 58).
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getContractBase() {
        return contractBase;
    }

    /**
     * Sets the value of the contractBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getContractBase()
     */
    public void setContractBase(NsiRef value) {
        this.contractBase = value;
    }

    /**
     * Сведения о сроках. Для EditContract допускается указывать пустым, сведения будут скопированы из предыдущей версии.
     * 
     * @return
     *     possible object is
     *     {@link DateDetailsExportType }
     *     
     */
    public DateDetailsExportType getDateDetails() {
        return dateDetails;
    }

    /**
     * Sets the value of the dateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateDetailsExportType }
     *     
     * @see #getDateDetails()
     */
    public void setDateDetails(DateDetailsExportType value) {
        this.dateDetails = value;
    }

    /**
     * Договор на управление и приложения
     * 
     * Gets the value of the contractAttachment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractAttachment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContractAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the contractAttachment property.
     */
    public List<AttachmentType> getContractAttachment() {
        if (contractAttachment == null) {
            contractAttachment = new ArrayList<>();
        }
        return this.contractAttachment;
    }

    /**
     * Дополнительное соглашение
     * 
     * Gets the value of the agreementAttachment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementAttachment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAgreementAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractExportType.AgreementAttachment }
     * </p>
     * 
     * 
     * @return
     *     The value of the agreementAttachment property.
     */
    public List<ContractExportType.AgreementAttachment> getAgreementAttachment() {
        if (agreementAttachment == null) {
            agreementAttachment = new ArrayList<>();
        }
        return this.agreementAttachment;
    }

    /**
     * Реестр собственников, подписавших договор.
     * 
     * Gets the value of the signedOwners property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signedOwners property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSignedOwners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the signedOwners property.
     */
    public List<AttachmentType> getSignedOwners() {
        if (signedOwners == null) {
            signedOwners = new ArrayList<>();
        }
        return this.signedOwners;
    }

    /**
     * Разрешение на ввод в эксплуатацию. Обязателен, если в "Основание заключения договора" указано "Разрешение на ввод в эксплуатацию".
     * 
     * Gets the value of the commissioningPermitAgreement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissioningPermitAgreement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCommissioningPermitAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the commissioningPermitAgreement property.
     */
    public List<AttachmentType> getCommissioningPermitAgreement() {
        if (commissioningPermitAgreement == null) {
            commissioningPermitAgreement = new ArrayList<>();
        }
        return this.commissioningPermitAgreement;
    }

    /**
     * Устав. Обязателен, если в "Основание заключения договора" указано "Устав".
     * 
     * Gets the value of the charter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCharter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the charter property.
     */
    public List<AttachmentType> getCharter() {
        if (charter == null) {
            charter = new ArrayList<>();
        }
        return this.charter;
    }

    /**
     * Решение органа местного самоуправления.
     * 
     * Gets the value of the localGovernmentDecision property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localGovernmentDecision property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLocalGovernmentDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the localGovernmentDecision property.
     */
    public List<AttachmentType> getLocalGovernmentDecision() {
        if (localGovernmentDecision == null) {
            localGovernmentDecision = new ArrayList<>();
        }
        return this.localGovernmentDecision;
    }

    /**
     * Идентификатор решения из Реестра решений об определении управляющей организации.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryDecisionID() {
        return registryDecisionID;
    }

    /**
     * Sets the value of the registryDecisionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegistryDecisionID()
     */
    public void setRegistryDecisionID(String value) {
        this.registryDecisionID = value;
    }

    /**
     * Автоматически пролонгировать договор на один год при наступлении даты окончания действия договора. Для автоматического пролонгирования указывается значение true.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticRollOverOneYear() {
        return automaticRollOverOneYear;
    }

    /**
     * Sets the value of the automaticRollOverOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAutomaticRollOverOneYear()
     */
    public void setAutomaticRollOverOneYear(Boolean value) {
        this.automaticRollOverOneYear = value;
    }

    /**
     * Разрешить (true) или запретить (false) передачу гражданам текущих показаний по индивидуальным приборам учета в любой день месяца.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicationsAnyDay() {
        return indicationsAnyDay;
    }

    /**
     * Sets the value of the indicationsAnyDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIndicationsAnyDay()
     */
    public void setIndicationsAnyDay(Boolean value) {
        this.indicationsAnyDay = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType">
     *       <sequence>
     *         <element name="ImprintAgreement" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ImprintAgreementExportType"/>
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
        "imprintAgreement"
    })
    public static class AgreementAttachment
        extends AttachmentType
    {

        /**
         * Реквизиты дополнительного соглашения
         * 
         */
        @XmlElement(name = "ImprintAgreement", required = true)
        protected ImprintAgreementExportType imprintAgreement;

        /**
         * Реквизиты дополнительного соглашения
         * 
         * @return
         *     possible object is
         *     {@link ImprintAgreementExportType }
         *     
         */
        public ImprintAgreementExportType getImprintAgreement() {
            return imprintAgreement;
        }

        /**
         * Sets the value of the imprintAgreement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImprintAgreementExportType }
         *     
         * @see #getImprintAgreement()
         */
        public void setImprintAgreement(ImprintAgreementExportType value) {
            this.imprintAgreement = value;
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
     *       <sequence minOccurs="0">
     *         <element name="ProtocolAdd" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <sequence>
     *                     <sequence minOccurs="0">
     *                       <element name="PurchaseNumber" minOccurs="0">
     *                         <simpleType>
     *                           <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
     *                             <maxLength value="60"/>
     *                           </restriction>
     *                         </simpleType>
     *                       </element>
     *                       <element name="ProtocolOK" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                     </sequence>
     *                     <element name="ProtocolMeetingOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                   </sequence>
     *                   <element name="ProtocolMeetingBoard" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                   <element name="ProtocolBuildingOwner" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="VotingProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded" minOccurs="0"/>
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
        "protocolAdd",
        "votingProtocolGUID"
    })
    public static class Protocol {

        /**
         * Протокол открытого конкурса/собрания собственников (Добавление нового протокола)
         * 
         */
        @XmlElement(name = "ProtocolAdd")
        protected ContractExportType.Protocol.ProtocolAdd protocolAdd;
        /**
         * Идентификатор версии протокола голосования (Добавление протокола из реестра сведений о голосовании)
         * 
         */
        @XmlElement(name = "VotingProtocolGUID")
        protected List<String> votingProtocolGUID;

        /**
         * Протокол открытого конкурса/собрания собственников (Добавление нового протокола)
         * 
         * @return
         *     possible object is
         *     {@link ContractExportType.Protocol.ProtocolAdd }
         *     
         */
        public ContractExportType.Protocol.ProtocolAdd getProtocolAdd() {
            return protocolAdd;
        }

        /**
         * Sets the value of the protocolAdd property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractExportType.Protocol.ProtocolAdd }
         *     
         * @see #getProtocolAdd()
         */
        public void setProtocolAdd(ContractExportType.Protocol.ProtocolAdd value) {
            this.protocolAdd = value;
        }

        /**
         * Идентификатор версии протокола голосования (Добавление протокола из реестра сведений о голосовании)
         * 
         * Gets the value of the votingProtocolGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the votingProtocolGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getVotingProtocolGUID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * </p>
         * 
         * 
         * @return
         *     The value of the votingProtocolGUID property.
         */
        public List<String> getVotingProtocolGUID() {
            if (votingProtocolGUID == null) {
                votingProtocolGUID = new ArrayList<>();
            }
            return this.votingProtocolGUID;
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
         *           <sequence minOccurs="0">
         *             <element name="PurchaseNumber" minOccurs="0">
         *               <simpleType>
         *                 <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
         *                   <maxLength value="60"/>
         *                 </restriction>
         *               </simpleType>
         *             </element>
         *             <element name="ProtocolOK" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
         *           </sequence>
         *           <element name="ProtocolMeetingOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
         *         </sequence>
         *         <element name="ProtocolMeetingBoard" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
         *         <element name="ProtocolBuildingOwner" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
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
            "purchaseNumber",
            "protocolOK",
            "protocolMeetingOwners",
            "protocolMeetingBoard",
            "protocolBuildingOwner"
        })
        public static class ProtocolAdd {

            /**
             * Элемент не используется, оставлен в схеме для обеспечения совместимости интеграционного взаимодействия
             * 
             */
            @XmlElement(name = "PurchaseNumber")
            protected String purchaseNumber;
            /**
             * Протокол открытого конкурса
             * 
             */
            @XmlElement(name = "ProtocolOK")
            protected List<AttachmentType> protocolOK;
            /**
             * Протокол собрания собственников
             * 
             */
            @XmlElement(name = "ProtocolMeetingOwners")
            protected List<AttachmentType> protocolMeetingOwners;
            /**
             * Протокол заседания правления
             * 
             */
            @XmlElement(name = "ProtocolMeetingBoard")
            protected List<AttachmentType> protocolMeetingBoard;
            /**
             * Документ, подтверждающий принятое решение органом управления застройщика
             * 
             */
            @XmlElement(name = "ProtocolBuildingOwner")
            protected List<AttachmentType> protocolBuildingOwner;

            /**
             * Элемент не используется, оставлен в схеме для обеспечения совместимости интеграционного взаимодействия
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurchaseNumber() {
                return purchaseNumber;
            }

            /**
             * Sets the value of the purchaseNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPurchaseNumber()
             */
            public void setPurchaseNumber(String value) {
                this.purchaseNumber = value;
            }

            /**
             * Протокол открытого конкурса
             * 
             * Gets the value of the protocolOK property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the protocolOK property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getProtocolOK().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachmentType }
             * </p>
             * 
             * 
             * @return
             *     The value of the protocolOK property.
             */
            public List<AttachmentType> getProtocolOK() {
                if (protocolOK == null) {
                    protocolOK = new ArrayList<>();
                }
                return this.protocolOK;
            }

            /**
             * Протокол собрания собственников
             * 
             * Gets the value of the protocolMeetingOwners property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the protocolMeetingOwners property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getProtocolMeetingOwners().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachmentType }
             * </p>
             * 
             * 
             * @return
             *     The value of the protocolMeetingOwners property.
             */
            public List<AttachmentType> getProtocolMeetingOwners() {
                if (protocolMeetingOwners == null) {
                    protocolMeetingOwners = new ArrayList<>();
                }
                return this.protocolMeetingOwners;
            }

            /**
             * Протокол заседания правления
             * 
             * Gets the value of the protocolMeetingBoard property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the protocolMeetingBoard property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getProtocolMeetingBoard().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachmentType }
             * </p>
             * 
             * 
             * @return
             *     The value of the protocolMeetingBoard property.
             */
            public List<AttachmentType> getProtocolMeetingBoard() {
                if (protocolMeetingBoard == null) {
                    protocolMeetingBoard = new ArrayList<>();
                }
                return this.protocolMeetingBoard;
            }

            /**
             * Документ, подтверждающий принятое решение органом управления застройщика
             * 
             * Gets the value of the protocolBuildingOwner property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the protocolBuildingOwner property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getProtocolBuildingOwner().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachmentType }
             * </p>
             * 
             * 
             * @return
             *     The value of the protocolBuildingOwner property.
             */
            public List<AttachmentType> getProtocolBuildingOwner() {
                if (protocolBuildingOwner == null) {
                    protocolBuildingOwner = new ArrayList<>();
                }
                return this.protocolBuildingOwner;
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
     *         <element name="Month" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               <totalDigits value="2"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Year" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               <totalDigits value="4"/>
     *             </restriction>
     *           </simpleType>
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
    @XmlType(name = "", propOrder = {
        "month",
        "year"
    })
    public static class Validity {

        /**
         * Месяц
         * 
         */
        @XmlElement(name = "Month")
        protected BigInteger month;
        /**
         * год/лет
         * 
         */
        @XmlElement(name = "Year")
        protected BigInteger year;

        /**
         * Месяц
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonth() {
            return month;
        }

        /**
         * Sets the value of the month property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         * @see #getMonth()
         */
        public void setMonth(BigInteger value) {
            this.month = value;
        }

        /**
         * год/лет
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         * @see #getYear()
         */
        public void setYear(BigInteger value) {
            this.year = value;
        }

    }

}
