
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
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
 * Экспортируемый договор ресурсоснабжения
 * 
 * <p>Java class for ExportSupplyResourceContractType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportSupplyResourceContractType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="IsContract">
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
 *                     <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="ContractAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
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
 *                     <element name="ContractAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <choice>
 *           <element name="IndefiniteTerm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           <sequence>
 *             <element name="AutomaticRollOverOneYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *             <element name="ComptetionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *         <element name="VolumeDepends" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *                             <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
 *                             <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
 *         <element name="IndicationsAnyDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ContractBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded" minOccurs="0"/>
 *         <choice>
 *           <element name="Offer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="ApartmentBuildingOwner">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="RegOrg" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSORegOrgType"/>
 *                     <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOIndType"/>
 *                     <element name="NoData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="LivingHouseOwner">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="RegOrg" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSORegOrgType"/>
 *                     <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOIndType"/>
 *                     <element name="NoData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="Organization">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="ApartmentBuildingRepresentativeOwner">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="NoData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="RegOrg" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSORegOrgType"/>
 *                     <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOIndType"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="ApartmentBuildingSoleOwner">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="NoData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="RegOrg" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSORegOrgType"/>
 *                     <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOIndType"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="IsPlannedVolume" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="PlannedVolumeType" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="D"/>
 *               <enumeration value="O"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
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
 *         <element name="MeteringDeviceInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SpecifyingQualityIndicators">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="D"/>
 *               <enumeration value="O"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="NoConnectionToWaterSupply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Quality" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="QualityIndicator" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="IndicatorValue" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <sequence>
 *                               <choice>
 *                                 <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType" minOccurs="0"/>
 *                                 <sequence>
 *                                   <element name="StartRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType" minOccurs="0"/>
 *                                   <element name="EndRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType" minOccurs="0"/>
 *                                 </sequence>
 *                               </choice>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
 *                             </sequence>
 *                             <element name="Correspond" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OtherQualityIndicator" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="IndicatorName" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OtherQualityIndicatorNameType"/>
 *                   <element name="IndicatorValue">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PlannedVolume" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="Volume" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOVolumeType" minOccurs="0"/>
 *                   <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKEIType" minOccurs="0"/>
 *                   <element name="FeedingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OneTimePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportSupplyResourceContractType", propOrder = {
    "isContract",
    "isNotContract",
    "indefiniteTerm",
    "automaticRollOverOneYear",
    "comptetionDate",
    "volumeDepends",
    "period",
    "indicationsAnyDay",
    "contractBase",
    "offer",
    "apartmentBuildingOwner",
    "livingHouseOwner",
    "organization",
    "apartmentBuildingRepresentativeOwner",
    "apartmentBuildingSoleOwner",
    "isPlannedVolume",
    "plannedVolumeType",
    "contractSubject",
    "countingResource",
    "meteringDeviceInformation",
    "specifyingQualityIndicators",
    "noConnectionToWaterSupply",
    "quality",
    "otherQualityIndicator",
    "plannedVolume",
    "oneTimePayment",
    "billingDate",
    "paymentDate",
    "providingInformationDate"
})
@XmlSeeAlso({
    ExportSupplyResourceContractResultType.class
})
public class ExportSupplyResourceContractType {

    /**
     * Договор не является публичным и/или присутствует заключенный на бумажном носителе (электронной форме) и/или не заключен  в отношении нежилых помещений в многоквартирных домах
     * 
     */
    @XmlElement(name = "IsContract")
    protected ExportSupplyResourceContractType.IsContract isContract;
    /**
     * Договор является публичным и/или отсутствует заключенный на бумажном носителе (в электронной форме) и/или заключен в отношении нежилых помещений в многоквартирных домах
     * 
     */
    @XmlElement(name = "IsNotContract")
    protected ExportSupplyResourceContractType.IsNotContract isNotContract;
    /**
     * Договор заключен на неопределенный срок
     * 
     */
    @XmlElement(name = "IndefiniteTerm")
    protected Boolean indefiniteTerm;
    /**
     * Автоматически пролонгировать договор на один год при наступлении даты окончания действия.
     * 
     */
    @XmlElement(name = "AutomaticRollOverOneYear")
    protected Boolean automaticRollOverOneYear;
    /**
     * Дата окончания действия
     * 
     */
    @XmlElement(name = "ComptetionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar comptetionDate;
    /**
     * Объем поставки ресурса(ов) определяется на основании прибора учета.
     * 
     */
    @XmlElement(name = "VolumeDepends")
    protected Boolean volumeDepends;
    /**
     * Период передачи текущих показаний по индивидуальным приборам учета.
     * 
     */
    @XmlElement(name = "Period")
    protected ExportSupplyResourceContractType.Period period;
    /**
     * Разрешить передачу гражданам текущих показаний по индивидуальным приборам учета в любой день месяца
     * 
     */
    @XmlElement(name = "IndicationsAnyDay")
    protected Boolean indicationsAnyDay;
    /**
     * Ссылка на НСИ "Основание заключения договора" (реестровый номер 58).
     * 
     */
    @XmlElement(name = "ContractBase")
    protected List<NsiRef> contractBase;
    /**
     * Договор оферта
     * 
     */
    @XmlElement(name = "Offer")
    protected Boolean offer;
    /**
     * Собственник или пользователь жилого (нежилого) помещения в МКД
     * 
     */
    @XmlElement(name = "ApartmentBuildingOwner")
    protected ExportSupplyResourceContractType.ApartmentBuildingOwner apartmentBuildingOwner;
    /**
     * Собственник или пользователь жилого дома (домовладения)
     * 
     */
    @XmlElement(name = "LivingHouseOwner")
    protected ExportSupplyResourceContractType.LivingHouseOwner livingHouseOwner;
    /**
     * Управляющая организация
     * 
     */
    @XmlElement(name = "Organization")
    protected ExportSupplyResourceContractType.Organization organization;
    /**
     * Представитель собственников многоквартирного дома
     * 
     */
    @XmlElement(name = "ApartmentBuildingRepresentativeOwner")
    protected ExportSupplyResourceContractType.ApartmentBuildingRepresentativeOwner apartmentBuildingRepresentativeOwner;
    /**
     * Единоличный собственник помещений в многоквартирном доме
     * 
     */
    @XmlElement(name = "ApartmentBuildingSoleOwner")
    protected ExportSupplyResourceContractType.ApartmentBuildingSoleOwner apartmentBuildingSoleOwner;
    /**
     * Наличие в договоре планового объема и режима подачи поставки ресурсов
     * 
     */
    @XmlElement(name = "IsPlannedVolume")
    protected boolean isPlannedVolume;
    /**
     * Тип ведения планового объема и режима подачи:
     * D - в разрезе договора.
     * O - в разрезе объектов жилищного фонда.
     * 
     */
    @XmlElement(name = "PlannedVolumeType")
    protected String plannedVolumeType;
    /**
     * Предмет договора
     * 
     */
    @XmlElement(name = "ContractSubject")
    protected List<ExportSupplyResourceContractType.ContractSubject> contractSubject;
    /**
     * Размещение информации о начислениях за коммунальные услуги осуществляет:
     * R(SO)- РСО.
     * P(roprietor)-Исполнитель коммунальных услуг.
     * 
     */
    @XmlElement(name = "CountingResource")
    protected String countingResource;
    /**
     * Размещение информации об индивидуальных приборах учета и их показаниях осуществляет ресурсоснабжающая организация.
     * 
     */
    @XmlElement(name = "MeteringDeviceInformation")
    protected Boolean meteringDeviceInformation;
    /**
     * Показатели качества коммунальных ресурсов и температурный график ведутся:
     * D - в разрезе договора.
     * O - в разрезе объектов жилищного фонда.
     * 
     */
    @XmlElement(name = "SpecifyingQualityIndicators", required = true)
    protected String specifyingQualityIndicators;
    /**
     * Признак "Отсутствие присоединения сетей объектов жилищного фонда к централизованной системе водоснабжения"
     * 
     */
    @XmlElement(name = "NoConnectionToWaterSupply")
    protected Boolean noConnectionToWaterSupply;
    /**
     * Показатель качества (содержащийся в справочнике показателей качества). Информация выгружается, если показатели ведутся в разрезе договора.
     * 
     */
    @XmlElement(name = "Quality")
    protected List<ExportSupplyResourceContractType.Quality> quality;
    /**
     * Иной показатель качества коммунального ресурса (не содержащийся в справочнике показателей качества). Информация выгружается, если показатели ведутся в разрезе договора.
     * 
     */
    @XmlElement(name = "OtherQualityIndicator")
    protected List<ExportSupplyResourceContractType.OtherQualityIndicator> otherQualityIndicator;
    /**
     * Плановый объем и режим подачи за год. Информация выгружается, если плановый объем и режим подачи ведется в разрезе договора.
     * 
     */
    @XmlElement(name = "PlannedVolume")
    protected List<ExportSupplyResourceContractType.PlannedVolume> plannedVolume;
    /**
     * Оплата предоставленных услуг осуществляется единоразово при отгрузке указанных ресурсов без заведения лицевых счетов для потребителей.
     * 
     */
    @XmlElement(name = "OneTimePayment")
    protected Boolean oneTimePayment;
    /**
     * Срок представления (выставления) платежных документов, не позднее.
     * 
     */
    @XmlElement(name = "BillingDate")
    protected ExportSupplyResourceContractType.BillingDate billingDate;
    /**
     * Срок внесения платы, не позднее.
     * 
     */
    @XmlElement(name = "PaymentDate")
    protected ExportSupplyResourceContractType.PaymentDate paymentDate;
    /**
     * Срок предоставления информации о поступивших платежах, не позднее.
     * 
     */
    @XmlElement(name = "ProvidingInformationDate")
    protected ExportSupplyResourceContractType.ProvidingInformationDate providingInformationDate;

    /**
     * Договор не является публичным и/или присутствует заключенный на бумажном носителе (электронной форме) и/или не заключен  в отношении нежилых помещений в многоквартирных домах
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractType.IsContract }
     *     
     */
    public ExportSupplyResourceContractType.IsContract getIsContract() {
        return isContract;
    }

    /**
     * Sets the value of the isContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractType.IsContract }
     *     
     * @see #getIsContract()
     */
    public void setIsContract(ExportSupplyResourceContractType.IsContract value) {
        this.isContract = value;
    }

    /**
     * Договор является публичным и/или отсутствует заключенный на бумажном носителе (в электронной форме) и/или заключен в отношении нежилых помещений в многоквартирных домах
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractType.IsNotContract }
     *     
     */
    public ExportSupplyResourceContractType.IsNotContract getIsNotContract() {
        return isNotContract;
    }

    /**
     * Sets the value of the isNotContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractType.IsNotContract }
     *     
     * @see #getIsNotContract()
     */
    public void setIsNotContract(ExportSupplyResourceContractType.IsNotContract value) {
        this.isNotContract = value;
    }

    /**
     * Договор заключен на неопределенный срок
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndefiniteTerm() {
        return indefiniteTerm;
    }

    /**
     * Sets the value of the indefiniteTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIndefiniteTerm()
     */
    public void setIndefiniteTerm(Boolean value) {
        this.indefiniteTerm = value;
    }

    /**
     * Автоматически пролонгировать договор на один год при наступлении даты окончания действия.
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
     * Дата окончания действия
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getComptetionDate() {
        return comptetionDate;
    }

    /**
     * Sets the value of the comptetionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getComptetionDate()
     */
    public void setComptetionDate(XMLGregorianCalendar value) {
        this.comptetionDate = value;
    }

    /**
     * Объем поставки ресурса(ов) определяется на основании прибора учета.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVolumeDepends() {
        return volumeDepends;
    }

    /**
     * Sets the value of the volumeDepends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isVolumeDepends()
     */
    public void setVolumeDepends(Boolean value) {
        this.volumeDepends = value;
    }

    /**
     * Период передачи текущих показаний по индивидуальным приборам учета.
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractType.Period }
     *     
     */
    public ExportSupplyResourceContractType.Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractType.Period }
     *     
     * @see #getPeriod()
     */
    public void setPeriod(ExportSupplyResourceContractType.Period value) {
        this.period = value;
    }

    /**
     * Разрешить передачу гражданам текущих показаний по индивидуальным приборам учета в любой день месяца
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
     * Ссылка на НСИ "Основание заключения договора" (реестровый номер 58).
     * 
     * Gets the value of the contractBase property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractBase property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContractBase().add(newItem);
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
     *     The value of the contractBase property.
     */
    public List<NsiRef> getContractBase() {
        if (contractBase == null) {
            contractBase = new ArrayList<>();
        }
        return this.contractBase;
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
     * Собственник или пользователь жилого (нежилого) помещения в МКД
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractType.ApartmentBuildingOwner }
     *     
     */
    public ExportSupplyResourceContractType.ApartmentBuildingOwner getApartmentBuildingOwner() {
        return apartmentBuildingOwner;
    }

    /**
     * Sets the value of the apartmentBuildingOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractType.ApartmentBuildingOwner }
     *     
     * @see #getApartmentBuildingOwner()
     */
    public void setApartmentBuildingOwner(ExportSupplyResourceContractType.ApartmentBuildingOwner value) {
        this.apartmentBuildingOwner = value;
    }

    /**
     * Собственник или пользователь жилого дома (домовладения)
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractType.LivingHouseOwner }
     *     
     */
    public ExportSupplyResourceContractType.LivingHouseOwner getLivingHouseOwner() {
        return livingHouseOwner;
    }

    /**
     * Sets the value of the livingHouseOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractType.LivingHouseOwner }
     *     
     * @see #getLivingHouseOwner()
     */
    public void setLivingHouseOwner(ExportSupplyResourceContractType.LivingHouseOwner value) {
        this.livingHouseOwner = value;
    }

    /**
     * Управляющая организация
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractType.Organization }
     *     
     */
    public ExportSupplyResourceContractType.Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractType.Organization }
     *     
     * @see #getOrganization()
     */
    public void setOrganization(ExportSupplyResourceContractType.Organization value) {
        this.organization = value;
    }

    /**
     * Представитель собственников многоквартирного дома
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractType.ApartmentBuildingRepresentativeOwner }
     *     
     */
    public ExportSupplyResourceContractType.ApartmentBuildingRepresentativeOwner getApartmentBuildingRepresentativeOwner() {
        return apartmentBuildingRepresentativeOwner;
    }

    /**
     * Sets the value of the apartmentBuildingRepresentativeOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractType.ApartmentBuildingRepresentativeOwner }
     *     
     * @see #getApartmentBuildingRepresentativeOwner()
     */
    public void setApartmentBuildingRepresentativeOwner(ExportSupplyResourceContractType.ApartmentBuildingRepresentativeOwner value) {
        this.apartmentBuildingRepresentativeOwner = value;
    }

    /**
     * Единоличный собственник помещений в многоквартирном доме
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractType.ApartmentBuildingSoleOwner }
     *     
     */
    public ExportSupplyResourceContractType.ApartmentBuildingSoleOwner getApartmentBuildingSoleOwner() {
        return apartmentBuildingSoleOwner;
    }

    /**
     * Sets the value of the apartmentBuildingSoleOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractType.ApartmentBuildingSoleOwner }
     *     
     * @see #getApartmentBuildingSoleOwner()
     */
    public void setApartmentBuildingSoleOwner(ExportSupplyResourceContractType.ApartmentBuildingSoleOwner value) {
        this.apartmentBuildingSoleOwner = value;
    }

    /**
     * Наличие в договоре планового объема и режима подачи поставки ресурсов
     * 
     */
    public boolean isIsPlannedVolume() {
        return isPlannedVolume;
    }

    /**
     * Sets the value of the isPlannedVolume property.
     * 
     */
    public void setIsPlannedVolume(boolean value) {
        this.isPlannedVolume = value;
    }

    /**
     * Тип ведения планового объема и режима подачи:
     * D - в разрезе договора.
     * O - в разрезе объектов жилищного фонда.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedVolumeType() {
        return plannedVolumeType;
    }

    /**
     * Sets the value of the plannedVolumeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlannedVolumeType()
     */
    public void setPlannedVolumeType(String value) {
        this.plannedVolumeType = value;
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
     * {@link ExportSupplyResourceContractType.ContractSubject }
     * </p>
     * 
     * 
     * @return
     *     The value of the contractSubject property.
     */
    public List<ExportSupplyResourceContractType.ContractSubject> getContractSubject() {
        if (contractSubject == null) {
            contractSubject = new ArrayList<>();
        }
        return this.contractSubject;
    }

    /**
     * Размещение информации о начислениях за коммунальные услуги осуществляет:
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
     * Размещение информации об индивидуальных приборах учета и их показаниях осуществляет ресурсоснабжающая организация.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeteringDeviceInformation() {
        return meteringDeviceInformation;
    }

    /**
     * Sets the value of the meteringDeviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMeteringDeviceInformation()
     */
    public void setMeteringDeviceInformation(Boolean value) {
        this.meteringDeviceInformation = value;
    }

    /**
     * Показатели качества коммунальных ресурсов и температурный график ведутся:
     * D - в разрезе договора.
     * O - в разрезе объектов жилищного фонда.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecifyingQualityIndicators() {
        return specifyingQualityIndicators;
    }

    /**
     * Sets the value of the specifyingQualityIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSpecifyingQualityIndicators()
     */
    public void setSpecifyingQualityIndicators(String value) {
        this.specifyingQualityIndicators = value;
    }

    /**
     * Признак "Отсутствие присоединения сетей объектов жилищного фонда к централизованной системе водоснабжения"
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
     * Показатель качества (содержащийся в справочнике показателей качества). Информация выгружается, если показатели ведутся в разрезе договора.
     * 
     * Gets the value of the quality property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quality property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getQuality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportSupplyResourceContractType.Quality }
     * </p>
     * 
     * 
     * @return
     *     The value of the quality property.
     */
    public List<ExportSupplyResourceContractType.Quality> getQuality() {
        if (quality == null) {
            quality = new ArrayList<>();
        }
        return this.quality;
    }

    /**
     * Иной показатель качества коммунального ресурса (не содержащийся в справочнике показателей качества). Информация выгружается, если показатели ведутся в разрезе договора.
     * 
     * Gets the value of the otherQualityIndicator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherQualityIndicator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOtherQualityIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportSupplyResourceContractType.OtherQualityIndicator }
     * </p>
     * 
     * 
     * @return
     *     The value of the otherQualityIndicator property.
     */
    public List<ExportSupplyResourceContractType.OtherQualityIndicator> getOtherQualityIndicator() {
        if (otherQualityIndicator == null) {
            otherQualityIndicator = new ArrayList<>();
        }
        return this.otherQualityIndicator;
    }

    /**
     * Плановый объем и режим подачи за год. Информация выгружается, если плановый объем и режим подачи ведется в разрезе договора.
     * 
     * Gets the value of the plannedVolume property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedVolume property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPlannedVolume().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportSupplyResourceContractType.PlannedVolume }
     * </p>
     * 
     * 
     * @return
     *     The value of the plannedVolume property.
     */
    public List<ExportSupplyResourceContractType.PlannedVolume> getPlannedVolume() {
        if (plannedVolume == null) {
            plannedVolume = new ArrayList<>();
        }
        return this.plannedVolume;
    }

    /**
     * Оплата предоставленных услуг осуществляется единоразово при отгрузке указанных ресурсов без заведения лицевых счетов для потребителей.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneTimePayment() {
        return oneTimePayment;
    }

    /**
     * Sets the value of the oneTimePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOneTimePayment()
     */
    public void setOneTimePayment(Boolean value) {
        this.oneTimePayment = value;
    }

    /**
     * Срок представления (выставления) платежных документов, не позднее.
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractType.BillingDate }
     *     
     */
    public ExportSupplyResourceContractType.BillingDate getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractType.BillingDate }
     *     
     * @see #getBillingDate()
     */
    public void setBillingDate(ExportSupplyResourceContractType.BillingDate value) {
        this.billingDate = value;
    }

    /**
     * Срок внесения платы, не позднее.
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractType.PaymentDate }
     *     
     */
    public ExportSupplyResourceContractType.PaymentDate getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractType.PaymentDate }
     *     
     * @see #getPaymentDate()
     */
    public void setPaymentDate(ExportSupplyResourceContractType.PaymentDate value) {
        this.paymentDate = value;
    }

    /**
     * Срок предоставления информации о поступивших платежах, не позднее.
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractType.ProvidingInformationDate }
     *     
     */
    public ExportSupplyResourceContractType.ProvidingInformationDate getProvidingInformationDate() {
        return providingInformationDate;
    }

    /**
     * Sets the value of the providingInformationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractType.ProvidingInformationDate }
     *     
     * @see #getProvidingInformationDate()
     */
    public void setProvidingInformationDate(ExportSupplyResourceContractType.ProvidingInformationDate value) {
        this.providingInformationDate = value;
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
     *         <element name="RegOrg" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSORegOrgType"/>
     *         <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOIndType"/>
     *         <element name="NoData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "regOrg",
        "ind",
        "noData"
    })
    public static class ApartmentBuildingOwner {

        /**
         * Организация (Юридическое лицо или индивидуальный предприниматель)
         * 
         */
        @XmlElement(name = "RegOrg")
        protected DRSORegOrgType regOrg;
        /**
         * Физическое лицо
         * 
         */
        @XmlElement(name = "Ind")
        protected DRSOIndType ind;
        /**
         * Не указывать собственника или пользователя
         * 
         */
        @XmlElement(name = "NoData")
        protected Boolean noData;

        /**
         * Организация (Юридическое лицо или индивидуальный предприниматель)
         * 
         * @return
         *     possible object is
         *     {@link DRSORegOrgType }
         *     
         */
        public DRSORegOrgType getRegOrg() {
            return regOrg;
        }

        /**
         * Sets the value of the regOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link DRSORegOrgType }
         *     
         * @see #getRegOrg()
         */
        public void setRegOrg(DRSORegOrgType value) {
            this.regOrg = value;
        }

        /**
         * Физическое лицо
         * 
         * @return
         *     possible object is
         *     {@link DRSOIndType }
         *     
         */
        public DRSOIndType getInd() {
            return ind;
        }

        /**
         * Sets the value of the ind property.
         * 
         * @param value
         *     allowed object is
         *     {@link DRSOIndType }
         *     
         * @see #getInd()
         */
        public void setInd(DRSOIndType value) {
            this.ind = value;
        }

        /**
         * Не указывать собственника или пользователя
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoData() {
            return noData;
        }

        /**
         * Sets the value of the noData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNoData()
         */
        public void setNoData(Boolean value) {
            this.noData = value;
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
     *         <element name="NoData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="RegOrg" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSORegOrgType"/>
     *         <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOIndType"/>
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
        "noData",
        "regOrg",
        "ind"
    })
    public static class ApartmentBuildingRepresentativeOwner {

        /**
         * Не указывать собственника или пользователя
         * 
         */
        @XmlElement(name = "NoData")
        protected Boolean noData;
        /**
         * Организация (Юридическое лицо или индивидуальный предприниматель)
         * 
         */
        @XmlElement(name = "RegOrg")
        protected DRSORegOrgType regOrg;
        /**
         * Физическое лицо
         * 
         */
        @XmlElement(name = "Ind")
        protected DRSOIndType ind;

        /**
         * Не указывать собственника или пользователя
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoData() {
            return noData;
        }

        /**
         * Sets the value of the noData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNoData()
         */
        public void setNoData(Boolean value) {
            this.noData = value;
        }

        /**
         * Организация (Юридическое лицо или индивидуальный предприниматель)
         * 
         * @return
         *     possible object is
         *     {@link DRSORegOrgType }
         *     
         */
        public DRSORegOrgType getRegOrg() {
            return regOrg;
        }

        /**
         * Sets the value of the regOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link DRSORegOrgType }
         *     
         * @see #getRegOrg()
         */
        public void setRegOrg(DRSORegOrgType value) {
            this.regOrg = value;
        }

        /**
         * Физическое лицо
         * 
         * @return
         *     possible object is
         *     {@link DRSOIndType }
         *     
         */
        public DRSOIndType getInd() {
            return ind;
        }

        /**
         * Sets the value of the ind property.
         * 
         * @param value
         *     allowed object is
         *     {@link DRSOIndType }
         *     
         * @see #getInd()
         */
        public void setInd(DRSOIndType value) {
            this.ind = value;
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
     *         <element name="NoData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="RegOrg" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSORegOrgType"/>
     *         <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOIndType"/>
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
        "noData",
        "regOrg",
        "ind"
    })
    public static class ApartmentBuildingSoleOwner {

        /**
         * Не указывать собственника или пользователя
         * 
         */
        @XmlElement(name = "NoData")
        protected Boolean noData;
        /**
         * Организация (Юридическое лицо или индивидуальный предприниматель)
         * 
         */
        @XmlElement(name = "RegOrg")
        protected DRSORegOrgType regOrg;
        /**
         * Физическое лицо
         * 
         */
        @XmlElement(name = "Ind")
        protected DRSOIndType ind;

        /**
         * Не указывать собственника или пользователя
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoData() {
            return noData;
        }

        /**
         * Sets the value of the noData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNoData()
         */
        public void setNoData(Boolean value) {
            this.noData = value;
        }

        /**
         * Организация (Юридическое лицо или индивидуальный предприниматель)
         * 
         * @return
         *     possible object is
         *     {@link DRSORegOrgType }
         *     
         */
        public DRSORegOrgType getRegOrg() {
            return regOrg;
        }

        /**
         * Sets the value of the regOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link DRSORegOrgType }
         *     
         * @see #getRegOrg()
         */
        public void setRegOrg(DRSORegOrgType value) {
            this.regOrg = value;
        }

        /**
         * Физическое лицо
         * 
         * @return
         *     possible object is
         *     {@link DRSOIndType }
         *     
         */
        public DRSOIndType getInd() {
            return ind;
        }

        /**
         * Sets the value of the ind property.
         * 
         * @param value
         *     allowed object is
         *     {@link DRSOIndType }
         *     
         * @see #getInd()
         */
        public void setInd(DRSOIndType value) {
            this.ind = value;
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
    public static class BillingDate {

        /**
         * Срок представления (выставления) платежных документов (число), не позднее. Если нужно указать значение "Последний день месяца", то поле заполняется значением "-1".
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
         * Срок представления (выставления) платежных документов (число), не позднее. Если нужно указать значение "Последний день месяца", то поле заполняется значением "-1".
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
        protected ExportSupplyResourceContractType.ContractSubject.ServiceType serviceType;
        /**
         * Коммунальный ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239)
         * 
         */
        @XmlElement(name = "MunicipalResource", required = true)
        protected ExportSupplyResourceContractType.ContractSubject.MunicipalResource municipalResource;
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
         *     {@link ExportSupplyResourceContractType.ContractSubject.ServiceType }
         *     
         */
        public ExportSupplyResourceContractType.ContractSubject.ServiceType getServiceType() {
            return serviceType;
        }

        /**
         * Sets the value of the serviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportSupplyResourceContractType.ContractSubject.ServiceType }
         *     
         * @see #getServiceType()
         */
        public void setServiceType(ExportSupplyResourceContractType.ContractSubject.ServiceType value) {
            this.serviceType = value;
        }

        /**
         * Коммунальный ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239)
         * 
         * @return
         *     possible object is
         *     {@link ExportSupplyResourceContractType.ContractSubject.MunicipalResource }
         *     
         */
        public ExportSupplyResourceContractType.ContractSubject.MunicipalResource getMunicipalResource() {
            return municipalResource;
        }

        /**
         * Sets the value of the municipalResource property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportSupplyResourceContractType.ContractSubject.MunicipalResource }
         *     
         * @see #getMunicipalResource()
         */
        public void setMunicipalResource(ExportSupplyResourceContractType.ContractSubject.MunicipalResource value) {
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
     *         <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="ContractAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
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
        "effectiveDate",
        "contractAttachment"
    })
    public static class IsContract {

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
         * Договор ресурсоснабжения и приложения к договору
         * 
         */
        @XmlElement(name = "ContractAttachment")
        protected List<AttachmentType> contractAttachment;

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

        /**
         * Договор ресурсоснабжения и приложения к договору
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
     *         <element name="ContractAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
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
        "effectiveDate",
        "contractAttachment"
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
         * Договор ресурсоснабжения и приложения к договору
         * 
         */
        @XmlElement(name = "ContractAttachment")
        protected List<AttachmentType> contractAttachment;

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

        /**
         * Договор ресурсоснабжения и приложения к договору
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
     *         <element name="RegOrg" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSORegOrgType"/>
     *         <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOIndType"/>
     *         <element name="NoData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "regOrg",
        "ind",
        "noData"
    })
    public static class LivingHouseOwner {

        /**
         * Организация (Юридическое лицо или индивидуальный предприниматель)
         * 
         */
        @XmlElement(name = "RegOrg")
        protected DRSORegOrgType regOrg;
        /**
         * Физическое лицо
         * 
         */
        @XmlElement(name = "Ind")
        protected DRSOIndType ind;
        /**
         * Не указывать собственника или пользователя
         * 
         */
        @XmlElement(name = "NoData")
        protected Boolean noData;

        /**
         * Организация (Юридическое лицо или индивидуальный предприниматель)
         * 
         * @return
         *     possible object is
         *     {@link DRSORegOrgType }
         *     
         */
        public DRSORegOrgType getRegOrg() {
            return regOrg;
        }

        /**
         * Sets the value of the regOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link DRSORegOrgType }
         *     
         * @see #getRegOrg()
         */
        public void setRegOrg(DRSORegOrgType value) {
            this.regOrg = value;
        }

        /**
         * Физическое лицо
         * 
         * @return
         *     possible object is
         *     {@link DRSOIndType }
         *     
         */
        public DRSOIndType getInd() {
            return ind;
        }

        /**
         * Sets the value of the ind property.
         * 
         * @param value
         *     allowed object is
         *     {@link DRSOIndType }
         *     
         * @see #getInd()
         */
        public void setInd(DRSOIndType value) {
            this.ind = value;
        }

        /**
         * Не указывать собственника или пользователя
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoData() {
            return noData;
        }

        /**
         * Sets the value of the noData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNoData()
         */
        public void setNoData(Boolean value) {
            this.noData = value;
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
    public static class Organization
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
     *         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="IndicatorName" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OtherQualityIndicatorNameType"/>
     *         <element name="IndicatorValue">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
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
        "pairKey",
        "indicatorName",
        "indicatorValue",
        "additionalInformation"
    })
    public static class OtherQualityIndicator {

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
         * 
         */
        @XmlElement(name = "PairKey", required = true)
        protected String pairKey;
        /**
         * Наименование показателя
         * 
         */
        @XmlElement(name = "IndicatorName", required = true)
        protected String indicatorName;
        /**
         * Значение показателя качества
         * 
         */
        @XmlElement(name = "IndicatorValue", required = true)
        protected ExportSupplyResourceContractType.OtherQualityIndicator.IndicatorValue indicatorValue;
        /**
         * Дополнительная информация
         * 
         */
        @XmlElement(name = "AdditionalInformation")
        protected String additionalInformation;

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPairKey() {
            return pairKey;
        }

        /**
         * Sets the value of the pairKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPairKey()
         */
        public void setPairKey(String value) {
            this.pairKey = value;
        }

        /**
         * Наименование показателя
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndicatorName() {
            return indicatorName;
        }

        /**
         * Sets the value of the indicatorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getIndicatorName()
         */
        public void setIndicatorName(String value) {
            this.indicatorName = value;
        }

        /**
         * Значение показателя качества
         * 
         * @return
         *     possible object is
         *     {@link ExportSupplyResourceContractType.OtherQualityIndicator.IndicatorValue }
         *     
         */
        public ExportSupplyResourceContractType.OtherQualityIndicator.IndicatorValue getIndicatorValue() {
            return indicatorValue;
        }

        /**
         * Sets the value of the indicatorValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportSupplyResourceContractType.OtherQualityIndicator.IndicatorValue }
         *     
         * @see #getIndicatorValue()
         */
        public void setIndicatorValue(ExportSupplyResourceContractType.OtherQualityIndicator.IndicatorValue value) {
            this.indicatorValue = value;
        }

        /**
         * Дополнительная информация
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInformation() {
            return additionalInformation;
        }

        /**
         * Sets the value of the additionalInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAdditionalInformation()
         */
        public void setAdditionalInformation(String value) {
            this.additionalInformation = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class IndicatorValue
            extends IndicatorValueType
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
         * Срок внесения платы (число), не позднее. Если нужно указать значение "Последний день месяца", то поле заполняется значением "-1".
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
         * Срок внесения платы (число), не позднее. Если нужно указать значение "Последний день месяца", то поле заполняется значением "-1".
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
     *                   <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
     *                   <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        protected ExportSupplyResourceContractType.Period.Start start;
        /**
         * Конец периода
         * 
         */
        @XmlElement(name = "End", required = true)
        protected ExportSupplyResourceContractType.Period.End end;

        /**
         * Начало периода
         * 
         * @return
         *     possible object is
         *     {@link ExportSupplyResourceContractType.Period.Start }
         *     
         */
        public ExportSupplyResourceContractType.Period.Start getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportSupplyResourceContractType.Period.Start }
         *     
         * @see #getStart()
         */
        public void setStart(ExportSupplyResourceContractType.Period.Start value) {
            this.start = value;
        }

        /**
         * Конец периода
         * 
         * @return
         *     possible object is
         *     {@link ExportSupplyResourceContractType.Period.End }
         *     
         */
        public ExportSupplyResourceContractType.Period.End getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportSupplyResourceContractType.Period.End }
         *     
         * @see #getEnd()
         */
        public void setEnd(ExportSupplyResourceContractType.Period.End value) {
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
         *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
             * Дата окончания. Если нужно указать значение "Последний день месяца", то поле заполняется значением "-1".
             * 
             */
            @XmlElement(name = "EndDate", required = true)
            protected BigInteger endDate;
            /**
             * Следующего месяца
             * 
             */
            @XmlElement(name = "NextMonth")
            protected Boolean nextMonth;

            /**
             * Дата окончания. Если нужно указать значение "Последний день месяца", то поле заполняется значением "-1".
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getEndDate() {
                return endDate;
            }

            /**
             * Sets the value of the endDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             * @see #getEndDate()
             */
            public void setEndDate(BigInteger value) {
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
         *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
            @XmlElement(name = "StartDate", required = true)
            protected BigInteger startDate;
            /**
             * Следующего месяца
             * 
             */
            @XmlElement(name = "NextMonth")
            protected Boolean nextMonth;

            /**
             * Дата начала
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getStartDate() {
                return startDate;
            }

            /**
             * Sets the value of the startDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             * @see #getStartDate()
             */
            public void setStartDate(BigInteger value) {
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
     *         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="Volume" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOVolumeType" minOccurs="0"/>
     *         <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKEIType" minOccurs="0"/>
     *         <element name="FeedingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "pairKey",
        "volume",
        "unit",
        "feedingMode"
    })
    public static class PlannedVolume {

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
         * 
         */
        @XmlElement(name = "PairKey", required = true)
        protected String pairKey;
        /**
         * Плановый объем
         * 
         */
        @XmlElement(name = "Volume")
        protected BigDecimal volume;
        /**
         * Единица измерения.
         * справочника НСИ №236 "Связь вида коммунальной услуги, тарифицируемого ресурса и единиц измерения ставки тарифа"
         * 
         */
        @XmlElement(name = "Unit")
        protected String unit;
        /**
         * Режим подачи
         * 
         */
        @XmlElement(name = "FeedingMode")
        protected String feedingMode;

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPairKey() {
            return pairKey;
        }

        /**
         * Sets the value of the pairKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPairKey()
         */
        public void setPairKey(String value) {
            this.pairKey = value;
        }

        /**
         * Плановый объем
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVolume() {
            return volume;
        }

        /**
         * Sets the value of the volume property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getVolume()
         */
        public void setVolume(BigDecimal value) {
            this.volume = value;
        }

        /**
         * Единица измерения.
         * справочника НСИ №236 "Связь вида коммунальной услуги, тарифицируемого ресурса и единиц измерения ставки тарифа"
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getUnit()
         */
        public void setUnit(String value) {
            this.unit = value;
        }

        /**
         * Режим подачи
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeedingMode() {
            return feedingMode;
        }

        /**
         * Sets the value of the feedingMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFeedingMode()
         */
        public void setFeedingMode(String value) {
            this.feedingMode = value;
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
         * Срок предоставления информации о поступивших платежах (число), не позднее. Если нужно указать значение "Последний день месяца", то поле заполняется значением "-1".
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
         * Срок предоставления информации о поступивших платежах (число), не позднее. Если нужно указать значение "Последний день месяца", то поле заполняется значением "-1".
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
     *         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="QualityIndicator" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="IndicatorValue" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <sequence>
     *                     <choice>
     *                       <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType" minOccurs="0"/>
     *                       <sequence>
     *                         <element name="StartRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType" minOccurs="0"/>
     *                         <element name="EndRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType" minOccurs="0"/>
     *                       </sequence>
     *                     </choice>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
     *                   </sequence>
     *                   <element name="Correspond" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
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
        "pairKey",
        "qualityIndicator",
        "indicatorValue",
        "additionalInformation"
    })
    public static class Quality {

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
         * 
         */
        @XmlElement(name = "PairKey", required = true)
        protected String pairKey;
        /**
         * Показатель качества. Ссылка на НСИ "Показатели качества коммунальных ресурсов" (реестровый номер 276)
         * 
         */
        @XmlElement(name = "QualityIndicator", required = true)
        protected NsiRef qualityIndicator;
        /**
         * Значение показателя качества
         * 
         */
        @XmlElement(name = "IndicatorValue")
        protected List<ExportSupplyResourceContractType.Quality.IndicatorValue> indicatorValue;
        /**
         * Дополнительная информация
         * 
         */
        @XmlElement(name = "AdditionalInformation")
        protected String additionalInformation;

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPairKey() {
            return pairKey;
        }

        /**
         * Sets the value of the pairKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPairKey()
         */
        public void setPairKey(String value) {
            this.pairKey = value;
        }

        /**
         * Показатель качества. Ссылка на НСИ "Показатели качества коммунальных ресурсов" (реестровый номер 276)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getQualityIndicator() {
            return qualityIndicator;
        }

        /**
         * Sets the value of the qualityIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getQualityIndicator()
         */
        public void setQualityIndicator(NsiRef value) {
            this.qualityIndicator = value;
        }

        /**
         * Значение показателя качества
         * 
         * Gets the value of the indicatorValue property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the indicatorValue property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getIndicatorValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportSupplyResourceContractType.Quality.IndicatorValue }
         * </p>
         * 
         * 
         * @return
         *     The value of the indicatorValue property.
         */
        public List<ExportSupplyResourceContractType.Quality.IndicatorValue> getIndicatorValue() {
            if (indicatorValue == null) {
                indicatorValue = new ArrayList<>();
            }
            return this.indicatorValue;
        }

        /**
         * Дополнительная информация
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInformation() {
            return additionalInformation;
        }

        /**
         * Sets the value of the additionalInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAdditionalInformation()
         */
        public void setAdditionalInformation(String value) {
            this.additionalInformation = value;
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
         *           <choice>
         *             <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType" minOccurs="0"/>
         *             <sequence>
         *               <element name="StartRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType" minOccurs="0"/>
         *               <element name="EndRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType" minOccurs="0"/>
         *             </sequence>
         *           </choice>
         *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
         *         </sequence>
         *         <element name="Correspond" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "number",
            "startRange",
            "endRange",
            "okei",
            "correspond"
        })
        public static class IndicatorValue {

            /**
             * Число
             * 
             */
            @XmlElement(name = "Number")
            protected BigDecimal number;
            /**
             * Начало диапазона
             * 
             */
            @XmlElement(name = "StartRange")
            protected BigDecimal startRange;
            /**
             * Конец диапазона
             * 
             */
            @XmlElement(name = "EndRange")
            protected BigDecimal endRange;
            /**
             * Код ОКЕИ
             * 
             */
            @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
            protected String okei;
            /**
             * Значение соответствует
             * 
             */
            @XmlElement(name = "Correspond")
            protected Boolean correspond;

            /**
             * Число
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getNumber()
             */
            public void setNumber(BigDecimal value) {
                this.number = value;
            }

            /**
             * Начало диапазона
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getStartRange() {
                return startRange;
            }

            /**
             * Sets the value of the startRange property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getStartRange()
             */
            public void setStartRange(BigDecimal value) {
                this.startRange = value;
            }

            /**
             * Конец диапазона
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEndRange() {
                return endRange;
            }

            /**
             * Sets the value of the endRange property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getEndRange()
             */
            public void setEndRange(BigDecimal value) {
                this.endRange = value;
            }

            /**
             * Код ОКЕИ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOKEI() {
                return okei;
            }

            /**
             * Sets the value of the okei property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOKEI()
             */
            public void setOKEI(String value) {
                this.okei = value;
            }

            /**
             * Значение соответствует
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCorrespond() {
                return correspond;
            }

            /**
             * Sets the value of the correspond property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isCorrespond()
             */
            public void setCorrespond(Boolean value) {
                this.correspond = value;
            }

        }

    }

}
