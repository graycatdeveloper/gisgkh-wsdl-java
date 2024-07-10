
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.RegionType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Договор ресурсоснабжения (проект)
 * 
 * <p>Java class for SupplyResourceContractProjectType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SupplyResourceContractProjectType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
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
 *                     <element name="ContractAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="IsNotContract">
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
 *                                   <maxInclusive value="30"/>
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
 *                                   <maxInclusive value="30"/>
 *                                   <minInclusive value="-1"/>
 *                                   <pattern value="(-1)|[1-9]|([1][0-9])|([2][0-9])|30"/>
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
 *         <element name="ContractSubject" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractSubjectType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                 </sequence>
 *               </extension>
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
 *         <element name="OtherQualityIndicator" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="IndicatorName" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OtherQualityIndicatorNameType"/>
 *                   <choice>
 *                     <sequence>
 *                       <choice>
 *                         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
 *                         <sequence>
 *                           <element name="StartRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
 *                           <element name="EndRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
 *                         </sequence>
 *                       </choice>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
 *                     </sequence>
 *                     <element name="Correspond" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                   <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="TemperatureChart" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="OutsideTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="FlowLineTemperature">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <minInclusive value="0"/>
 *                         <fractionDigits value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="OppositeLineTemperature">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <minInclusive value="0"/>
 *                         <fractionDigits value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
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
 *         <element name="MeteringDeviceInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="VolumeDepends" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="OneTimePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AccrualProcedure" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="D"/>
 *               <enumeration value="O"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="RegionalSettings" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/base/}RegionType"/>
 *                   <element name="Tariff" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             <element name="PriceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Norm" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             <element name="NormGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyResourceContractProjectType", propOrder = {
    "isContract",
    "isNotContract",
    "indefiniteTerm",
    "automaticRollOverOneYear",
    "comptetionDate",
    "period",
    "indicationsAnyDay",
    "contractBase",
    "offer",
    "apartmentBuildingOwner",
    "livingHouseOwner",
    "organization",
    "apartmentBuildingSoleOwner",
    "apartmentBuildingRepresentativeOwner",
    "isPlannedVolume",
    "plannedVolumeType",
    "contractSubject",
    "countingResource",
    "specifyingQualityIndicators",
    "noConnectionToWaterSupply",
    "quality",
    "otherQualityIndicator",
    "temperatureChart",
    "billingDate",
    "paymentDate",
    "providingInformationDate",
    "meteringDeviceInformation",
    "volumeDepends",
    "oneTimePayment",
    "accrualProcedure",
    "regionalSettings"
})
public class SupplyResourceContractProjectType {

    /**
     * Договор не является публичным и/или присутствует заключенный на бумажном носителе (электронной форме) и/или не заключен  в отношении нежилых помещений в многоквартирных домах
     * 
     */
    @XmlElement(name = "IsContract")
    protected SupplyResourceContractProjectType.IsContract isContract;
    /**
     * Договор является публичным и/или отсутствует заключенный на бумажном носителе (в электронной форме) и/или заключен в отношении нежилых помещений в многоквартирных домах
     * 
     */
    @XmlElement(name = "IsNotContract")
    protected SupplyResourceContractProjectType.IsNotContract isNotContract;
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
     * Дата окончания действия. Обязательно для заполнения, если указано значение в AutomaticRollOverOneYear
     * 
     */
    @XmlElement(name = "ComptetionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar comptetionDate;
    /**
     * Период передачи текущих показаний по индивидуальным приборам учета. Может быть указан только, если поле VolumeDepends = true -ИЛИ- поле MeteringDeviceInformation = «true»
     * 
     */
    @XmlElement(name = "Period")
    protected SupplyResourceContractProjectType.Period period;
    /**
     * Разрешить передачу гражданам текущих показаний по индивидуальным приборам учета в любой день месяца.
     * Заполнение возможно только если: в настройках организации установлена настройка «Разрешить передачу гражданам показаний индивидуальных или общих (квартирных) приборов учета в любой день месяца» ИЛИ в настройках организации установлена настройка «Разрешить передачу гражданам показаний индивидуальных или общих (квартирных) приборов учета только в сроки, установленные в договоре, или в любой день месяца, если в договоре установлен признак «Разрешить передачу показаний приборов учета в любой день месяца» И заполнен Period
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
    protected SupplyResourceContractProjectType.ApartmentBuildingOwner apartmentBuildingOwner;
    /**
     * Собственник или пользователь жилого дома (домовладения)
     * 
     */
    @XmlElement(name = "LivingHouseOwner")
    protected SupplyResourceContractProjectType.LivingHouseOwner livingHouseOwner;
    /**
     * Управляющая организация
     * 
     */
    @XmlElement(name = "Organization")
    protected SupplyResourceContractProjectType.Organization organization;
    /**
     * Единоличный собственник помещений в многоквартирном доме
     * 
     */
    @XmlElement(name = "ApartmentBuildingSoleOwner")
    protected SupplyResourceContractProjectType.ApartmentBuildingSoleOwner apartmentBuildingSoleOwner;
    /**
     * Представитель собственников многоквартирного дома
     * 
     */
    @XmlElement(name = "ApartmentBuildingRepresentativeOwner")
    protected SupplyResourceContractProjectType.ApartmentBuildingRepresentativeOwner apartmentBuildingRepresentativeOwner;
    /**
     * Наличие в договоре планового объема и режима подачи поставки ресурсов
     * 
     */
    @XmlElement(name = "IsPlannedVolume")
    protected boolean isPlannedVolume;
    /**
     * Тип ведения планового объема и режима подачи:
     * D - в разрезе договора.
     * O - в разрезе объектов жилищного фонда. Заполняется при наличии в договоре планового объема и режима поставки ресурсов.
     * 
     */
    @XmlElement(name = "PlannedVolumeType")
    protected String plannedVolumeType;
    /**
     * Предмет договора
     * 
     */
    @XmlElement(name = "ContractSubject", required = true)
    protected List<SupplyResourceContractProjectType.ContractSubject> contractSubject;
    /**
     * Размещение информации о начислениях за коммунальные услуги осуществляет:
     * R(SO)- РСО.
     * P(roprietor)-Исполнитель коммунальных услуг. 
     * Заполняется, если порядок размещения информации о начислениях за коммунальные услуги ведется в разрезе договора
     * 
     */
    @XmlElement(name = "CountingResource")
    protected String countingResource;
    /**
     * Показатели качества коммунальных ресурсов и температурный график ведутся:
     * D - в разрезе договора.
     * O - в разрезе объектов жилищного фонда.
     * 
     */
    @XmlElement(name = "SpecifyingQualityIndicators", required = true)
    protected String specifyingQualityIndicators;
    /**
     * Признак "Отсутствие присоединения сетей объектов жилищного фонда к централизованной системе водоснабжения". Может быть указан, только если показатели качества коммунальных ресурсов ведутся в разрезе договора и предмет договора включает коммунальную услугу "Холодное водоснабжение" и/или "Горячее водоснабжение"
     * 
     */
    @XmlElement(name = "NoConnectionToWaterSupply")
    protected Boolean noConnectionToWaterSupply;
    /**
     * Показатель качества (содержащийся в справочнике показателей качества). Обязательно для заполнения, если показатели качества указываются в разрезе договора.                                                              Для пары КУ и КР "Горячее водоснабжение" и "Питьевая вода" указываются актуальные показатели, определенные для КР "Горячая вода" в справочнике показателей качества коммунальных ресурсов                                                                      Для пары КУ и КР "Горячее водоснабжение" и "Тепловая энергия" информация о показателях качества не заполняется только в том случае, если для договора (если показатели ведутся в разрезе договора) или ОЖФ в договоре (если показатели ведутся в разрезе ОЖФ) также указана пара КУ и КР "Горячее водоснабжение" и "Питьевая вода"
     * 
     */
    @XmlElement(name = "Quality")
    protected List<SupplyResourceContractProjectType.Quality> quality;
    /**
     * Иной показатель качества коммунального ресурса (не содержащийся в справочнике показателей качества).
     * 
     */
    @XmlElement(name = "OtherQualityIndicator")
    protected List<SupplyResourceContractProjectType.OtherQualityIndicator> otherQualityIndicator;
    /**
     * Информация о температурном графике. Доступно для заполнения только, если в предмете договора хотя бы раз встречается ресурс "Тепловая энергия".
     * 
     */
    @XmlElement(name = "TemperatureChart")
    protected List<SupplyResourceContractProjectType.TemperatureChart> temperatureChart;
    /**
     * Срок представления (выставления) платежных документов, не позднее. Является обязательным, если вторая сторона договора отличается от "Управляющая организация" ИЛИ если заполнено поле tns:MeteringDeviceInformation                                       Не заполняется, если OneTimePayment = true
     * 
     */
    @XmlElement(name = "BillingDate")
    protected SupplyResourceContractProjectType.BillingDate billingDate;
    /**
     * Срок внесения платы, не позднее. Является обязательным, если вторая сторона договора отличается от "Управляющая организация" И договор не является публичным и/или присутствует заключенный на бумажном носителе или в электронной форме И в поле OneTimePayment = false.                                     Не заполняется, если OneTimePayment = true
     * 
     */
    @XmlElement(name = "PaymentDate")
    protected SupplyResourceContractProjectType.PaymentDate paymentDate;
    /**
     * Срок предоставления информации о поступивших платежах, не позднее. Является обязательным, если второй стороной договора является «Управляющая организация», «Размещение информации о начислениях за коммунальные услуги осуществляет» = «РСО» И договор не является публичным и/или присутствует заключенный на бумажном носителе или в электронной форме.
     * 
     */
    @XmlElement(name = "ProvidingInformationDate")
    protected SupplyResourceContractProjectType.ProvidingInformationDate providingInformationDate;
    /**
     * Размещение информации об индивидуальных приборах учета и их показаниях осуществляет ресурсоснабжающая организация. Обязательно для заполнения, если в tns:CountingResource указано"РСО" . В остальных случаях не заполняется.
     * 
     */
    @XmlElement(name = "MeteringDeviceInformation")
    protected Boolean meteringDeviceInformation;
    /**
     * Объем поставки ресурса(ов) определяется на основании прибора учета. Поле не заполняется, если вторая сторона договора = Управляющая организация ИЛИ в поле   OneTimePayment = true.
     * 
     */
    @XmlElement(name = "VolumeDepends")
    protected Boolean volumeDepends;
    /**
     * Оплата предоставленных услуг осуществляется единоразово при отгрузке указанных ресурсов без заведения лицевых счетов для потребителей.  Доступно для заполнения, только если вторая сторона договора отлична от Управляющая организация.
     * 
     */
    @XmlElement(name = "OneTimePayment")
    protected Boolean oneTimePayment;
    /**
     * Порядок размещения информации о начислениях за коммунальные услуги ведется
     * D - в разрезе договора.
     * O - в разрезе объектов жилищного фонда. 
     * Заполняется, если второй стороной договора является исполнитель коммунальных услуг
     * 
     */
    @XmlElement(name = "AccrualProcedure")
    protected String accrualProcedure;
    /**
     * Данные о тарифах и/или нормативах потребления коммунальных услуг, применяемых для всех объектов жилищного фонда договора в Субъекте РФ. Заполняется при наличии хотя бы одного такого тарифа / норматива в Субъекте РФ
     * 
     */
    @XmlElement(name = "RegionalSettings")
    protected SupplyResourceContractProjectType.RegionalSettings regionalSettings;

    /**
     * Договор не является публичным и/или присутствует заключенный на бумажном носителе (электронной форме) и/или не заключен  в отношении нежилых помещений в многоквартирных домах
     * 
     * @return
     *     possible object is
     *     {@link SupplyResourceContractProjectType.IsContract }
     *     
     */
    public SupplyResourceContractProjectType.IsContract getIsContract() {
        return isContract;
    }

    /**
     * Sets the value of the isContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.IsContract }
     *     
     * @see #getIsContract()
     */
    public void setIsContract(SupplyResourceContractProjectType.IsContract value) {
        this.isContract = value;
    }

    /**
     * Договор является публичным и/или отсутствует заключенный на бумажном носителе (в электронной форме) и/или заключен в отношении нежилых помещений в многоквартирных домах
     * 
     * @return
     *     possible object is
     *     {@link SupplyResourceContractProjectType.IsNotContract }
     *     
     */
    public SupplyResourceContractProjectType.IsNotContract getIsNotContract() {
        return isNotContract;
    }

    /**
     * Sets the value of the isNotContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.IsNotContract }
     *     
     * @see #getIsNotContract()
     */
    public void setIsNotContract(SupplyResourceContractProjectType.IsNotContract value) {
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
     * Дата окончания действия. Обязательно для заполнения, если указано значение в AutomaticRollOverOneYear
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
     * Период передачи текущих показаний по индивидуальным приборам учета. Может быть указан только, если поле VolumeDepends = true -ИЛИ- поле MeteringDeviceInformation = «true»
     * 
     * @return
     *     possible object is
     *     {@link SupplyResourceContractProjectType.Period }
     *     
     */
    public SupplyResourceContractProjectType.Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.Period }
     *     
     * @see #getPeriod()
     */
    public void setPeriod(SupplyResourceContractProjectType.Period value) {
        this.period = value;
    }

    /**
     * Разрешить передачу гражданам текущих показаний по индивидуальным приборам учета в любой день месяца.
     * Заполнение возможно только если: в настройках организации установлена настройка «Разрешить передачу гражданам показаний индивидуальных или общих (квартирных) приборов учета в любой день месяца» ИЛИ в настройках организации установлена настройка «Разрешить передачу гражданам показаний индивидуальных или общих (квартирных) приборов учета только в сроки, установленные в договоре, или в любой день месяца, если в договоре установлен признак «Разрешить передачу показаний приборов учета в любой день месяца» И заполнен Period
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
     *     {@link SupplyResourceContractProjectType.ApartmentBuildingOwner }
     *     
     */
    public SupplyResourceContractProjectType.ApartmentBuildingOwner getApartmentBuildingOwner() {
        return apartmentBuildingOwner;
    }

    /**
     * Sets the value of the apartmentBuildingOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.ApartmentBuildingOwner }
     *     
     * @see #getApartmentBuildingOwner()
     */
    public void setApartmentBuildingOwner(SupplyResourceContractProjectType.ApartmentBuildingOwner value) {
        this.apartmentBuildingOwner = value;
    }

    /**
     * Собственник или пользователь жилого дома (домовладения)
     * 
     * @return
     *     possible object is
     *     {@link SupplyResourceContractProjectType.LivingHouseOwner }
     *     
     */
    public SupplyResourceContractProjectType.LivingHouseOwner getLivingHouseOwner() {
        return livingHouseOwner;
    }

    /**
     * Sets the value of the livingHouseOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.LivingHouseOwner }
     *     
     * @see #getLivingHouseOwner()
     */
    public void setLivingHouseOwner(SupplyResourceContractProjectType.LivingHouseOwner value) {
        this.livingHouseOwner = value;
    }

    /**
     * Управляющая организация
     * 
     * @return
     *     possible object is
     *     {@link SupplyResourceContractProjectType.Organization }
     *     
     */
    public SupplyResourceContractProjectType.Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.Organization }
     *     
     * @see #getOrganization()
     */
    public void setOrganization(SupplyResourceContractProjectType.Organization value) {
        this.organization = value;
    }

    /**
     * Единоличный собственник помещений в многоквартирном доме
     * 
     * @return
     *     possible object is
     *     {@link SupplyResourceContractProjectType.ApartmentBuildingSoleOwner }
     *     
     */
    public SupplyResourceContractProjectType.ApartmentBuildingSoleOwner getApartmentBuildingSoleOwner() {
        return apartmentBuildingSoleOwner;
    }

    /**
     * Sets the value of the apartmentBuildingSoleOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.ApartmentBuildingSoleOwner }
     *     
     * @see #getApartmentBuildingSoleOwner()
     */
    public void setApartmentBuildingSoleOwner(SupplyResourceContractProjectType.ApartmentBuildingSoleOwner value) {
        this.apartmentBuildingSoleOwner = value;
    }

    /**
     * Представитель собственников многоквартирного дома
     * 
     * @return
     *     possible object is
     *     {@link SupplyResourceContractProjectType.ApartmentBuildingRepresentativeOwner }
     *     
     */
    public SupplyResourceContractProjectType.ApartmentBuildingRepresentativeOwner getApartmentBuildingRepresentativeOwner() {
        return apartmentBuildingRepresentativeOwner;
    }

    /**
     * Sets the value of the apartmentBuildingRepresentativeOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.ApartmentBuildingRepresentativeOwner }
     *     
     * @see #getApartmentBuildingRepresentativeOwner()
     */
    public void setApartmentBuildingRepresentativeOwner(SupplyResourceContractProjectType.ApartmentBuildingRepresentativeOwner value) {
        this.apartmentBuildingRepresentativeOwner = value;
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
     * O - в разрезе объектов жилищного фонда. Заполняется при наличии в договоре планового объема и режима поставки ресурсов.
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
     * {@link SupplyResourceContractProjectType.ContractSubject }
     * </p>
     * 
     * 
     * @return
     *     The value of the contractSubject property.
     */
    public List<SupplyResourceContractProjectType.ContractSubject> getContractSubject() {
        if (contractSubject == null) {
            contractSubject = new ArrayList<>();
        }
        return this.contractSubject;
    }

    /**
     * Размещение информации о начислениях за коммунальные услуги осуществляет:
     * R(SO)- РСО.
     * P(roprietor)-Исполнитель коммунальных услуг. 
     * Заполняется, если порядок размещения информации о начислениях за коммунальные услуги ведется в разрезе договора
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
     * Показатель качества (содержащийся в справочнике показателей качества). Обязательно для заполнения, если показатели качества указываются в разрезе договора.                                                              Для пары КУ и КР "Горячее водоснабжение" и "Питьевая вода" указываются актуальные показатели, определенные для КР "Горячая вода" в справочнике показателей качества коммунальных ресурсов                                                                      Для пары КУ и КР "Горячее водоснабжение" и "Тепловая энергия" информация о показателях качества не заполняется только в том случае, если для договора (если показатели ведутся в разрезе договора) или ОЖФ в договоре (если показатели ведутся в разрезе ОЖФ) также указана пара КУ и КР "Горячее водоснабжение" и "Питьевая вода"
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
     * {@link SupplyResourceContractProjectType.Quality }
     * </p>
     * 
     * 
     * @return
     *     The value of the quality property.
     */
    public List<SupplyResourceContractProjectType.Quality> getQuality() {
        if (quality == null) {
            quality = new ArrayList<>();
        }
        return this.quality;
    }

    /**
     * Иной показатель качества коммунального ресурса (не содержащийся в справочнике показателей качества).
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
     * {@link SupplyResourceContractProjectType.OtherQualityIndicator }
     * </p>
     * 
     * 
     * @return
     *     The value of the otherQualityIndicator property.
     */
    public List<SupplyResourceContractProjectType.OtherQualityIndicator> getOtherQualityIndicator() {
        if (otherQualityIndicator == null) {
            otherQualityIndicator = new ArrayList<>();
        }
        return this.otherQualityIndicator;
    }

    /**
     * Информация о температурном графике. Доступно для заполнения только, если в предмете договора хотя бы раз встречается ресурс "Тепловая энергия".
     * 
     * Gets the value of the temperatureChart property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperatureChart property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTemperatureChart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyResourceContractProjectType.TemperatureChart }
     * </p>
     * 
     * 
     * @return
     *     The value of the temperatureChart property.
     */
    public List<SupplyResourceContractProjectType.TemperatureChart> getTemperatureChart() {
        if (temperatureChart == null) {
            temperatureChart = new ArrayList<>();
        }
        return this.temperatureChart;
    }

    /**
     * Срок представления (выставления) платежных документов, не позднее. Является обязательным, если вторая сторона договора отличается от "Управляющая организация" ИЛИ если заполнено поле tns:MeteringDeviceInformation                                       Не заполняется, если OneTimePayment = true
     * 
     * @return
     *     possible object is
     *     {@link SupplyResourceContractProjectType.BillingDate }
     *     
     */
    public SupplyResourceContractProjectType.BillingDate getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.BillingDate }
     *     
     * @see #getBillingDate()
     */
    public void setBillingDate(SupplyResourceContractProjectType.BillingDate value) {
        this.billingDate = value;
    }

    /**
     * Срок внесения платы, не позднее. Является обязательным, если вторая сторона договора отличается от "Управляющая организация" И договор не является публичным и/или присутствует заключенный на бумажном носителе или в электронной форме И в поле OneTimePayment = false.                                     Не заполняется, если OneTimePayment = true
     * 
     * @return
     *     possible object is
     *     {@link SupplyResourceContractProjectType.PaymentDate }
     *     
     */
    public SupplyResourceContractProjectType.PaymentDate getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.PaymentDate }
     *     
     * @see #getPaymentDate()
     */
    public void setPaymentDate(SupplyResourceContractProjectType.PaymentDate value) {
        this.paymentDate = value;
    }

    /**
     * Срок предоставления информации о поступивших платежах, не позднее. Является обязательным, если второй стороной договора является «Управляющая организация», «Размещение информации о начислениях за коммунальные услуги осуществляет» = «РСО» И договор не является публичным и/или присутствует заключенный на бумажном носителе или в электронной форме.
     * 
     * @return
     *     possible object is
     *     {@link SupplyResourceContractProjectType.ProvidingInformationDate }
     *     
     */
    public SupplyResourceContractProjectType.ProvidingInformationDate getProvidingInformationDate() {
        return providingInformationDate;
    }

    /**
     * Sets the value of the providingInformationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.ProvidingInformationDate }
     *     
     * @see #getProvidingInformationDate()
     */
    public void setProvidingInformationDate(SupplyResourceContractProjectType.ProvidingInformationDate value) {
        this.providingInformationDate = value;
    }

    /**
     * Размещение информации об индивидуальных приборах учета и их показаниях осуществляет ресурсоснабжающая организация. Обязательно для заполнения, если в tns:CountingResource указано"РСО" . В остальных случаях не заполняется.
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
     * Объем поставки ресурса(ов) определяется на основании прибора учета. Поле не заполняется, если вторая сторона договора = Управляющая организация ИЛИ в поле   OneTimePayment = true.
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
     * Оплата предоставленных услуг осуществляется единоразово при отгрузке указанных ресурсов без заведения лицевых счетов для потребителей.  Доступно для заполнения, только если вторая сторона договора отлична от Управляющая организация.
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
     * Порядок размещения информации о начислениях за коммунальные услуги ведется
     * D - в разрезе договора.
     * O - в разрезе объектов жилищного фонда. 
     * Заполняется, если второй стороной договора является исполнитель коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrualProcedure() {
        return accrualProcedure;
    }

    /**
     * Sets the value of the accrualProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccrualProcedure()
     */
    public void setAccrualProcedure(String value) {
        this.accrualProcedure = value;
    }

    /**
     * Данные о тарифах и/или нормативах потребления коммунальных услуг, применяемых для всех объектов жилищного фонда договора в Субъекте РФ. Заполняется при наличии хотя бы одного такого тарифа / норматива в Субъекте РФ
     * 
     * @return
     *     possible object is
     *     {@link SupplyResourceContractProjectType.RegionalSettings }
     *     
     */
    public SupplyResourceContractProjectType.RegionalSettings getRegionalSettings() {
        return regionalSettings;
    }

    /**
     * Sets the value of the regionalSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyResourceContractProjectType.RegionalSettings }
     *     
     * @see #getRegionalSettings()
     */
    public void setRegionalSettings(SupplyResourceContractProjectType.RegionalSettings value) {
        this.regionalSettings = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractSubjectType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
        "transportGUID"
    })
    public static class ContractSubject
        extends ContractSubjectType
    {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;

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
     *         <element name="ContractAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100"/>
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
         * Договор ресурсоснабжения и приложения к договору
         * 
         */
        @XmlElement(name = "ContractAttachment", required = true)
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
     *         <choice>
     *           <sequence>
     *             <choice>
     *               <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
     *               <sequence>
     *                 <element name="StartRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
     *                 <element name="EndRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
     *               </sequence>
     *             </choice>
     *             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
     *           </sequence>
     *           <element name="Correspond" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         </choice>
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
        "number",
        "startRange",
        "endRange",
        "okei",
        "correspond",
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
     *                   <element name="StartDate">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         <maxInclusive value="30"/>
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
     *                         <maxInclusive value="30"/>
     *                         <minInclusive value="-1"/>
     *                         <pattern value="(-1)|[1-9]|([1][0-9])|([2][0-9])|30"/>
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
        protected SupplyResourceContractProjectType.Period.Start start;
        /**
         * Конец периода
         * 
         */
        @XmlElement(name = "End", required = true)
        protected SupplyResourceContractProjectType.Period.End end;

        /**
         * Начало периода
         * 
         * @return
         *     possible object is
         *     {@link SupplyResourceContractProjectType.Period.Start }
         *     
         */
        public SupplyResourceContractProjectType.Period.Start getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link SupplyResourceContractProjectType.Period.Start }
         *     
         * @see #getStart()
         */
        public void setStart(SupplyResourceContractProjectType.Period.Start value) {
            this.start = value;
        }

        /**
         * Конец периода
         * 
         * @return
         *     possible object is
         *     {@link SupplyResourceContractProjectType.Period.End }
         *     
         */
        public SupplyResourceContractProjectType.Period.End getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link SupplyResourceContractProjectType.Period.End }
         *     
         * @see #getEnd()
         */
        public void setEnd(SupplyResourceContractProjectType.Period.End value) {
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
         *               <maxInclusive value="30"/>
         *               <minInclusive value="-1"/>
         *               <pattern value="(-1)|[1-9]|([1][0-9])|([2][0-9])|30"/>
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
             * Дата окончания. Если нужно указать значение "Последний день месяца", то поле заполняется значением "-1".
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
             * Дата окончания. Если нужно указать значение "Последний день месяца", то поле заполняется значением "-1".
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
         *               <maxInclusive value="30"/>
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
        @XmlElement(name = "IndicatorValue", required = true)
        protected SupplyResourceContractProjectType.Quality.IndicatorValue indicatorValue;
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
         * @return
         *     possible object is
         *     {@link SupplyResourceContractProjectType.Quality.IndicatorValue }
         *     
         */
        public SupplyResourceContractProjectType.Quality.IndicatorValue getIndicatorValue() {
            return indicatorValue;
        }

        /**
         * Sets the value of the indicatorValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link SupplyResourceContractProjectType.Quality.IndicatorValue }
         *     
         * @see #getIndicatorValue()
         */
        public void setIndicatorValue(SupplyResourceContractProjectType.Quality.IndicatorValue value) {
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
     *         <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/base/}RegionType"/>
     *         <element name="Tariff" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   <element name="PriceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Norm" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   <element name="NormGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "region",
        "tariff",
        "norm"
    })
    public static class RegionalSettings {

        /**
         * Субъект РФ, в котором применяются тарифы и/или нормативы потребления КУ (у поставщика данных должна быть подтвержденная функция РСО в этом Субъекте РФ)
         * 
         */
        @XmlElement(name = "Region", required = true)
        protected RegionType region;
        /**
         * Информация о применяемом тарифе
         * 
         */
        @XmlElement(name = "Tariff")
        protected List<SupplyResourceContractProjectType.RegionalSettings.Tariff> tariff;
        /**
         * Информация о нормативе потребления коммунальной услуги
         * 
         */
        @XmlElement(name = "Norm")
        protected List<SupplyResourceContractProjectType.RegionalSettings.Norm> norm;

        /**
         * Субъект РФ, в котором применяются тарифы и/или нормативы потребления КУ (у поставщика данных должна быть подтвержденная функция РСО в этом Субъекте РФ)
         * 
         * @return
         *     possible object is
         *     {@link RegionType }
         *     
         */
        public RegionType getRegion() {
            return region;
        }

        /**
         * Sets the value of the region property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegionType }
         *     
         * @see #getRegion()
         */
        public void setRegion(RegionType value) {
            this.region = value;
        }

        /**
         * Информация о применяемом тарифе
         * 
         * Gets the value of the tariff property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tariff property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getTariff().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SupplyResourceContractProjectType.RegionalSettings.Tariff }
         * </p>
         * 
         * 
         * @return
         *     The value of the tariff property.
         */
        public List<SupplyResourceContractProjectType.RegionalSettings.Tariff> getTariff() {
            if (tariff == null) {
                tariff = new ArrayList<>();
            }
            return this.tariff;
        }

        /**
         * Информация о нормативе потребления коммунальной услуги
         * 
         * Gets the value of the norm property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the norm property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getNorm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SupplyResourceContractProjectType.RegionalSettings.Norm }
         * </p>
         * 
         * 
         * @return
         *     The value of the norm property.
         */
        public List<SupplyResourceContractProjectType.RegionalSettings.Norm> getNorm() {
            if (norm == null) {
                norm = new ArrayList<>();
            }
            return this.norm;
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
         *         <element name="NormGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "normGUID"
        })
        public static class Norm {

            /**
             * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
             * 
             */
            @XmlElement(name = "PairKey", required = true)
            protected String pairKey;
            /**
             * Идентификатор норматива потребления коммунальной услуги
             * 
             */
            @XmlElement(name = "NormGUID", required = true)
            protected String normGUID;

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
             * Идентификатор норматива потребления коммунальной услуги
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNormGUID() {
                return normGUID;
            }

            /**
             * Sets the value of the normGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getNormGUID()
             */
            public void setNormGUID(String value) {
                this.normGUID = value;
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
         *         <element name="PriceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "priceGUID"
        })
        public static class Tariff {

            /**
             * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
             * 
             */
            @XmlElement(name = "PairKey", required = true)
            protected String pairKey;
            /**
             * Идентификатор дифференцированной цены тарифа
             * 
             */
            @XmlElement(name = "PriceGUID", required = true)
            protected String priceGUID;

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
             * Идентификатор дифференцированной цены тарифа
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPriceGUID() {
                return priceGUID;
            }

            /**
             * Sets the value of the priceGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPriceGUID()
             */
            public void setPriceGUID(String value) {
                this.priceGUID = value;
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
     *         <element name="OutsideTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="FlowLineTemperature">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <minInclusive value="0"/>
     *               <fractionDigits value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="OppositeLineTemperature">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <minInclusive value="0"/>
     *               <fractionDigits value="1"/>
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
        "outsideTemperature",
        "flowLineTemperature",
        "oppositeLineTemperature"
    })
    public static class TemperatureChart {

        /**
         * Температура наружного воздуха
         * 
         */
        @XmlElement(name = "OutsideTemperature")
        protected int outsideTemperature;
        /**
         * Температура теплоносителя в подающем трубопроводе
         * 
         */
        @XmlElement(name = "FlowLineTemperature", required = true)
        protected BigDecimal flowLineTemperature;
        /**
         * Температура теплоносителя в обратном трубопроводе
         * 
         */
        @XmlElement(name = "OppositeLineTemperature", required = true)
        protected BigDecimal oppositeLineTemperature;

        /**
         * Температура наружного воздуха
         * 
         */
        public int getOutsideTemperature() {
            return outsideTemperature;
        }

        /**
         * Sets the value of the outsideTemperature property.
         * 
         */
        public void setOutsideTemperature(int value) {
            this.outsideTemperature = value;
        }

        /**
         * Температура теплоносителя в подающем трубопроводе
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFlowLineTemperature() {
            return flowLineTemperature;
        }

        /**
         * Sets the value of the flowLineTemperature property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getFlowLineTemperature()
         */
        public void setFlowLineTemperature(BigDecimal value) {
            this.flowLineTemperature = value;
        }

        /**
         * Температура теплоносителя в обратном трубопроводе
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOppositeLineTemperature() {
            return oppositeLineTemperature;
        }

        /**
         * Sets the value of the oppositeLineTemperature property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getOppositeLineTemperature()
         */
        public void setOppositeLineTemperature(BigDecimal value) {
            this.oppositeLineTemperature = value;
        }

    }

}
