
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gosuslugi.dom.schema.integration.house_management package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _InheritMissingValues_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "InheritMissingValues");
    private static final QName _DemolishHouseRequest_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "demolishHouseRequest");
    private static final QName _AccountIndividualServiceGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "AccountIndividualServiceGUID");
    private static final QName _ContractGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "ContractGUID");
    private static final QName _ContractVersionGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "ContractVersionGUID");
    private static final QName _CadastralNumber_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "CadastralNumber");
    private static final QName _NoCadastralNumber_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "NoCadastralNumber");
    private static final QName _ConditionalNumber_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "ConditionalNumber");
    private static final QName _NoRSOGKNEGRPRegistered_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "No_RSO_GKN_EGRP_Registered");
    private static final QName _NoRSOGKNEGRPData_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "No_RSO_GKN_EGRP_Data");
    private static final QName _EntranceNum_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "EntranceNum");
    private static final QName _TerminationDate_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "TerminationDate");
    private static final QName _CharterGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "CharterGUID");
    private static final QName _CharterVersionGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "CharterVersionGUID");
    private static final QName _ContractStatus_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "ContractStatus");
    private static final QName _CharterStatus_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "CharterStatus");
    private static final QName _ContractObjectVersionGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "ContractObjectVersionGUID");
    private static final QName _ManagedObjectStatus_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "ManagedObjectStatus");
    private static final QName _ContractPaymentsInfoVersionGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "ContractPaymentsInfoVersionGUID");
    private static final QName _CharterPaymentsInfoVersionGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "CharterPaymentsInfoVersionGUID");
    private static final QName _LicenseRequest_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "LicenseRequest");
    private static final QName _RISUHouseRequest_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/house-management/", "RISUHouseRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gosuslugi.dom.schema.integration.house_management
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImportHouseUORequest }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest }
     */
    public ImportHouseUORequest createImportHouseUORequest() {
        return new ImportHouseUORequest();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest }
     */
    public ImportHouseOMSRequest createImportHouseOMSRequest() {
        return new ImportHouseOMSRequest();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest }
     */
    public ImportHouseESPRequest createImportHouseESPRequest() {
        return new ImportHouseESPRequest();
    }

    /**
     * Create an instance of {@link ImportAccountRequest }
     * 
     * @return
     *     the new instance of {@link ImportAccountRequest }
     */
    public ImportAccountRequest createImportAccountRequest() {
        return new ImportAccountRequest();
    }

    /**
     * Create an instance of {@link ImportAccountIndividualServicesRequest }
     * 
     * @return
     *     the new instance of {@link ImportAccountIndividualServicesRequest }
     */
    public ImportAccountIndividualServicesRequest createImportAccountIndividualServicesRequest() {
        return new ImportAccountIndividualServicesRequest();
    }

    /**
     * Create an instance of {@link ImportMeteringDeviceDataRequest }
     * 
     * @return
     *     the new instance of {@link ImportMeteringDeviceDataRequest }
     */
    public ImportMeteringDeviceDataRequest createImportMeteringDeviceDataRequest() {
        return new ImportMeteringDeviceDataRequest();
    }

    /**
     * Create an instance of {@link ImportContractRequest }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest }
     */
    public ImportContractRequest createImportContractRequest() {
        return new ImportContractRequest();
    }

    /**
     * Create an instance of {@link ImportCharterRequest }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest }
     */
    public ImportCharterRequest createImportCharterRequest() {
        return new ImportCharterRequest();
    }

    /**
     * Create an instance of {@link ExportStatusCAChRequest }
     * 
     * @return
     *     the new instance of {@link ExportStatusCAChRequest }
     */
    public ExportStatusCAChRequest createExportStatusCAChRequest() {
        return new ExportStatusCAChRequest();
    }

    /**
     * Create an instance of {@link ImportPublicPropertyContractRequest }
     * 
     * @return
     *     the new instance of {@link ImportPublicPropertyContractRequest }
     */
    public ImportPublicPropertyContractRequest createImportPublicPropertyContractRequest() {
        return new ImportPublicPropertyContractRequest();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractRequest }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractRequest }
     */
    public ImportSupplyResourceContractRequest createImportSupplyResourceContractRequest() {
        return new ImportSupplyResourceContractRequest();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractProjectRequest }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractProjectRequest }
     */
    public ImportSupplyResourceContractProjectRequest createImportSupplyResourceContractProjectRequest() {
        return new ImportSupplyResourceContractProjectRequest();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractRequest }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractRequest }
     */
    public ExportSupplyResourceContractRequest createExportSupplyResourceContractRequest() {
        return new ExportSupplyResourceContractRequest();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest }
     */
    public ImportSupplyResourceContractObjectAddressRequest createImportSupplyResourceContractObjectAddressRequest() {
        return new ImportSupplyResourceContractObjectAddressRequest();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractRequest }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractRequest }
     */
    public ExportBriefSupplyResourceContractRequest createExportBriefSupplyResourceContractRequest() {
        return new ExportBriefSupplyResourceContractRequest();
    }

    /**
     * Create an instance of {@link ImportNotificationRequest }
     * 
     * @return
     *     the new instance of {@link ImportNotificationRequest }
     */
    public ImportNotificationRequest createImportNotificationRequest() {
        return new ImportNotificationRequest();
    }

    /**
     * Create an instance of {@link ImportVotingProtocolRequest }
     * 
     * @return
     *     the new instance of {@link ImportVotingProtocolRequest }
     */
    public ImportVotingProtocolRequest createImportVotingProtocolRequest() {
        return new ImportVotingProtocolRequest();
    }

    /**
     * Create an instance of {@link ImportOwnerDecisionRequest }
     * 
     * @return
     *     the new instance of {@link ImportOwnerDecisionRequest }
     */
    public ImportOwnerDecisionRequest createImportOwnerDecisionRequest() {
        return new ImportOwnerDecisionRequest();
    }

    /**
     * Create an instance of {@link ImportOwnerRefusalRequest }
     * 
     * @return
     *     the new instance of {@link ImportOwnerRefusalRequest }
     */
    public ImportOwnerRefusalRequest createImportOwnerRefusalRequest() {
        return new ImportOwnerRefusalRequest();
    }

    /**
     * Create an instance of {@link ExportBriefSocialHireContractRequest }
     * 
     * @return
     *     the new instance of {@link ExportBriefSocialHireContractRequest }
     */
    public ExportBriefSocialHireContractRequest createExportBriefSocialHireContractRequest() {
        return new ExportBriefSocialHireContractRequest();
    }

    /**
     * Create an instance of {@link GetStateResult }
     * 
     * @return
     *     the new instance of {@link GetStateResult }
     */
    public GetStateResult createGetStateResult() {
        return new GetStateResult();
    }

    /**
     * Create an instance of {@link Owner }
     * 
     * @return
     *     the new instance of {@link Owner }
     */
    public Owner createOwner() {
        return new Owner();
    }

    /**
     * Create an instance of {@link PropertyDetails }
     * 
     * @return
     *     the new instance of {@link PropertyDetails }
     */
    public PropertyDetails createPropertyDetails() {
        return new PropertyDetails();
    }

    /**
     * Create an instance of {@link ExportPropertyDetails }
     * 
     * @return
     *     the new instance of {@link ExportPropertyDetails }
     */
    public ExportPropertyDetails createExportPropertyDetails() {
        return new ExportPropertyDetails();
    }

    /**
     * Create an instance of {@link Representative }
     * 
     * @return
     *     the new instance of {@link Representative }
     */
    public Representative createRepresentative() {
        return new Representative();
    }

    /**
     * Create an instance of {@link MunicipalResourceElectricExportType2 }
     * 
     * @return
     *     the new instance of {@link MunicipalResourceElectricExportType2 }
     */
    public MunicipalResourceElectricExportType2 createMunicipalResourceElectricExportType2() {
        return new MunicipalResourceElectricExportType2();
    }

    /**
     * Create an instance of {@link MunicipalResourceElectricExportType }
     * 
     * @return
     *     the new instance of {@link MunicipalResourceElectricExportType }
     */
    public MunicipalResourceElectricExportType createMunicipalResourceElectricExportType() {
        return new MunicipalResourceElectricExportType();
    }

    /**
     * Create an instance of {@link MunicipalResourceNotElectricExportType2 }
     * 
     * @return
     *     the new instance of {@link MunicipalResourceNotElectricExportType2 }
     */
    public MunicipalResourceNotElectricExportType2 createMunicipalResourceNotElectricExportType2() {
        return new MunicipalResourceNotElectricExportType2();
    }

    /**
     * Create an instance of {@link MunicipalResourceNotElectricExportType }
     * 
     * @return
     *     the new instance of {@link MunicipalResourceNotElectricExportType }
     */
    public MunicipalResourceNotElectricExportType createMunicipalResourceNotElectricExportType() {
        return new MunicipalResourceNotElectricExportType();
    }

    /**
     * Create an instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType }
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType createMeteringDeviceToUpdateAfterDevicesValuesType() {
        return new MeteringDeviceToUpdateAfterDevicesValuesType();
    }

    /**
     * Create an instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts }
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts createMeteringDeviceToUpdateAfterDevicesValuesTypeAddressChatacteristicts() {
        return new MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts();
    }

    /**
     * Create an instance of {@link MeteringDeviceFullInformationExportType }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceFullInformationExportType }
     */
    public MeteringDeviceFullInformationExportType createMeteringDeviceFullInformationExportType() {
        return new MeteringDeviceFullInformationExportType();
    }

    /**
     * Create an instance of {@link MeteringDeviceFullInformationType }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceFullInformationType }
     */
    public MeteringDeviceFullInformationType createMeteringDeviceFullInformationType() {
        return new MeteringDeviceFullInformationType();
    }

    /**
     * Create an instance of {@link MeteringDeviceBasicCharacteristicsType }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceBasicCharacteristicsType }
     */
    public MeteringDeviceBasicCharacteristicsType createMeteringDeviceBasicCharacteristicsType() {
        return new MeteringDeviceBasicCharacteristicsType();
    }

    /**
     * Create an instance of {@link ContractSubjectObjectAdressType }
     * 
     * @return
     *     the new instance of {@link ContractSubjectObjectAdressType }
     */
    public ContractSubjectObjectAdressType createContractSubjectObjectAdressType() {
        return new ContractSubjectObjectAdressType();
    }

    /**
     * Create an instance of {@link PublicPropertyContractExportType }
     * 
     * @return
     *     the new instance of {@link PublicPropertyContractExportType }
     */
    public PublicPropertyContractExportType createPublicPropertyContractExportType() {
        return new PublicPropertyContractExportType();
    }

    /**
     * Create an instance of {@link PublicPropertyContractExportType.RentAgrConfirmationDocument }
     * 
     * @return
     *     the new instance of {@link PublicPropertyContractExportType.RentAgrConfirmationDocument }
     */
    public PublicPropertyContractExportType.RentAgrConfirmationDocument createPublicPropertyContractExportTypeRentAgrConfirmationDocument() {
        return new PublicPropertyContractExportType.RentAgrConfirmationDocument();
    }

    /**
     * Create an instance of {@link PublicPropertyContractType }
     * 
     * @return
     *     the new instance of {@link PublicPropertyContractType }
     */
    public PublicPropertyContractType createPublicPropertyContractType() {
        return new PublicPropertyContractType();
    }

    /**
     * Create an instance of {@link PublicPropertyContractType.RentAgrConfirmationDocument }
     * 
     * @return
     *     the new instance of {@link PublicPropertyContractType.RentAgrConfirmationDocument }
     */
    public PublicPropertyContractType.RentAgrConfirmationDocument createPublicPropertyContractTypeRentAgrConfirmationDocument() {
        return new PublicPropertyContractType.RentAgrConfirmationDocument();
    }

    /**
     * Create an instance of {@link ProtocolExportType }
     * 
     * @return
     *     the new instance of {@link ProtocolExportType }
     */
    public ProtocolExportType createProtocolExportType() {
        return new ProtocolExportType();
    }

    /**
     * Create an instance of {@link ProtocolExportType.DecisionList }
     * 
     * @return
     *     the new instance of {@link ProtocolExportType.DecisionList }
     */
    public ProtocolExportType.DecisionList createProtocolExportTypeDecisionList() {
        return new ProtocolExportType.DecisionList();
    }

    /**
     * Create an instance of {@link AdminOfGeneralMeetingType }
     * 
     * @return
     *     the new instance of {@link AdminOfGeneralMeetingType }
     */
    public AdminOfGeneralMeetingType createAdminOfGeneralMeetingType() {
        return new AdminOfGeneralMeetingType();
    }

    /**
     * Create an instance of {@link MessageExportType }
     * 
     * @return
     *     the new instance of {@link MessageExportType }
     */
    public MessageExportType createMessageExportType() {
        return new MessageExportType();
    }

    /**
     * Create an instance of {@link MessageExportType.DecisionList }
     * 
     * @return
     *     the new instance of {@link MessageExportType.DecisionList }
     */
    public MessageExportType.DecisionList createMessageExportTypeDecisionList() {
        return new MessageExportType.DecisionList();
    }

    /**
     * Create an instance of {@link ProtocolType }
     * 
     * @return
     *     the new instance of {@link ProtocolType }
     */
    public ProtocolType createProtocolType() {
        return new ProtocolType();
    }

    /**
     * Create an instance of {@link ProtocolType.DecisionList }
     * 
     * @return
     *     the new instance of {@link ProtocolType.DecisionList }
     */
    public ProtocolType.DecisionList createProtocolTypeDecisionList() {
        return new ProtocolType.DecisionList();
    }

    /**
     * Create an instance of {@link CharterPaymentsInfoType }
     * 
     * @return
     *     the new instance of {@link CharterPaymentsInfoType }
     */
    public CharterPaymentsInfoType createCharterPaymentsInfoType() {
        return new CharterPaymentsInfoType();
    }

    /**
     * Create an instance of {@link ContractPaymentsInfoType }
     * 
     * @return
     *     the new instance of {@link ContractPaymentsInfoType }
     */
    public ContractPaymentsInfoType createContractPaymentsInfoType() {
        return new ContractPaymentsInfoType();
    }

    /**
     * Create an instance of {@link ContractExportType }
     * 
     * @return
     *     the new instance of {@link ContractExportType }
     */
    public ContractExportType createContractExportType() {
        return new ContractExportType();
    }

    /**
     * Create an instance of {@link ContractExportType.Protocol }
     * 
     * @return
     *     the new instance of {@link ContractExportType.Protocol }
     */
    public ContractExportType.Protocol createContractExportTypeProtocol() {
        return new ContractExportType.Protocol();
    }

    /**
     * Create an instance of {@link ContractType }
     * 
     * @return
     *     the new instance of {@link ContractType }
     */
    public ContractType createContractType() {
        return new ContractType();
    }

    /**
     * Create an instance of {@link ContractType.Protocol }
     * 
     * @return
     *     the new instance of {@link ContractType.Protocol }
     */
    public ContractType.Protocol createContractTypeProtocol() {
        return new ContractType.Protocol();
    }

    /**
     * Create an instance of {@link CharterExportType }
     * 
     * @return
     *     the new instance of {@link CharterExportType }
     */
    public CharterExportType createCharterExportType() {
        return new CharterExportType();
    }

    /**
     * Create an instance of {@link CharterType }
     * 
     * @return
     *     the new instance of {@link CharterType }
     */
    public CharterType createCharterType() {
        return new CharterType();
    }

    /**
     * Create an instance of {@link CharterDateDetailsExportType }
     * 
     * @return
     *     the new instance of {@link CharterDateDetailsExportType }
     */
    public CharterDateDetailsExportType createCharterDateDetailsExportType() {
        return new CharterDateDetailsExportType();
    }

    /**
     * Create an instance of {@link CharterDateDetailsType }
     * 
     * @return
     *     the new instance of {@link CharterDateDetailsType }
     */
    public CharterDateDetailsType createCharterDateDetailsType() {
        return new CharterDateDetailsType();
    }

    /**
     * Create an instance of {@link DateDetailsExportType }
     * 
     * @return
     *     the new instance of {@link DateDetailsExportType }
     */
    public DateDetailsExportType createDateDetailsExportType() {
        return new DateDetailsExportType();
    }

    /**
     * Create an instance of {@link DateDetailsType }
     * 
     * @return
     *     the new instance of {@link DateDetailsType }
     */
    public DateDetailsType createDateDetailsType() {
        return new DateDetailsType();
    }

    /**
     * Create an instance of {@link AccountReasonsImportType }
     * 
     * @return
     *     the new instance of {@link AccountReasonsImportType }
     */
    public AccountReasonsImportType createAccountReasonsImportType() {
        return new AccountReasonsImportType();
    }

    /**
     * Create an instance of {@link AccountIndExportType }
     * 
     * @return
     *     the new instance of {@link AccountIndExportType }
     */
    public AccountIndExportType createAccountIndExportType() {
        return new AccountIndExportType();
    }

    /**
     * Create an instance of {@link AccountExportType }
     * 
     * @return
     *     the new instance of {@link AccountExportType }
     */
    public AccountExportType createAccountExportType() {
        return new AccountExportType();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     * @return
     *     the new instance of {@link AccountType }
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link LivingHouseOMSType }
     * 
     * @return
     *     the new instance of {@link LivingHouseOMSType }
     */
    public LivingHouseOMSType createLivingHouseOMSType() {
        return new LivingHouseOMSType();
    }

    /**
     * Create an instance of {@link ApartmentHouseESPType }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseESPType }
     */
    public ApartmentHouseESPType createApartmentHouseESPType() {
        return new ApartmentHouseESPType();
    }

    /**
     * Create an instance of {@link ApartmentHouseOMSType }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseOMSType }
     */
    public ApartmentHouseOMSType createApartmentHouseOMSType() {
        return new ApartmentHouseOMSType();
    }

    /**
     * Create an instance of {@link ApartmentHouseUOType }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseUOType }
     */
    public ApartmentHouseUOType createApartmentHouseUOType() {
        return new ApartmentHouseUOType();
    }

    /**
     * Create an instance of {@link OGFImportStatusType }
     * 
     * @return
     *     the new instance of {@link OGFImportStatusType }
     */
    public OGFImportStatusType createOGFImportStatusType() {
        return new OGFImportStatusType();
    }

    /**
     * Create an instance of {@link ExportStatusCAChResultType }
     * 
     * @return
     *     the new instance of {@link ExportStatusCAChResultType }
     */
    public ExportStatusCAChResultType createExportStatusCAChResultType() {
        return new ExportStatusCAChResultType();
    }

    /**
     * Create an instance of {@link ObjectAddressBriefType }
     * 
     * @return
     *     the new instance of {@link ObjectAddressBriefType }
     */
    public ObjectAddressBriefType createObjectAddressBriefType() {
        return new ObjectAddressBriefType();
    }

    /**
     * Create an instance of {@link ContractSubjectType }
     * 
     * @return
     *     the new instance of {@link ContractSubjectType }
     */
    public ContractSubjectType createContractSubjectType() {
        return new ContractSubjectType();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType }
     */
    public ExportBriefSupplyResourceContractResultType createExportBriefSupplyResourceContractResultType() {
        return new ExportBriefSupplyResourceContractResultType();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.Period }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.Period }
     */
    public ExportBriefSupplyResourceContractResultType.Period createExportBriefSupplyResourceContractResultTypePeriod() {
        return new ExportBriefSupplyResourceContractResultType.Period();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.ContractSubject }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.ContractSubject }
     */
    public ExportBriefSupplyResourceContractResultType.ContractSubject createExportBriefSupplyResourceContractResultTypeContractSubject() {
        return new ExportBriefSupplyResourceContractResultType.ContractSubject();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.SecondPartyContract }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.SecondPartyContract }
     */
    public ExportBriefSupplyResourceContractResultType.SecondPartyContract createExportBriefSupplyResourceContractResultTypeSecondPartyContract() {
        return new ExportBriefSupplyResourceContractResultType.SecondPartyContract();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType }
     */
    public SupplyResourceContractProjectType createSupplyResourceContractProjectType() {
        return new SupplyResourceContractProjectType();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.RegionalSettings }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.RegionalSettings }
     */
    public SupplyResourceContractProjectType.RegionalSettings createSupplyResourceContractProjectTypeRegionalSettings() {
        return new SupplyResourceContractProjectType.RegionalSettings();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.Quality }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.Quality }
     */
    public SupplyResourceContractProjectType.Quality createSupplyResourceContractProjectTypeQuality() {
        return new SupplyResourceContractProjectType.Quality();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.Period }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.Period }
     */
    public SupplyResourceContractProjectType.Period createSupplyResourceContractProjectTypePeriod() {
        return new SupplyResourceContractProjectType.Period();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractObjectAddressResultType }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractObjectAddressResultType }
     */
    public ExportSupplyResourceContractObjectAddressResultType createExportSupplyResourceContractObjectAddressResultType() {
        return new ExportSupplyResourceContractObjectAddressResultType();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator }
     */
    public ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator createExportSupplyResourceContractObjectAddressResultTypeOtherQualityIndicator() {
        return new ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractObjectAddressResultType.Quality }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractObjectAddressResultType.Quality }
     */
    public ExportSupplyResourceContractObjectAddressResultType.Quality createExportSupplyResourceContractObjectAddressResultTypeQuality() {
        return new ExportSupplyResourceContractObjectAddressResultType.Quality();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractObjectAddressResultType.Pair }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractObjectAddressResultType.Pair }
     */
    public ExportSupplyResourceContractObjectAddressResultType.Pair createExportSupplyResourceContractObjectAddressResultTypePair() {
        return new ExportSupplyResourceContractObjectAddressResultType.Pair();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType }
     */
    public ExportSupplyResourceContractType createExportSupplyResourceContractType() {
        return new ExportSupplyResourceContractType();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.OtherQualityIndicator }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.OtherQualityIndicator }
     */
    public ExportSupplyResourceContractType.OtherQualityIndicator createExportSupplyResourceContractTypeOtherQualityIndicator() {
        return new ExportSupplyResourceContractType.OtherQualityIndicator();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.Quality }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.Quality }
     */
    public ExportSupplyResourceContractType.Quality createExportSupplyResourceContractTypeQuality() {
        return new ExportSupplyResourceContractType.Quality();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.ContractSubject }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.ContractSubject }
     */
    public ExportSupplyResourceContractType.ContractSubject createExportSupplyResourceContractTypeContractSubject() {
        return new ExportSupplyResourceContractType.ContractSubject();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.Period }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.Period }
     */
    public ExportSupplyResourceContractType.Period createExportSupplyResourceContractTypePeriod() {
        return new ExportSupplyResourceContractType.Period();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType }
     */
    public SupplyResourceContractType createSupplyResourceContractType() {
        return new SupplyResourceContractType();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.Quality }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.Quality }
     */
    public SupplyResourceContractType.Quality createSupplyResourceContractTypeQuality() {
        return new SupplyResourceContractType.Quality();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.ObjectAddress }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.ObjectAddress }
     */
    public SupplyResourceContractType.ObjectAddress createSupplyResourceContractTypeObjectAddress() {
        return new SupplyResourceContractType.ObjectAddress();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.ObjectAddress.Pair }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.ObjectAddress.Pair }
     */
    public SupplyResourceContractType.ObjectAddress.Pair createSupplyResourceContractTypeObjectAddressPair() {
        return new SupplyResourceContractType.ObjectAddress.Pair();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.Period }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.Period }
     */
    public SupplyResourceContractType.Period createSupplyResourceContractTypePeriod() {
        return new SupplyResourceContractType.Period();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractResultType }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractResultType }
     */
    public ExportSupplyResourceContractResultType createExportSupplyResourceContractResultType() {
        return new ExportSupplyResourceContractResultType();
    }

    /**
     * Create an instance of {@link ExportBriefSocialHireContractResultType }
     * 
     * @return
     *     the new instance of {@link ExportBriefSocialHireContractResultType }
     */
    public ExportBriefSocialHireContractResultType createExportBriefSocialHireContractResultType() {
        return new ExportBriefSocialHireContractResultType();
    }

    /**
     * Create an instance of {@link ExportRolloverStatusCAChResultType }
     * 
     * @return
     *     the new instance of {@link ExportRolloverStatusCAChResultType }
     */
    public ExportRolloverStatusCAChResultType createExportRolloverStatusCAChResultType() {
        return new ExportRolloverStatusCAChResultType();
    }

    /**
     * Create an instance of {@link ExportRolloverStatusCAChResultType.Status }
     * 
     * @return
     *     the new instance of {@link ExportRolloverStatusCAChResultType.Status }
     */
    public ExportRolloverStatusCAChResultType.Status createExportRolloverStatusCAChResultTypeStatus() {
        return new ExportRolloverStatusCAChResultType.Status();
    }

    /**
     * Create an instance of {@link ExportRolloverStatusCAChResultType.Status.CACh }
     * 
     * @return
     *     the new instance of {@link ExportRolloverStatusCAChResultType.Status.CACh }
     */
    public ExportRolloverStatusCAChResultType.Status.CACh createExportRolloverStatusCAChResultTypeStatusCACh() {
        return new ExportRolloverStatusCAChResultType.Status.CACh();
    }

    /**
     * Create an instance of {@link ExportAccountResultType }
     * 
     * @return
     *     the new instance of {@link ExportAccountResultType }
     */
    public ExportAccountResultType createExportAccountResultType() {
        return new ExportAccountResultType();
    }

    /**
     * Create an instance of {@link ExportAccountResultType.AccountReasons }
     * 
     * @return
     *     the new instance of {@link ExportAccountResultType.AccountReasons }
     */
    public ExportAccountResultType.AccountReasons createExportAccountResultTypeAccountReasons() {
        return new ExportAccountResultType.AccountReasons();
    }

    /**
     * Create an instance of {@link ExportStatusPublicPropertyContractResultType }
     * 
     * @return
     *     the new instance of {@link ExportStatusPublicPropertyContractResultType }
     */
    public ExportStatusPublicPropertyContractResultType createExportStatusPublicPropertyContractResultType() {
        return new ExportStatusPublicPropertyContractResultType();
    }

    /**
     * Create an instance of {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract }
     * 
     * @return
     *     the new instance of {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract }
     */
    public ExportStatusPublicPropertyContractResultType.PublicPropertyContract createExportStatusPublicPropertyContractResultTypePublicPropertyContract() {
        return new ExportStatusPublicPropertyContractResultType.PublicPropertyContract();
    }

    /**
     * Create an instance of {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment }
     * 
     * @return
     *     the new instance of {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment }
     */
    public ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment createExportStatusPublicPropertyContractResultTypePublicPropertyContractAgreementPayment() {
        return new ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment();
    }

    /**
     * Create an instance of {@link ExportCAChResultType }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType }
     */
    public ExportCAChResultType createExportCAChResultType() {
        return new ExportCAChResultType();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Charter }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Charter }
     */
    public ExportCAChResultType.Charter createExportCAChResultTypeCharter() {
        return new ExportCAChResultType.Charter();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Charter.ContractObject }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Charter.ContractObject }
     */
    public ExportCAChResultType.Charter.ContractObject createExportCAChResultTypeCharterContractObject() {
        return new ExportCAChResultType.Charter.ContractObject();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Contract }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Contract }
     */
    public ExportCAChResultType.Contract createExportCAChResultTypeContract() {
        return new ExportCAChResultType.Contract();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Contract.ContractObject }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Contract.ContractObject }
     */
    public ExportCAChResultType.Contract.ContractObject createExportCAChResultTypeContractContractObject() {
        return new ExportCAChResultType.Contract.ContractObject();
    }

    /**
     * Create an instance of {@link ExportMeteringDeviceDataResultType }
     * 
     * @return
     *     the new instance of {@link ExportMeteringDeviceDataResultType }
     */
    public ExportMeteringDeviceDataResultType createExportMeteringDeviceDataResultType() {
        return new ExportMeteringDeviceDataResultType();
    }

    /**
     * Create an instance of {@link ExportHouseResultType }
     * 
     * @return
     *     the new instance of {@link ExportHouseResultType }
     */
    public ExportHouseResultType createExportHouseResultType() {
        return new ExportHouseResultType();
    }

    /**
     * Create an instance of {@link ExportHouseResultType.LivingHouse }
     * 
     * @return
     *     the new instance of {@link ExportHouseResultType.LivingHouse }
     */
    public ExportHouseResultType.LivingHouse createExportHouseResultTypeLivingHouse() {
        return new ExportHouseResultType.LivingHouse();
    }

    /**
     * Create an instance of {@link ExportHouseResultType.LivingHouse.Block }
     * 
     * @return
     *     the new instance of {@link ExportHouseResultType.LivingHouse.Block }
     */
    public ExportHouseResultType.LivingHouse.Block createExportHouseResultTypeLivingHouseBlock() {
        return new ExportHouseResultType.LivingHouse.Block();
    }

    /**
     * Create an instance of {@link ExportHouseResultType.ApartmentHouse }
     * 
     * @return
     *     the new instance of {@link ExportHouseResultType.ApartmentHouse }
     */
    public ExportHouseResultType.ApartmentHouse createExportHouseResultTypeApartmentHouse() {
        return new ExportHouseResultType.ApartmentHouse();
    }

    /**
     * Create an instance of {@link ExportHouseResultType.ApartmentHouse.ResidentialPremises }
     * 
     * @return
     *     the new instance of {@link ExportHouseResultType.ApartmentHouse.ResidentialPremises }
     */
    public ExportHouseResultType.ApartmentHouse.ResidentialPremises createExportHouseResultTypeApartmentHouseResidentialPremises() {
        return new ExportHouseResultType.ApartmentHouse.ResidentialPremises();
    }

    /**
     * Create an instance of {@link GetStateResult.ImportResult }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ImportResult }
     */
    public GetStateResult.ImportResult createGetStateResultImportResult() {
        return new GetStateResult.ImportResult();
    }

    /**
     * Create an instance of {@link GetStateResult.ImportResult.CommonResult }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ImportResult.CommonResult }
     */
    public GetStateResult.ImportResult.CommonResult createGetStateResultImportResultCommonResult() {
        return new GetStateResult.ImportResult.CommonResult();
    }

    /**
     * Create an instance of {@link ImportOwnerRefusalRequest.OwnerRefusal }
     * 
     * @return
     *     the new instance of {@link ImportOwnerRefusalRequest.OwnerRefusal }
     */
    public ImportOwnerRefusalRequest.OwnerRefusal createImportOwnerRefusalRequestOwnerRefusal() {
        return new ImportOwnerRefusalRequest.OwnerRefusal();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     * @return
     *     the new instance of {@link MessageType }
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link MessageType.DecisionList }
     * 
     * @return
     *     the new instance of {@link MessageType.DecisionList }
     */
    public MessageType.DecisionList createMessageTypeDecisionList() {
        return new MessageType.DecisionList();
    }

    /**
     * Create an instance of {@link ExternalVotingProtocolType }
     * 
     * @return
     *     the new instance of {@link ExternalVotingProtocolType }
     */
    public ExternalVotingProtocolType createExternalVotingProtocolType() {
        return new ExternalVotingProtocolType();
    }

    /**
     * Create an instance of {@link ImportNotificationRequest.Notification }
     * 
     * @return
     *     the new instance of {@link ImportNotificationRequest.Notification }
     */
    public ImportNotificationRequest.Notification createImportNotificationRequestNotification() {
        return new ImportNotificationRequest.Notification();
    }

    /**
     * Create an instance of {@link ImportNotificationRequest.Notification.Create }
     * 
     * @return
     *     the new instance of {@link ImportNotificationRequest.Notification.Create }
     */
    public ImportNotificationRequest.Notification.Create createImportNotificationRequestNotificationCreate() {
        return new ImportNotificationRequest.Notification.Create();
    }

    /**
     * Create an instance of {@link ImportNotificationRequest.Notification.Create.RoomOwners }
     * 
     * @return
     *     the new instance of {@link ImportNotificationRequest.Notification.Create.RoomOwners }
     */
    public ImportNotificationRequest.Notification.Create.RoomOwners createImportNotificationRequestNotificationCreateRoomOwners() {
        return new ImportNotificationRequest.Notification.Create.RoomOwners();
    }

    /**
     * Create an instance of {@link ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming }
     * 
     * @return
     *     the new instance of {@link ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming }
     */
    public ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming createImportNotificationRequestNotificationCreateRoomOwnersDeptsInforming() {
        return new ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractRequest.Criteria }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractRequest.Criteria }
     */
    public ExportBriefSupplyResourceContractRequest.Criteria createExportBriefSupplyResourceContractRequestCriteria() {
        return new ExportBriefSupplyResourceContractRequest.Criteria();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject }
     */
    public ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject createExportBriefSupplyResourceContractRequestCriteriaContractSubject() {
        return new ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress }
     */
    public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress createImportSupplyResourceContractObjectAddressRequestObjectAddress() {
        return new ImportSupplyResourceContractObjectAddressRequest.ObjectAddress();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject }
     */
    public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject createImportSupplyResourceContractObjectAddressRequestObjectAddressLoadObject() {
        return new ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality }
     */
    public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality createImportSupplyResourceContractObjectAddressRequestObjectAddressLoadObjectQuality() {
        return new ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair }
     */
    public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair createImportSupplyResourceContractObjectAddressRequestObjectAddressLoadObjectPair() {
        return new ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractRequest.ContractSubject }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractRequest.ContractSubject }
     */
    public ExportSupplyResourceContractRequest.ContractSubject createExportSupplyResourceContractRequestContractSubject() {
        return new ExportSupplyResourceContractRequest.ContractSubject();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractRequest.Contract }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractRequest.Contract }
     */
    public ImportSupplyResourceContractRequest.Contract createImportSupplyResourceContractRequestContract() {
        return new ImportSupplyResourceContractRequest.Contract();
    }

    /**
     * Create an instance of {@link ImportPublicPropertyContractRequest.AddAgreementPayment }
     * 
     * @return
     *     the new instance of {@link ImportPublicPropertyContractRequest.AddAgreementPayment }
     */
    public ImportPublicPropertyContractRequest.AddAgreementPayment createImportPublicPropertyContractRequestAddAgreementPayment() {
        return new ImportPublicPropertyContractRequest.AddAgreementPayment();
    }

    /**
     * Create an instance of {@link ImportPublicPropertyContractRequest.Contract }
     * 
     * @return
     *     the new instance of {@link ImportPublicPropertyContractRequest.Contract }
     */
    public ImportPublicPropertyContractRequest.Contract createImportPublicPropertyContractRequestContract() {
        return new ImportPublicPropertyContractRequest.Contract();
    }

    /**
     * Create an instance of {@link ImportPublicPropertyContractRequest.Contract.PublicPropertyContract }
     * 
     * @return
     *     the new instance of {@link ImportPublicPropertyContractRequest.Contract.PublicPropertyContract }
     */
    public ImportPublicPropertyContractRequest.Contract.PublicPropertyContract createImportPublicPropertyContractRequestContractPublicPropertyContract() {
        return new ImportPublicPropertyContractRequest.Contract.PublicPropertyContract();
    }

    /**
     * Create an instance of {@link ExportStatusCAChRequest.Criteria }
     * 
     * @return
     *     the new instance of {@link ExportStatusCAChRequest.Criteria }
     */
    public ExportStatusCAChRequest.Criteria createExportStatusCAChRequestCriteria() {
        return new ExportStatusCAChRequest.Criteria();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.EditCharter }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.EditCharter }
     */
    public ImportCharterRequest.EditCharter createImportCharterRequestEditCharter() {
        return new ImportCharterRequest.EditCharter();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.EditCharter.ContractObject }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.EditCharter.ContractObject }
     */
    public ImportCharterRequest.EditCharter.ContractObject createImportCharterRequestEditCharterContractObject() {
        return new ImportCharterRequest.EditCharter.ContractObject();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.EditCharter.ContractObject.Edit }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.EditCharter.ContractObject.Edit }
     */
    public ImportCharterRequest.EditCharter.ContractObject.Edit createImportCharterRequestEditCharterContractObjectEdit() {
        return new ImportCharterRequest.EditCharter.ContractObject.Edit();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.EditCharter.ContractObject.Add }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.EditCharter.ContractObject.Add }
     */
    public ImportCharterRequest.EditCharter.ContractObject.Add createImportCharterRequestEditCharterContractObjectAdd() {
        return new ImportCharterRequest.EditCharter.ContractObject.Add();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.PlacingCharter }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.PlacingCharter }
     */
    public ImportCharterRequest.PlacingCharter createImportCharterRequestPlacingCharter() {
        return new ImportCharterRequest.PlacingCharter();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.PlacingCharter.ContractObject }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.PlacingCharter.ContractObject }
     */
    public ImportCharterRequest.PlacingCharter.ContractObject createImportCharterRequestPlacingCharterContractObject() {
        return new ImportCharterRequest.PlacingCharter.ContractObject();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract }
     */
    public ImportContractRequest.Contract createImportContractRequestContract() {
        return new ImportContractRequest.Contract();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.EditContract }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.EditContract }
     */
    public ImportContractRequest.Contract.EditContract createImportContractRequestContractEditContract() {
        return new ImportContractRequest.Contract.EditContract();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.EditContract.ContractObject }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.EditContract.ContractObject }
     */
    public ImportContractRequest.Contract.EditContract.ContractObject createImportContractRequestContractEditContractContractObject() {
        return new ImportContractRequest.Contract.EditContract.ContractObject();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Edit }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Edit }
     */
    public ImportContractRequest.Contract.EditContract.ContractObject.Edit createImportContractRequestContractEditContractContractObjectEdit() {
        return new ImportContractRequest.Contract.EditContract.ContractObject.Edit();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Add }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Add }
     */
    public ImportContractRequest.Contract.EditContract.ContractObject.Add createImportContractRequestContractEditContractContractObjectAdd() {
        return new ImportContractRequest.Contract.EditContract.ContractObject.Add();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.PlacingContract }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.PlacingContract }
     */
    public ImportContractRequest.Contract.PlacingContract createImportContractRequestContractPlacingContract() {
        return new ImportContractRequest.Contract.PlacingContract();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.PlacingContract.ContractObject }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.PlacingContract.ContractObject }
     */
    public ImportContractRequest.Contract.PlacingContract.ContractObject createImportContractRequestContractPlacingContractContractObject() {
        return new ImportContractRequest.Contract.PlacingContract.ContractObject();
    }

    /**
     * Create an instance of {@link ImportMeteringDeviceDataRequest.MeteringDevice }
     * 
     * @return
     *     the new instance of {@link ImportMeteringDeviceDataRequest.MeteringDevice }
     */
    public ImportMeteringDeviceDataRequest.MeteringDevice createImportMeteringDeviceDataRequestMeteringDevice() {
        return new ImportMeteringDeviceDataRequest.MeteringDevice();
    }

    /**
     * Create an instance of {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate }
     */
    public ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate createImportMeteringDeviceDataRequestMeteringDeviceDeviceDataToUpdate() {
        return new ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse }
     */
    public ImportHouseESPRequest.ApartmentHouse createImportHouseESPRequestApartmentHouse() {
        return new ImportHouseESPRequest.ApartmentHouse();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises }
     */
    public ImportHouseESPRequest.ApartmentHouse.ResidentialPremises createImportHouseESPRequestApartmentHouseResidentialPremises() {
        return new ImportHouseESPRequest.ApartmentHouse.ResidentialPremises();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.LivingHouse }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.LivingHouse }
     */
    public ImportHouseOMSRequest.LivingHouse createImportHouseOMSRequestLivingHouse() {
        return new ImportHouseOMSRequest.LivingHouse();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.LivingHouse.Blocks }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.LivingHouse.Blocks }
     */
    public ImportHouseOMSRequest.LivingHouse.Blocks createImportHouseOMSRequestLivingHouseBlocks() {
        return new ImportHouseOMSRequest.LivingHouse.Blocks();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse }
     */
    public ImportHouseOMSRequest.ApartmentHouse createImportHouseOMSRequestApartmentHouse() {
        return new ImportHouseOMSRequest.ApartmentHouse();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises }
     */
    public ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises createImportHouseOMSRequestApartmentHouseResidentialPremises() {
        return new ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.LivingHouse }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.LivingHouse }
     */
    public ImportHouseUORequest.LivingHouse createImportHouseUORequestLivingHouse() {
        return new ImportHouseUORequest.LivingHouse();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.LivingHouse.Blocks }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.LivingHouse.Blocks }
     */
    public ImportHouseUORequest.LivingHouse.Blocks createImportHouseUORequestLivingHouseBlocks() {
        return new ImportHouseUORequest.LivingHouse.Blocks();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse }
     */
    public ImportHouseUORequest.ApartmentHouse createImportHouseUORequestApartmentHouse() {
        return new ImportHouseUORequest.ApartmentHouse();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises }
     */
    public ImportHouseUORequest.ApartmentHouse.ResidentialPremises createImportHouseUORequestApartmentHouseResidentialPremises() {
        return new ImportHouseUORequest.ApartmentHouse.ResidentialPremises();
    }

    /**
     * Create an instance of {@link ExportHouseRequest }
     * 
     * @return
     *     the new instance of {@link ExportHouseRequest }
     */
    public ExportHouseRequest createExportHouseRequest() {
        return new ExportHouseRequest();
    }

    /**
     * Create an instance of {@link DemolishHouseRequestType }
     * 
     * @return
     *     the new instance of {@link DemolishHouseRequestType }
     */
    public DemolishHouseRequestType createDemolishHouseRequestType() {
        return new DemolishHouseRequestType();
    }

    /**
     * Create an instance of {@link ExportBriefBasicHouseRequest }
     * 
     * @return
     *     the new instance of {@link ExportBriefBasicHouseRequest }
     */
    public ExportBriefBasicHouseRequest createExportBriefBasicHouseRequest() {
        return new ExportBriefBasicHouseRequest();
    }

    /**
     * Create an instance of {@link ExportBriefBasicHouseRequestType }
     * 
     * @return
     *     the new instance of {@link ExportBriefBasicHouseRequestType }
     */
    public ExportBriefBasicHouseRequestType createExportBriefBasicHouseRequestType() {
        return new ExportBriefBasicHouseRequestType();
    }

    /**
     * Create an instance of {@link ExportBriefLivingHouseRequest }
     * 
     * @return
     *     the new instance of {@link ExportBriefLivingHouseRequest }
     */
    public ExportBriefLivingHouseRequest createExportBriefLivingHouseRequest() {
        return new ExportBriefLivingHouseRequest();
    }

    /**
     * Create an instance of {@link ExportBriefLivingHouseRequestType }
     * 
     * @return
     *     the new instance of {@link ExportBriefLivingHouseRequestType }
     */
    public ExportBriefLivingHouseRequestType createExportBriefLivingHouseRequestType() {
        return new ExportBriefLivingHouseRequestType();
    }

    /**
     * Create an instance of {@link ExportBriefApartmentHouseRequest }
     * 
     * @return
     *     the new instance of {@link ExportBriefApartmentHouseRequest }
     */
    public ExportBriefApartmentHouseRequest createExportBriefApartmentHouseRequest() {
        return new ExportBriefApartmentHouseRequest();
    }

    /**
     * Create an instance of {@link ImportAccountRequest.Account }
     * 
     * @return
     *     the new instance of {@link ImportAccountRequest.Account }
     */
    public ImportAccountRequest.Account createImportAccountRequestAccount() {
        return new ImportAccountRequest.Account();
    }

    /**
     * Create an instance of {@link ExportAccountRequest }
     * 
     * @return
     *     the new instance of {@link ExportAccountRequest }
     */
    public ExportAccountRequest createExportAccountRequest() {
        return new ExportAccountRequest();
    }

    /**
     * Create an instance of {@link ImportAccountIndividualServicesRequest.IndividualService }
     * 
     * @return
     *     the new instance of {@link ImportAccountIndividualServicesRequest.IndividualService }
     */
    public ImportAccountIndividualServicesRequest.IndividualService createImportAccountIndividualServicesRequestIndividualService() {
        return new ImportAccountIndividualServicesRequest.IndividualService();
    }

    /**
     * Create an instance of {@link ImportAccountIndividualServicesRequest.DeleteIndividualService }
     * 
     * @return
     *     the new instance of {@link ImportAccountIndividualServicesRequest.DeleteIndividualService }
     */
    public ImportAccountIndividualServicesRequest.DeleteIndividualService createImportAccountIndividualServicesRequestDeleteIndividualService() {
        return new ImportAccountIndividualServicesRequest.DeleteIndividualService();
    }

    /**
     * Create an instance of {@link ExportAccountIndividualServicesRequest }
     * 
     * @return
     *     the new instance of {@link ExportAccountIndividualServicesRequest }
     */
    public ExportAccountIndividualServicesRequest createExportAccountIndividualServicesRequest() {
        return new ExportAccountIndividualServicesRequest();
    }

    /**
     * Create an instance of {@link ExportMeteringDeviceDataRequest }
     * 
     * @return
     *     the new instance of {@link ExportMeteringDeviceDataRequest }
     */
    public ExportMeteringDeviceDataRequest createExportMeteringDeviceDataRequest() {
        return new ExportMeteringDeviceDataRequest();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.RollOverCharter }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.RollOverCharter }
     */
    public ImportCharterRequest.RollOverCharter createImportCharterRequestRollOverCharter() {
        return new ImportCharterRequest.RollOverCharter();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.TerminateCharter }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.TerminateCharter }
     */
    public ImportCharterRequest.TerminateCharter createImportCharterRequestTerminateCharter() {
        return new ImportCharterRequest.TerminateCharter();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.AnnulmentCharter }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.AnnulmentCharter }
     */
    public ImportCharterRequest.AnnulmentCharter createImportCharterRequestAnnulmentCharter() {
        return new ImportCharterRequest.AnnulmentCharter();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.PlaceCharterPaymentsInfo }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.PlaceCharterPaymentsInfo }
     */
    public ImportCharterRequest.PlaceCharterPaymentsInfo createImportCharterRequestPlaceCharterPaymentsInfo() {
        return new ImportCharterRequest.PlaceCharterPaymentsInfo();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.AnnulmentCharterPaymentsInfo }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.AnnulmentCharterPaymentsInfo }
     */
    public ImportCharterRequest.AnnulmentCharterPaymentsInfo createImportCharterRequestAnnulmentCharterPaymentsInfo() {
        return new ImportCharterRequest.AnnulmentCharterPaymentsInfo();
    }

    /**
     * Create an instance of {@link ExportRolloverStatusCAChRequest }
     * 
     * @return
     *     the new instance of {@link ExportRolloverStatusCAChRequest }
     */
    public ExportRolloverStatusCAChRequest createExportRolloverStatusCAChRequest() {
        return new ExportRolloverStatusCAChRequest();
    }

    /**
     * Create an instance of {@link ExportCAChAsyncRequest }
     * 
     * @return
     *     the new instance of {@link ExportCAChAsyncRequest }
     */
    public ExportCAChAsyncRequest createExportCAChAsyncRequest() {
        return new ExportCAChAsyncRequest();
    }

    /**
     * Create an instance of {@link ExportCAChRequestCriteriaType }
     * 
     * @return
     *     the new instance of {@link ExportCAChRequestCriteriaType }
     */
    public ExportCAChRequestCriteriaType createExportCAChRequestCriteriaType() {
        return new ExportCAChRequestCriteriaType();
    }

    /**
     * Create an instance of {@link ImportPublicPropertyContractRequest.AnnulAgreementPayment }
     * 
     * @return
     *     the new instance of {@link ImportPublicPropertyContractRequest.AnnulAgreementPayment }
     */
    public ImportPublicPropertyContractRequest.AnnulAgreementPayment createImportPublicPropertyContractRequestAnnulAgreementPayment() {
        return new ImportPublicPropertyContractRequest.AnnulAgreementPayment();
    }

    /**
     * Create an instance of {@link ImportPublicPropertyContractRequest.DelAgreementPayment }
     * 
     * @return
     *     the new instance of {@link ImportPublicPropertyContractRequest.DelAgreementPayment }
     */
    public ImportPublicPropertyContractRequest.DelAgreementPayment createImportPublicPropertyContractRequestDelAgreementPayment() {
        return new ImportPublicPropertyContractRequest.DelAgreementPayment();
    }

    /**
     * Create an instance of {@link ExportStatusPublicPropertyContractRequest }
     * 
     * @return
     *     the new instance of {@link ExportStatusPublicPropertyContractRequest }
     */
    public ExportStatusPublicPropertyContractRequest createExportStatusPublicPropertyContractRequest() {
        return new ExportStatusPublicPropertyContractRequest();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractProjectRequest.Contract }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractProjectRequest.Contract }
     */
    public ImportSupplyResourceContractProjectRequest.Contract createImportSupplyResourceContractProjectRequestContract() {
        return new ImportSupplyResourceContractProjectRequest.Contract();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractObjectAddressRequest }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractObjectAddressRequest }
     */
    public ExportSupplyResourceContractObjectAddressRequest createExportSupplyResourceContractObjectAddressRequest() {
        return new ExportSupplyResourceContractObjectAddressRequest();
    }

    /**
     * Create an instance of {@link ImportVotingProtocolRequest.Protocol }
     * 
     * @return
     *     the new instance of {@link ImportVotingProtocolRequest.Protocol }
     */
    public ImportVotingProtocolRequest.Protocol createImportVotingProtocolRequestProtocol() {
        return new ImportVotingProtocolRequest.Protocol();
    }

    /**
     * Create an instance of {@link AnnulmentProtocolType }
     * 
     * @return
     *     the new instance of {@link AnnulmentProtocolType }
     */
    public AnnulmentProtocolType createAnnulmentProtocolType() {
        return new AnnulmentProtocolType();
    }

    /**
     * Create an instance of {@link ImportExternalVotingProtocolRequest }
     * 
     * @return
     *     the new instance of {@link ImportExternalVotingProtocolRequest }
     */
    public ImportExternalVotingProtocolRequest createImportExternalVotingProtocolRequest() {
        return new ImportExternalVotingProtocolRequest();
    }

    /**
     * Create an instance of {@link ExportVotingProtocolRequest }
     * 
     * @return
     *     the new instance of {@link ExportVotingProtocolRequest }
     */
    public ExportVotingProtocolRequest createExportVotingProtocolRequest() {
        return new ExportVotingProtocolRequest();
    }

    /**
     * Create an instance of {@link ImportVotingMessageRequest }
     * 
     * @return
     *     the new instance of {@link ImportVotingMessageRequest }
     */
    public ImportVotingMessageRequest createImportVotingMessageRequest() {
        return new ImportVotingMessageRequest();
    }

    /**
     * Create an instance of {@link ExportVotingMessageRequest }
     * 
     * @return
     *     the new instance of {@link ExportVotingMessageRequest }
     */
    public ExportVotingMessageRequest createExportVotingMessageRequest() {
        return new ExportVotingMessageRequest();
    }

    /**
     * Create an instance of {@link ImportOwnerDecisionRequest.OwnerDecision }
     * 
     * @return
     *     the new instance of {@link ImportOwnerDecisionRequest.OwnerDecision }
     */
    public ImportOwnerDecisionRequest.OwnerDecision createImportOwnerDecisionRequestOwnerDecision() {
        return new ImportOwnerDecisionRequest.OwnerDecision();
    }

    /**
     * Create an instance of {@link ExportOwnerDecisionRequest }
     * 
     * @return
     *     the new instance of {@link ExportOwnerDecisionRequest }
     */
    public ExportOwnerDecisionRequest createExportOwnerDecisionRequest() {
        return new ExportOwnerDecisionRequest();
    }

    /**
     * Create an instance of {@link ExportOwnerRefusalRequest }
     * 
     * @return
     *     the new instance of {@link ExportOwnerRefusalRequest }
     */
    public ExportOwnerRefusalRequest createExportOwnerRefusalRequest() {
        return new ExportOwnerRefusalRequest();
    }

    /**
     * Create an instance of {@link ExportBriefSocialHireContractRequest.Criteria }
     * 
     * @return
     *     the new instance of {@link ExportBriefSocialHireContractRequest.Criteria }
     */
    public ExportBriefSocialHireContractRequest.Criteria createExportBriefSocialHireContractRequestCriteria() {
        return new ExportBriefSocialHireContractRequest.Criteria();
    }

    /**
     * Create an instance of {@link GetStateResult.ExportBriefBasicHouseResult }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ExportBriefBasicHouseResult }
     */
    public GetStateResult.ExportBriefBasicHouseResult createGetStateResultExportBriefBasicHouseResult() {
        return new GetStateResult.ExportBriefBasicHouseResult();
    }

    /**
     * Create an instance of {@link GetStateResult.ExportBriefApartmentHouseResult }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ExportBriefApartmentHouseResult }
     */
    public GetStateResult.ExportBriefApartmentHouseResult createGetStateResultExportBriefApartmentHouseResult() {
        return new GetStateResult.ExportBriefApartmentHouseResult();
    }

    /**
     * Create an instance of {@link GetStateResult.ExportBriefLivingHouseResult }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ExportBriefLivingHouseResult }
     */
    public GetStateResult.ExportBriefLivingHouseResult createGetStateResultExportBriefLivingHouseResult() {
        return new GetStateResult.ExportBriefLivingHouseResult();
    }

    /**
     * Create an instance of {@link ExportVotingProtocolResultType }
     * 
     * @return
     *     the new instance of {@link ExportVotingProtocolResultType }
     */
    public ExportVotingProtocolResultType createExportVotingProtocolResultType() {
        return new ExportVotingProtocolResultType();
    }

    /**
     * Create an instance of {@link ExportVotingMessageResultType }
     * 
     * @return
     *     the new instance of {@link ExportVotingMessageResultType }
     */
    public ExportVotingMessageResultType createExportVotingMessageResultType() {
        return new ExportVotingMessageResultType();
    }

    /**
     * Create an instance of {@link GetStateResult.ExportSupplyResourceContractResult }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ExportSupplyResourceContractResult }
     */
    public GetStateResult.ExportSupplyResourceContractResult createGetStateResultExportSupplyResourceContractResult() {
        return new GetStateResult.ExportSupplyResourceContractResult();
    }

    /**
     * Create an instance of {@link GetStateResult.ExportSupplyResourceContractObjectAddress }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ExportSupplyResourceContractObjectAddress }
     */
    public GetStateResult.ExportSupplyResourceContractObjectAddress createGetStateResultExportSupplyResourceContractObjectAddress() {
        return new GetStateResult.ExportSupplyResourceContractObjectAddress();
    }

    /**
     * Create an instance of {@link GetStateResult.ExportBriefSupplyResourceContractResult }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ExportBriefSupplyResourceContractResult }
     */
    public GetStateResult.ExportBriefSupplyResourceContractResult createGetStateResultExportBriefSupplyResourceContractResult() {
        return new GetStateResult.ExportBriefSupplyResourceContractResult();
    }

    /**
     * Create an instance of {@link ExportAccountIndividualServicesResultType }
     * 
     * @return
     *     the new instance of {@link ExportAccountIndividualServicesResultType }
     */
    public ExportAccountIndividualServicesResultType createExportAccountIndividualServicesResultType() {
        return new ExportAccountIndividualServicesResultType();
    }

    /**
     * Create an instance of {@link ExportOwnerDecisionResultType }
     * 
     * @return
     *     the new instance of {@link ExportOwnerDecisionResultType }
     */
    public ExportOwnerDecisionResultType createExportOwnerDecisionResultType() {
        return new ExportOwnerDecisionResultType();
    }

    /**
     * Create an instance of {@link OwnerRefusalExportType }
     * 
     * @return
     *     the new instance of {@link OwnerRefusalExportType }
     */
    public OwnerRefusalExportType createOwnerRefusalExportType() {
        return new OwnerRefusalExportType();
    }

    /**
     * Create an instance of {@link RightOrEncumbrance }
     * 
     * @return
     *     the new instance of {@link RightOrEncumbrance }
     */
    public RightOrEncumbrance createRightOrEncumbrance() {
        return new RightOrEncumbrance();
    }

    /**
     * Create an instance of {@link ru.gosuslugi.dom.schema.integration.house_management.VoteInitiators }
     * 
     * @return
     *     the new instance of {@link ru.gosuslugi.dom.schema.integration.house_management.VoteInitiators }
     */
    public ru.gosuslugi.dom.schema.integration.house_management.VoteInitiators createVoteInitiators() {
        return new ru.gosuslugi.dom.schema.integration.house_management.VoteInitiators();
    }

    /**
     * Create an instance of {@link VotingInitiatorIndType }
     * 
     * @return
     *     the new instance of {@link VotingInitiatorIndType }
     */
    public VotingInitiatorIndType createVotingInitiatorIndType() {
        return new VotingInitiatorIndType();
    }

    /**
     * Create an instance of {@link Attachments }
     * 
     * @return
     *     the new instance of {@link Attachments }
     */
    public Attachments createAttachments() {
        return new Attachments();
    }

    /**
     * Create an instance of {@link VotingInitiatorIndID }
     * 
     * @return
     *     the new instance of {@link VotingInitiatorIndID }
     */
    public VotingInitiatorIndID createVotingInitiatorIndID() {
        return new VotingInitiatorIndID();
    }

    /**
     * Create an instance of {@link DecisionIndID }
     * 
     * @return
     *     the new instance of {@link DecisionIndID }
     */
    public DecisionIndID createDecisionIndID() {
        return new DecisionIndID();
    }

    /**
     * Create an instance of {@link Owner.OwnerInd }
     * 
     * @return
     *     the new instance of {@link Owner.OwnerInd }
     */
    public Owner.OwnerInd createOwnerOwnerInd() {
        return new Owner.OwnerInd();
    }

    /**
     * Create an instance of {@link PropertyDetails.PropertyType }
     * 
     * @return
     *     the new instance of {@link PropertyDetails.PropertyType }
     */
    public PropertyDetails.PropertyType createPropertyDetailsPropertyType() {
        return new PropertyDetails.PropertyType();
    }

    /**
     * Create an instance of {@link PropertyDetails.ShareSize }
     * 
     * @return
     *     the new instance of {@link PropertyDetails.ShareSize }
     */
    public PropertyDetails.ShareSize createPropertyDetailsShareSize() {
        return new PropertyDetails.ShareSize();
    }

    /**
     * Create an instance of {@link ExportPropertyDetails.PropertyType }
     * 
     * @return
     *     the new instance of {@link ExportPropertyDetails.PropertyType }
     */
    public ExportPropertyDetails.PropertyType createExportPropertyDetailsPropertyType() {
        return new ExportPropertyDetails.PropertyType();
    }

    /**
     * Create an instance of {@link ExportPropertyDetails.ShareSize }
     * 
     * @return
     *     the new instance of {@link ExportPropertyDetails.ShareSize }
     */
    public ExportPropertyDetails.ShareSize createExportPropertyDetailsShareSize() {
        return new ExportPropertyDetails.ShareSize();
    }

    /**
     * Create an instance of {@link Representative.RepresentativeInd }
     * 
     * @return
     *     the new instance of {@link Representative.RepresentativeInd }
     */
    public Representative.RepresentativeInd createRepresentativeRepresentativeInd() {
        return new Representative.RepresentativeInd();
    }

    /**
     * Create an instance of {@link HouseToDemolishType }
     * 
     * @return
     *     the new instance of {@link HouseToDemolishType }
     */
    public HouseToDemolishType createHouseToDemolishType() {
        return new HouseToDemolishType();
    }

    /**
     * Create an instance of {@link DemolishionReasonType }
     * 
     * @return
     *     the new instance of {@link DemolishionReasonType }
     */
    public DemolishionReasonType createDemolishionReasonType() {
        return new DemolishionReasonType();
    }

    /**
     * Create an instance of {@link ExportBriefBasicCriteriaType }
     * 
     * @return
     *     the new instance of {@link ExportBriefBasicCriteriaType }
     */
    public ExportBriefBasicCriteriaType createExportBriefBasicCriteriaType() {
        return new ExportBriefBasicCriteriaType();
    }

    /**
     * Create an instance of {@link ExportBriefBasicHouseResultType }
     * 
     * @return
     *     the new instance of {@link ExportBriefBasicHouseResultType }
     */
    public ExportBriefBasicHouseResultType createExportBriefBasicHouseResultType() {
        return new ExportBriefBasicHouseResultType();
    }

    /**
     * Create an instance of {@link ExportBriefLivingHouseResultType }
     * 
     * @return
     *     the new instance of {@link ExportBriefLivingHouseResultType }
     */
    public ExportBriefLivingHouseResultType createExportBriefLivingHouseResultType() {
        return new ExportBriefLivingHouseResultType();
    }

    /**
     * Create an instance of {@link BriefBasicHouseType }
     * 
     * @return
     *     the new instance of {@link BriefBasicHouseType }
     */
    public BriefBasicHouseType createBriefBasicHouseType() {
        return new BriefBasicHouseType();
    }

    /**
     * Create an instance of {@link BriefBasicCharactericticsType }
     * 
     * @return
     *     the new instance of {@link BriefBasicCharactericticsType }
     */
    public BriefBasicCharactericticsType createBriefBasicCharactericticsType() {
        return new BriefBasicCharactericticsType();
    }

    /**
     * Create an instance of {@link BriefLocationType }
     * 
     * @return
     *     the new instance of {@link BriefLocationType }
     */
    public BriefLocationType createBriefLocationType() {
        return new BriefLocationType();
    }

    /**
     * Create an instance of {@link BriefLivingHouseType }
     * 
     * @return
     *     the new instance of {@link BriefLivingHouseType }
     */
    public BriefLivingHouseType createBriefLivingHouseType() {
        return new BriefLivingHouseType();
    }

    /**
     * Create an instance of {@link BriefApartmentHouseType }
     * 
     * @return
     *     the new instance of {@link BriefApartmentHouseType }
     */
    public BriefApartmentHouseType createBriefApartmentHouseType() {
        return new BriefApartmentHouseType();
    }

    /**
     * Create an instance of {@link BriefBlockType }
     * 
     * @return
     *     the new instance of {@link BriefBlockType }
     */
    public BriefBlockType createBriefBlockType() {
        return new BriefBlockType();
    }

    /**
     * Create an instance of {@link BriefEntranceType }
     * 
     * @return
     *     the new instance of {@link BriefEntranceType }
     */
    public BriefEntranceType createBriefEntranceType() {
        return new BriefEntranceType();
    }

    /**
     * Create an instance of {@link BriefNonResidentialPremisesType }
     * 
     * @return
     *     the new instance of {@link BriefNonResidentialPremisesType }
     */
    public BriefNonResidentialPremisesType createBriefNonResidentialPremisesType() {
        return new BriefNonResidentialPremisesType();
    }

    /**
     * Create an instance of {@link BriefResidentialPremisesType }
     * 
     * @return
     *     the new instance of {@link BriefResidentialPremisesType }
     */
    public BriefResidentialPremisesType createBriefResidentialPremisesType() {
        return new BriefResidentialPremisesType();
    }

    /**
     * Create an instance of {@link BriefLivingRoomType }
     * 
     * @return
     *     the new instance of {@link BriefLivingRoomType }
     */
    public BriefLivingRoomType createBriefLivingRoomType() {
        return new BriefLivingRoomType();
    }

    /**
     * Create an instance of {@link ImportContractResultType }
     * 
     * @return
     *     the new instance of {@link ImportContractResultType }
     */
    public ImportContractResultType createImportContractResultType() {
        return new ImportContractResultType();
    }

    /**
     * Create an instance of {@link ImportCharterResultType }
     * 
     * @return
     *     the new instance of {@link ImportCharterResultType }
     */
    public ImportCharterResultType createImportCharterResultType() {
        return new ImportCharterResultType();
    }

    /**
     * Create an instance of {@link GKNEGRPKeyType }
     * 
     * @return
     *     the new instance of {@link GKNEGRPKeyType }
     */
    public GKNEGRPKeyType createGKNEGRPKeyType() {
        return new GKNEGRPKeyType();
    }

    /**
     * Create an instance of {@link GKNEGRPKeyRSOType }
     * 
     * @return
     *     the new instance of {@link GKNEGRPKeyRSOType }
     */
    public GKNEGRPKeyRSOType createGKNEGRPKeyRSOType() {
        return new GKNEGRPKeyRSOType();
    }

    /**
     * Create an instance of {@link GKNEGRPKeyExportType }
     * 
     * @return
     *     the new instance of {@link GKNEGRPKeyExportType }
     */
    public GKNEGRPKeyExportType createGKNEGRPKeyExportType() {
        return new GKNEGRPKeyExportType();
    }

    /**
     * Create an instance of {@link GKNRelationshipStatusType }
     * 
     * @return
     *     the new instance of {@link GKNRelationshipStatusType }
     */
    public GKNRelationshipStatusType createGKNRelationshipStatusType() {
        return new GKNRelationshipStatusType();
    }

    /**
     * Create an instance of {@link EGRPRelationshipStatusType }
     * 
     * @return
     *     the new instance of {@link EGRPRelationshipStatusType }
     */
    public EGRPRelationshipStatusType createEGRPRelationshipStatusType() {
        return new EGRPRelationshipStatusType();
    }

    /**
     * Create an instance of {@link OGFExportStatusType }
     * 
     * @return
     *     the new instance of {@link OGFExportStatusType }
     */
    public OGFExportStatusType createOGFExportStatusType() {
        return new OGFExportStatusType();
    }

    /**
     * Create an instance of {@link HouseBasicUOType }
     * 
     * @return
     *     the new instance of {@link HouseBasicUOType }
     */
    public HouseBasicUOType createHouseBasicUOType() {
        return new HouseBasicUOType();
    }

    /**
     * Create an instance of {@link HouseBasicRSOType }
     * 
     * @return
     *     the new instance of {@link HouseBasicRSOType }
     */
    public HouseBasicRSOType createHouseBasicRSOType() {
        return new HouseBasicRSOType();
    }

    /**
     * Create an instance of {@link HouseBasicUpdateUOType }
     * 
     * @return
     *     the new instance of {@link HouseBasicUpdateUOType }
     */
    public HouseBasicUpdateUOType createHouseBasicUpdateUOType() {
        return new HouseBasicUpdateUOType();
    }

    /**
     * Create an instance of {@link HouseBasicUpdateRSOType }
     * 
     * @return
     *     the new instance of {@link HouseBasicUpdateRSOType }
     */
    public HouseBasicUpdateRSOType createHouseBasicUpdateRSOType() {
        return new HouseBasicUpdateRSOType();
    }

    /**
     * Create an instance of {@link HouseBasicUpdateOMSType }
     * 
     * @return
     *     the new instance of {@link HouseBasicUpdateOMSType }
     */
    public HouseBasicUpdateOMSType createHouseBasicUpdateOMSType() {
        return new HouseBasicUpdateOMSType();
    }

    /**
     * Create an instance of {@link HouseBasicUpdateESPType }
     * 
     * @return
     *     the new instance of {@link HouseBasicUpdateESPType }
     */
    public HouseBasicUpdateESPType createHouseBasicUpdateESPType() {
        return new HouseBasicUpdateESPType();
    }

    /**
     * Create an instance of {@link HouseBasicExportType }
     * 
     * @return
     *     the new instance of {@link HouseBasicExportType }
     */
    public HouseBasicExportType createHouseBasicExportType() {
        return new HouseBasicExportType();
    }

    /**
     * Create an instance of {@link ApartmentHouseRSOType }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseRSOType }
     */
    public ApartmentHouseRSOType createApartmentHouseRSOType() {
        return new ApartmentHouseRSOType();
    }

    /**
     * Create an instance of {@link ApartmentHouseUpdateUOType }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseUpdateUOType }
     */
    public ApartmentHouseUpdateUOType createApartmentHouseUpdateUOType() {
        return new ApartmentHouseUpdateUOType();
    }

    /**
     * Create an instance of {@link ApartmentHouseUpdateRSOType }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseUpdateRSOType }
     */
    public ApartmentHouseUpdateRSOType createApartmentHouseUpdateRSOType() {
        return new ApartmentHouseUpdateRSOType();
    }

    /**
     * Create an instance of {@link ApartmentHouseUpdateOMSType }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseUpdateOMSType }
     */
    public ApartmentHouseUpdateOMSType createApartmentHouseUpdateOMSType() {
        return new ApartmentHouseUpdateOMSType();
    }

    /**
     * Create an instance of {@link ApartmentHouseUpdateESPType }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseUpdateESPType }
     */
    public ApartmentHouseUpdateESPType createApartmentHouseUpdateESPType() {
        return new ApartmentHouseUpdateESPType();
    }

    /**
     * Create an instance of {@link ApartmentHouseExportType }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseExportType }
     */
    public ApartmentHouseExportType createApartmentHouseExportType() {
        return new ApartmentHouseExportType();
    }

    /**
     * Create an instance of {@link LiftUOType }
     * 
     * @return
     *     the new instance of {@link LiftUOType }
     */
    public LiftUOType createLiftUOType() {
        return new LiftUOType();
    }

    /**
     * Create an instance of {@link LiftOMSType }
     * 
     * @return
     *     the new instance of {@link LiftOMSType }
     */
    public LiftOMSType createLiftOMSType() {
        return new LiftOMSType();
    }

    /**
     * Create an instance of {@link LiftESPType }
     * 
     * @return
     *     the new instance of {@link LiftESPType }
     */
    public LiftESPType createLiftESPType() {
        return new LiftESPType();
    }

    /**
     * Create an instance of {@link LiftUpdateUOType }
     * 
     * @return
     *     the new instance of {@link LiftUpdateUOType }
     */
    public LiftUpdateUOType createLiftUpdateUOType() {
        return new LiftUpdateUOType();
    }

    /**
     * Create an instance of {@link LiftUpdateOMSType }
     * 
     * @return
     *     the new instance of {@link LiftUpdateOMSType }
     */
    public LiftUpdateOMSType createLiftUpdateOMSType() {
        return new LiftUpdateOMSType();
    }

    /**
     * Create an instance of {@link LiftUpdateESPType }
     * 
     * @return
     *     the new instance of {@link LiftUpdateESPType }
     */
    public LiftUpdateESPType createLiftUpdateESPType() {
        return new LiftUpdateESPType();
    }

    /**
     * Create an instance of {@link LiftExportType }
     * 
     * @return
     *     the new instance of {@link LiftExportType }
     */
    public LiftExportType createLiftExportType() {
        return new LiftExportType();
    }

    /**
     * Create an instance of {@link LivingHouseUOType }
     * 
     * @return
     *     the new instance of {@link LivingHouseUOType }
     */
    public LivingHouseUOType createLivingHouseUOType() {
        return new LivingHouseUOType();
    }

    /**
     * Create an instance of {@link LivingHouseRSOType }
     * 
     * @return
     *     the new instance of {@link LivingHouseRSOType }
     */
    public LivingHouseRSOType createLivingHouseRSOType() {
        return new LivingHouseRSOType();
    }

    /**
     * Create an instance of {@link LivingHouseUpdateUOType }
     * 
     * @return
     *     the new instance of {@link LivingHouseUpdateUOType }
     */
    public LivingHouseUpdateUOType createLivingHouseUpdateUOType() {
        return new LivingHouseUpdateUOType();
    }

    /**
     * Create an instance of {@link LivingHouseUpdateRSOType }
     * 
     * @return
     *     the new instance of {@link LivingHouseUpdateRSOType }
     */
    public LivingHouseUpdateRSOType createLivingHouseUpdateRSOType() {
        return new LivingHouseUpdateRSOType();
    }

    /**
     * Create an instance of {@link LivingHouseUpdateOMSType }
     * 
     * @return
     *     the new instance of {@link LivingHouseUpdateOMSType }
     */
    public LivingHouseUpdateOMSType createLivingHouseUpdateOMSType() {
        return new LivingHouseUpdateOMSType();
    }

    /**
     * Create an instance of {@link LivingHouseExportType }
     * 
     * @return
     *     the new instance of {@link LivingHouseExportType }
     */
    public LivingHouseExportType createLivingHouseExportType() {
        return new LivingHouseExportType();
    }

    /**
     * Create an instance of {@link EntranceUOType }
     * 
     * @return
     *     the new instance of {@link EntranceUOType }
     */
    public EntranceUOType createEntranceUOType() {
        return new EntranceUOType();
    }

    /**
     * Create an instance of {@link EntranceRSOType }
     * 
     * @return
     *     the new instance of {@link EntranceRSOType }
     */
    public EntranceRSOType createEntranceRSOType() {
        return new EntranceRSOType();
    }

    /**
     * Create an instance of {@link EntranceOMSType }
     * 
     * @return
     *     the new instance of {@link EntranceOMSType }
     */
    public EntranceOMSType createEntranceOMSType() {
        return new EntranceOMSType();
    }

    /**
     * Create an instance of {@link EntranceESPType }
     * 
     * @return
     *     the new instance of {@link EntranceESPType }
     */
    public EntranceESPType createEntranceESPType() {
        return new EntranceESPType();
    }

    /**
     * Create an instance of {@link EntranceUpdateUOType }
     * 
     * @return
     *     the new instance of {@link EntranceUpdateUOType }
     */
    public EntranceUpdateUOType createEntranceUpdateUOType() {
        return new EntranceUpdateUOType();
    }

    /**
     * Create an instance of {@link EntranceUpdateRSOType }
     * 
     * @return
     *     the new instance of {@link EntranceUpdateRSOType }
     */
    public EntranceUpdateRSOType createEntranceUpdateRSOType() {
        return new EntranceUpdateRSOType();
    }

    /**
     * Create an instance of {@link EntranceUpdateOMSType }
     * 
     * @return
     *     the new instance of {@link EntranceUpdateOMSType }
     */
    public EntranceUpdateOMSType createEntranceUpdateOMSType() {
        return new EntranceUpdateOMSType();
    }

    /**
     * Create an instance of {@link EntranceUpdateESPType }
     * 
     * @return
     *     the new instance of {@link EntranceUpdateESPType }
     */
    public EntranceUpdateESPType createEntranceUpdateESPType() {
        return new EntranceUpdateESPType();
    }

    /**
     * Create an instance of {@link EntranceExportType }
     * 
     * @return
     *     the new instance of {@link EntranceExportType }
     */
    public EntranceExportType createEntranceExportType() {
        return new EntranceExportType();
    }

    /**
     * Create an instance of {@link BlockUOType }
     * 
     * @return
     *     the new instance of {@link BlockUOType }
     */
    public BlockUOType createBlockUOType() {
        return new BlockUOType();
    }

    /**
     * Create an instance of {@link BlockRSOType }
     * 
     * @return
     *     the new instance of {@link BlockRSOType }
     */
    public BlockRSOType createBlockRSOType() {
        return new BlockRSOType();
    }

    /**
     * Create an instance of {@link BlockOMSType }
     * 
     * @return
     *     the new instance of {@link BlockOMSType }
     */
    public BlockOMSType createBlockOMSType() {
        return new BlockOMSType();
    }

    /**
     * Create an instance of {@link BlockUpdateUOType }
     * 
     * @return
     *     the new instance of {@link BlockUpdateUOType }
     */
    public BlockUpdateUOType createBlockUpdateUOType() {
        return new BlockUpdateUOType();
    }

    /**
     * Create an instance of {@link BlockUpdateRSOType }
     * 
     * @return
     *     the new instance of {@link BlockUpdateRSOType }
     */
    public BlockUpdateRSOType createBlockUpdateRSOType() {
        return new BlockUpdateRSOType();
    }

    /**
     * Create an instance of {@link BlockUpdateOMSType }
     * 
     * @return
     *     the new instance of {@link BlockUpdateOMSType }
     */
    public BlockUpdateOMSType createBlockUpdateOMSType() {
        return new BlockUpdateOMSType();
    }

    /**
     * Create an instance of {@link BlockExportType }
     * 
     * @return
     *     the new instance of {@link BlockExportType }
     */
    public BlockExportType createBlockExportType() {
        return new BlockExportType();
    }

    /**
     * Create an instance of {@link PremisesBasicUOType }
     * 
     * @return
     *     the new instance of {@link PremisesBasicUOType }
     */
    public PremisesBasicUOType createPremisesBasicUOType() {
        return new PremisesBasicUOType();
    }

    /**
     * Create an instance of {@link PremisesBasicRSOType }
     * 
     * @return
     *     the new instance of {@link PremisesBasicRSOType }
     */
    public PremisesBasicRSOType createPremisesBasicRSOType() {
        return new PremisesBasicRSOType();
    }

    /**
     * Create an instance of {@link PremisesBasicOMSType }
     * 
     * @return
     *     the new instance of {@link PremisesBasicOMSType }
     */
    public PremisesBasicOMSType createPremisesBasicOMSType() {
        return new PremisesBasicOMSType();
    }

    /**
     * Create an instance of {@link PremisesBasicESPType }
     * 
     * @return
     *     the new instance of {@link PremisesBasicESPType }
     */
    public PremisesBasicESPType createPremisesBasicESPType() {
        return new PremisesBasicESPType();
    }

    /**
     * Create an instance of {@link PremisesBasicUpdateUOType }
     * 
     * @return
     *     the new instance of {@link PremisesBasicUpdateUOType }
     */
    public PremisesBasicUpdateUOType createPremisesBasicUpdateUOType() {
        return new PremisesBasicUpdateUOType();
    }

    /**
     * Create an instance of {@link PremisesBasicUpdateRSOType }
     * 
     * @return
     *     the new instance of {@link PremisesBasicUpdateRSOType }
     */
    public PremisesBasicUpdateRSOType createPremisesBasicUpdateRSOType() {
        return new PremisesBasicUpdateRSOType();
    }

    /**
     * Create an instance of {@link PremisesBasicUpdateOMSType }
     * 
     * @return
     *     the new instance of {@link PremisesBasicUpdateOMSType }
     */
    public PremisesBasicUpdateOMSType createPremisesBasicUpdateOMSType() {
        return new PremisesBasicUpdateOMSType();
    }

    /**
     * Create an instance of {@link PremisesBasicUpdateESPType }
     * 
     * @return
     *     the new instance of {@link PremisesBasicUpdateESPType }
     */
    public PremisesBasicUpdateESPType createPremisesBasicUpdateESPType() {
        return new PremisesBasicUpdateESPType();
    }

    /**
     * Create an instance of {@link PremisesBasicExportType }
     * 
     * @return
     *     the new instance of {@link PremisesBasicExportType }
     */
    public PremisesBasicExportType createPremisesBasicExportType() {
        return new PremisesBasicExportType();
    }

    /**
     * Create an instance of {@link ResidentialPremisesUOType }
     * 
     * @return
     *     the new instance of {@link ResidentialPremisesUOType }
     */
    public ResidentialPremisesUOType createResidentialPremisesUOType() {
        return new ResidentialPremisesUOType();
    }

    /**
     * Create an instance of {@link ResidentialPremisesRSOType }
     * 
     * @return
     *     the new instance of {@link ResidentialPremisesRSOType }
     */
    public ResidentialPremisesRSOType createResidentialPremisesRSOType() {
        return new ResidentialPremisesRSOType();
    }

    /**
     * Create an instance of {@link ResidentialPremisesOMSType }
     * 
     * @return
     *     the new instance of {@link ResidentialPremisesOMSType }
     */
    public ResidentialPremisesOMSType createResidentialPremisesOMSType() {
        return new ResidentialPremisesOMSType();
    }

    /**
     * Create an instance of {@link ResidentialPremisesESPType }
     * 
     * @return
     *     the new instance of {@link ResidentialPremisesESPType }
     */
    public ResidentialPremisesESPType createResidentialPremisesESPType() {
        return new ResidentialPremisesESPType();
    }

    /**
     * Create an instance of {@link ResidentialPremisesUpdateUOType }
     * 
     * @return
     *     the new instance of {@link ResidentialPremisesUpdateUOType }
     */
    public ResidentialPremisesUpdateUOType createResidentialPremisesUpdateUOType() {
        return new ResidentialPremisesUpdateUOType();
    }

    /**
     * Create an instance of {@link ResidentialPremisesUpdateRSOType }
     * 
     * @return
     *     the new instance of {@link ResidentialPremisesUpdateRSOType }
     */
    public ResidentialPremisesUpdateRSOType createResidentialPremisesUpdateRSOType() {
        return new ResidentialPremisesUpdateRSOType();
    }

    /**
     * Create an instance of {@link ResidentialPremisesUpdateOMSType }
     * 
     * @return
     *     the new instance of {@link ResidentialPremisesUpdateOMSType }
     */
    public ResidentialPremisesUpdateOMSType createResidentialPremisesUpdateOMSType() {
        return new ResidentialPremisesUpdateOMSType();
    }

    /**
     * Create an instance of {@link ResidentialPremisesUpdateESPType }
     * 
     * @return
     *     the new instance of {@link ResidentialPremisesUpdateESPType }
     */
    public ResidentialPremisesUpdateESPType createResidentialPremisesUpdateESPType() {
        return new ResidentialPremisesUpdateESPType();
    }

    /**
     * Create an instance of {@link ResidentialPremisesExportType }
     * 
     * @return
     *     the new instance of {@link ResidentialPremisesExportType }
     */
    public ResidentialPremisesExportType createResidentialPremisesExportType() {
        return new ResidentialPremisesExportType();
    }

    /**
     * Create an instance of {@link NonResidentialPremisesUOType }
     * 
     * @return
     *     the new instance of {@link NonResidentialPremisesUOType }
     */
    public NonResidentialPremisesUOType createNonResidentialPremisesUOType() {
        return new NonResidentialPremisesUOType();
    }

    /**
     * Create an instance of {@link NonResidentialPremisesRSOType }
     * 
     * @return
     *     the new instance of {@link NonResidentialPremisesRSOType }
     */
    public NonResidentialPremisesRSOType createNonResidentialPremisesRSOType() {
        return new NonResidentialPremisesRSOType();
    }

    /**
     * Create an instance of {@link NonResidentialPremisesOMSType }
     * 
     * @return
     *     the new instance of {@link NonResidentialPremisesOMSType }
     */
    public NonResidentialPremisesOMSType createNonResidentialPremisesOMSType() {
        return new NonResidentialPremisesOMSType();
    }

    /**
     * Create an instance of {@link NonResidentialPremisesESPType }
     * 
     * @return
     *     the new instance of {@link NonResidentialPremisesESPType }
     */
    public NonResidentialPremisesESPType createNonResidentialPremisesESPType() {
        return new NonResidentialPremisesESPType();
    }

    /**
     * Create an instance of {@link NonResidentialPremisesUpdateUOType }
     * 
     * @return
     *     the new instance of {@link NonResidentialPremisesUpdateUOType }
     */
    public NonResidentialPremisesUpdateUOType createNonResidentialPremisesUpdateUOType() {
        return new NonResidentialPremisesUpdateUOType();
    }

    /**
     * Create an instance of {@link NonResidentialPremisesUpdateRSOType }
     * 
     * @return
     *     the new instance of {@link NonResidentialPremisesUpdateRSOType }
     */
    public NonResidentialPremisesUpdateRSOType createNonResidentialPremisesUpdateRSOType() {
        return new NonResidentialPremisesUpdateRSOType();
    }

    /**
     * Create an instance of {@link NonResidentialPremisesUpdateOMSType }
     * 
     * @return
     *     the new instance of {@link NonResidentialPremisesUpdateOMSType }
     */
    public NonResidentialPremisesUpdateOMSType createNonResidentialPremisesUpdateOMSType() {
        return new NonResidentialPremisesUpdateOMSType();
    }

    /**
     * Create an instance of {@link NonResidentialPremisesUpdateESPType }
     * 
     * @return
     *     the new instance of {@link NonResidentialPremisesUpdateESPType }
     */
    public NonResidentialPremisesUpdateESPType createNonResidentialPremisesUpdateESPType() {
        return new NonResidentialPremisesUpdateESPType();
    }

    /**
     * Create an instance of {@link NonResidentialPremisesExportType }
     * 
     * @return
     *     the new instance of {@link NonResidentialPremisesExportType }
     */
    public NonResidentialPremisesExportType createNonResidentialPremisesExportType() {
        return new NonResidentialPremisesExportType();
    }

    /**
     * Create an instance of {@link RoomUOType }
     * 
     * @return
     *     the new instance of {@link RoomUOType }
     */
    public RoomUOType createRoomUOType() {
        return new RoomUOType();
    }

    /**
     * Create an instance of {@link RoomRSOType }
     * 
     * @return
     *     the new instance of {@link RoomRSOType }
     */
    public RoomRSOType createRoomRSOType() {
        return new RoomRSOType();
    }

    /**
     * Create an instance of {@link RoomOMSType }
     * 
     * @return
     *     the new instance of {@link RoomOMSType }
     */
    public RoomOMSType createRoomOMSType() {
        return new RoomOMSType();
    }

    /**
     * Create an instance of {@link RoomESPType }
     * 
     * @return
     *     the new instance of {@link RoomESPType }
     */
    public RoomESPType createRoomESPType() {
        return new RoomESPType();
    }

    /**
     * Create an instance of {@link RoomUpdateUOType }
     * 
     * @return
     *     the new instance of {@link RoomUpdateUOType }
     */
    public RoomUpdateUOType createRoomUpdateUOType() {
        return new RoomUpdateUOType();
    }

    /**
     * Create an instance of {@link RoomUpdateRSOType }
     * 
     * @return
     *     the new instance of {@link RoomUpdateRSOType }
     */
    public RoomUpdateRSOType createRoomUpdateRSOType() {
        return new RoomUpdateRSOType();
    }

    /**
     * Create an instance of {@link RoomUpdateOMSType }
     * 
     * @return
     *     the new instance of {@link RoomUpdateOMSType }
     */
    public RoomUpdateOMSType createRoomUpdateOMSType() {
        return new RoomUpdateOMSType();
    }

    /**
     * Create an instance of {@link RoomUpdateESPType }
     * 
     * @return
     *     the new instance of {@link RoomUpdateESPType }
     */
    public RoomUpdateESPType createRoomUpdateESPType() {
        return new RoomUpdateESPType();
    }

    /**
     * Create an instance of {@link RoomExportType }
     * 
     * @return
     *     the new instance of {@link RoomExportType }
     */
    public RoomExportType createRoomExportType() {
        return new RoomExportType();
    }

    /**
     * Create an instance of {@link OGFData }
     * 
     * @return
     *     the new instance of {@link OGFData }
     */
    public OGFData createOGFData() {
        return new OGFData();
    }

    /**
     * Create an instance of {@link OGFDataValue }
     * 
     * @return
     *     the new instance of {@link OGFDataValue }
     */
    public OGFDataValue createOGFDataValue() {
        return new OGFDataValue();
    }

    /**
     * Create an instance of {@link AccountIndType }
     * 
     * @return
     *     the new instance of {@link AccountIndType }
     */
    public AccountIndType createAccountIndType() {
        return new AccountIndType();
    }

    /**
     * Create an instance of {@link AccountUpdateType }
     * 
     * @return
     *     the new instance of {@link AccountUpdateType }
     */
    public AccountUpdateType createAccountUpdateType() {
        return new AccountUpdateType();
    }

    /**
     * Create an instance of {@link ClosedAccountAttributesType }
     * 
     * @return
     *     the new instance of {@link ClosedAccountAttributesType }
     */
    public ClosedAccountAttributesType createClosedAccountAttributesType() {
        return new ClosedAccountAttributesType();
    }

    /**
     * Create an instance of {@link AccountIndividualServiceType }
     * 
     * @return
     *     the new instance of {@link AccountIndividualServiceType }
     */
    public AccountIndividualServiceType createAccountIndividualServiceType() {
        return new AccountIndividualServiceType();
    }

    /**
     * Create an instance of {@link MainInfoType }
     * 
     * @return
     *     the new instance of {@link MainInfoType }
     */
    public MainInfoType createMainInfoType() {
        return new MainInfoType();
    }

    /**
     * Create an instance of {@link DaySelectionType }
     * 
     * @return
     *     the new instance of {@link DaySelectionType }
     */
    public DaySelectionType createDaySelectionType() {
        return new DaySelectionType();
    }

    /**
     * Create an instance of {@link DaySelectionExportType }
     * 
     * @return
     *     the new instance of {@link DaySelectionExportType }
     */
    public DaySelectionExportType createDaySelectionExportType() {
        return new DaySelectionExportType();
    }

    /**
     * Create an instance of {@link DeviceMeteringsDaySelectionType }
     * 
     * @return
     *     the new instance of {@link DeviceMeteringsDaySelectionType }
     */
    public DeviceMeteringsDaySelectionType createDeviceMeteringsDaySelectionType() {
        return new DeviceMeteringsDaySelectionType();
    }

    /**
     * Create an instance of {@link ManageObjectType }
     * 
     * @return
     *     the new instance of {@link ManageObjectType }
     */
    public ManageObjectType createManageObjectType() {
        return new ManageObjectType();
    }

    /**
     * Create an instance of {@link ProtocolOKType }
     * 
     * @return
     *     the new instance of {@link ProtocolOKType }
     */
    public ProtocolOKType createProtocolOKType() {
        return new ProtocolOKType();
    }

    /**
     * Create an instance of {@link RollOverType }
     * 
     * @return
     *     the new instance of {@link RollOverType }
     */
    public RollOverType createRollOverType() {
        return new RollOverType();
    }

    /**
     * Create an instance of {@link TerminateType }
     * 
     * @return
     *     the new instance of {@link TerminateType }
     */
    public TerminateType createTerminateType() {
        return new TerminateType();
    }

    /**
     * Create an instance of {@link DeleteDocType }
     * 
     * @return
     *     the new instance of {@link DeleteDocType }
     */
    public DeleteDocType createDeleteDocType() {
        return new DeleteDocType();
    }

    /**
     * Create an instance of {@link ContractServiceType }
     * 
     * @return
     *     the new instance of {@link ContractServiceType }
     */
    public ContractServiceType createContractServiceType() {
        return new ContractServiceType();
    }

    /**
     * Create an instance of {@link ImprintAgreementType }
     * 
     * @return
     *     the new instance of {@link ImprintAgreementType }
     */
    public ImprintAgreementType createImprintAgreementType() {
        return new ImprintAgreementType();
    }

    /**
     * Create an instance of {@link ImprintAgreementExportType }
     * 
     * @return
     *     the new instance of {@link ImprintAgreementExportType }
     */
    public ImprintAgreementExportType createImprintAgreementExportType() {
        return new ImprintAgreementExportType();
    }

    /**
     * Create an instance of {@link ApprovalType }
     * 
     * @return
     *     the new instance of {@link ApprovalType }
     */
    public ApprovalType createApprovalType() {
        return new ApprovalType();
    }

    /**
     * Create an instance of {@link BaseServiceType }
     * 
     * @return
     *     the new instance of {@link BaseServiceType }
     */
    public BaseServiceType createBaseServiceType() {
        return new BaseServiceType();
    }

    /**
     * Create an instance of {@link BaseServiceCharterType }
     * 
     * @return
     *     the new instance of {@link BaseServiceCharterType }
     */
    public BaseServiceCharterType createBaseServiceCharterType() {
        return new BaseServiceCharterType();
    }

    /**
     * Create an instance of {@link AnnulmentType }
     * 
     * @return
     *     the new instance of {@link AnnulmentType }
     */
    public AnnulmentType createAnnulmentType() {
        return new AnnulmentType();
    }

    /**
     * Create an instance of {@link VoitingType }
     * 
     * @return
     *     the new instance of {@link VoitingType }
     */
    public VoitingType createVoitingType() {
        return new VoitingType();
    }

    /**
     * Create an instance of {@link VotingSystemDetailsType }
     * 
     * @return
     *     the new instance of {@link VotingSystemDetailsType }
     */
    public VotingSystemDetailsType createVotingSystemDetailsType() {
        return new VotingSystemDetailsType();
    }

    /**
     * Create an instance of {@link OwnerDecisionType }
     * 
     * @return
     *     the new instance of {@link OwnerDecisionType }
     */
    public OwnerDecisionType createOwnerDecisionType() {
        return new OwnerDecisionType();
    }

    /**
     * Create an instance of {@link QuestionOnDecisionType }
     * 
     * @return
     *     the new instance of {@link QuestionOnDecisionType }
     */
    public QuestionOnDecisionType createQuestionOnDecisionType() {
        return new QuestionOnDecisionType();
    }

    /**
     * Create an instance of {@link ExportQuestionOnDecisionType }
     * 
     * @return
     *     the new instance of {@link ExportQuestionOnDecisionType }
     */
    public ExportQuestionOnDecisionType createExportQuestionOnDecisionType() {
        return new ExportQuestionOnDecisionType();
    }

    /**
     * Create an instance of {@link DecisionIndType }
     * 
     * @return
     *     the new instance of {@link DecisionIndType }
     */
    public DecisionIndType createDecisionIndType() {
        return new DecisionIndType();
    }

    /**
     * Create an instance of {@link OwnerRefusalType }
     * 
     * @return
     *     the new instance of {@link OwnerRefusalType }
     */
    public OwnerRefusalType createOwnerRefusalType() {
        return new OwnerRefusalType();
    }

    /**
     * Create an instance of {@link ObjectAddressType }
     * 
     * @return
     *     the new instance of {@link ObjectAddressType }
     */
    public ObjectAddressType createObjectAddressType() {
        return new ObjectAddressType();
    }

    /**
     * Create an instance of {@link ExportObjectAddressType }
     * 
     * @return
     *     the new instance of {@link ExportObjectAddressType }
     */
    public ExportObjectAddressType createExportObjectAddressType() {
        return new ExportObjectAddressType();
    }

    /**
     * Create an instance of {@link IndicatorValueType }
     * 
     * @return
     *     the new instance of {@link IndicatorValueType }
     */
    public IndicatorValueType createIndicatorValueType() {
        return new IndicatorValueType();
    }

    /**
     * Create an instance of {@link DRSORegOrgType }
     * 
     * @return
     *     the new instance of {@link DRSORegOrgType }
     */
    public DRSORegOrgType createDRSORegOrgType() {
        return new DRSORegOrgType();
    }

    /**
     * Create an instance of {@link DRSOIndType }
     * 
     * @return
     *     the new instance of {@link DRSOIndType }
     */
    public DRSOIndType createDRSOIndType() {
        return new DRSOIndType();
    }

    /**
     * Create an instance of {@link MunicipalResourceNotElectricBaseType }
     * 
     * @return
     *     the new instance of {@link MunicipalResourceNotElectricBaseType }
     */
    public MunicipalResourceNotElectricBaseType createMunicipalResourceNotElectricBaseType() {
        return new MunicipalResourceNotElectricBaseType();
    }

    /**
     * Create an instance of {@link MunicipalResourceElectricBaseType }
     * 
     * @return
     *     the new instance of {@link MunicipalResourceElectricBaseType }
     */
    public MunicipalResourceElectricBaseType createMunicipalResourceElectricBaseType() {
        return new MunicipalResourceElectricBaseType();
    }

    /**
     * Create an instance of {@link MunicipalResourceElectricUpdateType }
     * 
     * @return
     *     the new instance of {@link MunicipalResourceElectricUpdateType }
     */
    public MunicipalResourceElectricUpdateType createMunicipalResourceElectricUpdateType() {
        return new MunicipalResourceElectricUpdateType();
    }

    /**
     * Create an instance of {@link DeviceMunicipalResourceType }
     * 
     * @return
     *     the new instance of {@link DeviceMunicipalResourceType }
     */
    public DeviceMunicipalResourceType createDeviceMunicipalResourceType() {
        return new DeviceMunicipalResourceType();
    }

    /**
     * Create an instance of {@link ExportAnnulmentType }
     * 
     * @return
     *     the new instance of {@link ExportAnnulmentType }
     */
    public ExportAnnulmentType createExportAnnulmentType() {
        return new ExportAnnulmentType();
    }

    /**
     * Create an instance of {@link HostelDataType }
     * 
     * @return
     *     the new instance of {@link HostelDataType }
     */
    public HostelDataType createHostelDataType() {
        return new HostelDataType();
    }

    /**
     * Create an instance of {@link ExportHostelDataType }
     * 
     * @return
     *     the new instance of {@link ExportHostelDataType }
     */
    public ExportHostelDataType createExportHostelDataType() {
        return new ExportHostelDataType();
    }

    /**
     * Create an instance of {@link MunicipalResourceElectricExportType2 .MeteringValueInDefaultUnit }
     * 
     * @return
     *     the new instance of {@link MunicipalResourceElectricExportType2 .MeteringValueInDefaultUnit }
     */
    public MunicipalResourceElectricExportType2 .MeteringValueInDefaultUnit createMunicipalResourceElectricExportType2MeteringValueInDefaultUnit() {
        return new MunicipalResourceElectricExportType2 .MeteringValueInDefaultUnit();
    }

    /**
     * Create an instance of {@link MunicipalResourceElectricExportType.MeteringValueInDefaultUnit }
     * 
     * @return
     *     the new instance of {@link MunicipalResourceElectricExportType.MeteringValueInDefaultUnit }
     */
    public MunicipalResourceElectricExportType.MeteringValueInDefaultUnit createMunicipalResourceElectricExportTypeMeteringValueInDefaultUnit() {
        return new MunicipalResourceElectricExportType.MeteringValueInDefaultUnit();
    }

    /**
     * Create an instance of {@link MunicipalResourceNotElectricExportType2 .MeteringValueInDefaultUnit }
     * 
     * @return
     *     the new instance of {@link MunicipalResourceNotElectricExportType2 .MeteringValueInDefaultUnit }
     */
    public MunicipalResourceNotElectricExportType2 .MeteringValueInDefaultUnit createMunicipalResourceNotElectricExportType2MeteringValueInDefaultUnit() {
        return new MunicipalResourceNotElectricExportType2 .MeteringValueInDefaultUnit();
    }

    /**
     * Create an instance of {@link MunicipalResourceNotElectricExportType.MeteringValueInDefaultUnit }
     * 
     * @return
     *     the new instance of {@link MunicipalResourceNotElectricExportType.MeteringValueInDefaultUnit }
     */
    public MunicipalResourceNotElectricExportType.MeteringValueInDefaultUnit createMunicipalResourceNotElectricExportTypeMeteringValueInDefaultUnit() {
        return new MunicipalResourceNotElectricExportType.MeteringValueInDefaultUnit();
    }

    /**
     * Create an instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.CollectiveDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.CollectiveDevice }
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.CollectiveDevice createMeteringDeviceToUpdateAfterDevicesValuesTypeCollectiveDevice() {
        return new MeteringDeviceToUpdateAfterDevicesValuesType.CollectiveDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.LinkedWithMetering }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.LinkedWithMetering }
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.LinkedWithMetering createMeteringDeviceToUpdateAfterDevicesValuesTypeLinkedWithMetering() {
        return new MeteringDeviceToUpdateAfterDevicesValuesType.LinkedWithMetering();
    }

    /**
     * Create an instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ResidentialPremiseDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ResidentialPremiseDevice }
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ResidentialPremiseDevice createMeteringDeviceToUpdateAfterDevicesValuesTypeAddressChatacteristictsResidentialPremiseDevice() {
        return new MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ResidentialPremiseDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.NonResidentialPremiseDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.NonResidentialPremiseDevice }
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.NonResidentialPremiseDevice createMeteringDeviceToUpdateAfterDevicesValuesTypeAddressChatacteristictsNonResidentialPremiseDevice() {
        return new MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.NonResidentialPremiseDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ApartmentHouseDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ApartmentHouseDevice }
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ApartmentHouseDevice createMeteringDeviceToUpdateAfterDevicesValuesTypeAddressChatacteristictsApartmentHouseDevice() {
        return new MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.ApartmentHouseDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveDevice }
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveDevice createMeteringDeviceToUpdateAfterDevicesValuesTypeAddressChatacteristictsCollectiveDevice() {
        return new MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.LivingRoomDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.LivingRoomDevice }
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.LivingRoomDevice createMeteringDeviceToUpdateAfterDevicesValuesTypeAddressChatacteristictsLivingRoomDevice() {
        return new MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.LivingRoomDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveApartmentDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveApartmentDevice }
     */
    public MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveApartmentDevice createMeteringDeviceToUpdateAfterDevicesValuesTypeAddressChatacteristictsCollectiveApartmentDevice() {
        return new MeteringDeviceToUpdateAfterDevicesValuesType.AddressChatacteristicts.CollectiveApartmentDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceFullInformationExportType.LinkedWithMetering }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceFullInformationExportType.LinkedWithMetering }
     */
    public MeteringDeviceFullInformationExportType.LinkedWithMetering createMeteringDeviceFullInformationExportTypeLinkedWithMetering() {
        return new MeteringDeviceFullInformationExportType.LinkedWithMetering();
    }

    /**
     * Create an instance of {@link MeteringDeviceFullInformationType.LinkedWithMetering }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceFullInformationType.LinkedWithMetering }
     */
    public MeteringDeviceFullInformationType.LinkedWithMetering createMeteringDeviceFullInformationTypeLinkedWithMetering() {
        return new MeteringDeviceFullInformationType.LinkedWithMetering();
    }

    /**
     * Create an instance of {@link MeteringDeviceBasicCharacteristicsType.CollectiveDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceBasicCharacteristicsType.CollectiveDevice }
     */
    public MeteringDeviceBasicCharacteristicsType.CollectiveDevice createMeteringDeviceBasicCharacteristicsTypeCollectiveDevice() {
        return new MeteringDeviceBasicCharacteristicsType.CollectiveDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceBasicCharacteristicsType.ResidentialPremiseDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceBasicCharacteristicsType.ResidentialPremiseDevice }
     */
    public MeteringDeviceBasicCharacteristicsType.ResidentialPremiseDevice createMeteringDeviceBasicCharacteristicsTypeResidentialPremiseDevice() {
        return new MeteringDeviceBasicCharacteristicsType.ResidentialPremiseDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceBasicCharacteristicsType.NonResidentialPremiseDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceBasicCharacteristicsType.NonResidentialPremiseDevice }
     */
    public MeteringDeviceBasicCharacteristicsType.NonResidentialPremiseDevice createMeteringDeviceBasicCharacteristicsTypeNonResidentialPremiseDevice() {
        return new MeteringDeviceBasicCharacteristicsType.NonResidentialPremiseDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceBasicCharacteristicsType.ApartmentHouseDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceBasicCharacteristicsType.ApartmentHouseDevice }
     */
    public MeteringDeviceBasicCharacteristicsType.ApartmentHouseDevice createMeteringDeviceBasicCharacteristicsTypeApartmentHouseDevice() {
        return new MeteringDeviceBasicCharacteristicsType.ApartmentHouseDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceBasicCharacteristicsType.LivingRoomDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceBasicCharacteristicsType.LivingRoomDevice }
     */
    public MeteringDeviceBasicCharacteristicsType.LivingRoomDevice createMeteringDeviceBasicCharacteristicsTypeLivingRoomDevice() {
        return new MeteringDeviceBasicCharacteristicsType.LivingRoomDevice();
    }

    /**
     * Create an instance of {@link MeteringDeviceBasicCharacteristicsType.CollectiveApartmentDevice }
     * 
     * @return
     *     the new instance of {@link MeteringDeviceBasicCharacteristicsType.CollectiveApartmentDevice }
     */
    public MeteringDeviceBasicCharacteristicsType.CollectiveApartmentDevice createMeteringDeviceBasicCharacteristicsTypeCollectiveApartmentDevice() {
        return new MeteringDeviceBasicCharacteristicsType.CollectiveApartmentDevice();
    }

    /**
     * Create an instance of {@link ContractSubjectObjectAdressType.ServiceType }
     * 
     * @return
     *     the new instance of {@link ContractSubjectObjectAdressType.ServiceType }
     */
    public ContractSubjectObjectAdressType.ServiceType createContractSubjectObjectAdressTypeServiceType() {
        return new ContractSubjectObjectAdressType.ServiceType();
    }

    /**
     * Create an instance of {@link ContractSubjectObjectAdressType.MunicipalResource }
     * 
     * @return
     *     the new instance of {@link ContractSubjectObjectAdressType.MunicipalResource }
     */
    public ContractSubjectObjectAdressType.MunicipalResource createContractSubjectObjectAdressTypeMunicipalResource() {
        return new ContractSubjectObjectAdressType.MunicipalResource();
    }

    /**
     * Create an instance of {@link PublicPropertyContractExportType.RentAgrConfirmationDocument.ProtocolMeetingOwners }
     * 
     * @return
     *     the new instance of {@link PublicPropertyContractExportType.RentAgrConfirmationDocument.ProtocolMeetingOwners }
     */
    public PublicPropertyContractExportType.RentAgrConfirmationDocument.ProtocolMeetingOwners createPublicPropertyContractExportTypeRentAgrConfirmationDocumentProtocolMeetingOwners() {
        return new PublicPropertyContractExportType.RentAgrConfirmationDocument.ProtocolMeetingOwners();
    }

    /**
     * Create an instance of {@link PublicPropertyContractType.RentAgrConfirmationDocument.ProtocolMeetingOwners }
     * 
     * @return
     *     the new instance of {@link PublicPropertyContractType.RentAgrConfirmationDocument.ProtocolMeetingOwners }
     */
    public PublicPropertyContractType.RentAgrConfirmationDocument.ProtocolMeetingOwners createPublicPropertyContractTypeRentAgrConfirmationDocumentProtocolMeetingOwners() {
        return new PublicPropertyContractType.RentAgrConfirmationDocument.ProtocolMeetingOwners();
    }

    /**
     * Create an instance of {@link ProtocolExportType.AVoting }
     * 
     * @return
     *     the new instance of {@link ProtocolExportType.AVoting }
     */
    public ProtocolExportType.AVoting createProtocolExportTypeAVoting() {
        return new ProtocolExportType.AVoting();
    }

    /**
     * Create an instance of {@link ProtocolExportType.Meeting }
     * 
     * @return
     *     the new instance of {@link ProtocolExportType.Meeting }
     */
    public ProtocolExportType.Meeting createProtocolExportTypeMeeting() {
        return new ProtocolExportType.Meeting();
    }

    /**
     * Create an instance of {@link ProtocolExportType.EVoting }
     * 
     * @return
     *     the new instance of {@link ProtocolExportType.EVoting }
     */
    public ProtocolExportType.EVoting createProtocolExportTypeEVoting() {
        return new ProtocolExportType.EVoting();
    }

    /**
     * Create an instance of {@link ProtocolExportType.MeetingAVoting }
     * 
     * @return
     *     the new instance of {@link ProtocolExportType.MeetingAVoting }
     */
    public ProtocolExportType.MeetingAVoting createProtocolExportTypeMeetingAVoting() {
        return new ProtocolExportType.MeetingAVoting();
    }

    /**
     * Create an instance of {@link ProtocolExportType.VoteInitiators }
     * 
     * @return
     *     the new instance of {@link ProtocolExportType.VoteInitiators }
     */
    public ProtocolExportType.VoteInitiators createProtocolExportTypeVoteInitiators() {
        return new ProtocolExportType.VoteInitiators();
    }

    /**
     * Create an instance of {@link ProtocolExportType.DecisionList.HomeownersDecisionsType }
     * 
     * @return
     *     the new instance of {@link ProtocolExportType.DecisionList.HomeownersDecisionsType }
     */
    public ProtocolExportType.DecisionList.HomeownersDecisionsType createProtocolExportTypeDecisionListHomeownersDecisionsType() {
        return new ProtocolExportType.DecisionList.HomeownersDecisionsType();
    }

    /**
     * Create an instance of {@link AdminOfGeneralMeetingType.CitizenAdministator }
     * 
     * @return
     *     the new instance of {@link AdminOfGeneralMeetingType.CitizenAdministator }
     */
    public AdminOfGeneralMeetingType.CitizenAdministator createAdminOfGeneralMeetingTypeCitizenAdministator() {
        return new AdminOfGeneralMeetingType.CitizenAdministator();
    }

    /**
     * Create an instance of {@link MessageExportType.AVoting }
     * 
     * @return
     *     the new instance of {@link MessageExportType.AVoting }
     */
    public MessageExportType.AVoting createMessageExportTypeAVoting() {
        return new MessageExportType.AVoting();
    }

    /**
     * Create an instance of {@link MessageExportType.Meeting }
     * 
     * @return
     *     the new instance of {@link MessageExportType.Meeting }
     */
    public MessageExportType.Meeting createMessageExportTypeMeeting() {
        return new MessageExportType.Meeting();
    }

    /**
     * Create an instance of {@link MessageExportType.MeetingAVoting }
     * 
     * @return
     *     the new instance of {@link MessageExportType.MeetingAVoting }
     */
    public MessageExportType.MeetingAVoting createMessageExportTypeMeetingAVoting() {
        return new MessageExportType.MeetingAVoting();
    }

    /**
     * Create an instance of {@link MessageExportType.EVoting }
     * 
     * @return
     *     the new instance of {@link MessageExportType.EVoting }
     */
    public MessageExportType.EVoting createMessageExportTypeEVoting() {
        return new MessageExportType.EVoting();
    }

    /**
     * Create an instance of {@link MessageExportType.DecisionList.HomeownersDecisionsType }
     * 
     * @return
     *     the new instance of {@link MessageExportType.DecisionList.HomeownersDecisionsType }
     */
    public MessageExportType.DecisionList.HomeownersDecisionsType createMessageExportTypeDecisionListHomeownersDecisionsType() {
        return new MessageExportType.DecisionList.HomeownersDecisionsType();
    }

    /**
     * Create an instance of {@link ProtocolType.AVoting }
     * 
     * @return
     *     the new instance of {@link ProtocolType.AVoting }
     */
    public ProtocolType.AVoting createProtocolTypeAVoting() {
        return new ProtocolType.AVoting();
    }

    /**
     * Create an instance of {@link ProtocolType.Meeting }
     * 
     * @return
     *     the new instance of {@link ProtocolType.Meeting }
     */
    public ProtocolType.Meeting createProtocolTypeMeeting() {
        return new ProtocolType.Meeting();
    }

    /**
     * Create an instance of {@link ProtocolType.EVoting }
     * 
     * @return
     *     the new instance of {@link ProtocolType.EVoting }
     */
    public ProtocolType.EVoting createProtocolTypeEVoting() {
        return new ProtocolType.EVoting();
    }

    /**
     * Create an instance of {@link ProtocolType.MeetingAVoting }
     * 
     * @return
     *     the new instance of {@link ProtocolType.MeetingAVoting }
     */
    public ProtocolType.MeetingAVoting createProtocolTypeMeetingAVoting() {
        return new ProtocolType.MeetingAVoting();
    }

    /**
     * Create an instance of {@link ProtocolType.DecisionList.HomeownersDecisionsType }
     * 
     * @return
     *     the new instance of {@link ProtocolType.DecisionList.HomeownersDecisionsType }
     */
    public ProtocolType.DecisionList.HomeownersDecisionsType createProtocolTypeDecisionListHomeownersDecisionsType() {
        return new ProtocolType.DecisionList.HomeownersDecisionsType();
    }

    /**
     * Create an instance of {@link CharterPaymentsInfoType.MaintenanceAndRepairsForMembers }
     * 
     * @return
     *     the new instance of {@link CharterPaymentsInfoType.MaintenanceAndRepairsForMembers }
     */
    public CharterPaymentsInfoType.MaintenanceAndRepairsForMembers createCharterPaymentsInfoTypeMaintenanceAndRepairsForMembers() {
        return new CharterPaymentsInfoType.MaintenanceAndRepairsForMembers();
    }

    /**
     * Create an instance of {@link CharterPaymentsInfoType.MaintenanceAndRepairsForNonMembersInfo }
     * 
     * @return
     *     the new instance of {@link CharterPaymentsInfoType.MaintenanceAndRepairsForNonMembersInfo }
     */
    public CharterPaymentsInfoType.MaintenanceAndRepairsForNonMembersInfo createCharterPaymentsInfoTypeMaintenanceAndRepairsForNonMembersInfo() {
        return new CharterPaymentsInfoType.MaintenanceAndRepairsForNonMembersInfo();
    }

    /**
     * Create an instance of {@link CharterPaymentsInfoType.ServicePayment }
     * 
     * @return
     *     the new instance of {@link CharterPaymentsInfoType.ServicePayment }
     */
    public CharterPaymentsInfoType.ServicePayment createCharterPaymentsInfoTypeServicePayment() {
        return new CharterPaymentsInfoType.ServicePayment();
    }

    /**
     * Create an instance of {@link ContractPaymentsInfoType.ServicePayment }
     * 
     * @return
     *     the new instance of {@link ContractPaymentsInfoType.ServicePayment }
     */
    public ContractPaymentsInfoType.ServicePayment createContractPaymentsInfoTypeServicePayment() {
        return new ContractPaymentsInfoType.ServicePayment();
    }

    /**
     * Create an instance of {@link ContractExportType.Validity }
     * 
     * @return
     *     the new instance of {@link ContractExportType.Validity }
     */
    public ContractExportType.Validity createContractExportTypeValidity() {
        return new ContractExportType.Validity();
    }

    /**
     * Create an instance of {@link ContractExportType.AgreementAttachment }
     * 
     * @return
     *     the new instance of {@link ContractExportType.AgreementAttachment }
     */
    public ContractExportType.AgreementAttachment createContractExportTypeAgreementAttachment() {
        return new ContractExportType.AgreementAttachment();
    }

    /**
     * Create an instance of {@link ContractExportType.Protocol.ProtocolAdd }
     * 
     * @return
     *     the new instance of {@link ContractExportType.Protocol.ProtocolAdd }
     */
    public ContractExportType.Protocol.ProtocolAdd createContractExportTypeProtocolProtocolAdd() {
        return new ContractExportType.Protocol.ProtocolAdd();
    }

    /**
     * Create an instance of {@link ContractType.Validity }
     * 
     * @return
     *     the new instance of {@link ContractType.Validity }
     */
    public ContractType.Validity createContractTypeValidity() {
        return new ContractType.Validity();
    }

    /**
     * Create an instance of {@link ContractType.AgreementAttachment }
     * 
     * @return
     *     the new instance of {@link ContractType.AgreementAttachment }
     */
    public ContractType.AgreementAttachment createContractTypeAgreementAttachment() {
        return new ContractType.AgreementAttachment();
    }

    /**
     * Create an instance of {@link ContractType.Protocol.ProtocolAdd }
     * 
     * @return
     *     the new instance of {@link ContractType.Protocol.ProtocolAdd }
     */
    public ContractType.Protocol.ProtocolAdd createContractTypeProtocolProtocolAdd() {
        return new ContractType.Protocol.ProtocolAdd();
    }

    /**
     * Create an instance of {@link CharterExportType.MeetingProtocol }
     * 
     * @return
     *     the new instance of {@link CharterExportType.MeetingProtocol }
     */
    public CharterExportType.MeetingProtocol createCharterExportTypeMeetingProtocol() {
        return new CharterExportType.MeetingProtocol();
    }

    /**
     * Create an instance of {@link CharterType.MeetingProtocol }
     * 
     * @return
     *     the new instance of {@link CharterType.MeetingProtocol }
     */
    public CharterType.MeetingProtocol createCharterTypeMeetingProtocol() {
        return new CharterType.MeetingProtocol();
    }

    /**
     * Create an instance of {@link CharterDateDetailsExportType.PeriodMetering }
     * 
     * @return
     *     the new instance of {@link CharterDateDetailsExportType.PeriodMetering }
     */
    public CharterDateDetailsExportType.PeriodMetering createCharterDateDetailsExportTypePeriodMetering() {
        return new CharterDateDetailsExportType.PeriodMetering();
    }

    /**
     * Create an instance of {@link CharterDateDetailsExportType.PaymentDocumentInterval }
     * 
     * @return
     *     the new instance of {@link CharterDateDetailsExportType.PaymentDocumentInterval }
     */
    public CharterDateDetailsExportType.PaymentDocumentInterval createCharterDateDetailsExportTypePaymentDocumentInterval() {
        return new CharterDateDetailsExportType.PaymentDocumentInterval();
    }

    /**
     * Create an instance of {@link CharterDateDetailsExportType.PaymentInterval }
     * 
     * @return
     *     the new instance of {@link CharterDateDetailsExportType.PaymentInterval }
     */
    public CharterDateDetailsExportType.PaymentInterval createCharterDateDetailsExportTypePaymentInterval() {
        return new CharterDateDetailsExportType.PaymentInterval();
    }

    /**
     * Create an instance of {@link CharterDateDetailsType.PeriodMetering }
     * 
     * @return
     *     the new instance of {@link CharterDateDetailsType.PeriodMetering }
     */
    public CharterDateDetailsType.PeriodMetering createCharterDateDetailsTypePeriodMetering() {
        return new CharterDateDetailsType.PeriodMetering();
    }

    /**
     * Create an instance of {@link CharterDateDetailsType.PaymentDocumentInterval }
     * 
     * @return
     *     the new instance of {@link CharterDateDetailsType.PaymentDocumentInterval }
     */
    public CharterDateDetailsType.PaymentDocumentInterval createCharterDateDetailsTypePaymentDocumentInterval() {
        return new CharterDateDetailsType.PaymentDocumentInterval();
    }

    /**
     * Create an instance of {@link CharterDateDetailsType.PaymentInterval }
     * 
     * @return
     *     the new instance of {@link CharterDateDetailsType.PaymentInterval }
     */
    public CharterDateDetailsType.PaymentInterval createCharterDateDetailsTypePaymentInterval() {
        return new CharterDateDetailsType.PaymentInterval();
    }

    /**
     * Create an instance of {@link DateDetailsExportType.PeriodMetering }
     * 
     * @return
     *     the new instance of {@link DateDetailsExportType.PeriodMetering }
     */
    public DateDetailsExportType.PeriodMetering createDateDetailsExportTypePeriodMetering() {
        return new DateDetailsExportType.PeriodMetering();
    }

    /**
     * Create an instance of {@link DateDetailsExportType.PaymentDocumentInterval }
     * 
     * @return
     *     the new instance of {@link DateDetailsExportType.PaymentDocumentInterval }
     */
    public DateDetailsExportType.PaymentDocumentInterval createDateDetailsExportTypePaymentDocumentInterval() {
        return new DateDetailsExportType.PaymentDocumentInterval();
    }

    /**
     * Create an instance of {@link DateDetailsExportType.PaymentInterval }
     * 
     * @return
     *     the new instance of {@link DateDetailsExportType.PaymentInterval }
     */
    public DateDetailsExportType.PaymentInterval createDateDetailsExportTypePaymentInterval() {
        return new DateDetailsExportType.PaymentInterval();
    }

    /**
     * Create an instance of {@link DateDetailsType.PeriodMetering }
     * 
     * @return
     *     the new instance of {@link DateDetailsType.PeriodMetering }
     */
    public DateDetailsType.PeriodMetering createDateDetailsTypePeriodMetering() {
        return new DateDetailsType.PeriodMetering();
    }

    /**
     * Create an instance of {@link DateDetailsType.PaymentDocumentInterval }
     * 
     * @return
     *     the new instance of {@link DateDetailsType.PaymentDocumentInterval }
     */
    public DateDetailsType.PaymentDocumentInterval createDateDetailsTypePaymentDocumentInterval() {
        return new DateDetailsType.PaymentDocumentInterval();
    }

    /**
     * Create an instance of {@link DateDetailsType.PaymentInterval }
     * 
     * @return
     *     the new instance of {@link DateDetailsType.PaymentInterval }
     */
    public DateDetailsType.PaymentInterval createDateDetailsTypePaymentInterval() {
        return new DateDetailsType.PaymentInterval();
    }

    /**
     * Create an instance of {@link AccountReasonsImportType.SupplyResourceContract }
     * 
     * @return
     *     the new instance of {@link AccountReasonsImportType.SupplyResourceContract }
     */
    public AccountReasonsImportType.SupplyResourceContract createAccountReasonsImportTypeSupplyResourceContract() {
        return new AccountReasonsImportType.SupplyResourceContract();
    }

    /**
     * Create an instance of {@link AccountReasonsImportType.SocialHireContract }
     * 
     * @return
     *     the new instance of {@link AccountReasonsImportType.SocialHireContract }
     */
    public AccountReasonsImportType.SocialHireContract createAccountReasonsImportTypeSocialHireContract() {
        return new AccountReasonsImportType.SocialHireContract();
    }

    /**
     * Create an instance of {@link AccountReasonsImportType.TKOContract }
     * 
     * @return
     *     the new instance of {@link AccountReasonsImportType.TKOContract }
     */
    public AccountReasonsImportType.TKOContract createAccountReasonsImportTypeTKOContract() {
        return new AccountReasonsImportType.TKOContract();
    }

    /**
     * Create an instance of {@link AccountIndExportType.ID }
     * 
     * @return
     *     the new instance of {@link AccountIndExportType.ID }
     */
    public AccountIndExportType.ID createAccountIndExportTypeID() {
        return new AccountIndExportType.ID();
    }

    /**
     * Create an instance of {@link AccountExportType.Accommodation }
     * 
     * @return
     *     the new instance of {@link AccountExportType.Accommodation }
     */
    public AccountExportType.Accommodation createAccountExportTypeAccommodation() {
        return new AccountExportType.Accommodation();
    }

    /**
     * Create an instance of {@link AccountExportType.PayerInfo }
     * 
     * @return
     *     the new instance of {@link AccountExportType.PayerInfo }
     */
    public AccountExportType.PayerInfo createAccountExportTypePayerInfo() {
        return new AccountExportType.PayerInfo();
    }

    /**
     * Create an instance of {@link AccountType.Accommodation }
     * 
     * @return
     *     the new instance of {@link AccountType.Accommodation }
     */
    public AccountType.Accommodation createAccountTypeAccommodation() {
        return new AccountType.Accommodation();
    }

    /**
     * Create an instance of {@link AccountType.PayerInfo }
     * 
     * @return
     *     the new instance of {@link AccountType.PayerInfo }
     */
    public AccountType.PayerInfo createAccountTypePayerInfo() {
        return new AccountType.PayerInfo();
    }

    /**
     * Create an instance of {@link LivingHouseOMSType.BasicCharacteristicts }
     * 
     * @return
     *     the new instance of {@link LivingHouseOMSType.BasicCharacteristicts }
     */
    public LivingHouseOMSType.BasicCharacteristicts createLivingHouseOMSTypeBasicCharacteristicts() {
        return new LivingHouseOMSType.BasicCharacteristicts();
    }

    /**
     * Create an instance of {@link ApartmentHouseESPType.BasicCharacteristicts }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseESPType.BasicCharacteristicts }
     */
    public ApartmentHouseESPType.BasicCharacteristicts createApartmentHouseESPTypeBasicCharacteristicts() {
        return new ApartmentHouseESPType.BasicCharacteristicts();
    }

    /**
     * Create an instance of {@link ApartmentHouseOMSType.BasicCharacteristicts }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseOMSType.BasicCharacteristicts }
     */
    public ApartmentHouseOMSType.BasicCharacteristicts createApartmentHouseOMSTypeBasicCharacteristicts() {
        return new ApartmentHouseOMSType.BasicCharacteristicts();
    }

    /**
     * Create an instance of {@link ApartmentHouseUOType.BasicCharacteristicts }
     * 
     * @return
     *     the new instance of {@link ApartmentHouseUOType.BasicCharacteristicts }
     */
    public ApartmentHouseUOType.BasicCharacteristicts createApartmentHouseUOTypeBasicCharacteristicts() {
        return new ApartmentHouseUOType.BasicCharacteristicts();
    }

    /**
     * Create an instance of {@link OGFImportStatusType.GKNRelationshipStatus }
     * 
     * @return
     *     the new instance of {@link OGFImportStatusType.GKNRelationshipStatus }
     */
    public OGFImportStatusType.GKNRelationshipStatus createOGFImportStatusTypeGKNRelationshipStatus() {
        return new OGFImportStatusType.GKNRelationshipStatus();
    }

    /**
     * Create an instance of {@link ExportStatusCAChResultType.ContractObject }
     * 
     * @return
     *     the new instance of {@link ExportStatusCAChResultType.ContractObject }
     */
    public ExportStatusCAChResultType.ContractObject createExportStatusCAChResultTypeContractObject() {
        return new ExportStatusCAChResultType.ContractObject();
    }

    /**
     * Create an instance of {@link ObjectAddressBriefType.Pair }
     * 
     * @return
     *     the new instance of {@link ObjectAddressBriefType.Pair }
     */
    public ObjectAddressBriefType.Pair createObjectAddressBriefTypePair() {
        return new ObjectAddressBriefType.Pair();
    }

    /**
     * Create an instance of {@link ContractSubjectType.ServiceType }
     * 
     * @return
     *     the new instance of {@link ContractSubjectType.ServiceType }
     */
    public ContractSubjectType.ServiceType createContractSubjectTypeServiceType() {
        return new ContractSubjectType.ServiceType();
    }

    /**
     * Create an instance of {@link ContractSubjectType.MunicipalResource }
     * 
     * @return
     *     the new instance of {@link ContractSubjectType.MunicipalResource }
     */
    public ContractSubjectType.MunicipalResource createContractSubjectTypeMunicipalResource() {
        return new ContractSubjectType.MunicipalResource();
    }

    /**
     * Create an instance of {@link ContractSubjectType.PlannedVolume }
     * 
     * @return
     *     the new instance of {@link ContractSubjectType.PlannedVolume }
     */
    public ContractSubjectType.PlannedVolume createContractSubjectTypePlannedVolume() {
        return new ContractSubjectType.PlannedVolume();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.IsContract }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.IsContract }
     */
    public ExportBriefSupplyResourceContractResultType.IsContract createExportBriefSupplyResourceContractResultTypeIsContract() {
        return new ExportBriefSupplyResourceContractResultType.IsContract();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.IsNotContract }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.IsNotContract }
     */
    public ExportBriefSupplyResourceContractResultType.IsNotContract createExportBriefSupplyResourceContractResultTypeIsNotContract() {
        return new ExportBriefSupplyResourceContractResultType.IsNotContract();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.FirstPartyContract }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.FirstPartyContract }
     */
    public ExportBriefSupplyResourceContractResultType.FirstPartyContract createExportBriefSupplyResourceContractResultTypeFirstPartyContract() {
        return new ExportBriefSupplyResourceContractResultType.FirstPartyContract();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.BillingDate }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.BillingDate }
     */
    public ExportBriefSupplyResourceContractResultType.BillingDate createExportBriefSupplyResourceContractResultTypeBillingDate() {
        return new ExportBriefSupplyResourceContractResultType.BillingDate();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.PaymentDate }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.PaymentDate }
     */
    public ExportBriefSupplyResourceContractResultType.PaymentDate createExportBriefSupplyResourceContractResultTypePaymentDate() {
        return new ExportBriefSupplyResourceContractResultType.PaymentDate();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.ProvidingInformationDate }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.ProvidingInformationDate }
     */
    public ExportBriefSupplyResourceContractResultType.ProvidingInformationDate createExportBriefSupplyResourceContractResultTypeProvidingInformationDate() {
        return new ExportBriefSupplyResourceContractResultType.ProvidingInformationDate();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.TerminateContract }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.TerminateContract }
     */
    public ExportBriefSupplyResourceContractResultType.TerminateContract createExportBriefSupplyResourceContractResultTypeTerminateContract() {
        return new ExportBriefSupplyResourceContractResultType.TerminateContract();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.Period.Start }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.Period.Start }
     */
    public ExportBriefSupplyResourceContractResultType.Period.Start createExportBriefSupplyResourceContractResultTypePeriodStart() {
        return new ExportBriefSupplyResourceContractResultType.Period.Start();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.Period.End }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.Period.End }
     */
    public ExportBriefSupplyResourceContractResultType.Period.End createExportBriefSupplyResourceContractResultTypePeriodEnd() {
        return new ExportBriefSupplyResourceContractResultType.Period.End();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.ContractSubject.ServiceType }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.ContractSubject.ServiceType }
     */
    public ExportBriefSupplyResourceContractResultType.ContractSubject.ServiceType createExportBriefSupplyResourceContractResultTypeContractSubjectServiceType() {
        return new ExportBriefSupplyResourceContractResultType.ContractSubject.ServiceType();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.ContractSubject.MunicipalResource }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.ContractSubject.MunicipalResource }
     */
    public ExportBriefSupplyResourceContractResultType.ContractSubject.MunicipalResource createExportBriefSupplyResourceContractResultTypeContractSubjectMunicipalResource() {
        return new ExportBriefSupplyResourceContractResultType.ContractSubject.MunicipalResource();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractResultType.SecondPartyContract.Organization }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractResultType.SecondPartyContract.Organization }
     */
    public ExportBriefSupplyResourceContractResultType.SecondPartyContract.Organization createExportBriefSupplyResourceContractResultTypeSecondPartyContractOrganization() {
        return new ExportBriefSupplyResourceContractResultType.SecondPartyContract.Organization();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.IsContract }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.IsContract }
     */
    public SupplyResourceContractProjectType.IsContract createSupplyResourceContractProjectTypeIsContract() {
        return new SupplyResourceContractProjectType.IsContract();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.IsNotContract }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.IsNotContract }
     */
    public SupplyResourceContractProjectType.IsNotContract createSupplyResourceContractProjectTypeIsNotContract() {
        return new SupplyResourceContractProjectType.IsNotContract();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.ApartmentBuildingOwner }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.ApartmentBuildingOwner }
     */
    public SupplyResourceContractProjectType.ApartmentBuildingOwner createSupplyResourceContractProjectTypeApartmentBuildingOwner() {
        return new SupplyResourceContractProjectType.ApartmentBuildingOwner();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.LivingHouseOwner }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.LivingHouseOwner }
     */
    public SupplyResourceContractProjectType.LivingHouseOwner createSupplyResourceContractProjectTypeLivingHouseOwner() {
        return new SupplyResourceContractProjectType.LivingHouseOwner();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.Organization }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.Organization }
     */
    public SupplyResourceContractProjectType.Organization createSupplyResourceContractProjectTypeOrganization() {
        return new SupplyResourceContractProjectType.Organization();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.ApartmentBuildingSoleOwner }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.ApartmentBuildingSoleOwner }
     */
    public SupplyResourceContractProjectType.ApartmentBuildingSoleOwner createSupplyResourceContractProjectTypeApartmentBuildingSoleOwner() {
        return new SupplyResourceContractProjectType.ApartmentBuildingSoleOwner();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.ApartmentBuildingRepresentativeOwner }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.ApartmentBuildingRepresentativeOwner }
     */
    public SupplyResourceContractProjectType.ApartmentBuildingRepresentativeOwner createSupplyResourceContractProjectTypeApartmentBuildingRepresentativeOwner() {
        return new SupplyResourceContractProjectType.ApartmentBuildingRepresentativeOwner();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.ContractSubject }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.ContractSubject }
     */
    public SupplyResourceContractProjectType.ContractSubject createSupplyResourceContractProjectTypeContractSubject() {
        return new SupplyResourceContractProjectType.ContractSubject();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.OtherQualityIndicator }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.OtherQualityIndicator }
     */
    public SupplyResourceContractProjectType.OtherQualityIndicator createSupplyResourceContractProjectTypeOtherQualityIndicator() {
        return new SupplyResourceContractProjectType.OtherQualityIndicator();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.TemperatureChart }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.TemperatureChart }
     */
    public SupplyResourceContractProjectType.TemperatureChart createSupplyResourceContractProjectTypeTemperatureChart() {
        return new SupplyResourceContractProjectType.TemperatureChart();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.BillingDate }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.BillingDate }
     */
    public SupplyResourceContractProjectType.BillingDate createSupplyResourceContractProjectTypeBillingDate() {
        return new SupplyResourceContractProjectType.BillingDate();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.PaymentDate }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.PaymentDate }
     */
    public SupplyResourceContractProjectType.PaymentDate createSupplyResourceContractProjectTypePaymentDate() {
        return new SupplyResourceContractProjectType.PaymentDate();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.ProvidingInformationDate }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.ProvidingInformationDate }
     */
    public SupplyResourceContractProjectType.ProvidingInformationDate createSupplyResourceContractProjectTypeProvidingInformationDate() {
        return new SupplyResourceContractProjectType.ProvidingInformationDate();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.RegionalSettings.Tariff }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.RegionalSettings.Tariff }
     */
    public SupplyResourceContractProjectType.RegionalSettings.Tariff createSupplyResourceContractProjectTypeRegionalSettingsTariff() {
        return new SupplyResourceContractProjectType.RegionalSettings.Tariff();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.RegionalSettings.Norm }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.RegionalSettings.Norm }
     */
    public SupplyResourceContractProjectType.RegionalSettings.Norm createSupplyResourceContractProjectTypeRegionalSettingsNorm() {
        return new SupplyResourceContractProjectType.RegionalSettings.Norm();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.Quality.IndicatorValue }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.Quality.IndicatorValue }
     */
    public SupplyResourceContractProjectType.Quality.IndicatorValue createSupplyResourceContractProjectTypeQualityIndicatorValue() {
        return new SupplyResourceContractProjectType.Quality.IndicatorValue();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.Period.Start }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.Period.Start }
     */
    public SupplyResourceContractProjectType.Period.Start createSupplyResourceContractProjectTypePeriodStart() {
        return new SupplyResourceContractProjectType.Period.Start();
    }

    /**
     * Create an instance of {@link SupplyResourceContractProjectType.Period.End }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractProjectType.Period.End }
     */
    public SupplyResourceContractProjectType.Period.End createSupplyResourceContractProjectTypePeriodEnd() {
        return new SupplyResourceContractProjectType.Period.End();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractObjectAddressResultType.PlannedVolume }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractObjectAddressResultType.PlannedVolume }
     */
    public ExportSupplyResourceContractObjectAddressResultType.PlannedVolume createExportSupplyResourceContractObjectAddressResultTypePlannedVolume() {
        return new ExportSupplyResourceContractObjectAddressResultType.PlannedVolume();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator.IndicatorValue }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator.IndicatorValue }
     */
    public ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator.IndicatorValue createExportSupplyResourceContractObjectAddressResultTypeOtherQualityIndicatorIndicatorValue() {
        return new ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator.IndicatorValue();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractObjectAddressResultType.Quality.IndicatorValue }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractObjectAddressResultType.Quality.IndicatorValue }
     */
    public ExportSupplyResourceContractObjectAddressResultType.Quality.IndicatorValue createExportSupplyResourceContractObjectAddressResultTypeQualityIndicatorValue() {
        return new ExportSupplyResourceContractObjectAddressResultType.Quality.IndicatorValue();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractObjectAddressResultType.Pair.HeatingSystemType }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractObjectAddressResultType.Pair.HeatingSystemType }
     */
    public ExportSupplyResourceContractObjectAddressResultType.Pair.HeatingSystemType createExportSupplyResourceContractObjectAddressResultTypePairHeatingSystemType() {
        return new ExportSupplyResourceContractObjectAddressResultType.Pair.HeatingSystemType();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.IsContract }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.IsContract }
     */
    public ExportSupplyResourceContractType.IsContract createExportSupplyResourceContractTypeIsContract() {
        return new ExportSupplyResourceContractType.IsContract();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.IsNotContract }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.IsNotContract }
     */
    public ExportSupplyResourceContractType.IsNotContract createExportSupplyResourceContractTypeIsNotContract() {
        return new ExportSupplyResourceContractType.IsNotContract();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.ApartmentBuildingOwner }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.ApartmentBuildingOwner }
     */
    public ExportSupplyResourceContractType.ApartmentBuildingOwner createExportSupplyResourceContractTypeApartmentBuildingOwner() {
        return new ExportSupplyResourceContractType.ApartmentBuildingOwner();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.LivingHouseOwner }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.LivingHouseOwner }
     */
    public ExportSupplyResourceContractType.LivingHouseOwner createExportSupplyResourceContractTypeLivingHouseOwner() {
        return new ExportSupplyResourceContractType.LivingHouseOwner();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.Organization }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.Organization }
     */
    public ExportSupplyResourceContractType.Organization createExportSupplyResourceContractTypeOrganization() {
        return new ExportSupplyResourceContractType.Organization();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.ApartmentBuildingRepresentativeOwner }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.ApartmentBuildingRepresentativeOwner }
     */
    public ExportSupplyResourceContractType.ApartmentBuildingRepresentativeOwner createExportSupplyResourceContractTypeApartmentBuildingRepresentativeOwner() {
        return new ExportSupplyResourceContractType.ApartmentBuildingRepresentativeOwner();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.ApartmentBuildingSoleOwner }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.ApartmentBuildingSoleOwner }
     */
    public ExportSupplyResourceContractType.ApartmentBuildingSoleOwner createExportSupplyResourceContractTypeApartmentBuildingSoleOwner() {
        return new ExportSupplyResourceContractType.ApartmentBuildingSoleOwner();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.PlannedVolume }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.PlannedVolume }
     */
    public ExportSupplyResourceContractType.PlannedVolume createExportSupplyResourceContractTypePlannedVolume() {
        return new ExportSupplyResourceContractType.PlannedVolume();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.BillingDate }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.BillingDate }
     */
    public ExportSupplyResourceContractType.BillingDate createExportSupplyResourceContractTypeBillingDate() {
        return new ExportSupplyResourceContractType.BillingDate();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.PaymentDate }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.PaymentDate }
     */
    public ExportSupplyResourceContractType.PaymentDate createExportSupplyResourceContractTypePaymentDate() {
        return new ExportSupplyResourceContractType.PaymentDate();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.ProvidingInformationDate }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.ProvidingInformationDate }
     */
    public ExportSupplyResourceContractType.ProvidingInformationDate createExportSupplyResourceContractTypeProvidingInformationDate() {
        return new ExportSupplyResourceContractType.ProvidingInformationDate();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.OtherQualityIndicator.IndicatorValue }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.OtherQualityIndicator.IndicatorValue }
     */
    public ExportSupplyResourceContractType.OtherQualityIndicator.IndicatorValue createExportSupplyResourceContractTypeOtherQualityIndicatorIndicatorValue() {
        return new ExportSupplyResourceContractType.OtherQualityIndicator.IndicatorValue();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.Quality.IndicatorValue }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.Quality.IndicatorValue }
     */
    public ExportSupplyResourceContractType.Quality.IndicatorValue createExportSupplyResourceContractTypeQualityIndicatorValue() {
        return new ExportSupplyResourceContractType.Quality.IndicatorValue();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.ContractSubject.ServiceType }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.ContractSubject.ServiceType }
     */
    public ExportSupplyResourceContractType.ContractSubject.ServiceType createExportSupplyResourceContractTypeContractSubjectServiceType() {
        return new ExportSupplyResourceContractType.ContractSubject.ServiceType();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.ContractSubject.MunicipalResource }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.ContractSubject.MunicipalResource }
     */
    public ExportSupplyResourceContractType.ContractSubject.MunicipalResource createExportSupplyResourceContractTypeContractSubjectMunicipalResource() {
        return new ExportSupplyResourceContractType.ContractSubject.MunicipalResource();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.Period.Start }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.Period.Start }
     */
    public ExportSupplyResourceContractType.Period.Start createExportSupplyResourceContractTypePeriodStart() {
        return new ExportSupplyResourceContractType.Period.Start();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractType.Period.End }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractType.Period.End }
     */
    public ExportSupplyResourceContractType.Period.End createExportSupplyResourceContractTypePeriodEnd() {
        return new ExportSupplyResourceContractType.Period.End();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.IsContract }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.IsContract }
     */
    public SupplyResourceContractType.IsContract createSupplyResourceContractTypeIsContract() {
        return new SupplyResourceContractType.IsContract();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.IsNotContract }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.IsNotContract }
     */
    public SupplyResourceContractType.IsNotContract createSupplyResourceContractTypeIsNotContract() {
        return new SupplyResourceContractType.IsNotContract();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.ApartmentBuildingOwner }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.ApartmentBuildingOwner }
     */
    public SupplyResourceContractType.ApartmentBuildingOwner createSupplyResourceContractTypeApartmentBuildingOwner() {
        return new SupplyResourceContractType.ApartmentBuildingOwner();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.LivingHouseOwner }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.LivingHouseOwner }
     */
    public SupplyResourceContractType.LivingHouseOwner createSupplyResourceContractTypeLivingHouseOwner() {
        return new SupplyResourceContractType.LivingHouseOwner();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.Organization }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.Organization }
     */
    public SupplyResourceContractType.Organization createSupplyResourceContractTypeOrganization() {
        return new SupplyResourceContractType.Organization();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.ApartmentBuildingRepresentativeOwner }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.ApartmentBuildingRepresentativeOwner }
     */
    public SupplyResourceContractType.ApartmentBuildingRepresentativeOwner createSupplyResourceContractTypeApartmentBuildingRepresentativeOwner() {
        return new SupplyResourceContractType.ApartmentBuildingRepresentativeOwner();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.ApartmentBuildingSoleOwner }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.ApartmentBuildingSoleOwner }
     */
    public SupplyResourceContractType.ApartmentBuildingSoleOwner createSupplyResourceContractTypeApartmentBuildingSoleOwner() {
        return new SupplyResourceContractType.ApartmentBuildingSoleOwner();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.ContractSubject }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.ContractSubject }
     */
    public SupplyResourceContractType.ContractSubject createSupplyResourceContractTypeContractSubject() {
        return new SupplyResourceContractType.ContractSubject();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.OtherQualityIndicator }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.OtherQualityIndicator }
     */
    public SupplyResourceContractType.OtherQualityIndicator createSupplyResourceContractTypeOtherQualityIndicator() {
        return new SupplyResourceContractType.OtherQualityIndicator();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.TemperatureChart }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.TemperatureChart }
     */
    public SupplyResourceContractType.TemperatureChart createSupplyResourceContractTypeTemperatureChart() {
        return new SupplyResourceContractType.TemperatureChart();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.BillingDate }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.BillingDate }
     */
    public SupplyResourceContractType.BillingDate createSupplyResourceContractTypeBillingDate() {
        return new SupplyResourceContractType.BillingDate();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.PaymentDate }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.PaymentDate }
     */
    public SupplyResourceContractType.PaymentDate createSupplyResourceContractTypePaymentDate() {
        return new SupplyResourceContractType.PaymentDate();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.ProvidingInformationDate }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.ProvidingInformationDate }
     */
    public SupplyResourceContractType.ProvidingInformationDate createSupplyResourceContractTypeProvidingInformationDate() {
        return new SupplyResourceContractType.ProvidingInformationDate();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.Tariff }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.Tariff }
     */
    public SupplyResourceContractType.Tariff createSupplyResourceContractTypeTariff() {
        return new SupplyResourceContractType.Tariff();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.Norm }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.Norm }
     */
    public SupplyResourceContractType.Norm createSupplyResourceContractTypeNorm() {
        return new SupplyResourceContractType.Norm();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.Quality.IndicatorValue }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.Quality.IndicatorValue }
     */
    public SupplyResourceContractType.Quality.IndicatorValue createSupplyResourceContractTypeQualityIndicatorValue() {
        return new SupplyResourceContractType.Quality.IndicatorValue();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.ObjectAddress.PlannedVolume }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.ObjectAddress.PlannedVolume }
     */
    public SupplyResourceContractType.ObjectAddress.PlannedVolume createSupplyResourceContractTypeObjectAddressPlannedVolume() {
        return new SupplyResourceContractType.ObjectAddress.PlannedVolume();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.ObjectAddress.Pair.HeatingSystemType }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.ObjectAddress.Pair.HeatingSystemType }
     */
    public SupplyResourceContractType.ObjectAddress.Pair.HeatingSystemType createSupplyResourceContractTypeObjectAddressPairHeatingSystemType() {
        return new SupplyResourceContractType.ObjectAddress.Pair.HeatingSystemType();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.Period.Start }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.Period.Start }
     */
    public SupplyResourceContractType.Period.Start createSupplyResourceContractTypePeriodStart() {
        return new SupplyResourceContractType.Period.Start();
    }

    /**
     * Create an instance of {@link SupplyResourceContractType.Period.End }
     * 
     * @return
     *     the new instance of {@link SupplyResourceContractType.Period.End }
     */
    public SupplyResourceContractType.Period.End createSupplyResourceContractTypePeriodEnd() {
        return new SupplyResourceContractType.Period.End();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractResultType.TerminateContract }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractResultType.TerminateContract }
     */
    public ExportSupplyResourceContractResultType.TerminateContract createExportSupplyResourceContractResultTypeTerminateContract() {
        return new ExportSupplyResourceContractResultType.TerminateContract();
    }

    /**
     * Create an instance of {@link ExportBriefSocialHireContractResultType.TerminateContract }
     * 
     * @return
     *     the new instance of {@link ExportBriefSocialHireContractResultType.TerminateContract }
     */
    public ExportBriefSocialHireContractResultType.TerminateContract createExportBriefSocialHireContractResultTypeTerminateContract() {
        return new ExportBriefSocialHireContractResultType.TerminateContract();
    }

    /**
     * Create an instance of {@link ExportBriefSocialHireContractResultType.ObjectAddress }
     * 
     * @return
     *     the new instance of {@link ExportBriefSocialHireContractResultType.ObjectAddress }
     */
    public ExportBriefSocialHireContractResultType.ObjectAddress createExportBriefSocialHireContractResultTypeObjectAddress() {
        return new ExportBriefSocialHireContractResultType.ObjectAddress();
    }

    /**
     * Create an instance of {@link ExportRolloverStatusCAChResultType.Status.CACh.ContractObject }
     * 
     * @return
     *     the new instance of {@link ExportRolloverStatusCAChResultType.Status.CACh.ContractObject }
     */
    public ExportRolloverStatusCAChResultType.Status.CACh.ContractObject createExportRolloverStatusCAChResultTypeStatusCAChContractObject() {
        return new ExportRolloverStatusCAChResultType.Status.CACh.ContractObject();
    }

    /**
     * Create an instance of {@link ExportAccountResultType.AccountReasons.Contract }
     * 
     * @return
     *     the new instance of {@link ExportAccountResultType.AccountReasons.Contract }
     */
    public ExportAccountResultType.AccountReasons.Contract createExportAccountResultTypeAccountReasonsContract() {
        return new ExportAccountResultType.AccountReasons.Contract();
    }

    /**
     * Create an instance of {@link ExportAccountResultType.AccountReasons.Charter }
     * 
     * @return
     *     the new instance of {@link ExportAccountResultType.AccountReasons.Charter }
     */
    public ExportAccountResultType.AccountReasons.Charter createExportAccountResultTypeAccountReasonsCharter() {
        return new ExportAccountResultType.AccountReasons.Charter();
    }

    /**
     * Create an instance of {@link ExportAccountResultType.AccountReasons.OverhaulFormingKindProtocol }
     * 
     * @return
     *     the new instance of {@link ExportAccountResultType.AccountReasons.OverhaulFormingKindProtocol }
     */
    public ExportAccountResultType.AccountReasons.OverhaulFormingKindProtocol createExportAccountResultTypeAccountReasonsOverhaulFormingKindProtocol() {
        return new ExportAccountResultType.AccountReasons.OverhaulFormingKindProtocol();
    }

    /**
     * Create an instance of {@link ExportAccountResultType.AccountReasons.OverhaulFormingKindOMSDescision }
     * 
     * @return
     *     the new instance of {@link ExportAccountResultType.AccountReasons.OverhaulFormingKindOMSDescision }
     */
    public ExportAccountResultType.AccountReasons.OverhaulFormingKindOMSDescision createExportAccountResultTypeAccountReasonsOverhaulFormingKindOMSDescision() {
        return new ExportAccountResultType.AccountReasons.OverhaulFormingKindOMSDescision();
    }

    /**
     * Create an instance of {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract.PaymentInterval }
     * 
     * @return
     *     the new instance of {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract.PaymentInterval }
     */
    public ExportStatusPublicPropertyContractResultType.PublicPropertyContract.PaymentInterval createExportStatusPublicPropertyContractResultTypePublicPropertyContractPaymentInterval() {
        return new ExportStatusPublicPropertyContractResultType.PublicPropertyContract.PaymentInterval();
    }

    /**
     * Create an instance of {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment.DatePeriod }
     * 
     * @return
     *     the new instance of {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment.DatePeriod }
     */
    public ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment.DatePeriod createExportStatusPublicPropertyContractResultTypePublicPropertyContractAgreementPaymentDatePeriod() {
        return new ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment.DatePeriod();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Charter.Terminate }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Charter.Terminate }
     */
    public ExportCAChResultType.Charter.Terminate createExportCAChResultTypeCharterTerminate() {
        return new ExportCAChResultType.Charter.Terminate();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Charter.CharterPaymentsInfo }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Charter.CharterPaymentsInfo }
     */
    public ExportCAChResultType.Charter.CharterPaymentsInfo createExportCAChResultTypeCharterCharterPaymentsInfo() {
        return new ExportCAChResultType.Charter.CharterPaymentsInfo();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Charter.ContractObject.HouseService }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Charter.ContractObject.HouseService }
     */
    public ExportCAChResultType.Charter.ContractObject.HouseService createExportCAChResultTypeCharterContractObjectHouseService() {
        return new ExportCAChResultType.Charter.ContractObject.HouseService();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Charter.ContractObject.AddService }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Charter.ContractObject.AddService }
     */
    public ExportCAChResultType.Charter.ContractObject.AddService createExportCAChResultTypeCharterContractObjectAddService() {
        return new ExportCAChResultType.Charter.ContractObject.AddService();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Charter.ContractObject.Exclusion }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Charter.ContractObject.Exclusion }
     */
    public ExportCAChResultType.Charter.ContractObject.Exclusion createExportCAChResultTypeCharterContractObjectExclusion() {
        return new ExportCAChResultType.Charter.ContractObject.Exclusion();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Contract.Terminate }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Contract.Terminate }
     */
    public ExportCAChResultType.Contract.Terminate createExportCAChResultTypeContractTerminate() {
        return new ExportCAChResultType.Contract.Terminate();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Contract.ContractPaymentsInfo }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Contract.ContractPaymentsInfo }
     */
    public ExportCAChResultType.Contract.ContractPaymentsInfo createExportCAChResultTypeContractContractPaymentsInfo() {
        return new ExportCAChResultType.Contract.ContractPaymentsInfo();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Contract.ContractObject.HouseService }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Contract.ContractObject.HouseService }
     */
    public ExportCAChResultType.Contract.ContractObject.HouseService createExportCAChResultTypeContractContractObjectHouseService() {
        return new ExportCAChResultType.Contract.ContractObject.HouseService();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Contract.ContractObject.AddService }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Contract.ContractObject.AddService }
     */
    public ExportCAChResultType.Contract.ContractObject.AddService createExportCAChResultTypeContractContractObjectAddService() {
        return new ExportCAChResultType.Contract.ContractObject.AddService();
    }

    /**
     * Create an instance of {@link ExportCAChResultType.Contract.ContractObject.Exclusion }
     * 
     * @return
     *     the new instance of {@link ExportCAChResultType.Contract.ContractObject.Exclusion }
     */
    public ExportCAChResultType.Contract.ContractObject.Exclusion createExportCAChResultTypeContractContractObjectExclusion() {
        return new ExportCAChResultType.Contract.ContractObject.Exclusion();
    }

    /**
     * Create an instance of {@link ExportMeteringDeviceDataResultType.MeteringOwner }
     * 
     * @return
     *     the new instance of {@link ExportMeteringDeviceDataResultType.MeteringOwner }
     */
    public ExportMeteringDeviceDataResultType.MeteringOwner createExportMeteringDeviceDataResultTypeMeteringOwner() {
        return new ExportMeteringDeviceDataResultType.MeteringOwner();
    }

    /**
     * Create an instance of {@link ExportHouseResultType.LivingHouse.LivingRoom }
     * 
     * @return
     *     the new instance of {@link ExportHouseResultType.LivingHouse.LivingRoom }
     */
    public ExportHouseResultType.LivingHouse.LivingRoom createExportHouseResultTypeLivingHouseLivingRoom() {
        return new ExportHouseResultType.LivingHouse.LivingRoom();
    }

    /**
     * Create an instance of {@link ExportHouseResultType.LivingHouse.Block.LivingRoom }
     * 
     * @return
     *     the new instance of {@link ExportHouseResultType.LivingHouse.Block.LivingRoom }
     */
    public ExportHouseResultType.LivingHouse.Block.LivingRoom createExportHouseResultTypeLivingHouseBlockLivingRoom() {
        return new ExportHouseResultType.LivingHouse.Block.LivingRoom();
    }

    /**
     * Create an instance of {@link ExportHouseResultType.ApartmentHouse.Entrance }
     * 
     * @return
     *     the new instance of {@link ExportHouseResultType.ApartmentHouse.Entrance }
     */
    public ExportHouseResultType.ApartmentHouse.Entrance createExportHouseResultTypeApartmentHouseEntrance() {
        return new ExportHouseResultType.ApartmentHouse.Entrance();
    }

    /**
     * Create an instance of {@link ExportHouseResultType.ApartmentHouse.Lift }
     * 
     * @return
     *     the new instance of {@link ExportHouseResultType.ApartmentHouse.Lift }
     */
    public ExportHouseResultType.ApartmentHouse.Lift createExportHouseResultTypeApartmentHouseLift() {
        return new ExportHouseResultType.ApartmentHouse.Lift();
    }

    /**
     * Create an instance of {@link ExportHouseResultType.ApartmentHouse.NonResidentialPremises }
     * 
     * @return
     *     the new instance of {@link ExportHouseResultType.ApartmentHouse.NonResidentialPremises }
     */
    public ExportHouseResultType.ApartmentHouse.NonResidentialPremises createExportHouseResultTypeApartmentHouseNonResidentialPremises() {
        return new ExportHouseResultType.ApartmentHouse.NonResidentialPremises();
    }

    /**
     * Create an instance of {@link ExportHouseResultType.ApartmentHouse.ResidentialPremises.LivingRoom }
     * 
     * @return
     *     the new instance of {@link ExportHouseResultType.ApartmentHouse.ResidentialPremises.LivingRoom }
     */
    public ExportHouseResultType.ApartmentHouse.ResidentialPremises.LivingRoom createExportHouseResultTypeApartmentHouseResidentialPremisesLivingRoom() {
        return new ExportHouseResultType.ApartmentHouse.ResidentialPremises.LivingRoom();
    }

    /**
     * Create an instance of {@link GetStateResult.ImportResult.CommonResult.ImportMeteringDevice }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ImportResult.CommonResult.ImportMeteringDevice }
     */
    public GetStateResult.ImportResult.CommonResult.ImportMeteringDevice createGetStateResultImportResultCommonResultImportMeteringDevice() {
        return new GetStateResult.ImportResult.CommonResult.ImportMeteringDevice();
    }

    /**
     * Create an instance of {@link GetStateResult.ImportResult.CommonResult.ImportAccount }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ImportResult.CommonResult.ImportAccount }
     */
    public GetStateResult.ImportResult.CommonResult.ImportAccount createGetStateResultImportResultCommonResultImportAccount() {
        return new GetStateResult.ImportResult.CommonResult.ImportAccount();
    }

    /**
     * Create an instance of {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractObjectAddress }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractObjectAddress }
     */
    public GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractObjectAddress createGetStateResultImportResultCommonResultImportSupplyResourceContractObjectAddress() {
        return new GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractObjectAddress();
    }

    /**
     * Create an instance of {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContract }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContract }
     */
    public GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContract createGetStateResultImportResultCommonResultImportSupplyResourceContract() {
        return new GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContract();
    }

    /**
     * Create an instance of {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractProject }
     * 
     * @return
     *     the new instance of {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractProject }
     */
    public GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractProject createGetStateResultImportResultCommonResultImportSupplyResourceContractProject() {
        return new GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractProject();
    }

    /**
     * Create an instance of {@link ImportOwnerRefusalRequest.OwnerRefusal.Publish }
     * 
     * @return
     *     the new instance of {@link ImportOwnerRefusalRequest.OwnerRefusal.Publish }
     */
    public ImportOwnerRefusalRequest.OwnerRefusal.Publish createImportOwnerRefusalRequestOwnerRefusalPublish() {
        return new ImportOwnerRefusalRequest.OwnerRefusal.Publish();
    }

    /**
     * Create an instance of {@link ImportOwnerRefusalRequest.OwnerRefusal.Edit }
     * 
     * @return
     *     the new instance of {@link ImportOwnerRefusalRequest.OwnerRefusal.Edit }
     */
    public ImportOwnerRefusalRequest.OwnerRefusal.Edit createImportOwnerRefusalRequestOwnerRefusalEdit() {
        return new ImportOwnerRefusalRequest.OwnerRefusal.Edit();
    }

    /**
     * Create an instance of {@link ImportOwnerRefusalRequest.OwnerRefusal.Annulment }
     * 
     * @return
     *     the new instance of {@link ImportOwnerRefusalRequest.OwnerRefusal.Annulment }
     */
    public ImportOwnerRefusalRequest.OwnerRefusal.Annulment createImportOwnerRefusalRequestOwnerRefusalAnnulment() {
        return new ImportOwnerRefusalRequest.OwnerRefusal.Annulment();
    }

    /**
     * Create an instance of {@link MessageType.AVoting }
     * 
     * @return
     *     the new instance of {@link MessageType.AVoting }
     */
    public MessageType.AVoting createMessageTypeAVoting() {
        return new MessageType.AVoting();
    }

    /**
     * Create an instance of {@link MessageType.Meeting }
     * 
     * @return
     *     the new instance of {@link MessageType.Meeting }
     */
    public MessageType.Meeting createMessageTypeMeeting() {
        return new MessageType.Meeting();
    }

    /**
     * Create an instance of {@link MessageType.MeetingAVoting }
     * 
     * @return
     *     the new instance of {@link MessageType.MeetingAVoting }
     */
    public MessageType.MeetingAVoting createMessageTypeMeetingAVoting() {
        return new MessageType.MeetingAVoting();
    }

    /**
     * Create an instance of {@link MessageType.EVoting }
     * 
     * @return
     *     the new instance of {@link MessageType.EVoting }
     */
    public MessageType.EVoting createMessageTypeEVoting() {
        return new MessageType.EVoting();
    }

    /**
     * Create an instance of {@link MessageType.DecisionList.HomeownersDecisionsType }
     * 
     * @return
     *     the new instance of {@link MessageType.DecisionList.HomeownersDecisionsType }
     */
    public MessageType.DecisionList.HomeownersDecisionsType createMessageTypeDecisionListHomeownersDecisionsType() {
        return new MessageType.DecisionList.HomeownersDecisionsType();
    }

    /**
     * Create an instance of {@link ExternalVotingProtocolType.DecisionList }
     * 
     * @return
     *     the new instance of {@link ExternalVotingProtocolType.DecisionList }
     */
    public ExternalVotingProtocolType.DecisionList createExternalVotingProtocolTypeDecisionList() {
        return new ExternalVotingProtocolType.DecisionList();
    }

    /**
     * Create an instance of {@link ImportNotificationRequest.Notification.RecallNotification }
     * 
     * @return
     *     the new instance of {@link ImportNotificationRequest.Notification.RecallNotification }
     */
    public ImportNotificationRequest.Notification.RecallNotification createImportNotificationRequestNotificationRecallNotification() {
        return new ImportNotificationRequest.Notification.RecallNotification();
    }

    /**
     * Create an instance of {@link ImportNotificationRequest.Notification.Create.MobileAppData }
     * 
     * @return
     *     the new instance of {@link ImportNotificationRequest.Notification.Create.MobileAppData }
     */
    public ImportNotificationRequest.Notification.Create.MobileAppData createImportNotificationRequestNotificationCreateMobileAppData() {
        return new ImportNotificationRequest.Notification.Create.MobileAppData();
    }

    /**
     * Create an instance of {@link ImportNotificationRequest.Notification.Create.RoomOwners.OtherOrganizationSelection }
     * 
     * @return
     *     the new instance of {@link ImportNotificationRequest.Notification.Create.RoomOwners.OtherOrganizationSelection }
     */
    public ImportNotificationRequest.Notification.Create.RoomOwners.OtherOrganizationSelection createImportNotificationRequestNotificationCreateRoomOwnersOtherOrganizationSelection() {
        return new ImportNotificationRequest.Notification.Create.RoomOwners.OtherOrganizationSelection();
    }

    /**
     * Create an instance of {@link ImportNotificationRequest.Notification.Create.RoomOwners.AccountOpening }
     * 
     * @return
     *     the new instance of {@link ImportNotificationRequest.Notification.Create.RoomOwners.AccountOpening }
     */
    public ImportNotificationRequest.Notification.Create.RoomOwners.AccountOpening createImportNotificationRequestNotificationCreateRoomOwnersAccountOpening() {
        return new ImportNotificationRequest.Notification.Create.RoomOwners.AccountOpening();
    }

    /**
     * Create an instance of {@link ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming.Account }
     * 
     * @return
     *     the new instance of {@link ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming.Account }
     */
    public ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming.Account createImportNotificationRequestNotificationCreateRoomOwnersDeptsInformingAccount() {
        return new ImportNotificationRequest.Notification.Create.RoomOwners.DeptsInforming.Account();
    }

    /**
     * Create an instance of {@link ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject.ServiceType }
     * 
     * @return
     *     the new instance of {@link ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject.ServiceType }
     */
    public ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject.ServiceType createExportBriefSupplyResourceContractRequestCriteriaContractSubjectServiceType() {
        return new ExportBriefSupplyResourceContractRequest.Criteria.ContractSubject.ServiceType();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.OtherQualityIndicator }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.OtherQualityIndicator }
     */
    public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.OtherQualityIndicator createImportSupplyResourceContractObjectAddressRequestObjectAddressLoadObjectOtherQualityIndicator() {
        return new ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.OtherQualityIndicator();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.TemperatureChart }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.TemperatureChart }
     */
    public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.TemperatureChart createImportSupplyResourceContractObjectAddressRequestObjectAddressLoadObjectTemperatureChart() {
        return new ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.TemperatureChart();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.PlannedVolume }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.PlannedVolume }
     */
    public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.PlannedVolume createImportSupplyResourceContractObjectAddressRequestObjectAddressLoadObjectPlannedVolume() {
        return new ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.PlannedVolume();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Tariff }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Tariff }
     */
    public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Tariff createImportSupplyResourceContractObjectAddressRequestObjectAddressLoadObjectTariff() {
        return new ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Tariff();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Norm }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Norm }
     */
    public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Norm createImportSupplyResourceContractObjectAddressRequestObjectAddressLoadObjectNorm() {
        return new ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Norm();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality.IndicatorValue }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality.IndicatorValue }
     */
    public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality.IndicatorValue createImportSupplyResourceContractObjectAddressRequestObjectAddressLoadObjectQualityIndicatorValue() {
        return new ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality.IndicatorValue();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair.HeatingSystemType }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair.HeatingSystemType }
     */
    public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair.HeatingSystemType createImportSupplyResourceContractObjectAddressRequestObjectAddressLoadObjectPairHeatingSystemType() {
        return new ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair.HeatingSystemType();
    }

    /**
     * Create an instance of {@link ExportSupplyResourceContractRequest.ContractSubject.ServiceType }
     * 
     * @return
     *     the new instance of {@link ExportSupplyResourceContractRequest.ContractSubject.ServiceType }
     */
    public ExportSupplyResourceContractRequest.ContractSubject.ServiceType createExportSupplyResourceContractRequestContractSubjectServiceType() {
        return new ExportSupplyResourceContractRequest.ContractSubject.ServiceType();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractRequest.Contract.TerminateContract }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractRequest.Contract.TerminateContract }
     */
    public ImportSupplyResourceContractRequest.Contract.TerminateContract createImportSupplyResourceContractRequestContractTerminateContract() {
        return new ImportSupplyResourceContractRequest.Contract.TerminateContract();
    }

    /**
     * Create an instance of {@link ImportSupplyResourceContractRequest.Contract.RollOverContract }
     * 
     * @return
     *     the new instance of {@link ImportSupplyResourceContractRequest.Contract.RollOverContract }
     */
    public ImportSupplyResourceContractRequest.Contract.RollOverContract createImportSupplyResourceContractRequestContractRollOverContract() {
        return new ImportSupplyResourceContractRequest.Contract.RollOverContract();
    }

    /**
     * Create an instance of {@link ImportPublicPropertyContractRequest.AddAgreementPayment.DatePeriod }
     * 
     * @return
     *     the new instance of {@link ImportPublicPropertyContractRequest.AddAgreementPayment.DatePeriod }
     */
    public ImportPublicPropertyContractRequest.AddAgreementPayment.DatePeriod createImportPublicPropertyContractRequestAddAgreementPaymentDatePeriod() {
        return new ImportPublicPropertyContractRequest.AddAgreementPayment.DatePeriod();
    }

    /**
     * Create an instance of {@link ImportPublicPropertyContractRequest.Contract.PublicPropertyContract.PaymentInterval }
     * 
     * @return
     *     the new instance of {@link ImportPublicPropertyContractRequest.Contract.PublicPropertyContract.PaymentInterval }
     */
    public ImportPublicPropertyContractRequest.Contract.PublicPropertyContract.PaymentInterval createImportPublicPropertyContractRequestContractPublicPropertyContractPaymentInterval() {
        return new ImportPublicPropertyContractRequest.Contract.PublicPropertyContract.PaymentInterval();
    }

    /**
     * Create an instance of {@link ExportStatusCAChRequest.Criteria.ControlObjects }
     * 
     * @return
     *     the new instance of {@link ExportStatusCAChRequest.Criteria.ControlObjects }
     */
    public ExportStatusCAChRequest.Criteria.ControlObjects createExportStatusCAChRequestCriteriaControlObjects() {
        return new ExportStatusCAChRequest.Criteria.ControlObjects();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.EditCharter.ContractObject.Annulment }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.EditCharter.ContractObject.Annulment }
     */
    public ImportCharterRequest.EditCharter.ContractObject.Annulment createImportCharterRequestEditCharterContractObjectAnnulment() {
        return new ImportCharterRequest.EditCharter.ContractObject.Annulment();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.EditCharter.ContractObject.Edit.HouseService }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.EditCharter.ContractObject.Edit.HouseService }
     */
    public ImportCharterRequest.EditCharter.ContractObject.Edit.HouseService createImportCharterRequestEditCharterContractObjectEditHouseService() {
        return new ImportCharterRequest.EditCharter.ContractObject.Edit.HouseService();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.EditCharter.ContractObject.Edit.AddService }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.EditCharter.ContractObject.Edit.AddService }
     */
    public ImportCharterRequest.EditCharter.ContractObject.Edit.AddService createImportCharterRequestEditCharterContractObjectEditAddService() {
        return new ImportCharterRequest.EditCharter.ContractObject.Edit.AddService();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.EditCharter.ContractObject.Add.HouseService }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.EditCharter.ContractObject.Add.HouseService }
     */
    public ImportCharterRequest.EditCharter.ContractObject.Add.HouseService createImportCharterRequestEditCharterContractObjectAddHouseService() {
        return new ImportCharterRequest.EditCharter.ContractObject.Add.HouseService();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.EditCharter.ContractObject.Add.AddService }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.EditCharter.ContractObject.Add.AddService }
     */
    public ImportCharterRequest.EditCharter.ContractObject.Add.AddService createImportCharterRequestEditCharterContractObjectAddAddService() {
        return new ImportCharterRequest.EditCharter.ContractObject.Add.AddService();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.PlacingCharter.ContractObject.HouseService }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.PlacingCharter.ContractObject.HouseService }
     */
    public ImportCharterRequest.PlacingCharter.ContractObject.HouseService createImportCharterRequestPlacingCharterContractObjectHouseService() {
        return new ImportCharterRequest.PlacingCharter.ContractObject.HouseService();
    }

    /**
     * Create an instance of {@link ImportCharterRequest.PlacingCharter.ContractObject.AddService }
     * 
     * @return
     *     the new instance of {@link ImportCharterRequest.PlacingCharter.ContractObject.AddService }
     */
    public ImportCharterRequest.PlacingCharter.ContractObject.AddService createImportCharterRequestPlacingCharterContractObjectAddService() {
        return new ImportCharterRequest.PlacingCharter.ContractObject.AddService();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.ApprovalContract }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.ApprovalContract }
     */
    public ImportContractRequest.Contract.ApprovalContract createImportContractRequestContractApprovalContract() {
        return new ImportContractRequest.Contract.ApprovalContract();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.RollOverContract }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.RollOverContract }
     */
    public ImportContractRequest.Contract.RollOverContract createImportContractRequestContractRollOverContract() {
        return new ImportContractRequest.Contract.RollOverContract();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.TerminateContract }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.TerminateContract }
     */
    public ImportContractRequest.Contract.TerminateContract createImportContractRequestContractTerminateContract() {
        return new ImportContractRequest.Contract.TerminateContract();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.AnnulmentContract }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.AnnulmentContract }
     */
    public ImportContractRequest.Contract.AnnulmentContract createImportContractRequestContractAnnulmentContract() {
        return new ImportContractRequest.Contract.AnnulmentContract();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.PlaceContractPaymentsInfo }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.PlaceContractPaymentsInfo }
     */
    public ImportContractRequest.Contract.PlaceContractPaymentsInfo createImportContractRequestContractPlaceContractPaymentsInfo() {
        return new ImportContractRequest.Contract.PlaceContractPaymentsInfo();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.AnnulmentContractPaymentsInfo }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.AnnulmentContractPaymentsInfo }
     */
    public ImportContractRequest.Contract.AnnulmentContractPaymentsInfo createImportContractRequestContractAnnulmentContractPaymentsInfo() {
        return new ImportContractRequest.Contract.AnnulmentContractPaymentsInfo();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Annulment }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Annulment }
     */
    public ImportContractRequest.Contract.EditContract.ContractObject.Annulment createImportContractRequestContractEditContractContractObjectAnnulment() {
        return new ImportContractRequest.Contract.EditContract.ContractObject.Annulment();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Edit.HouseService }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Edit.HouseService }
     */
    public ImportContractRequest.Contract.EditContract.ContractObject.Edit.HouseService createImportContractRequestContractEditContractContractObjectEditHouseService() {
        return new ImportContractRequest.Contract.EditContract.ContractObject.Edit.HouseService();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Edit.AddService }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Edit.AddService }
     */
    public ImportContractRequest.Contract.EditContract.ContractObject.Edit.AddService createImportContractRequestContractEditContractContractObjectEditAddService() {
        return new ImportContractRequest.Contract.EditContract.ContractObject.Edit.AddService();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Add.HouseService }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Add.HouseService }
     */
    public ImportContractRequest.Contract.EditContract.ContractObject.Add.HouseService createImportContractRequestContractEditContractContractObjectAddHouseService() {
        return new ImportContractRequest.Contract.EditContract.ContractObject.Add.HouseService();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Add.AddService }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.EditContract.ContractObject.Add.AddService }
     */
    public ImportContractRequest.Contract.EditContract.ContractObject.Add.AddService createImportContractRequestContractEditContractContractObjectAddAddService() {
        return new ImportContractRequest.Contract.EditContract.ContractObject.Add.AddService();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.PlacingContract.ContractObject.HouseService }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.PlacingContract.ContractObject.HouseService }
     */
    public ImportContractRequest.Contract.PlacingContract.ContractObject.HouseService createImportContractRequestContractPlacingContractContractObjectHouseService() {
        return new ImportContractRequest.Contract.PlacingContract.ContractObject.HouseService();
    }

    /**
     * Create an instance of {@link ImportContractRequest.Contract.PlacingContract.ContractObject.AddService }
     * 
     * @return
     *     the new instance of {@link ImportContractRequest.Contract.PlacingContract.ContractObject.AddService }
     */
    public ImportContractRequest.Contract.PlacingContract.ContractObject.AddService createImportContractRequestContractPlacingContractContractObjectAddService() {
        return new ImportContractRequest.Contract.PlacingContract.ContractObject.AddService();
    }

    /**
     * Create an instance of {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.LinkedWithMetering }
     * 
     * @return
     *     the new instance of {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.LinkedWithMetering }
     */
    public ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.LinkedWithMetering createImportMeteringDeviceDataRequestMeteringDeviceDeviceDataToUpdateLinkedWithMetering() {
        return new ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.LinkedWithMetering();
    }

    /**
     * Create an instance of {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ArchiveDevice }
     * 
     * @return
     *     the new instance of {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ArchiveDevice }
     */
    public ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ArchiveDevice createImportMeteringDeviceDataRequestMeteringDeviceDeviceDataToUpdateArchiveDevice() {
        return new ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ArchiveDevice();
    }

    /**
     * Create an instance of {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ReplaceDevice }
     * 
     * @return
     *     the new instance of {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ReplaceDevice }
     */
    public ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ReplaceDevice createImportMeteringDeviceDataRequestMeteringDeviceDeviceDataToUpdateReplaceDevice() {
        return new ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ReplaceDevice();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToCreate }
     */
    public ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToCreate createImportHouseESPRequestApartmentHouseApartmentHouseToCreate() {
        return new ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToUpdate }
     */
    public ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToUpdate createImportHouseESPRequestApartmentHouseApartmentHouseToUpdate() {
        return new ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToCreate }
     */
    public ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToCreate createImportHouseESPRequestApartmentHouseNonResidentialPremiseToCreate() {
        return new ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToUpdate }
     */
    public ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToUpdate createImportHouseESPRequestApartmentHouseNonResidentialPremiseToUpdate() {
        return new ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.EntranceToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.EntranceToCreate }
     */
    public ImportHouseESPRequest.ApartmentHouse.EntranceToCreate createImportHouseESPRequestApartmentHouseEntranceToCreate() {
        return new ImportHouseESPRequest.ApartmentHouse.EntranceToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.EntranceToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.EntranceToUpdate }
     */
    public ImportHouseESPRequest.ApartmentHouse.EntranceToUpdate createImportHouseESPRequestApartmentHouseEntranceToUpdate() {
        return new ImportHouseESPRequest.ApartmentHouse.EntranceToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.LiftToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.LiftToCreate }
     */
    public ImportHouseESPRequest.ApartmentHouse.LiftToCreate createImportHouseESPRequestApartmentHouseLiftToCreate() {
        return new ImportHouseESPRequest.ApartmentHouse.LiftToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.LiftToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.LiftToUpdate }
     */
    public ImportHouseESPRequest.ApartmentHouse.LiftToUpdate createImportHouseESPRequestApartmentHouseLiftToUpdate() {
        return new ImportHouseESPRequest.ApartmentHouse.LiftToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
     */
    public ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate createImportHouseESPRequestApartmentHouseResidentialPremisesResidentialPremisesToCreate() {
        return new ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
     */
    public ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate createImportHouseESPRequestApartmentHouseResidentialPremisesResidentialPremisesToUpdate() {
        return new ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate }
     */
    public ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate createImportHouseESPRequestApartmentHouseResidentialPremisesLivingRoomToCreate() {
        return new ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate }
     */
    public ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate createImportHouseESPRequestApartmentHouseResidentialPremisesLivingRoomToUpdate() {
        return new ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.LivingHouse.LivingHouseToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.LivingHouse.LivingHouseToCreate }
     */
    public ImportHouseOMSRequest.LivingHouse.LivingHouseToCreate createImportHouseOMSRequestLivingHouseLivingHouseToCreate() {
        return new ImportHouseOMSRequest.LivingHouse.LivingHouseToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.LivingHouse.LivingHouseToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.LivingHouse.LivingHouseToUpdate }
     */
    public ImportHouseOMSRequest.LivingHouse.LivingHouseToUpdate createImportHouseOMSRequestLivingHouseLivingHouseToUpdate() {
        return new ImportHouseOMSRequest.LivingHouse.LivingHouseToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.LivingHouse.LivingRoomToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.LivingHouse.LivingRoomToCreate }
     */
    public ImportHouseOMSRequest.LivingHouse.LivingRoomToCreate createImportHouseOMSRequestLivingHouseLivingRoomToCreate() {
        return new ImportHouseOMSRequest.LivingHouse.LivingRoomToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.LivingHouse.LivingRoomToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.LivingHouse.LivingRoomToUpdate }
     */
    public ImportHouseOMSRequest.LivingHouse.LivingRoomToUpdate createImportHouseOMSRequestLivingHouseLivingRoomToUpdate() {
        return new ImportHouseOMSRequest.LivingHouse.LivingRoomToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.LivingHouse.Blocks.BlockToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.LivingHouse.Blocks.BlockToCreate }
     */
    public ImportHouseOMSRequest.LivingHouse.Blocks.BlockToCreate createImportHouseOMSRequestLivingHouseBlocksBlockToCreate() {
        return new ImportHouseOMSRequest.LivingHouse.Blocks.BlockToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.LivingHouse.Blocks.BlockToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.LivingHouse.Blocks.BlockToUpdate }
     */
    public ImportHouseOMSRequest.LivingHouse.Blocks.BlockToUpdate createImportHouseOMSRequestLivingHouseBlocksBlockToUpdate() {
        return new ImportHouseOMSRequest.LivingHouse.Blocks.BlockToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToCreate }
     */
    public ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToCreate createImportHouseOMSRequestLivingHouseBlocksLivingRoomToCreate() {
        return new ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToUpdate }
     */
    public ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToUpdate createImportHouseOMSRequestLivingHouseBlocksLivingRoomToUpdate() {
        return new ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToCreate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToCreate createImportHouseOMSRequestApartmentHouseApartmentHouseToCreate() {
        return new ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToUpdate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToUpdate createImportHouseOMSRequestApartmentHouseApartmentHouseToUpdate() {
        return new ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToCreate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToCreate createImportHouseOMSRequestApartmentHouseNonResidentialPremiseToCreate() {
        return new ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToUpdate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToUpdate createImportHouseOMSRequestApartmentHouseNonResidentialPremiseToUpdate() {
        return new ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.EntranceToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.EntranceToCreate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.EntranceToCreate createImportHouseOMSRequestApartmentHouseEntranceToCreate() {
        return new ImportHouseOMSRequest.ApartmentHouse.EntranceToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.EntranceToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.EntranceToUpdate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.EntranceToUpdate createImportHouseOMSRequestApartmentHouseEntranceToUpdate() {
        return new ImportHouseOMSRequest.ApartmentHouse.EntranceToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.LiftToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.LiftToCreate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.LiftToCreate createImportHouseOMSRequestApartmentHouseLiftToCreate() {
        return new ImportHouseOMSRequest.ApartmentHouse.LiftToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.LiftToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.LiftToUpdate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.LiftToUpdate createImportHouseOMSRequestApartmentHouseLiftToUpdate() {
        return new ImportHouseOMSRequest.ApartmentHouse.LiftToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate createImportHouseOMSRequestApartmentHouseResidentialPremisesResidentialPremisesToCreate() {
        return new ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate createImportHouseOMSRequestApartmentHouseResidentialPremisesResidentialPremisesToUpdate() {
        return new ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate createImportHouseOMSRequestApartmentHouseResidentialPremisesLivingRoomToCreate() {
        return new ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate }
     */
    public ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate createImportHouseOMSRequestApartmentHouseResidentialPremisesLivingRoomToUpdate() {
        return new ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.LivingHouse.LivingHouseToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.LivingHouse.LivingHouseToCreate }
     */
    public ImportHouseUORequest.LivingHouse.LivingHouseToCreate createImportHouseUORequestLivingHouseLivingHouseToCreate() {
        return new ImportHouseUORequest.LivingHouse.LivingHouseToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.LivingHouse.LivingHouseToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.LivingHouse.LivingHouseToUpdate }
     */
    public ImportHouseUORequest.LivingHouse.LivingHouseToUpdate createImportHouseUORequestLivingHouseLivingHouseToUpdate() {
        return new ImportHouseUORequest.LivingHouse.LivingHouseToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.LivingHouse.LivingRoomToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.LivingHouse.LivingRoomToCreate }
     */
    public ImportHouseUORequest.LivingHouse.LivingRoomToCreate createImportHouseUORequestLivingHouseLivingRoomToCreate() {
        return new ImportHouseUORequest.LivingHouse.LivingRoomToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.LivingHouse.LivingRoomToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.LivingHouse.LivingRoomToUpdate }
     */
    public ImportHouseUORequest.LivingHouse.LivingRoomToUpdate createImportHouseUORequestLivingHouseLivingRoomToUpdate() {
        return new ImportHouseUORequest.LivingHouse.LivingRoomToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.LivingHouse.Blocks.BlockToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.LivingHouse.Blocks.BlockToCreate }
     */
    public ImportHouseUORequest.LivingHouse.Blocks.BlockToCreate createImportHouseUORequestLivingHouseBlocksBlockToCreate() {
        return new ImportHouseUORequest.LivingHouse.Blocks.BlockToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.LivingHouse.Blocks.BlockToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.LivingHouse.Blocks.BlockToUpdate }
     */
    public ImportHouseUORequest.LivingHouse.Blocks.BlockToUpdate createImportHouseUORequestLivingHouseBlocksBlockToUpdate() {
        return new ImportHouseUORequest.LivingHouse.Blocks.BlockToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToCreate }
     */
    public ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToCreate createImportHouseUORequestLivingHouseBlocksLivingRoomToCreate() {
        return new ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToUpdate }
     */
    public ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToUpdate createImportHouseUORequestLivingHouseBlocksLivingRoomToUpdate() {
        return new ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.ApartmentHouseToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.ApartmentHouseToCreate }
     */
    public ImportHouseUORequest.ApartmentHouse.ApartmentHouseToCreate createImportHouseUORequestApartmentHouseApartmentHouseToCreate() {
        return new ImportHouseUORequest.ApartmentHouse.ApartmentHouseToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.ApartmentHouseToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.ApartmentHouseToUpdate }
     */
    public ImportHouseUORequest.ApartmentHouse.ApartmentHouseToUpdate createImportHouseUORequestApartmentHouseApartmentHouseToUpdate() {
        return new ImportHouseUORequest.ApartmentHouse.ApartmentHouseToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToCreate }
     */
    public ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToCreate createImportHouseUORequestApartmentHouseNonResidentialPremiseToCreate() {
        return new ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToUpdate }
     */
    public ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToUpdate createImportHouseUORequestApartmentHouseNonResidentialPremiseToUpdate() {
        return new ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.EntranceToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.EntranceToCreate }
     */
    public ImportHouseUORequest.ApartmentHouse.EntranceToCreate createImportHouseUORequestApartmentHouseEntranceToCreate() {
        return new ImportHouseUORequest.ApartmentHouse.EntranceToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.EntranceToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.EntranceToUpdate }
     */
    public ImportHouseUORequest.ApartmentHouse.EntranceToUpdate createImportHouseUORequestApartmentHouseEntranceToUpdate() {
        return new ImportHouseUORequest.ApartmentHouse.EntranceToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.LiftToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.LiftToCreate }
     */
    public ImportHouseUORequest.ApartmentHouse.LiftToCreate createImportHouseUORequestApartmentHouseLiftToCreate() {
        return new ImportHouseUORequest.ApartmentHouse.LiftToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.LiftToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.LiftToUpdate }
     */
    public ImportHouseUORequest.ApartmentHouse.LiftToUpdate createImportHouseUORequestApartmentHouseLiftToUpdate() {
        return new ImportHouseUORequest.ApartmentHouse.LiftToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
     */
    public ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate createImportHouseUORequestApartmentHouseResidentialPremisesResidentialPremisesToCreate() {
        return new ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
     */
    public ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate createImportHouseUORequestApartmentHouseResidentialPremisesResidentialPremisesToUpdate() {
        return new ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate }
     */
    public ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate createImportHouseUORequestApartmentHouseResidentialPremisesLivingRoomToCreate() {
        return new ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate();
    }

    /**
     * Create an instance of {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate }
     * 
     * @return
     *     the new instance of {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate }
     */
    public ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate createImportHouseUORequestApartmentHouseResidentialPremisesLivingRoomToUpdate() {
        return new ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "InheritMissingValues")
    public JAXBElement<Boolean> createInheritMissingValues(Boolean value) {
        return new JAXBElement<>(_InheritMissingValues_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DemolishHouseRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DemolishHouseRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "demolishHouseRequest")
    public JAXBElement<DemolishHouseRequestType> createDemolishHouseRequest(DemolishHouseRequestType value) {
        return new JAXBElement<>(_DemolishHouseRequest_QNAME, DemolishHouseRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "AccountIndividualServiceGUID")
    public JAXBElement<String> createAccountIndividualServiceGUID(String value) {
        return new JAXBElement<>(_AccountIndividualServiceGUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "ContractGUID")
    public JAXBElement<String> createContractGUID(String value) {
        return new JAXBElement<>(_ContractGUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "ContractVersionGUID")
    public JAXBElement<String> createContractVersionGUID(String value) {
        return new JAXBElement<>(_ContractVersionGUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "CadastralNumber")
    public JAXBElement<String> createCadastralNumber(String value) {
        return new JAXBElement<>(_CadastralNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "NoCadastralNumber")
    public JAXBElement<Boolean> createNoCadastralNumber(Boolean value) {
        return new JAXBElement<>(_NoCadastralNumber_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "ConditionalNumber")
    public JAXBElement<String> createConditionalNumber(String value) {
        return new JAXBElement<>(_ConditionalNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "No_RSO_GKN_EGRP_Registered")
    public JAXBElement<Boolean> createNoRSOGKNEGRPRegistered(Boolean value) {
        return new JAXBElement<>(_NoRSOGKNEGRPRegistered_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "No_RSO_GKN_EGRP_Data")
    public JAXBElement<Boolean> createNoRSOGKNEGRPData(Boolean value) {
        return new JAXBElement<>(_NoRSOGKNEGRPData_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "EntranceNum")
    public JAXBElement<String> createEntranceNum(String value) {
        return new JAXBElement<>(_EntranceNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "TerminationDate")
    public JAXBElement<XMLGregorianCalendar> createTerminationDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_TerminationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "CharterGUID")
    public JAXBElement<String> createCharterGUID(String value) {
        return new JAXBElement<>(_CharterGUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "CharterVersionGUID")
    public JAXBElement<String> createCharterVersionGUID(String value) {
        return new JAXBElement<>(_CharterVersionGUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContractStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "ContractStatus")
    public JAXBElement<ContractStatusType> createContractStatus(ContractStatusType value) {
        return new JAXBElement<>(_ContractStatus_QNAME, ContractStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharterStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CharterStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "CharterStatus")
    public JAXBElement<CharterStatusType> createCharterStatus(CharterStatusType value) {
        return new JAXBElement<>(_CharterStatus_QNAME, CharterStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "ContractObjectVersionGUID")
    public JAXBElement<String> createContractObjectVersionGUID(String value) {
        return new JAXBElement<>(_ContractObjectVersionGUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusMKDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusMKDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "ManagedObjectStatus")
    public JAXBElement<StatusMKDType> createManagedObjectStatus(StatusMKDType value) {
        return new JAXBElement<>(_ManagedObjectStatus_QNAME, StatusMKDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "ContractPaymentsInfoVersionGUID")
    public JAXBElement<String> createContractPaymentsInfoVersionGUID(String value) {
        return new JAXBElement<>(_ContractPaymentsInfoVersionGUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "CharterPaymentsInfoVersionGUID")
    public JAXBElement<String> createCharterPaymentsInfoVersionGUID(String value) {
        return new JAXBElement<>(_CharterPaymentsInfoVersionGUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "LicenseRequest")
    public JAXBElement<Boolean> createLicenseRequest(Boolean value) {
        return new JAXBElement<>(_LicenseRequest_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/house-management/", name = "RISUHouseRequest")
    public JAXBElement<Boolean> createRISUHouseRequest(Boolean value) {
        return new JAXBElement<>(_RISUHouseRequest_QNAME, Boolean.class, null, value);
    }

}
