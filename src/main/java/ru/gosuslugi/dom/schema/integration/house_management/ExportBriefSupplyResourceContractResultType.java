
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * <p>Java class for exportBriefSupplyResourceContractResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportBriefSupplyResourceContractResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="VersionNumber">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="VersionStatus">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Posted"/>
 *               <enumeration value="Terminated"/>
 *               <enumeration value="Draft"/>
 *               <enumeration value="Annul"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ContractState">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="NotTakeEffect"/>
 *               <enumeration value="Proceed"/>
 *               <enumeration value="Expired"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <choice>
 *           <element name="IsContract">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="ContractNumber">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="100"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="IsNotContract" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="ContractNumber" minOccurs="0">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="100"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                     <element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <sequence>
 *           <element name="FirstPartyContract">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="SecondPartyContract">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="Organization">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Offer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="Owner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </sequence>
 *         <element name="ContractSubject" maxOccurs="100" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ServiceType">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="MunicipalResource">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="StartSupplyDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="EndSupplyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CountingResource" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="R"/>
 *               <enumeration value="P"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <sequence>
 *           <element name="BillingDate" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Date">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                           <minInclusive value="-1"/>
 *                           <maxInclusive value="30"/>
 *                           <pattern value="(-1)|[1-9]|([1][0-9])|([2][0-9])|30"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="DateType">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <enumeration value="C"/>
 *                           <enumeration value="N"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="PaymentDate" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Date">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                           <minInclusive value="-1"/>
 *                           <maxInclusive value="30"/>
 *                           <pattern value="(-1)|[1-9]|([1][0-9])|([2][0-9])|30"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="DateType">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <enumeration value="C"/>
 *                           <enumeration value="N"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="ProvidingInformationDate" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Date">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                           <minInclusive value="-1"/>
 *                           <maxInclusive value="30"/>
 *                           <pattern value="(-1)|[1-9]|([1][0-9])|([2][0-9])|30"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="DateType">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <enumeration value="C"/>
 *                           <enumeration value="N"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </sequence>
 *         <element name="Period" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Start">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="StartDate">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   <minInclusive value="1"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="NextMonth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="End">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="EndDate">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                   <minInclusive value="-1"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="NextMonth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="NoConnectionToWaterSupply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="TerminateContract" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
 *                 <sequence>
 *                   <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AnnulmentContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType" minOccurs="0"/>
 *         <element name="ObjectAddress" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ObjectAddressBriefType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportBriefSupplyResourceContractResultType", propOrder = {
    "contractRootGUID",
    "contractGUID",
    "versionNumber",
    "versionStatus",
    "contractState",
    "isContract",
    "isNotContract",
    "firstPartyContract",
    "secondPartyContract",
    "contractSubject",
    "countingResource",
    "billingDate",
    "paymentDate",
    "providingInformationDate",
    "period",
    "noConnectionToWaterSupply",
    "terminateContract",
    "annulmentContract",
    "objectAddress"
})
public class ExportBriefSupplyResourceContractResultType {

    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractRootGUID", required = true)
    protected String contractRootGUID;
    /**
     * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractGUID", required = true)
    protected String contractGUID;
    /**
     * Номер версии договора
     * 
     */
    @XmlElement(name = "VersionNumber", required = true)
    protected BigInteger versionNumber;
    /**
     * Статус версии договора
     * 
     */
    @XmlElement(name = "VersionStatus", required = true)
    protected String versionStatus;
    /**
     * Состояние договора
     * 
     */
    @XmlElement(name = "ContractState", required = true)
    protected String contractState;
    /**
     * Договор не является публичным и/или присутствует заключенный на бумажном носителе или в электронной форме
     * 
     */
    @XmlElement(name = "IsContract")
    protected ExportBriefSupplyResourceContractResultType.IsContract isContract;
    /**
     * Договор является публичным и/или отсутствует заключенный на бумажном носителе или в электронной форме
     * 
     */
    @XmlElement(name = "IsNotContract")
    protected ExportBriefSupplyResourceContractResultType.IsNotContract isNotContract;
    /**
     * Первая сторона договора (РСО)
     * 
     */
    @XmlElement(name = "FirstPartyContract", required = true)
    protected ExportBriefSupplyResourceContractResultType.FirstPartyContract firstPartyContract;
    /**
     * Вторая сторона договора
     * 
     */
    @XmlElement(name = "SecondPartyContract", required = true)
    protected ExportBriefSupplyResourceContractResultType.SecondPartyContract secondPartyContract;
    /**
     * Предмет договора
     * 
     */
    @XmlElement(name = "ContractSubject")
    protected List<ExportBriefSupplyResourceContractResultType.ContractSubject> contractSubject;
    /**
     * Коммерческий учет ресурса осуществляет:
     * R(SO)- РСО.
     * P(roprietor)-Исполнитель коммунальных услуг.
     * 
     */
    @XmlElement(name = "CountingResource")
    protected String countingResource;
    /**
     * Срок представления (выставления) платежных документов, не позднее.
     * 
     */
    @XmlElement(name = "BillingDate")
    protected ExportBriefSupplyResourceContractResultType.BillingDate billingDate;
    /**
     * Срок внесения платы, не позднее.
     * 
     */
    @XmlElement(name = "PaymentDate")
    protected ExportBriefSupplyResourceContractResultType.PaymentDate paymentDate;
    /**
     * Срок предоставления информации о поступивших платежах, не позднее.
     * 
     */
    @XmlElement(name = "ProvidingInformationDate")
    protected ExportBriefSupplyResourceContractResultType.ProvidingInformationDate providingInformationDate;
    /**
     * Период сдачи текущих показаний по ПУ.
     * 
     */
    @XmlElement(name = "Period")
    protected ExportBriefSupplyResourceContractResultType.Period period;
    /**
     * Признак "Отсутствие присоединения сетей объектов жилищного фонда к централизованной системе водоснабжения". Может быть указан, только если показатели качества коммунальных ресурсов ведутся в разрезе договора и предмет договора включает коммунальную услугу "Холодное водоснабжение" и/или "Горячее водоснабжение"
     * 
     */
    @XmlElement(name = "NoConnectionToWaterSupply")
    protected Boolean noConnectionToWaterSupply;
    /**
     * Информация о расторжении
     * 
     */
    @XmlElement(name = "TerminateContract")
    protected ExportBriefSupplyResourceContractResultType.TerminateContract terminateContract;
    /**
     * Информация об аннулировании
     * 
     */
    @XmlElement(name = "AnnulmentContract")
    protected AnnulmentType annulmentContract;
    /**
     * Объект жилищного фонда в договоре ресурсоснабжения
     * 
     */
    @XmlElement(name = "ObjectAddress")
    protected List<ObjectAddressBriefType> objectAddress;

    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractRootGUID() {
        return contractRootGUID;
    }

    /**
     * Sets the value of the contractRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractRootGUID()
     */
    public void setContractRootGUID(String value) {
        this.contractRootGUID = value;
    }

    /**
     * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractGUID() {
        return contractGUID;
    }

    /**
     * Sets the value of the contractGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractGUID()
     */
    public void setContractGUID(String value) {
        this.contractGUID = value;
    }

    /**
     * Номер версии договора
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getVersionNumber()
     */
    public void setVersionNumber(BigInteger value) {
        this.versionNumber = value;
    }

    /**
     * Статус версии договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionStatus() {
        return versionStatus;
    }

    /**
     * Sets the value of the versionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersionStatus()
     */
    public void setVersionStatus(String value) {
        this.versionStatus = value;
    }

    /**
     * Состояние договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractState() {
        return contractState;
    }

    /**
     * Sets the value of the contractState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractState()
     */
    public void setContractState(String value) {
        this.contractState = value;
    }

    /**
     * Договор не является публичным и/или присутствует заключенный на бумажном носителе или в электронной форме
     * 
     * @return
     *     possible object is
     *     {@link ExportBriefSupplyResourceContractResultType.IsContract }
     *     
     */
    public ExportBriefSupplyResourceContractResultType.IsContract getIsContract() {
        return isContract;
    }

    /**
     * Sets the value of the isContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportBriefSupplyResourceContractResultType.IsContract }
     *     
     * @see #getIsContract()
     */
    public void setIsContract(ExportBriefSupplyResourceContractResultType.IsContract value) {
        this.isContract = value;
    }

    /**
     * Договор является публичным и/или отсутствует заключенный на бумажном носителе или в электронной форме
     * 
     * @return
     *     possible object is
     *     {@link ExportBriefSupplyResourceContractResultType.IsNotContract }
     *     
     */
    public ExportBriefSupplyResourceContractResultType.IsNotContract getIsNotContract() {
        return isNotContract;
    }

    /**
     * Sets the value of the isNotContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportBriefSupplyResourceContractResultType.IsNotContract }
     *     
     * @see #getIsNotContract()
     */
    public void setIsNotContract(ExportBriefSupplyResourceContractResultType.IsNotContract value) {
        this.isNotContract = value;
    }

    /**
     * Первая сторона договора (РСО)
     * 
     * @return
     *     possible object is
     *     {@link ExportBriefSupplyResourceContractResultType.FirstPartyContract }
     *     
     */
    public ExportBriefSupplyResourceContractResultType.FirstPartyContract getFirstPartyContract() {
        return firstPartyContract;
    }

    /**
     * Sets the value of the firstPartyContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportBriefSupplyResourceContractResultType.FirstPartyContract }
     *     
     * @see #getFirstPartyContract()
     */
    public void setFirstPartyContract(ExportBriefSupplyResourceContractResultType.FirstPartyContract value) {
        this.firstPartyContract = value;
    }

    /**
     * Вторая сторона договора
     * 
     * @return
     *     possible object is
     *     {@link ExportBriefSupplyResourceContractResultType.SecondPartyContract }
     *     
     */
    public ExportBriefSupplyResourceContractResultType.SecondPartyContract getSecondPartyContract() {
        return secondPartyContract;
    }

    /**
     * Sets the value of the secondPartyContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportBriefSupplyResourceContractResultType.SecondPartyContract }
     *     
     * @see #getSecondPartyContract()
     */
    public void setSecondPartyContract(ExportBriefSupplyResourceContractResultType.SecondPartyContract value) {
        this.secondPartyContract = value;
    }

    /**
     * Предмет договора
     * 
     * Gets the value of the contractSubject property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractSubject property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContractSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportBriefSupplyResourceContractResultType.ContractSubject }
     * </p>
     * 
     * 
     * @return
     *     The value of the contractSubject property.
     */
    public List<ExportBriefSupplyResourceContractResultType.ContractSubject> getContractSubject() {
        if (contractSubject == null) {
            contractSubject = new ArrayList<>();
        }
        return this.contractSubject;
    }

    /**
     * Коммерческий учет ресурса осуществляет:
     * R(SO)- РСО.
     * P(roprietor)-Исполнитель коммунальных услуг.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountingResource() {
        return countingResource;
    }

    /**
     * Sets the value of the countingResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountingResource()
     */
    public void setCountingResource(String value) {
        this.countingResource = value;
    }

    /**
     * Срок представления (выставления) платежных документов, не позднее.
     * 
     * @return
     *     possible object is
     *     {@link ExportBriefSupplyResourceContractResultType.BillingDate }
     *     
     */
    public ExportBriefSupplyResourceContractResultType.BillingDate getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportBriefSupplyResourceContractResultType.BillingDate }
     *     
     * @see #getBillingDate()
     */
    public void setBillingDate(ExportBriefSupplyResourceContractResultType.BillingDate value) {
        this.billingDate = value;
    }

    /**
     * Срок внесения платы, не позднее.
     * 
     * @return
     *     possible object is
     *     {@link ExportBriefSupplyResourceContractResultType.PaymentDate }
     *     
     */
    public ExportBriefSupplyResourceContractResultType.PaymentDate getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportBriefSupplyResourceContractResultType.PaymentDate }
     *     
     * @see #getPaymentDate()
     */
    public void setPaymentDate(ExportBriefSupplyResourceContractResultType.PaymentDate value) {
        this.paymentDate = value;
    }

    /**
     * Срок предоставления информации о поступивших платежах, не позднее.
     * 
     * @return
     *     possible object is
     *     {@link ExportBriefSupplyResourceContractResultType.ProvidingInformationDate }
     *     
     */
    public ExportBriefSupplyResourceContractResultType.ProvidingInformationDate getProvidingInformationDate() {
        return providingInformationDate;
    }

    /**
     * Sets the value of the providingInformationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportBriefSupplyResourceContractResultType.ProvidingInformationDate }
     *     
     * @see #getProvidingInformationDate()
     */
    public void setProvidingInformationDate(ExportBriefSupplyResourceContractResultType.ProvidingInformationDate value) {
        this.providingInformationDate = value;
    }

    /**
     * Период сдачи текущих показаний по ПУ.
     * 
     * @return
     *     possible object is
     *     {@link ExportBriefSupplyResourceContractResultType.Period }
     *     
     */
    public ExportBriefSupplyResourceContractResultType.Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportBriefSupplyResourceContractResultType.Period }
     *     
     * @see #getPeriod()
     */
    public void setPeriod(ExportBriefSupplyResourceContractResultType.Period value) {
        this.period = value;
    }

    /**
     * Признак "Отсутствие присоединения сетей объектов жилищного фонда к централизованной системе водоснабжения". Может быть указан, только если показатели качества коммунальных ресурсов ведутся в разрезе договора и предмет договора включает коммунальную услугу "Холодное водоснабжение" и/или "Горячее водоснабжение"
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoConnectionToWaterSupply() {
        return noConnectionToWaterSupply;
    }

    /**
     * Sets the value of the noConnectionToWaterSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoConnectionToWaterSupply()
     */
    public void setNoConnectionToWaterSupply(Boolean value) {
        this.noConnectionToWaterSupply = value;
    }

    /**
     * Информация о расторжении
     * 
     * @return
     *     possible object is
     *     {@link ExportBriefSupplyResourceContractResultType.TerminateContract }
     *     
     */
    public ExportBriefSupplyResourceContractResultType.TerminateContract getTerminateContract() {
        return terminateContract;
    }

    /**
     * Sets the value of the terminateContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportBriefSupplyResourceContractResultType.TerminateContract }
     *     
     * @see #getTerminateContract()
     */
    public void setTerminateContract(ExportBriefSupplyResourceContractResultType.TerminateContract value) {
        this.terminateContract = value;
    }

    /**
     * Информация об аннулировании
     * 
     * @return
     *     possible object is
     *     {@link AnnulmentType }
     *     
     */
    public AnnulmentType getAnnulmentContract() {
        return annulmentContract;
    }

    /**
     * Sets the value of the annulmentContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnulmentType }
     *     
     * @see #getAnnulmentContract()
     */
    public void setAnnulmentContract(AnnulmentType value) {
        this.annulmentContract = value;
    }

    /**
     * Объект жилищного фонда в договоре ресурсоснабжения
     * 
     * Gets the value of the objectAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getObjectAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectAddressBriefType }
     * </p>
     * 
     * 
     * @return
     *     The value of the objectAddress property.
     */
    public List<ObjectAddressBriefType> getObjectAddress() {
        if (objectAddress == null) {
            objectAddress = new ArrayList<>();
        }
        return this.objectAddress;
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
     *         <element name="Date">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               <minInclusive value="-1"/>
     *               <maxInclusive value="30"/>
     *               <pattern value="(-1)|[1-9]|([1][0-9])|([2][0-9])|30"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="DateType">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="C"/>
     *               <enumeration value="N"/>
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
        "date",
        "dateType"
    })
    public static class BillingDate {

        /**
         * Срок представления (выставления) платежных документов (число), не позднее. Если указан "Последний день месяца", то в поле выгружается значение "-1".
         * 
         */
        @XmlElement(name = "Date")
        protected byte date;
        /**
         * Тип срока:
         * C (urrrent) - текущего расчетного месяца.
         * N (ext) - следующего месяца за расчетным.
         * 
         */
        @XmlElement(name = "DateType", required = true)
        protected String dateType;

        /**
         * Срок представления (выставления) платежных документов (число), не позднее. Если указан "Последний день месяца", то в поле выгружается значение "-1".
         * 
         */
        public byte getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         */
        public void setDate(byte value) {
            this.date = value;
        }

        /**
         * Тип срока:
         * C (urrrent) - текущего расчетного месяца.
         * N (ext) - следующего месяца за расчетным.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateType() {
            return dateType;
        }

        /**
         * Sets the value of the dateType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDateType()
         */
        public void setDateType(String value) {
            this.dateType = value;
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
     *         <element name="ServiceType">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="MunicipalResource">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="StartSupplyDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="EndSupplyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
        "serviceType",
        "municipalResource",
        "startSupplyDate",
        "endSupplyDate",
        "transportGUID"
    })
    public static class ContractSubject {

        /**
         * Вид КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
         * 
         */
        @XmlElement(name = "ServiceType", required = true)
        protected ExportBriefSupplyResourceContractResultType.ContractSubject.ServiceType serviceType;
        /**
         * Коммунальный ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239)
         * 
         */
        @XmlElement(name = "MunicipalResource", required = true)
        protected ExportBriefSupplyResourceContractResultType.ContractSubject.MunicipalResource municipalResource;
        /**
         * Дата начала поставки ресурса
         * 
         */
        @XmlElement(name = "StartSupplyDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startSupplyDate;
        /**
         * Дата окончания поставки ресурса
         * 
         */
        @XmlElement(name = "EndSupplyDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endSupplyDate;
        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;

        /**
         * Вид КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
         * 
         * @return
         *     possible object is
         *     {@link ExportBriefSupplyResourceContractResultType.ContractSubject.ServiceType }
         *     
         */
        public ExportBriefSupplyResourceContractResultType.ContractSubject.ServiceType getServiceType() {
            return serviceType;
        }

        /**
         * Sets the value of the serviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportBriefSupplyResourceContractResultType.ContractSubject.ServiceType }
         *     
         * @see #getServiceType()
         */
        public void setServiceType(ExportBriefSupplyResourceContractResultType.ContractSubject.ServiceType value) {
            this.serviceType = value;
        }

        /**
         * Коммунальный ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239)
         * 
         * @return
         *     possible object is
         *     {@link ExportBriefSupplyResourceContractResultType.ContractSubject.MunicipalResource }
         *     
         */
        public ExportBriefSupplyResourceContractResultType.ContractSubject.MunicipalResource getMunicipalResource() {
            return municipalResource;
        }

        /**
         * Sets the value of the municipalResource property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportBriefSupplyResourceContractResultType.ContractSubject.MunicipalResource }
         *     
         * @see #getMunicipalResource()
         */
        public void setMunicipalResource(ExportBriefSupplyResourceContractResultType.ContractSubject.MunicipalResource value) {
            this.municipalResource = value;
        }

        /**
         * Дата начала поставки ресурса
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartSupplyDate() {
            return startSupplyDate;
        }

        /**
         * Sets the value of the startSupplyDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getStartSupplyDate()
         */
        public void setStartSupplyDate(XMLGregorianCalendar value) {
            this.startSupplyDate = value;
        }

        /**
         * Дата окончания поставки ресурса
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndSupplyDate() {
            return endSupplyDate;
        }

        /**
         * Sets the value of the endSupplyDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getEndSupplyDate()
         */
        public void setEndSupplyDate(XMLGregorianCalendar value) {
            this.endSupplyDate = value;
        }

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
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MunicipalResource
            extends NsiRef
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ServiceType
            extends NsiRef
        {


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
    public static class FirstPartyContract
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
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="ContractNumber">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="100"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "contractNumber",
        "signingDate",
        "effectiveDate"
    })
    public static class IsContract {

        /**
         * Номер договора
         * 
         */
        @XmlElement(name = "ContractNumber", required = true)
        protected String contractNumber;
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
         * Номер договора
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractNumber() {
            return contractNumber;
        }

        /**
         * Sets the value of the contractNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractNumber()
         */
        public void setContractNumber(String value) {
            this.contractNumber = value;
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
     *         <element name="ContractNumber" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="100"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "contractNumber",
        "signingDate",
        "effectiveDate"
    })
    public static class IsNotContract {

        /**
         * Номер договора
         * 
         */
        @XmlElement(name = "ContractNumber")
        protected String contractNumber;
        /**
         * Дата заключения
         * 
         */
        @XmlElement(name = "SigningDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signingDate;
        /**
         * Дата вступления в силу
         * 
         */
        @XmlElement(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;

        /**
         * Номер договора
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractNumber() {
            return contractNumber;
        }

        /**
         * Sets the value of the contractNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractNumber()
         */
        public void setContractNumber(String value) {
            this.contractNumber = value;
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
     *         <element name="Date">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               <minInclusive value="-1"/>
     *               <maxInclusive value="30"/>
     *               <pattern value="(-1)|[1-9]|([1][0-9])|([2][0-9])|30"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="DateType">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="C"/>
     *               <enumeration value="N"/>
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
        "date",
        "dateType"
    })
    public static class PaymentDate {

        /**
         * Срок внесения платы (число), не позднее. Если указан "Последний день месяца", то в поле выгружается значение "-1".
         * 
         */
        @XmlElement(name = "Date")
        protected byte date;
        /**
         * Тип срока:
         * C (urrrent) - текущего расчетного месяца.
         * N (ext) - следующего месяца за расчетным.
         * 
         */
        @XmlElement(name = "DateType", required = true)
        protected String dateType;

        /**
         * Срок внесения платы (число), не позднее. Если указан "Последний день месяца", то в поле выгружается значение "-1".
         * 
         */
        public byte getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         */
        public void setDate(byte value) {
            this.date = value;
        }

        /**
         * Тип срока:
         * C (urrrent) - текущего расчетного месяца.
         * N (ext) - следующего месяца за расчетным.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateType() {
            return dateType;
        }

        /**
         * Sets the value of the dateType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDateType()
         */
        public void setDateType(String value) {
            this.dateType = value;
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
     *         <element name="Start">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="StartDate">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         <minInclusive value="1"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="NextMonth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="End">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="EndDate">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         <minInclusive value="-1"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="NextMonth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "start",
        "end"
    })
    public static class Period {

        /**
         * Начало периода
         * 
         */
        @XmlElement(name = "Start", required = true)
        protected ExportBriefSupplyResourceContractResultType.Period.Start start;
        /**
         * Конец периода
         * 
         */
        @XmlElement(name = "End", required = true)
        protected ExportBriefSupplyResourceContractResultType.Period.End end;

        /**
         * Начало периода
         * 
         * @return
         *     possible object is
         *     {@link ExportBriefSupplyResourceContractResultType.Period.Start }
         *     
         */
        public ExportBriefSupplyResourceContractResultType.Period.Start getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportBriefSupplyResourceContractResultType.Period.Start }
         *     
         * @see #getStart()
         */
        public void setStart(ExportBriefSupplyResourceContractResultType.Period.Start value) {
            this.start = value;
        }

        /**
         * Конец периода
         * 
         * @return
         *     possible object is
         *     {@link ExportBriefSupplyResourceContractResultType.Period.End }
         *     
         */
        public ExportBriefSupplyResourceContractResultType.Period.End getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportBriefSupplyResourceContractResultType.Period.End }
         *     
         * @see #getEnd()
         */
        public void setEnd(ExportBriefSupplyResourceContractResultType.Period.End value) {
            this.end = value;
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
         *         <element name="EndDate">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               <minInclusive value="-1"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="NextMonth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "endDate",
            "nextMonth"
        })
        public static class End {

            /**
             * Дата окончания. Если "Последний день месяца", то в поле выгружается значение "-1".
             * 
             */
            @XmlElement(name = "EndDate")
            protected byte endDate;
            /**
             * Следующего месяца
             * 
             */
            @XmlElement(name = "NextMonth")
            protected Boolean nextMonth;

            /**
             * Дата окончания. Если "Последний день месяца", то в поле выгружается значение "-1".
             * 
             */
            public byte getEndDate() {
                return endDate;
            }

            /**
             * Sets the value of the endDate property.
             * 
             */
            public void setEndDate(byte value) {
                this.endDate = value;
            }

            /**
             * Следующего месяца
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNextMonth() {
                return nextMonth;
            }

            /**
             * Sets the value of the nextMonth property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isNextMonth()
             */
            public void setNextMonth(Boolean value) {
                this.nextMonth = value;
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
         *         <element name="StartDate">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *               <minInclusive value="1"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="NextMonth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "startDate",
            "nextMonth"
        })
        public static class Start {

            /**
             * Дата начала
             * 
             */
            @XmlElement(name = "StartDate")
            protected byte startDate;
            /**
             * Следующего месяца
             * 
             */
            @XmlElement(name = "NextMonth")
            protected Boolean nextMonth;

            /**
             * Дата начала
             * 
             */
            public byte getStartDate() {
                return startDate;
            }

            /**
             * Sets the value of the startDate property.
             * 
             */
            public void setStartDate(byte value) {
                this.startDate = value;
            }

            /**
             * Следующего месяца
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNextMonth() {
                return nextMonth;
            }

            /**
             * Sets the value of the nextMonth property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isNextMonth()
             */
            public void setNextMonth(Boolean value) {
                this.nextMonth = value;
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
     *         <element name="Date">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               <minInclusive value="-1"/>
     *               <maxInclusive value="30"/>
     *               <pattern value="(-1)|[1-9]|([1][0-9])|([2][0-9])|30"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="DateType">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="C"/>
     *               <enumeration value="N"/>
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
        "date",
        "dateType"
    })
    public static class ProvidingInformationDate {

        /**
         * Срок предоставления информации о поступивших платежах (число), не позднее. Если указан "Последний день месяца", то в поле выгружается значение "-1".
         * 
         */
        @XmlElement(name = "Date")
        protected byte date;
        /**
         * Тип срока:
         * C (urrrent) - текущего расчетного месяца.
         * N (ext) - следующего месяца за расчетным.
         * 
         */
        @XmlElement(name = "DateType", required = true)
        protected String dateType;

        /**
         * Срок предоставления информации о поступивших платежах (число), не позднее. Если указан "Последний день месяца", то в поле выгружается значение "-1".
         * 
         */
        public byte getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         */
        public void setDate(byte value) {
            this.date = value;
        }

        /**
         * Тип срока:
         * C (urrrent) - текущего расчетного месяца.
         * N (ext) - следующего месяца за расчетным.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateType() {
            return dateType;
        }

        /**
         * Sets the value of the dateType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDateType()
         */
        public void setDateType(String value) {
            this.dateType = value;
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
     *         <element name="Organization">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Offer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="Owner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "offer",
        "owner"
    })
    public static class SecondPartyContract {

        /**
         * Управляющая организация
         * 
         */
        @XmlElement(name = "Organization")
        protected ExportBriefSupplyResourceContractResultType.SecondPartyContract.Organization organization;
        /**
         * Договор оферта
         * 
         */
        @XmlElement(name = "Offer")
        protected Boolean offer;
        /**
         * Договор заключен с собственниками
         * 
         */
        @XmlElement(name = "Owner")
        protected Boolean owner;

        /**
         * Управляющая организация
         * 
         * @return
         *     possible object is
         *     {@link ExportBriefSupplyResourceContractResultType.SecondPartyContract.Organization }
         *     
         */
        public ExportBriefSupplyResourceContractResultType.SecondPartyContract.Organization getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportBriefSupplyResourceContractResultType.SecondPartyContract.Organization }
         *     
         * @see #getOrganization()
         */
        public void setOrganization(ExportBriefSupplyResourceContractResultType.SecondPartyContract.Organization value) {
            this.organization = value;
        }

        /**
         * Договор оферта
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOffer() {
            return offer;
        }

        /**
         * Sets the value of the offer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isOffer()
         */
        public void setOffer(Boolean value) {
            this.offer = value;
        }

        /**
         * Договор заключен с собственниками
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isOwner()
         */
        public void setOwner(Boolean value) {
            this.owner = value;
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
        public static class Organization
            extends RegOrgType
        {


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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
     *       <sequence>
     *         <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
        "reasonRef"
    })
    public static class TerminateContract
        extends TerminateType
    {

        /**
         * Ссылка на НСИ "54	Причина расторжения договора" (реестровый номер 54)
         * 
         */
        @XmlElement(name = "ReasonRef", required = true)
        protected NsiRef reasonRef;

        /**
         * Ссылка на НСИ "54	Причина расторжения договора" (реестровый номер 54)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getReasonRef() {
            return reasonRef;
        }

        /**
         * Sets the value of the reasonRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getReasonRef()
         */
        public void setReasonRef(NsiRef value) {
            this.reasonRef = value;
        }

    }

}
