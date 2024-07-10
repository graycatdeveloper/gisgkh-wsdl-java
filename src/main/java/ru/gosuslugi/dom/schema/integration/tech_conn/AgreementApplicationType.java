
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Составной тип: Экспорт данных заявления на заключение договора о подключении
 * 
 * <p>Java class for AgreementApplicationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AgreementApplicationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicationOverview">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicationOverviewType">
 *                 <sequence>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AgreementApplicationStatusType"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ApplicationVersion" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ApplicationVersionGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="VersionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="ActualVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="Network">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="NetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
 *                             <element name="ConnectedResource" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" maxOccurs="unbounded" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="TypeOfWork" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
 *                   <element name="ApplicantCategory" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
 *                   <element name="Applicant">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicantType">
 *                           <choice minOccurs="0">
 *                             <element name="IsConstituentAppliedDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             <element name="IsIdentityDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           </choice>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ObjectAddressInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ObjectAddressInfoType"/>
 *                   <sequence>
 *                     <sequence minOccurs="0">
 *                       <element name="ApplicationNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type"/>
 *                       <element name="ApplicationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                       <element name="AgreementApplicationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                     </sequence>
 *                     <sequence minOccurs="0">
 *                       <element name="TechnicalSpecificationNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type"/>
 *                       <element name="TechnicalSpecificationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                       <element name="TechnicalSpecificationApplicationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                     </sequence>
 *                     <sequence minOccurs="0">
 *                       <element name="ConnectionPossibilityNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type"/>
 *                       <element name="ConnectionPossibilityDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                       <element name="ConnectionPossibilityApplicationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                     </sequence>
 *                   </sequence>
 *                   <element name="Representative" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}RepresentativeType">
 *                           <sequence minOccurs="0">
 *                             <element name="IsPowerOfAttorneyDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Land" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}LandCommonType">
 *                           <sequence>
 *                             <element name="PermittedUse" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" minOccurs="0"/>
 *                             <element name="LandSquare" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}SquareType" minOccurs="0"/>
 *                             <element name="BuildingFloorLimit" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FloorCountType" minOccurs="0"/>
 *                             <element name="BuildingHeightLimit" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}BuildingHeightType" minOccurs="0"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Facility">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FacilityCommonType">
 *                           <sequence minOccurs="0">
 *                             <element name="BuildingRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                             <element name="IsBuildingRightsDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             <choice>
 *                               <choice minOccurs="0">
 *                                 <choice minOccurs="0">
 *                                   <element name="ExpectedCommissioningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                   <element name="ExpectedEndOfConstructionNotificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                 </choice>
 *                                 <element name="ExpectedEndOfConstructionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                               </choice>
 *                               <element name="PlannedConnectionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             </choice>
 *                             <element name="FloorCount" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FloorCountType"/>
 *                             <element name="BuildingHeight" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}BuildingHeightType" minOccurs="0"/>
 *                             <element name="BuildingVolume" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}BuildingVolumeType" minOccurs="0"/>
 *                             <element name="BuildingSquare" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}SquareType" minOccurs="0"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ObjectTechnicalParameters">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <sequence>
 *                               <element name="PluggableWaterLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}WaterSupplyPowerDetailsType"/>
 *                               <element name="CurrentWaterLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}WaterSupplyPowerDetailsType" minOccurs="0"/>
 *                             </sequence>
 *                             <sequence>
 *                               <element name="PluggableHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType"/>
 *                               <element name="CurrentHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType" minOccurs="0"/>
 *                               <element name="AdditionalHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType" minOccurs="0"/>
 *                               <element name="HeatTransfer" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatTransferType" maxOccurs="unbounded" minOccurs="0"/>
 *                               <element name="ReturnHeatTransferInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type" minOccurs="0"/>
 *                               <element name="HeatConsumptionInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingConsumptionInfoType"/>
 *                               <element name="MeteringUnitLocation" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
 *                               <element name="ReliabilityCategory" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
 *                               <element name="AdditionalRequiementToReliability" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
 *                               <element name="OwnSources" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
 *                               <element name="TemperatureGraph" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingTemperatureGraphType" minOccurs="0"/>
 *                             </sequence>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Documents">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <sequence>
 *                               <element name="LandRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               <element name="IsLandRightsDocumentsActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             </sequence>
 *                             <sequence>
 *                               <element name="TerritoryDevelopmentContract" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               <element name="TerritoryDevelopmentPlanProject" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               <element name="TerritoryDevelopmentEngineeringSupportScheme" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                             </sequence>
 *                             <sequence>
 *                               <element name="TopographicMap" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               <element name="IsTopographicMapActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             </sequence>
 *                             <element name="SituationPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
 *                             <sequence>
 *                               <element name="LandBorderScheme" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               <sequence>
 *                                 <element name="LandPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                                 <element name="IsLandPlanActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               </sequence>
 *                               <element name="MeteringDeviceDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               <element name="LandCharacteristics" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               <sequence>
 *                                 <element name="UseAnotherWaterSupplySystem" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                                 <element name="UseOwnHotWaterSystem" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                                 <element name="UseAnotherSewageSystem" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               </sequence>
 *                               <sequence>
 *                                 <element name="ColdAndSewageWaterBalanceDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                                 <element name="HotWaterBalanceDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               </sequence>
 *                               <sequence>
 *                                 <element name="PPTDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                                 <element name="PMTDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               </sequence>
 *                               <sequence>
 *                                 <element name="ReliefPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                                 <element name="WellPosition" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                                 <element name="RoomPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               </sequence>
 *                               <choice minOccurs="0">
 *                                 <element name="EngineeringSurveyResults" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
 *                                 <element name="EngineeringSurveyResultsLink" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type"/>
 *                               </choice>
 *                             </sequence>
 *                             <sequence>
 *                               <element name="ApplicantBankDetails" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                               <element name="BuildingPermitDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                             </sequence>
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
@XmlType(name = "AgreementApplicationType", propOrder = {
    "applicationOverview",
    "applicationVersion"
})
public class AgreementApplicationType {

    /**
     * Общие сведения о заявлении
     * 
     */
    @XmlElement(name = "ApplicationOverview", required = true)
    protected AgreementApplicationType.ApplicationOverview applicationOverview;
    /**
     * Версия заявления
     * 
     */
    @XmlElement(name = "ApplicationVersion", required = true)
    protected List<AgreementApplicationType.ApplicationVersion> applicationVersion;

    /**
     * Общие сведения о заявлении
     * 
     * @return
     *     possible object is
     *     {@link AgreementApplicationType.ApplicationOverview }
     *     
     */
    public AgreementApplicationType.ApplicationOverview getApplicationOverview() {
        return applicationOverview;
    }

    /**
     * Sets the value of the applicationOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementApplicationType.ApplicationOverview }
     *     
     * @see #getApplicationOverview()
     */
    public void setApplicationOverview(AgreementApplicationType.ApplicationOverview value) {
        this.applicationOverview = value;
    }

    /**
     * Версия заявления
     * 
     * Gets the value of the applicationVersion property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationVersion property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getApplicationVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementApplicationType.ApplicationVersion }
     * </p>
     * 
     * 
     * @return
     *     The value of the applicationVersion property.
     */
    public List<AgreementApplicationType.ApplicationVersion> getApplicationVersion() {
        if (applicationVersion == null) {
            applicationVersion = new ArrayList<>();
        }
        return this.applicationVersion;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicationOverviewType">
     *       <sequence>
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AgreementApplicationStatusType"/>
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
        "status"
    })
    public static class ApplicationOverview
        extends ApplicationOverviewType
    {

        /**
         * Статус заявления
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlSchemaType(name = "string")
        protected AgreementApplicationStatusType status;

        /**
         * Статус заявления
         * 
         * @return
         *     possible object is
         *     {@link AgreementApplicationStatusType }
         *     
         */
        public AgreementApplicationStatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgreementApplicationStatusType }
         *     
         * @see #getStatus()
         */
        public void setStatus(AgreementApplicationStatusType value) {
            this.status = value;
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
     *         <element name="ApplicationVersionGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="VersionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="ActualVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="Network">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="NetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
     *                   <element name="ConnectedResource" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" maxOccurs="unbounded" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="TypeOfWork" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
     *         <element name="ApplicantCategory" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
     *         <element name="Applicant">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicantType">
     *                 <choice minOccurs="0">
     *                   <element name="IsConstituentAppliedDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   <element name="IsIdentityDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 </choice>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ObjectAddressInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ObjectAddressInfoType"/>
     *         <sequence>
     *           <sequence minOccurs="0">
     *             <element name="ApplicationNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type"/>
     *             <element name="ApplicationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *             <element name="AgreementApplicationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *           </sequence>
     *           <sequence minOccurs="0">
     *             <element name="TechnicalSpecificationNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type"/>
     *             <element name="TechnicalSpecificationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *             <element name="TechnicalSpecificationApplicationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *           </sequence>
     *           <sequence minOccurs="0">
     *             <element name="ConnectionPossibilityNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type"/>
     *             <element name="ConnectionPossibilityDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *             <element name="ConnectionPossibilityApplicationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *           </sequence>
     *         </sequence>
     *         <element name="Representative" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}RepresentativeType">
     *                 <sequence minOccurs="0">
     *                   <element name="IsPowerOfAttorneyDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Land" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}LandCommonType">
     *                 <sequence>
     *                   <element name="PermittedUse" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" minOccurs="0"/>
     *                   <element name="LandSquare" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}SquareType" minOccurs="0"/>
     *                   <element name="BuildingFloorLimit" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FloorCountType" minOccurs="0"/>
     *                   <element name="BuildingHeightLimit" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}BuildingHeightType" minOccurs="0"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Facility">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FacilityCommonType">
     *                 <sequence minOccurs="0">
     *                   <element name="BuildingRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                   <element name="IsBuildingRightsDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   <choice>
     *                     <choice minOccurs="0">
     *                       <choice minOccurs="0">
     *                         <element name="ExpectedCommissioningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                         <element name="ExpectedEndOfConstructionNotificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                       </choice>
     *                       <element name="ExpectedEndOfConstructionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                     </choice>
     *                     <element name="PlannedConnectionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   </choice>
     *                   <element name="FloorCount" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FloorCountType"/>
     *                   <element name="BuildingHeight" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}BuildingHeightType" minOccurs="0"/>
     *                   <element name="BuildingVolume" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}BuildingVolumeType" minOccurs="0"/>
     *                   <element name="BuildingSquare" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}SquareType" minOccurs="0"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ObjectTechnicalParameters">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <sequence>
     *                     <element name="PluggableWaterLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}WaterSupplyPowerDetailsType"/>
     *                     <element name="CurrentWaterLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}WaterSupplyPowerDetailsType" minOccurs="0"/>
     *                   </sequence>
     *                   <sequence>
     *                     <element name="PluggableHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType"/>
     *                     <element name="CurrentHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType" minOccurs="0"/>
     *                     <element name="AdditionalHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType" minOccurs="0"/>
     *                     <element name="HeatTransfer" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatTransferType" maxOccurs="unbounded" minOccurs="0"/>
     *                     <element name="ReturnHeatTransferInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type" minOccurs="0"/>
     *                     <element name="HeatConsumptionInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingConsumptionInfoType"/>
     *                     <element name="MeteringUnitLocation" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
     *                     <element name="ReliabilityCategory" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
     *                     <element name="AdditionalRequiementToReliability" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
     *                     <element name="OwnSources" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
     *                     <element name="TemperatureGraph" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingTemperatureGraphType" minOccurs="0"/>
     *                   </sequence>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Documents">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <sequence>
     *                     <element name="LandRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     <element name="IsLandRightsDocumentsActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   </sequence>
     *                   <sequence>
     *                     <element name="TerritoryDevelopmentContract" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     <element name="TerritoryDevelopmentPlanProject" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     <element name="TerritoryDevelopmentEngineeringSupportScheme" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                   </sequence>
     *                   <sequence>
     *                     <element name="TopographicMap" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     <element name="IsTopographicMapActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   </sequence>
     *                   <element name="SituationPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
     *                   <sequence>
     *                     <element name="LandBorderScheme" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     <sequence>
     *                       <element name="LandPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                       <element name="IsLandPlanActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     </sequence>
     *                     <element name="MeteringDeviceDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     <element name="LandCharacteristics" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     <sequence>
     *                       <element name="UseAnotherWaterSupplySystem" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                       <element name="UseOwnHotWaterSystem" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                       <element name="UseAnotherSewageSystem" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     </sequence>
     *                     <sequence>
     *                       <element name="ColdAndSewageWaterBalanceDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                       <element name="HotWaterBalanceDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     </sequence>
     *                     <sequence>
     *                       <element name="PPTDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                       <element name="PMTDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     </sequence>
     *                     <sequence>
     *                       <element name="ReliefPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                       <element name="WellPosition" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                       <element name="RoomPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     </sequence>
     *                     <choice minOccurs="0">
     *                       <element name="EngineeringSurveyResults" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
     *                       <element name="EngineeringSurveyResultsLink" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type"/>
     *                     </choice>
     *                   </sequence>
     *                   <sequence>
     *                     <element name="ApplicantBankDetails" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                     <element name="BuildingPermitDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
     *                   </sequence>
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
        "applicationVersionGuid",
        "versionNumber",
        "versionDate",
        "actualVersion",
        "network",
        "typeOfWork",
        "applicantCategory",
        "applicant",
        "objectAddressInfo",
        "applicationNumber",
        "applicationDate",
        "agreementApplicationGUID",
        "technicalSpecificationNumber",
        "technicalSpecificationDate",
        "technicalSpecificationApplicationGUID",
        "connectionPossibilityNumber",
        "connectionPossibilityDate",
        "connectionPossibilityApplicationGUID",
        "representative",
        "land",
        "facility",
        "objectTechnicalParameters",
        "documents"
    })
    public static class ApplicationVersion {

        /**
         * Уникальный идентификатор версии заявления в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ApplicationVersionGuid", required = true)
        protected String applicationVersionGuid;
        /**
         * Номер версии
         * 
         */
        @XmlElement(name = "VersionNumber")
        protected int versionNumber;
        /**
         * Дата версии
         * 
         */
        @XmlElement(name = "VersionDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar versionDate;
        /**
         * Актуальная версия
         * 
         */
        @XmlElement(name = "ActualVersion")
        protected Boolean actualVersion;
        /**
         * Сведения о видах сетей и подключаемых ресурсах
         * 
         */
        @XmlElement(name = "Network", required = true)
        protected AgreementApplicationType.ApplicationVersion.Network network;
        /**
         * Основание обращения (вид работ).     
         * 
         * Для заявлений по водоснабжению и (или) водоотведению - справочник "Основание для заключения договора о подключении к системам водоснабжения и водоотведения" ЕСНСИ
         * 
         * Для заявлений по теплоснабжению - справочник "Основание обращения за услугой по выдаче технических условий подключения и договора о подключении к системам теплоснабжения" ЕСНСИ
         * 
         */
        @XmlElement(name = "TypeOfWork", required = true)
        protected EsnsiItemType typeOfWork;
        /**
         * Категория заявителя. Справочник "Лица, которым доступна возможность отправки заявления по подключению объектов капитального строительства к централизованным системам" ЕСНСИ
         * 
         */
        @XmlElement(name = "ApplicantCategory", required = true)
        protected EsnsiItemType applicantCategory;
        /**
         * Сведения о заявителе
         * 
         */
        @XmlElement(name = "Applicant", required = true)
        protected AgreementApplicationType.ApplicationVersion.Applicant applicant;
        /**
         * Информация об адресе подключаемого объекта
         * 
         */
        @XmlElement(name = "ObjectAddressInfo", required = true)
        protected ObjectAddressInfoType objectAddressInfo;
        /**
         * Номер заявления на заключение договора о подключении
         * 
         */
        @XmlElement(name = "ApplicationNumber")
        protected String applicationNumber;
        /**
         * Дата регистрации заявления на заключение договора о подключении
         * 
         */
        @XmlElement(name = "ApplicationDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar applicationDate;
        /**
         * Идентификатор заявления на заключение договора о подключении в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "AgreementApplicationGUID")
        protected String agreementApplicationGUID;
        /**
         * Номер технических условий подключения
         * 
         */
        @XmlElement(name = "TechnicalSpecificationNumber")
        protected String technicalSpecificationNumber;
        /**
         * Дата технических условий подключения
         * 
         */
        @XmlElement(name = "TechnicalSpecificationDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar technicalSpecificationDate;
        /**
         * Идентификатор заявления на предоставление технических условий подключения в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "TechnicalSpecificationApplicationGUID")
        protected String technicalSpecificationApplicationGUID;
        /**
         * Номер информации о возможности подключения
         * 
         */
        @XmlElement(name = "ConnectionPossibilityNumber")
        protected String connectionPossibilityNumber;
        /**
         * Дата информации о возможности подключения
         * 
         */
        @XmlElement(name = "ConnectionPossibilityDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar connectionPossibilityDate;
        /**
         * Идентификатор заявления на предоставление информации о возможности подключения в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ConnectionPossibilityApplicationGUID")
        protected String connectionPossibilityApplicationGUID;
        /**
         * Сведения о представителе заявителя
         * 
         */
        @XmlElement(name = "Representative")
        protected AgreementApplicationType.ApplicationVersion.Representative representative;
        /**
         * Сведения о земельном участке
         * 
         */
        @XmlElement(name = "Land", required = true)
        protected List<AgreementApplicationType.ApplicationVersion.Land> land;
        /**
         * Сведения об объекте недвижимости
         * 
         */
        @XmlElement(name = "Facility", required = true)
        protected AgreementApplicationType.ApplicationVersion.Facility facility;
        /**
         * Технические характеристики подключаемого объекта
         * 
         */
        @XmlElement(name = "ObjectTechnicalParameters", required = true)
        protected AgreementApplicationType.ApplicationVersion.ObjectTechnicalParameters objectTechnicalParameters;
        /**
         * Документы, приложенные к заявлению
         * 
         */
        @XmlElement(name = "Documents", required = true)
        protected AgreementApplicationType.ApplicationVersion.Documents documents;

        /**
         * Уникальный идентификатор версии заявления в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicationVersionGuid() {
            return applicationVersionGuid;
        }

        /**
         * Sets the value of the applicationVersionGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getApplicationVersionGuid()
         */
        public void setApplicationVersionGuid(String value) {
            this.applicationVersionGuid = value;
        }

        /**
         * Номер версии
         * 
         */
        public int getVersionNumber() {
            return versionNumber;
        }

        /**
         * Sets the value of the versionNumber property.
         * 
         */
        public void setVersionNumber(int value) {
            this.versionNumber = value;
        }

        /**
         * Дата версии
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getVersionDate() {
            return versionDate;
        }

        /**
         * Sets the value of the versionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getVersionDate()
         */
        public void setVersionDate(XMLGregorianCalendar value) {
            this.versionDate = value;
        }

        /**
         * Актуальная версия
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isActualVersion() {
            return actualVersion;
        }

        /**
         * Sets the value of the actualVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isActualVersion()
         */
        public void setActualVersion(Boolean value) {
            this.actualVersion = value;
        }

        /**
         * Сведения о видах сетей и подключаемых ресурсах
         * 
         * @return
         *     possible object is
         *     {@link AgreementApplicationType.ApplicationVersion.Network }
         *     
         */
        public AgreementApplicationType.ApplicationVersion.Network getNetwork() {
            return network;
        }

        /**
         * Sets the value of the network property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgreementApplicationType.ApplicationVersion.Network }
         *     
         * @see #getNetwork()
         */
        public void setNetwork(AgreementApplicationType.ApplicationVersion.Network value) {
            this.network = value;
        }

        /**
         * Основание обращения (вид работ).     
         * 
         * Для заявлений по водоснабжению и (или) водоотведению - справочник "Основание для заключения договора о подключении к системам водоснабжения и водоотведения" ЕСНСИ
         * 
         * Для заявлений по теплоснабжению - справочник "Основание обращения за услугой по выдаче технических условий подключения и договора о подключении к системам теплоснабжения" ЕСНСИ
         * 
         * @return
         *     possible object is
         *     {@link EsnsiItemType }
         *     
         */
        public EsnsiItemType getTypeOfWork() {
            return typeOfWork;
        }

        /**
         * Sets the value of the typeOfWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link EsnsiItemType }
         *     
         * @see #getTypeOfWork()
         */
        public void setTypeOfWork(EsnsiItemType value) {
            this.typeOfWork = value;
        }

        /**
         * Категория заявителя. Справочник "Лица, которым доступна возможность отправки заявления по подключению объектов капитального строительства к централизованным системам" ЕСНСИ
         * 
         * @return
         *     possible object is
         *     {@link EsnsiItemType }
         *     
         */
        public EsnsiItemType getApplicantCategory() {
            return applicantCategory;
        }

        /**
         * Sets the value of the applicantCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link EsnsiItemType }
         *     
         * @see #getApplicantCategory()
         */
        public void setApplicantCategory(EsnsiItemType value) {
            this.applicantCategory = value;
        }

        /**
         * Сведения о заявителе
         * 
         * @return
         *     possible object is
         *     {@link AgreementApplicationType.ApplicationVersion.Applicant }
         *     
         */
        public AgreementApplicationType.ApplicationVersion.Applicant getApplicant() {
            return applicant;
        }

        /**
         * Sets the value of the applicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgreementApplicationType.ApplicationVersion.Applicant }
         *     
         * @see #getApplicant()
         */
        public void setApplicant(AgreementApplicationType.ApplicationVersion.Applicant value) {
            this.applicant = value;
        }

        /**
         * Информация об адресе подключаемого объекта
         * 
         * @return
         *     possible object is
         *     {@link ObjectAddressInfoType }
         *     
         */
        public ObjectAddressInfoType getObjectAddressInfo() {
            return objectAddressInfo;
        }

        /**
         * Sets the value of the objectAddressInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ObjectAddressInfoType }
         *     
         * @see #getObjectAddressInfo()
         */
        public void setObjectAddressInfo(ObjectAddressInfoType value) {
            this.objectAddressInfo = value;
        }

        /**
         * Номер заявления на заключение договора о подключении
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicationNumber() {
            return applicationNumber;
        }

        /**
         * Sets the value of the applicationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getApplicationNumber()
         */
        public void setApplicationNumber(String value) {
            this.applicationNumber = value;
        }

        /**
         * Дата регистрации заявления на заключение договора о подключении
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getApplicationDate() {
            return applicationDate;
        }

        /**
         * Sets the value of the applicationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getApplicationDate()
         */
        public void setApplicationDate(XMLGregorianCalendar value) {
            this.applicationDate = value;
        }

        /**
         * Идентификатор заявления на заключение договора о подключении в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgreementApplicationGUID() {
            return agreementApplicationGUID;
        }

        /**
         * Sets the value of the agreementApplicationGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAgreementApplicationGUID()
         */
        public void setAgreementApplicationGUID(String value) {
            this.agreementApplicationGUID = value;
        }

        /**
         * Номер технических условий подключения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnicalSpecificationNumber() {
            return technicalSpecificationNumber;
        }

        /**
         * Sets the value of the technicalSpecificationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTechnicalSpecificationNumber()
         */
        public void setTechnicalSpecificationNumber(String value) {
            this.technicalSpecificationNumber = value;
        }

        /**
         * Дата технических условий подключения
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTechnicalSpecificationDate() {
            return technicalSpecificationDate;
        }

        /**
         * Sets the value of the technicalSpecificationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getTechnicalSpecificationDate()
         */
        public void setTechnicalSpecificationDate(XMLGregorianCalendar value) {
            this.technicalSpecificationDate = value;
        }

        /**
         * Идентификатор заявления на предоставление технических условий подключения в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnicalSpecificationApplicationGUID() {
            return technicalSpecificationApplicationGUID;
        }

        /**
         * Sets the value of the technicalSpecificationApplicationGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTechnicalSpecificationApplicationGUID()
         */
        public void setTechnicalSpecificationApplicationGUID(String value) {
            this.technicalSpecificationApplicationGUID = value;
        }

        /**
         * Номер информации о возможности подключения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConnectionPossibilityNumber() {
            return connectionPossibilityNumber;
        }

        /**
         * Sets the value of the connectionPossibilityNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getConnectionPossibilityNumber()
         */
        public void setConnectionPossibilityNumber(String value) {
            this.connectionPossibilityNumber = value;
        }

        /**
         * Дата информации о возможности подключения
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getConnectionPossibilityDate() {
            return connectionPossibilityDate;
        }

        /**
         * Sets the value of the connectionPossibilityDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getConnectionPossibilityDate()
         */
        public void setConnectionPossibilityDate(XMLGregorianCalendar value) {
            this.connectionPossibilityDate = value;
        }

        /**
         * Идентификатор заявления на предоставление информации о возможности подключения в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConnectionPossibilityApplicationGUID() {
            return connectionPossibilityApplicationGUID;
        }

        /**
         * Sets the value of the connectionPossibilityApplicationGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getConnectionPossibilityApplicationGUID()
         */
        public void setConnectionPossibilityApplicationGUID(String value) {
            this.connectionPossibilityApplicationGUID = value;
        }

        /**
         * Сведения о представителе заявителя
         * 
         * @return
         *     possible object is
         *     {@link AgreementApplicationType.ApplicationVersion.Representative }
         *     
         */
        public AgreementApplicationType.ApplicationVersion.Representative getRepresentative() {
            return representative;
        }

        /**
         * Sets the value of the representative property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgreementApplicationType.ApplicationVersion.Representative }
         *     
         * @see #getRepresentative()
         */
        public void setRepresentative(AgreementApplicationType.ApplicationVersion.Representative value) {
            this.representative = value;
        }

        /**
         * Сведения о земельном участке
         * 
         * Gets the value of the land property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the land property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getLand().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AgreementApplicationType.ApplicationVersion.Land }
         * </p>
         * 
         * 
         * @return
         *     The value of the land property.
         */
        public List<AgreementApplicationType.ApplicationVersion.Land> getLand() {
            if (land == null) {
                land = new ArrayList<>();
            }
            return this.land;
        }

        /**
         * Сведения об объекте недвижимости
         * 
         * @return
         *     possible object is
         *     {@link AgreementApplicationType.ApplicationVersion.Facility }
         *     
         */
        public AgreementApplicationType.ApplicationVersion.Facility getFacility() {
            return facility;
        }

        /**
         * Sets the value of the facility property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgreementApplicationType.ApplicationVersion.Facility }
         *     
         * @see #getFacility()
         */
        public void setFacility(AgreementApplicationType.ApplicationVersion.Facility value) {
            this.facility = value;
        }

        /**
         * Технические характеристики подключаемого объекта
         * 
         * @return
         *     possible object is
         *     {@link AgreementApplicationType.ApplicationVersion.ObjectTechnicalParameters }
         *     
         */
        public AgreementApplicationType.ApplicationVersion.ObjectTechnicalParameters getObjectTechnicalParameters() {
            return objectTechnicalParameters;
        }

        /**
         * Sets the value of the objectTechnicalParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgreementApplicationType.ApplicationVersion.ObjectTechnicalParameters }
         *     
         * @see #getObjectTechnicalParameters()
         */
        public void setObjectTechnicalParameters(AgreementApplicationType.ApplicationVersion.ObjectTechnicalParameters value) {
            this.objectTechnicalParameters = value;
        }

        /**
         * Документы, приложенные к заявлению
         * 
         * @return
         *     possible object is
         *     {@link AgreementApplicationType.ApplicationVersion.Documents }
         *     
         */
        public AgreementApplicationType.ApplicationVersion.Documents getDocuments() {
            return documents;
        }

        /**
         * Sets the value of the documents property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgreementApplicationType.ApplicationVersion.Documents }
         *     
         * @see #getDocuments()
         */
        public void setDocuments(AgreementApplicationType.ApplicationVersion.Documents value) {
            this.documents = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicantType">
         *       <choice minOccurs="0">
         *         <element name="IsConstituentAppliedDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         <element name="IsIdentityDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *       </choice>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "isConstituentAppliedDocumentActual",
            "isIdentityDocumentActual"
        })
        public static class Applicant
            extends ApplicantType
        {

            /**
             * Срок действия ранее предоставляемого учредительного документа не истек, и сведения, содержащиеся в документе, не изменились
             * 
             */
            @XmlElement(name = "IsConstituentAppliedDocumentActual")
            protected Boolean isConstituentAppliedDocumentActual;
            /**
             * Срок действия ранее предоставляемого документа, удостоверяющего личность заявителя, не истек, и сведения, содержащиеся в документе, не изменились
             * 
             */
            @XmlElement(name = "IsIdentityDocumentActual")
            protected Boolean isIdentityDocumentActual;

            /**
             * Срок действия ранее предоставляемого учредительного документа не истек, и сведения, содержащиеся в документе, не изменились
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsConstituentAppliedDocumentActual() {
                return isConstituentAppliedDocumentActual;
            }

            /**
             * Sets the value of the isConstituentAppliedDocumentActual property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsConstituentAppliedDocumentActual()
             */
            public void setIsConstituentAppliedDocumentActual(Boolean value) {
                this.isConstituentAppliedDocumentActual = value;
            }

            /**
             * Срок действия ранее предоставляемого документа, удостоверяющего личность заявителя, не истек, и сведения, содержащиеся в документе, не изменились
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsIdentityDocumentActual() {
                return isIdentityDocumentActual;
            }

            /**
             * Sets the value of the isIdentityDocumentActual property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsIdentityDocumentActual()
             */
            public void setIsIdentityDocumentActual(Boolean value) {
                this.isIdentityDocumentActual = value;
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
         *           <element name="LandRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           <element name="IsLandRightsDocumentsActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         </sequence>
         *         <sequence>
         *           <element name="TerritoryDevelopmentContract" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           <element name="TerritoryDevelopmentPlanProject" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           <element name="TerritoryDevelopmentEngineeringSupportScheme" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *         </sequence>
         *         <sequence>
         *           <element name="TopographicMap" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           <element name="IsTopographicMapActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         </sequence>
         *         <element name="SituationPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
         *         <sequence>
         *           <element name="LandBorderScheme" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           <sequence>
         *             <element name="LandPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *             <element name="IsLandPlanActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *           </sequence>
         *           <element name="MeteringDeviceDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           <element name="LandCharacteristics" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           <sequence>
         *             <element name="UseAnotherWaterSupplySystem" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *             <element name="UseOwnHotWaterSystem" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *             <element name="UseAnotherSewageSystem" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           </sequence>
         *           <sequence>
         *             <element name="ColdAndSewageWaterBalanceDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *             <element name="HotWaterBalanceDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           </sequence>
         *           <sequence>
         *             <element name="PPTDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *             <element name="PMTDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           </sequence>
         *           <sequence>
         *             <element name="ReliefPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *             <element name="WellPosition" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *             <element name="RoomPlan" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           </sequence>
         *           <choice minOccurs="0">
         *             <element name="EngineeringSurveyResults" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
         *             <element name="EngineeringSurveyResultsLink" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type"/>
         *           </choice>
         *         </sequence>
         *         <sequence>
         *           <element name="ApplicantBankDetails" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *           <element name="BuildingPermitDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "landRightsDocument",
            "isLandRightsDocumentsActual",
            "territoryDevelopmentContract",
            "territoryDevelopmentPlanProject",
            "territoryDevelopmentEngineeringSupportScheme",
            "topographicMap",
            "isTopographicMapActual",
            "situationPlan",
            "landBorderScheme",
            "landPlan",
            "isLandPlanActual",
            "meteringDeviceDocument",
            "landCharacteristics",
            "useAnotherWaterSupplySystem",
            "useOwnHotWaterSystem",
            "useAnotherSewageSystem",
            "coldAndSewageWaterBalanceDocument",
            "hotWaterBalanceDocument",
            "pptDocument",
            "pmtDocument",
            "reliefPlan",
            "wellPosition",
            "roomPlan",
            "engineeringSurveyResults",
            "engineeringSurveyResultsLink",
            "applicantBankDetails",
            "buildingPermitDocument"
        })
        public static class Documents {

            /**
             * Правоустанавливающий или правоудостоверяющий документ на земельный участок
             * 
             */
            @XmlElement(name = "LandRightsDocument")
            protected AttachedDocumentType landRightsDocument;
            /**
             * Срок действия ранее предоставляемых правоустанавливающих документов на земельный участок не истек, и сведения, содержащиеся в документах, не изменились
             * 
             */
            @XmlElement(name = "IsLandRightsDocumentsActual")
            protected Boolean isLandRightsDocumentsActual;
            /**
             * Копия договора о комплексном развитии территории
             * 
             */
            @XmlElement(name = "TerritoryDevelopmentContract")
            protected AttachedDocumentType territoryDevelopmentContract;
            /**
             * Проект планировки территории комплексного развития
             * 
             */
            @XmlElement(name = "TerritoryDevelopmentPlanProject")
            protected AttachedDocumentType territoryDevelopmentPlanProject;
            /**
             * Комплексная схема инженерного обеспечения территории комплексного развития
             * 
             */
            @XmlElement(name = "TerritoryDevelopmentEngineeringSupportScheme")
            protected AttachedDocumentType territoryDevelopmentEngineeringSupportScheme;
            /**
             * Топографическая карта земельного участка
             * 
             */
            @XmlElement(name = "TopographicMap")
            protected AttachedDocumentType topographicMap;
            /**
             * Срок действия ранее предоставляемой топографической карты не истек, и сведения, содержащиеся в документе, не изменились
             * 
             */
            @XmlElement(name = "IsTopographicMapActual")
            protected Boolean isTopographicMapActual;
            /**
             * Ситуационный план расположения объекта с привязкой к территории населенного пункта
             * 
             */
            @XmlElement(name = "SituationPlan", required = true)
            protected AttachedDocumentType situationPlan;
            /**
             * Схема расположения земельного участка или земельных участков на кадастровом плане территории, градостроительном плане земельного участка
             * 
             */
            @XmlElement(name = "LandBorderScheme")
            protected AttachedDocumentType landBorderScheme;
            /**
             * Градостроительный план земельного участка
             * 
             */
            @XmlElement(name = "LandPlan")
            protected AttachedDocumentType landPlan;
            /**
             * Срок действия ранее предоставляемого градостроительного плана земельного участка не истек, и сведения, содержащиеся в документе, не изменились
             * 
             */
            @XmlElement(name = "IsLandPlanActual")
            protected Boolean isLandPlanActual;
            /**
             * Сведения о расположении  средств  измерений  и  приборов  учета горячей воды, холодной воды и сточных вод
             * 
             */
            @XmlElement(name = "MeteringDeviceDocument")
            protected AttachedDocumentType meteringDeviceDocument;
            /**
             * Информация о площади и характеристике покрытия земельного участка, с которого осуществляется (будет осуществляться) сброс поверхностных сточных вод в централизованную ливневую систему водоотведения, в том числе неорганизованный сброс поверхностных сточных вод
             * 
             */
            @XmlElement(name = "LandCharacteristics")
            protected AttachedDocumentType landCharacteristics;
            /**
             * Файлы с информацией о наличии иных источников водоснабжения, кроме централизованных систем горячего и холодного водоснабжения с указанием объемов горячей и холодной воды, получаемой из таких иных источников водоснабжения
             * 
             */
            @XmlElement(name = "UseAnotherWaterSupplySystem")
            protected AttachedDocumentType useAnotherWaterSupplySystem;
            /**
             * Информация о наличии и возможности использования собственной нецентрализованной системы горячего водоснабжения (с указанием мощности и режима работы)
             * 
             */
            @XmlElement(name = "UseOwnHotWaterSystem")
            protected AttachedDocumentType useOwnHotWaterSystem;
            /**
             * Информация о наличии и возможности использования иных способов отведения сточных вод
             * 
             */
            @XmlElement(name = "UseAnotherSewageSystem")
            protected AttachedDocumentType useAnotherSewageSystem;
            /**
             * Баланс водопотребления и водоотведения подключаемого объекта в период использования максимальной величины мощности (нагрузки)
             * 
             */
            @XmlElement(name = "ColdAndSewageWaterBalanceDocument")
            protected AttachedDocumentType coldAndSewageWaterBalanceDocument;
            /**
             * Баланс потребления горячей воды подключаемого объекта (с указанием целей использования горячей воды)
             * 
             */
            @XmlElement(name = "HotWaterBalanceDocument")
            protected AttachedDocumentType hotWaterBalanceDocument;
            /**
             * Проект планировки территории
             * 
             */
            @XmlElement(name = "PPTDocument")
            protected AttachedDocumentType pptDocument;
            /**
             * Проект межевания территории
             * 
             */
            @XmlElement(name = "PMTDocument")
            protected AttachedDocumentType pmtDocument;
            /**
             * План организации рельефа (вертикальная планировка) земельного участка
             * 
             */
            @XmlElement(name = "ReliefPlan")
            protected AttachedDocumentType reliefPlan;
            /**
             * Планово-высотное положение проектируемого канализационного колодца
             * 
             */
            @XmlElement(name = "WellPosition")
            protected AttachedDocumentType wellPosition;
            /**
             * План колодца, подвального помещения (техподполья) или иного помещения (иных помещений)
             * 
             */
            @XmlElement(name = "RoomPlan")
            protected AttachedDocumentType roomPlan;
            /**
             * Результаты инженерных изысканий
             * 
             */
            @XmlElement(name = "EngineeringSurveyResults")
            protected AttachedDocumentType engineeringSurveyResults;
            /**
             * Ссылка на заключение в ЕГРЗ, содержащее результаты инженерных изысканий
             * 
             */
            @XmlElement(name = "EngineeringSurveyResultsLink")
            protected String engineeringSurveyResultsLink;
            /**
             * Действующие банковские реквизиты
             * 
             */
            @XmlElement(name = "ApplicantBankDetails")
            protected AttachedDocumentType applicantBankDetails;
            /**
             * Разрешение на строительство
             * 
             */
            @XmlElement(name = "BuildingPermitDocument")
            protected AttachedDocumentType buildingPermitDocument;

            /**
             * Правоустанавливающий или правоудостоверяющий документ на земельный участок
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getLandRightsDocument() {
                return landRightsDocument;
            }

            /**
             * Sets the value of the landRightsDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getLandRightsDocument()
             */
            public void setLandRightsDocument(AttachedDocumentType value) {
                this.landRightsDocument = value;
            }

            /**
             * Срок действия ранее предоставляемых правоустанавливающих документов на земельный участок не истек, и сведения, содержащиеся в документах, не изменились
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLandRightsDocumentsActual() {
                return isLandRightsDocumentsActual;
            }

            /**
             * Sets the value of the isLandRightsDocumentsActual property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsLandRightsDocumentsActual()
             */
            public void setIsLandRightsDocumentsActual(Boolean value) {
                this.isLandRightsDocumentsActual = value;
            }

            /**
             * Копия договора о комплексном развитии территории
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getTerritoryDevelopmentContract() {
                return territoryDevelopmentContract;
            }

            /**
             * Sets the value of the territoryDevelopmentContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getTerritoryDevelopmentContract()
             */
            public void setTerritoryDevelopmentContract(AttachedDocumentType value) {
                this.territoryDevelopmentContract = value;
            }

            /**
             * Проект планировки территории комплексного развития
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getTerritoryDevelopmentPlanProject() {
                return territoryDevelopmentPlanProject;
            }

            /**
             * Sets the value of the territoryDevelopmentPlanProject property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getTerritoryDevelopmentPlanProject()
             */
            public void setTerritoryDevelopmentPlanProject(AttachedDocumentType value) {
                this.territoryDevelopmentPlanProject = value;
            }

            /**
             * Комплексная схема инженерного обеспечения территории комплексного развития
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getTerritoryDevelopmentEngineeringSupportScheme() {
                return territoryDevelopmentEngineeringSupportScheme;
            }

            /**
             * Sets the value of the territoryDevelopmentEngineeringSupportScheme property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getTerritoryDevelopmentEngineeringSupportScheme()
             */
            public void setTerritoryDevelopmentEngineeringSupportScheme(AttachedDocumentType value) {
                this.territoryDevelopmentEngineeringSupportScheme = value;
            }

            /**
             * Топографическая карта земельного участка
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getTopographicMap() {
                return topographicMap;
            }

            /**
             * Sets the value of the topographicMap property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getTopographicMap()
             */
            public void setTopographicMap(AttachedDocumentType value) {
                this.topographicMap = value;
            }

            /**
             * Срок действия ранее предоставляемой топографической карты не истек, и сведения, содержащиеся в документе, не изменились
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsTopographicMapActual() {
                return isTopographicMapActual;
            }

            /**
             * Sets the value of the isTopographicMapActual property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsTopographicMapActual()
             */
            public void setIsTopographicMapActual(Boolean value) {
                this.isTopographicMapActual = value;
            }

            /**
             * Ситуационный план расположения объекта с привязкой к территории населенного пункта
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getSituationPlan() {
                return situationPlan;
            }

            /**
             * Sets the value of the situationPlan property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getSituationPlan()
             */
            public void setSituationPlan(AttachedDocumentType value) {
                this.situationPlan = value;
            }

            /**
             * Схема расположения земельного участка или земельных участков на кадастровом плане территории, градостроительном плане земельного участка
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getLandBorderScheme() {
                return landBorderScheme;
            }

            /**
             * Sets the value of the landBorderScheme property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getLandBorderScheme()
             */
            public void setLandBorderScheme(AttachedDocumentType value) {
                this.landBorderScheme = value;
            }

            /**
             * Градостроительный план земельного участка
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getLandPlan() {
                return landPlan;
            }

            /**
             * Sets the value of the landPlan property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getLandPlan()
             */
            public void setLandPlan(AttachedDocumentType value) {
                this.landPlan = value;
            }

            /**
             * Срок действия ранее предоставляемого градостроительного плана земельного участка не истек, и сведения, содержащиеся в документе, не изменились
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsLandPlanActual() {
                return isLandPlanActual;
            }

            /**
             * Sets the value of the isLandPlanActual property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsLandPlanActual()
             */
            public void setIsLandPlanActual(Boolean value) {
                this.isLandPlanActual = value;
            }

            /**
             * Сведения о расположении  средств  измерений  и  приборов  учета горячей воды, холодной воды и сточных вод
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getMeteringDeviceDocument() {
                return meteringDeviceDocument;
            }

            /**
             * Sets the value of the meteringDeviceDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getMeteringDeviceDocument()
             */
            public void setMeteringDeviceDocument(AttachedDocumentType value) {
                this.meteringDeviceDocument = value;
            }

            /**
             * Информация о площади и характеристике покрытия земельного участка, с которого осуществляется (будет осуществляться) сброс поверхностных сточных вод в централизованную ливневую систему водоотведения, в том числе неорганизованный сброс поверхностных сточных вод
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getLandCharacteristics() {
                return landCharacteristics;
            }

            /**
             * Sets the value of the landCharacteristics property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getLandCharacteristics()
             */
            public void setLandCharacteristics(AttachedDocumentType value) {
                this.landCharacteristics = value;
            }

            /**
             * Файлы с информацией о наличии иных источников водоснабжения, кроме централизованных систем горячего и холодного водоснабжения с указанием объемов горячей и холодной воды, получаемой из таких иных источников водоснабжения
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getUseAnotherWaterSupplySystem() {
                return useAnotherWaterSupplySystem;
            }

            /**
             * Sets the value of the useAnotherWaterSupplySystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getUseAnotherWaterSupplySystem()
             */
            public void setUseAnotherWaterSupplySystem(AttachedDocumentType value) {
                this.useAnotherWaterSupplySystem = value;
            }

            /**
             * Информация о наличии и возможности использования собственной нецентрализованной системы горячего водоснабжения (с указанием мощности и режима работы)
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getUseOwnHotWaterSystem() {
                return useOwnHotWaterSystem;
            }

            /**
             * Sets the value of the useOwnHotWaterSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getUseOwnHotWaterSystem()
             */
            public void setUseOwnHotWaterSystem(AttachedDocumentType value) {
                this.useOwnHotWaterSystem = value;
            }

            /**
             * Информация о наличии и возможности использования иных способов отведения сточных вод
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getUseAnotherSewageSystem() {
                return useAnotherSewageSystem;
            }

            /**
             * Sets the value of the useAnotherSewageSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getUseAnotherSewageSystem()
             */
            public void setUseAnotherSewageSystem(AttachedDocumentType value) {
                this.useAnotherSewageSystem = value;
            }

            /**
             * Баланс водопотребления и водоотведения подключаемого объекта в период использования максимальной величины мощности (нагрузки)
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getColdAndSewageWaterBalanceDocument() {
                return coldAndSewageWaterBalanceDocument;
            }

            /**
             * Sets the value of the coldAndSewageWaterBalanceDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getColdAndSewageWaterBalanceDocument()
             */
            public void setColdAndSewageWaterBalanceDocument(AttachedDocumentType value) {
                this.coldAndSewageWaterBalanceDocument = value;
            }

            /**
             * Баланс потребления горячей воды подключаемого объекта (с указанием целей использования горячей воды)
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getHotWaterBalanceDocument() {
                return hotWaterBalanceDocument;
            }

            /**
             * Sets the value of the hotWaterBalanceDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getHotWaterBalanceDocument()
             */
            public void setHotWaterBalanceDocument(AttachedDocumentType value) {
                this.hotWaterBalanceDocument = value;
            }

            /**
             * Проект планировки территории
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getPPTDocument() {
                return pptDocument;
            }

            /**
             * Sets the value of the pptDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getPPTDocument()
             */
            public void setPPTDocument(AttachedDocumentType value) {
                this.pptDocument = value;
            }

            /**
             * Проект межевания территории
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getPMTDocument() {
                return pmtDocument;
            }

            /**
             * Sets the value of the pmtDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getPMTDocument()
             */
            public void setPMTDocument(AttachedDocumentType value) {
                this.pmtDocument = value;
            }

            /**
             * План организации рельефа (вертикальная планировка) земельного участка
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getReliefPlan() {
                return reliefPlan;
            }

            /**
             * Sets the value of the reliefPlan property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getReliefPlan()
             */
            public void setReliefPlan(AttachedDocumentType value) {
                this.reliefPlan = value;
            }

            /**
             * Планово-высотное положение проектируемого канализационного колодца
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getWellPosition() {
                return wellPosition;
            }

            /**
             * Sets the value of the wellPosition property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getWellPosition()
             */
            public void setWellPosition(AttachedDocumentType value) {
                this.wellPosition = value;
            }

            /**
             * План колодца, подвального помещения (техподполья) или иного помещения (иных помещений)
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getRoomPlan() {
                return roomPlan;
            }

            /**
             * Sets the value of the roomPlan property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getRoomPlan()
             */
            public void setRoomPlan(AttachedDocumentType value) {
                this.roomPlan = value;
            }

            /**
             * Результаты инженерных изысканий
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getEngineeringSurveyResults() {
                return engineeringSurveyResults;
            }

            /**
             * Sets the value of the engineeringSurveyResults property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getEngineeringSurveyResults()
             */
            public void setEngineeringSurveyResults(AttachedDocumentType value) {
                this.engineeringSurveyResults = value;
            }

            /**
             * Ссылка на заключение в ЕГРЗ, содержащее результаты инженерных изысканий
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEngineeringSurveyResultsLink() {
                return engineeringSurveyResultsLink;
            }

            /**
             * Sets the value of the engineeringSurveyResultsLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getEngineeringSurveyResultsLink()
             */
            public void setEngineeringSurveyResultsLink(String value) {
                this.engineeringSurveyResultsLink = value;
            }

            /**
             * Действующие банковские реквизиты
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getApplicantBankDetails() {
                return applicantBankDetails;
            }

            /**
             * Sets the value of the applicantBankDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getApplicantBankDetails()
             */
            public void setApplicantBankDetails(AttachedDocumentType value) {
                this.applicantBankDetails = value;
            }

            /**
             * Разрешение на строительство
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getBuildingPermitDocument() {
                return buildingPermitDocument;
            }

            /**
             * Sets the value of the buildingPermitDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getBuildingPermitDocument()
             */
            public void setBuildingPermitDocument(AttachedDocumentType value) {
                this.buildingPermitDocument = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FacilityCommonType">
         *       <sequence minOccurs="0">
         *         <element name="BuildingRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
         *         <element name="IsBuildingRightsDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         <choice>
         *           <choice minOccurs="0">
         *             <choice minOccurs="0">
         *               <element name="ExpectedCommissioningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *               <element name="ExpectedEndOfConstructionNotificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *             </choice>
         *             <element name="ExpectedEndOfConstructionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *           </choice>
         *           <element name="PlannedConnectionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         </choice>
         *         <element name="FloorCount" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FloorCountType"/>
         *         <element name="BuildingHeight" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}BuildingHeightType" minOccurs="0"/>
         *         <element name="BuildingVolume" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}BuildingVolumeType" minOccurs="0"/>
         *         <element name="BuildingSquare" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}SquareType" minOccurs="0"/>
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
            "buildingRightsDocument",
            "isBuildingRightsDocumentActual",
            "expectedCommissioningDate",
            "expectedEndOfConstructionNotificationDate",
            "expectedEndOfConstructionDate",
            "plannedConnectionDate",
            "floorCount",
            "buildingHeight",
            "buildingVolume",
            "buildingSquare"
        })
        public static class Facility
            extends FacilityCommonType
        {

            /**
             * Правоустанавливающий или правоудостоверяющий документ на подключаемый объект
             * 
             */
            @XmlElement(name = "BuildingRightsDocument")
            protected AttachedDocumentType buildingRightsDocument;
            /**
             * Срок действия ранее предоставляемых правоустанавливающих документов на объект не истек, и сведения, содержащиеся в документах, не изменились
             * 
             */
            @XmlElement(name = "IsBuildingRightsDocumentActual")
            protected Boolean isBuildingRightsDocumentActual;
            /**
             * Планируемый срок ввода в эксплуатацию объекта
             * 
             */
            @XmlElement(name = "ExpectedCommissioningDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar expectedCommissioningDate;
            /**
             * Планируемая дата согласования уведомления об окончании строительства
             * 
             */
            @XmlElement(name = "ExpectedEndOfConstructionNotificationDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar expectedEndOfConstructionNotificationDate;
            /**
             * Планируемый срок завершения строительства объекта
             * 
             */
            @XmlElement(name = "ExpectedEndOfConstructionDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar expectedEndOfConstructionDate;
            /**
             * Планируемая дата подключения объекта к системе теплоснабжения
             * 
             */
            @XmlElement(name = "PlannedConnectionDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar plannedConnectionDate;
            /**
             * Количество этажей
             * 
             */
            @XmlElement(name = "FloorCount")
            protected Integer floorCount;
            /**
             * Высота здания/строение/сооружения (м)
             * 
             */
            @XmlElement(name = "BuildingHeight")
            protected BigDecimal buildingHeight;
            /**
             * Строительный объем (куб.м)
             * 
             */
            @XmlElement(name = "BuildingVolume")
            protected BigDecimal buildingVolume;
            /**
             * Площадь (кв.м)
             * 
             */
            @XmlElement(name = "BuildingSquare")
            protected BigDecimal buildingSquare;

            /**
             * Правоустанавливающий или правоудостоверяющий документ на подключаемый объект
             * 
             * @return
             *     possible object is
             *     {@link AttachedDocumentType }
             *     
             */
            public AttachedDocumentType getBuildingRightsDocument() {
                return buildingRightsDocument;
            }

            /**
             * Sets the value of the buildingRightsDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttachedDocumentType }
             *     
             * @see #getBuildingRightsDocument()
             */
            public void setBuildingRightsDocument(AttachedDocumentType value) {
                this.buildingRightsDocument = value;
            }

            /**
             * Срок действия ранее предоставляемых правоустанавливающих документов на объект не истек, и сведения, содержащиеся в документах, не изменились
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsBuildingRightsDocumentActual() {
                return isBuildingRightsDocumentActual;
            }

            /**
             * Sets the value of the isBuildingRightsDocumentActual property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsBuildingRightsDocumentActual()
             */
            public void setIsBuildingRightsDocumentActual(Boolean value) {
                this.isBuildingRightsDocumentActual = value;
            }

            /**
             * Планируемый срок ввода в эксплуатацию объекта
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExpectedCommissioningDate() {
                return expectedCommissioningDate;
            }

            /**
             * Sets the value of the expectedCommissioningDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getExpectedCommissioningDate()
             */
            public void setExpectedCommissioningDate(XMLGregorianCalendar value) {
                this.expectedCommissioningDate = value;
            }

            /**
             * Планируемая дата согласования уведомления об окончании строительства
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExpectedEndOfConstructionNotificationDate() {
                return expectedEndOfConstructionNotificationDate;
            }

            /**
             * Sets the value of the expectedEndOfConstructionNotificationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getExpectedEndOfConstructionNotificationDate()
             */
            public void setExpectedEndOfConstructionNotificationDate(XMLGregorianCalendar value) {
                this.expectedEndOfConstructionNotificationDate = value;
            }

            /**
             * Планируемый срок завершения строительства объекта
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExpectedEndOfConstructionDate() {
                return expectedEndOfConstructionDate;
            }

            /**
             * Sets the value of the expectedEndOfConstructionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getExpectedEndOfConstructionDate()
             */
            public void setExpectedEndOfConstructionDate(XMLGregorianCalendar value) {
                this.expectedEndOfConstructionDate = value;
            }

            /**
             * Планируемая дата подключения объекта к системе теплоснабжения
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPlannedConnectionDate() {
                return plannedConnectionDate;
            }

            /**
             * Sets the value of the plannedConnectionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getPlannedConnectionDate()
             */
            public void setPlannedConnectionDate(XMLGregorianCalendar value) {
                this.plannedConnectionDate = value;
            }

            /**
             * Количество этажей
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFloorCount() {
                return floorCount;
            }

            /**
             * Sets the value of the floorCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             * @see #getFloorCount()
             */
            public void setFloorCount(Integer value) {
                this.floorCount = value;
            }

            /**
             * Высота здания/строение/сооружения (м)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBuildingHeight() {
                return buildingHeight;
            }

            /**
             * Sets the value of the buildingHeight property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getBuildingHeight()
             */
            public void setBuildingHeight(BigDecimal value) {
                this.buildingHeight = value;
            }

            /**
             * Строительный объем (куб.м)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBuildingVolume() {
                return buildingVolume;
            }

            /**
             * Sets the value of the buildingVolume property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getBuildingVolume()
             */
            public void setBuildingVolume(BigDecimal value) {
                this.buildingVolume = value;
            }

            /**
             * Площадь (кв.м)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBuildingSquare() {
                return buildingSquare;
            }

            /**
             * Sets the value of the buildingSquare property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getBuildingSquare()
             */
            public void setBuildingSquare(BigDecimal value) {
                this.buildingSquare = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}LandCommonType">
         *       <sequence>
         *         <element name="PermittedUse" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" minOccurs="0"/>
         *         <element name="LandSquare" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}SquareType" minOccurs="0"/>
         *         <element name="BuildingFloorLimit" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FloorCountType" minOccurs="0"/>
         *         <element name="BuildingHeightLimit" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}BuildingHeightType" minOccurs="0"/>
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
            "permittedUse",
            "landSquare",
            "buildingFloorLimit",
            "buildingHeightLimit"
        })
        public static class Land
            extends LandCommonType
        {

            /**
             * Вид разрешенного использования земельного участка. Справочник "Вид разрешенного использования земельного участка" ЕСНСИ
             * 
             */
            @XmlElement(name = "PermittedUse")
            protected EsnsiItemType permittedUse;
            /**
             * Площадь земельного участка (кв.м.)
             * 
             */
            @XmlElement(name = "LandSquare")
            protected BigDecimal landSquare;
            /**
             * Предельное количество этажей
             * 
             */
            @XmlElement(name = "BuildingFloorLimit")
            protected Integer buildingFloorLimit;
            /**
             * Предельная высота здания/сооружения (м.)
             * 
             */
            @XmlElement(name = "BuildingHeightLimit")
            protected BigDecimal buildingHeightLimit;

            /**
             * Вид разрешенного использования земельного участка. Справочник "Вид разрешенного использования земельного участка" ЕСНСИ
             * 
             * @return
             *     possible object is
             *     {@link EsnsiItemType }
             *     
             */
            public EsnsiItemType getPermittedUse() {
                return permittedUse;
            }

            /**
             * Sets the value of the permittedUse property.
             * 
             * @param value
             *     allowed object is
             *     {@link EsnsiItemType }
             *     
             * @see #getPermittedUse()
             */
            public void setPermittedUse(EsnsiItemType value) {
                this.permittedUse = value;
            }

            /**
             * Площадь земельного участка (кв.м.)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLandSquare() {
                return landSquare;
            }

            /**
             * Sets the value of the landSquare property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getLandSquare()
             */
            public void setLandSquare(BigDecimal value) {
                this.landSquare = value;
            }

            /**
             * Предельное количество этажей
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getBuildingFloorLimit() {
                return buildingFloorLimit;
            }

            /**
             * Sets the value of the buildingFloorLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             * @see #getBuildingFloorLimit()
             */
            public void setBuildingFloorLimit(Integer value) {
                this.buildingFloorLimit = value;
            }

            /**
             * Предельная высота здания/сооружения (м.)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBuildingHeightLimit() {
                return buildingHeightLimit;
            }

            /**
             * Sets the value of the buildingHeightLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getBuildingHeightLimit()
             */
            public void setBuildingHeightLimit(BigDecimal value) {
                this.buildingHeightLimit = value;
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
         *         <element name="NetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
         *         <element name="ConnectedResource" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" maxOccurs="unbounded" minOccurs="0"/>
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
            "networkType",
            "connectedResource"
        })
        public static class Network {

            /**
             * Вид сети для технологического присоединения. Справочник "Виды сетей для технологического присоединения"
             * 
             */
            @XmlElement(name = "NetworkType", required = true)
            protected List<NsiRef> networkType;
            /**
             * Подключаемый ресурс. Справочник "Вид ресурсов или услуг, доступный для подключения" в ЕСНСИ
             * 
             */
            @XmlElement(name = "ConnectedResource")
            protected List<EsnsiItemType> connectedResource;

            /**
             * Вид сети для технологического присоединения. Справочник "Виды сетей для технологического присоединения"
             * 
             * Gets the value of the networkType property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the networkType property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getNetworkType().add(newItem);
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
             *     The value of the networkType property.
             */
            public List<NsiRef> getNetworkType() {
                if (networkType == null) {
                    networkType = new ArrayList<>();
                }
                return this.networkType;
            }

            /**
             * Подключаемый ресурс. Справочник "Вид ресурсов или услуг, доступный для подключения" в ЕСНСИ
             * 
             * Gets the value of the connectedResource property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the connectedResource property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getConnectedResource().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EsnsiItemType }
             * </p>
             * 
             * 
             * @return
             *     The value of the connectedResource property.
             */
            public List<EsnsiItemType> getConnectedResource() {
                if (connectedResource == null) {
                    connectedResource = new ArrayList<>();
                }
                return this.connectedResource;
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
         *         <sequence>
         *           <element name="PluggableWaterLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}WaterSupplyPowerDetailsType"/>
         *           <element name="CurrentWaterLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}WaterSupplyPowerDetailsType" minOccurs="0"/>
         *         </sequence>
         *         <sequence>
         *           <element name="PluggableHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType"/>
         *           <element name="CurrentHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType" minOccurs="0"/>
         *           <element name="AdditionalHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType" minOccurs="0"/>
         *           <element name="HeatTransfer" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatTransferType" maxOccurs="unbounded" minOccurs="0"/>
         *           <element name="ReturnHeatTransferInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type" minOccurs="0"/>
         *           <element name="HeatConsumptionInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingConsumptionInfoType"/>
         *           <element name="MeteringUnitLocation" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
         *           <element name="ReliabilityCategory" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
         *           <element name="AdditionalRequiementToReliability" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
         *           <element name="OwnSources" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
         *           <element name="TemperatureGraph" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingTemperatureGraphType" minOccurs="0"/>
         *         </sequence>
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
            "pluggableWaterLoad",
            "currentWaterLoad",
            "pluggableHeatLoad",
            "currentHeatLoad",
            "additionalHeatLoad",
            "heatTransfer",
            "returnHeatTransferInfo",
            "heatConsumptionInfo",
            "meteringUnitLocation",
            "reliabilityCategory",
            "additionalRequiementToReliability",
            "ownSources",
            "temperatureGraph"
        })
        public static class ObjectTechnicalParameters {

            /**
             * Подключаемая мощность (нагрузка) по водоснабжени и (или) водоотведению
             * 
             */
            @XmlElement(name = "PluggableWaterLoad")
            protected WaterSupplyPowerDetailsType pluggableWaterLoad;
            /**
             * Текущая подключеная мощность (нагрузка) по водоснабжени и (или) водоотведению
             * 
             */
            @XmlElement(name = "CurrentWaterLoad")
            protected WaterSupplyPowerDetailsType currentWaterLoad;
            /**
             * Подключаемая мощность (нагрузка) по теплоснабжению
             * 
             */
            @XmlElement(name = "PluggableHeatLoad")
            protected HeatingPowerDetailsType pluggableHeatLoad;
            /**
             * Текущая мощность (нагрузка) по теплоснабжению
             * 
             */
            @XmlElement(name = "CurrentHeatLoad")
            protected HeatingPowerDetailsType currentHeatLoad;
            /**
             * Текущая мощность (нагрузка) по теплоснабжению
             * 
             */
            @XmlElement(name = "AdditionalHeatLoad")
            protected HeatingPowerDetailsType additionalHeatLoad;
            /**
             * Сведения о теплоносителе
             * 
             */
            @XmlElement(name = "HeatTransfer")
            protected List<HeatTransferType> heatTransfer;
            /**
             * Сведения о параметрах возвращаемого теплоносителя
             * 
             */
            @XmlElement(name = "ReturnHeatTransferInfo")
            protected String returnHeatTransferInfo;
            /**
             * Сведения о теплопотреблении
             * 
             */
            @XmlElement(name = "HeatConsumptionInfo")
            protected HeatingConsumptionInfoType heatConsumptionInfo;
            /**
             * Сведения о расположения узла учета тепловой энергии и теплоносителей и контроля их качества
             * 
             */
            @XmlElement(name = "MeteringUnitLocation")
            protected String meteringUnitLocation;
            /**
             * Категория надежности. Справочник "Категория надежности теплоснабжения подключаемого объекта" ЕСНСИ
             * 
             */
            @XmlElement(name = "ReliabilityCategory")
            protected EsnsiItemType reliabilityCategory;
            /**
             * Дополнительные требования к надежности теплоснабжения
             * 
             */
            @XmlElement(name = "AdditionalRequiementToReliability")
            protected String additionalRequiementToReliability;
            /**
             * Сведения о наличии и возможности использования собственных источников тепловой энергии
             * 
             */
            @XmlElement(name = "OwnSources")
            protected String ownSources;
            /**
             * Температурный график (предполагаемый)
             * 
             */
            @XmlElement(name = "TemperatureGraph")
            protected HeatingTemperatureGraphType temperatureGraph;

            /**
             * Подключаемая мощность (нагрузка) по водоснабжени и (или) водоотведению
             * 
             * @return
             *     possible object is
             *     {@link WaterSupplyPowerDetailsType }
             *     
             */
            public WaterSupplyPowerDetailsType getPluggableWaterLoad() {
                return pluggableWaterLoad;
            }

            /**
             * Sets the value of the pluggableWaterLoad property.
             * 
             * @param value
             *     allowed object is
             *     {@link WaterSupplyPowerDetailsType }
             *     
             * @see #getPluggableWaterLoad()
             */
            public void setPluggableWaterLoad(WaterSupplyPowerDetailsType value) {
                this.pluggableWaterLoad = value;
            }

            /**
             * Текущая подключеная мощность (нагрузка) по водоснабжени и (или) водоотведению
             * 
             * @return
             *     possible object is
             *     {@link WaterSupplyPowerDetailsType }
             *     
             */
            public WaterSupplyPowerDetailsType getCurrentWaterLoad() {
                return currentWaterLoad;
            }

            /**
             * Sets the value of the currentWaterLoad property.
             * 
             * @param value
             *     allowed object is
             *     {@link WaterSupplyPowerDetailsType }
             *     
             * @see #getCurrentWaterLoad()
             */
            public void setCurrentWaterLoad(WaterSupplyPowerDetailsType value) {
                this.currentWaterLoad = value;
            }

            /**
             * Подключаемая мощность (нагрузка) по теплоснабжению
             * 
             * @return
             *     possible object is
             *     {@link HeatingPowerDetailsType }
             *     
             */
            public HeatingPowerDetailsType getPluggableHeatLoad() {
                return pluggableHeatLoad;
            }

            /**
             * Sets the value of the pluggableHeatLoad property.
             * 
             * @param value
             *     allowed object is
             *     {@link HeatingPowerDetailsType }
             *     
             * @see #getPluggableHeatLoad()
             */
            public void setPluggableHeatLoad(HeatingPowerDetailsType value) {
                this.pluggableHeatLoad = value;
            }

            /**
             * Текущая мощность (нагрузка) по теплоснабжению
             * 
             * @return
             *     possible object is
             *     {@link HeatingPowerDetailsType }
             *     
             */
            public HeatingPowerDetailsType getCurrentHeatLoad() {
                return currentHeatLoad;
            }

            /**
             * Sets the value of the currentHeatLoad property.
             * 
             * @param value
             *     allowed object is
             *     {@link HeatingPowerDetailsType }
             *     
             * @see #getCurrentHeatLoad()
             */
            public void setCurrentHeatLoad(HeatingPowerDetailsType value) {
                this.currentHeatLoad = value;
            }

            /**
             * Текущая мощность (нагрузка) по теплоснабжению
             * 
             * @return
             *     possible object is
             *     {@link HeatingPowerDetailsType }
             *     
             */
            public HeatingPowerDetailsType getAdditionalHeatLoad() {
                return additionalHeatLoad;
            }

            /**
             * Sets the value of the additionalHeatLoad property.
             * 
             * @param value
             *     allowed object is
             *     {@link HeatingPowerDetailsType }
             *     
             * @see #getAdditionalHeatLoad()
             */
            public void setAdditionalHeatLoad(HeatingPowerDetailsType value) {
                this.additionalHeatLoad = value;
            }

            /**
             * Сведения о теплоносителе
             * 
             * Gets the value of the heatTransfer property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the heatTransfer property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getHeatTransfer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link HeatTransferType }
             * </p>
             * 
             * 
             * @return
             *     The value of the heatTransfer property.
             */
            public List<HeatTransferType> getHeatTransfer() {
                if (heatTransfer == null) {
                    heatTransfer = new ArrayList<>();
                }
                return this.heatTransfer;
            }

            /**
             * Сведения о параметрах возвращаемого теплоносителя
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReturnHeatTransferInfo() {
                return returnHeatTransferInfo;
            }

            /**
             * Sets the value of the returnHeatTransferInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getReturnHeatTransferInfo()
             */
            public void setReturnHeatTransferInfo(String value) {
                this.returnHeatTransferInfo = value;
            }

            /**
             * Сведения о теплопотреблении
             * 
             * @return
             *     possible object is
             *     {@link HeatingConsumptionInfoType }
             *     
             */
            public HeatingConsumptionInfoType getHeatConsumptionInfo() {
                return heatConsumptionInfo;
            }

            /**
             * Sets the value of the heatConsumptionInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link HeatingConsumptionInfoType }
             *     
             * @see #getHeatConsumptionInfo()
             */
            public void setHeatConsumptionInfo(HeatingConsumptionInfoType value) {
                this.heatConsumptionInfo = value;
            }

            /**
             * Сведения о расположения узла учета тепловой энергии и теплоносителей и контроля их качества
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMeteringUnitLocation() {
                return meteringUnitLocation;
            }

            /**
             * Sets the value of the meteringUnitLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getMeteringUnitLocation()
             */
            public void setMeteringUnitLocation(String value) {
                this.meteringUnitLocation = value;
            }

            /**
             * Категория надежности. Справочник "Категория надежности теплоснабжения подключаемого объекта" ЕСНСИ
             * 
             * @return
             *     possible object is
             *     {@link EsnsiItemType }
             *     
             */
            public EsnsiItemType getReliabilityCategory() {
                return reliabilityCategory;
            }

            /**
             * Sets the value of the reliabilityCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link EsnsiItemType }
             *     
             * @see #getReliabilityCategory()
             */
            public void setReliabilityCategory(EsnsiItemType value) {
                this.reliabilityCategory = value;
            }

            /**
             * Дополнительные требования к надежности теплоснабжения
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalRequiementToReliability() {
                return additionalRequiementToReliability;
            }

            /**
             * Sets the value of the additionalRequiementToReliability property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getAdditionalRequiementToReliability()
             */
            public void setAdditionalRequiementToReliability(String value) {
                this.additionalRequiementToReliability = value;
            }

            /**
             * Сведения о наличии и возможности использования собственных источников тепловой энергии
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnSources() {
                return ownSources;
            }

            /**
             * Sets the value of the ownSources property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOwnSources()
             */
            public void setOwnSources(String value) {
                this.ownSources = value;
            }

            /**
             * Температурный график (предполагаемый)
             * 
             * @return
             *     possible object is
             *     {@link HeatingTemperatureGraphType }
             *     
             */
            public HeatingTemperatureGraphType getTemperatureGraph() {
                return temperatureGraph;
            }

            /**
             * Sets the value of the temperatureGraph property.
             * 
             * @param value
             *     allowed object is
             *     {@link HeatingTemperatureGraphType }
             *     
             * @see #getTemperatureGraph()
             */
            public void setTemperatureGraph(HeatingTemperatureGraphType value) {
                this.temperatureGraph = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}RepresentativeType">
         *       <sequence minOccurs="0">
         *         <element name="IsPowerOfAttorneyDocumentActual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "isPowerOfAttorneyDocumentActual"
        })
        public static class Representative
            extends RepresentativeType
        {

            /**
             * Срок действия ранее предоставляемого документа, подтверждающего полномочия представителя, не истек, и сведения, содержащиеся в документе, не изменились
             * 
             */
            @XmlElement(name = "IsPowerOfAttorneyDocumentActual")
            protected Boolean isPowerOfAttorneyDocumentActual;

            /**
             * Срок действия ранее предоставляемого документа, подтверждающего полномочия представителя, не истек, и сведения, содержащиеся в документе, не изменились
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsPowerOfAttorneyDocumentActual() {
                return isPowerOfAttorneyDocumentActual;
            }

            /**
             * Sets the value of the isPowerOfAttorneyDocumentActual property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsPowerOfAttorneyDocumentActual()
             */
            public void setIsPowerOfAttorneyDocumentActual(Boolean value) {
                this.isPowerOfAttorneyDocumentActual = value;
            }

        }

    }

}
