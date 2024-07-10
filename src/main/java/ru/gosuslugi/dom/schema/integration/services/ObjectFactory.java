
package ru.gosuslugi.dom.schema.integration.services;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gosuslugi.dom.schema.integration.services package. 
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

    private static final QName _WorkListStatus_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/services/", "WorkListStatus");
    private static final QName _HMServicesTarifsDocTypeKUMServiceTypeName_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/services/", "Name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gosuslugi.dom.schema.integration.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImportWorkingListRequest }
     * 
     * @return
     *     the new instance of {@link ImportWorkingListRequest }
     */
    public ImportWorkingListRequest createImportWorkingListRequest() {
        return new ImportWorkingListRequest();
    }

    /**
     * Create an instance of {@link ExportWorkingListRequest }
     * 
     * @return
     *     the new instance of {@link ExportWorkingListRequest }
     */
    public ExportWorkingListRequest createExportWorkingListRequest() {
        return new ExportWorkingListRequest();
    }

    /**
     * Create an instance of {@link ExportWorkingPlanRequest }
     * 
     * @return
     *     the new instance of {@link ExportWorkingPlanRequest }
     */
    public ExportWorkingPlanRequest createExportWorkingPlanRequest() {
        return new ExportWorkingPlanRequest();
    }

    /**
     * Create an instance of {@link ImportQualityAssessmentRequest }
     * 
     * @return
     *     the new instance of {@link ImportQualityAssessmentRequest }
     */
    public ImportQualityAssessmentRequest createImportQualityAssessmentRequest() {
        return new ImportQualityAssessmentRequest();
    }

    /**
     * Create an instance of {@link HMServicesTarifsDocType }
     * 
     * @return
     *     the new instance of {@link HMServicesTarifsDocType }
     */
    public HMServicesTarifsDocType createHMServicesTarifsDocType() {
        return new HMServicesTarifsDocType();
    }

    /**
     * Create an instance of {@link HMServicesTarifsDocType.KU }
     * 
     * @return
     *     the new instance of {@link HMServicesTarifsDocType.KU }
     */
    public HMServicesTarifsDocType.KU createHMServicesTarifsDocTypeKU() {
        return new HMServicesTarifsDocType.KU();
    }

    /**
     * Create an instance of {@link HMServicesTarifsDocType.GKU }
     * 
     * @return
     *     the new instance of {@link HMServicesTarifsDocType.GKU }
     */
    public HMServicesTarifsDocType.GKU createHMServicesTarifsDocTypeGKU() {
        return new HMServicesTarifsDocType.GKU();
    }

    /**
     * Create an instance of {@link CompletedWorksByPeriodExportType }
     * 
     * @return
     *     the new instance of {@link CompletedWorksByPeriodExportType }
     */
    public CompletedWorksByPeriodExportType createCompletedWorksByPeriodExportType() {
        return new CompletedWorksByPeriodExportType();
    }

    /**
     * Create an instance of {@link CompletedWorksByPeriodExportType.UnplannedWork }
     * 
     * @return
     *     the new instance of {@link CompletedWorksByPeriodExportType.UnplannedWork }
     */
    public CompletedWorksByPeriodExportType.UnplannedWork createCompletedWorksByPeriodExportTypeUnplannedWork() {
        return new CompletedWorksByPeriodExportType.UnplannedWork();
    }

    /**
     * Create an instance of {@link WorkingListBaseType }
     * 
     * @return
     *     the new instance of {@link WorkingListBaseType }
     */
    public WorkingListBaseType createWorkingListBaseType() {
        return new WorkingListBaseType();
    }

    /**
     * Create an instance of {@link ExportQualityAssessmentExportType }
     * 
     * @return
     *     the new instance of {@link ExportQualityAssessmentExportType }
     */
    public ExportQualityAssessmentExportType createExportQualityAssessmentExportType() {
        return new ExportQualityAssessmentExportType();
    }

    /**
     * Create an instance of {@link ExportWorkingPlanResultType }
     * 
     * @return
     *     the new instance of {@link ExportWorkingPlanResultType }
     */
    public ExportWorkingPlanResultType createExportWorkingPlanResultType() {
        return new ExportWorkingPlanResultType();
    }

    /**
     * Create an instance of {@link ExportWorkingPlanResultType.WorkingPlan }
     * 
     * @return
     *     the new instance of {@link ExportWorkingPlanResultType.WorkingPlan }
     */
    public ExportWorkingPlanResultType.WorkingPlan createExportWorkingPlanResultTypeWorkingPlan() {
        return new ExportWorkingPlanResultType.WorkingPlan();
    }

    /**
     * Create an instance of {@link ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod }
     * 
     * @return
     *     the new instance of {@link ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod }
     */
    public ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod createExportWorkingPlanResultTypeWorkingPlanReportingPeriod() {
        return new ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod();
    }

    /**
     * Create an instance of {@link ExportWorkingListResultType }
     * 
     * @return
     *     the new instance of {@link ExportWorkingListResultType }
     */
    public ExportWorkingListResultType createExportWorkingListResultType() {
        return new ExportWorkingListResultType();
    }

    /**
     * Create an instance of {@link ExportWorkingListResultType.WorkingList }
     * 
     * @return
     *     the new instance of {@link ExportWorkingListResultType.WorkingList }
     */
    public ExportWorkingListResultType.WorkingList createExportWorkingListResultTypeWorkingList() {
        return new ExportWorkingListResultType.WorkingList();
    }

    /**
     * Create an instance of {@link ImportQualityAssessmentRequest.QualityAssessment }
     * 
     * @return
     *     the new instance of {@link ImportQualityAssessmentRequest.QualityAssessment }
     */
    public ImportQualityAssessmentRequest.QualityAssessment createImportQualityAssessmentRequestQualityAssessment() {
        return new ImportQualityAssessmentRequest.QualityAssessment();
    }

    /**
     * Create an instance of {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment }
     * 
     * @return
     *     the new instance of {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment }
     */
    public ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment createImportQualityAssessmentRequestQualityAssessmentPlacingQualityAssessment() {
        return new ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment();
    }

    /**
     * Create an instance of {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works }
     * 
     * @return
     *     the new instance of {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works }
     */
    public ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works createImportQualityAssessmentRequestQualityAssessmentPlacingQualityAssessmentWorks() {
        return new ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works();
    }

    /**
     * Create an instance of {@link CompletedWorksByPeriodType }
     * 
     * @return
     *     the new instance of {@link CompletedWorksByPeriodType }
     */
    public CompletedWorksByPeriodType createCompletedWorksByPeriodType() {
        return new CompletedWorksByPeriodType();
    }

    /**
     * Create an instance of {@link CompletedWorksByPeriodType.UnplannedWork }
     * 
     * @return
     *     the new instance of {@link CompletedWorksByPeriodType.UnplannedWork }
     */
    public CompletedWorksByPeriodType.UnplannedWork createCompletedWorksByPeriodTypeUnplannedWork() {
        return new CompletedWorksByPeriodType.UnplannedWork();
    }

    /**
     * Create an instance of {@link WorkingPlanType }
     * 
     * @return
     *     the new instance of {@link WorkingPlanType }
     */
    public WorkingPlanType createWorkingPlanType() {
        return new WorkingPlanType();
    }

    /**
     * Create an instance of {@link ImportWorkingListRequest.ApprovedWorkingListData }
     * 
     * @return
     *     the new instance of {@link ImportWorkingListRequest.ApprovedWorkingListData }
     */
    public ImportWorkingListRequest.ApprovedWorkingListData createImportWorkingListRequestApprovedWorkingListData() {
        return new ImportWorkingListRequest.ApprovedWorkingListData();
    }

    /**
     * Create an instance of {@link ImportWorkingListRequest.CancelWorkingList }
     * 
     * @return
     *     the new instance of {@link ImportWorkingListRequest.CancelWorkingList }
     */
    public ImportWorkingListRequest.CancelWorkingList createImportWorkingListRequestCancelWorkingList() {
        return new ImportWorkingListRequest.CancelWorkingList();
    }

    /**
     * Create an instance of {@link ImportWorkingListRequest.AnnulledWorkingList }
     * 
     * @return
     *     the new instance of {@link ImportWorkingListRequest.AnnulledWorkingList }
     */
    public ImportWorkingListRequest.AnnulledWorkingList createImportWorkingListRequestAnnulledWorkingList() {
        return new ImportWorkingListRequest.AnnulledWorkingList();
    }

    /**
     * Create an instance of {@link ExportWorkingListRequest.MonthYearFrom }
     * 
     * @return
     *     the new instance of {@link ExportWorkingListRequest.MonthYearFrom }
     */
    public ExportWorkingListRequest.MonthYearFrom createExportWorkingListRequestMonthYearFrom() {
        return new ExportWorkingListRequest.MonthYearFrom();
    }

    /**
     * Create an instance of {@link ExportWorkingListRequest.MonthYearTo }
     * 
     * @return
     *     the new instance of {@link ExportWorkingListRequest.MonthYearTo }
     */
    public ExportWorkingListRequest.MonthYearTo createExportWorkingListRequestMonthYearTo() {
        return new ExportWorkingListRequest.MonthYearTo();
    }

    /**
     * Create an instance of {@link ImportWorkingPlanRequest }
     * 
     * @return
     *     the new instance of {@link ImportWorkingPlanRequest }
     */
    public ImportWorkingPlanRequest createImportWorkingPlanRequest() {
        return new ImportWorkingPlanRequest();
    }

    /**
     * Create an instance of {@link ExportWorkingPlanRequest.Work }
     * 
     * @return
     *     the new instance of {@link ExportWorkingPlanRequest.Work }
     */
    public ExportWorkingPlanRequest.Work createExportWorkingPlanRequestWork() {
        return new ExportWorkingPlanRequest.Work();
    }

    /**
     * Create an instance of {@link ImportCompletedWorksRequest }
     * 
     * @return
     *     the new instance of {@link ImportCompletedWorksRequest }
     */
    public ImportCompletedWorksRequest createImportCompletedWorksRequest() {
        return new ImportCompletedWorksRequest();
    }

    /**
     * Create an instance of {@link ExportCompletedWorksRequest }
     * 
     * @return
     *     the new instance of {@link ExportCompletedWorksRequest }
     */
    public ExportCompletedWorksRequest createExportCompletedWorksRequest() {
        return new ExportCompletedWorksRequest();
    }

    /**
     * Create an instance of {@link ExportQualityAssessmentRequest }
     * 
     * @return
     *     the new instance of {@link ExportQualityAssessmentRequest }
     */
    public ExportQualityAssessmentRequest createExportQualityAssessmentRequest() {
        return new ExportQualityAssessmentRequest();
    }

    /**
     * Create an instance of {@link ExportHMServicesTarifsRequest }
     * 
     * @return
     *     the new instance of {@link ExportHMServicesTarifsRequest }
     */
    public ExportHMServicesTarifsRequest createExportHMServicesTarifsRequest() {
        return new ExportHMServicesTarifsRequest();
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
     * Create an instance of {@link ExportHMServicesTarifsResultType }
     * 
     * @return
     *     the new instance of {@link ExportHMServicesTarifsResultType }
     */
    public ExportHMServicesTarifsResultType createExportHMServicesTarifsResultType() {
        return new ExportHMServicesTarifsResultType();
    }

    /**
     * Create an instance of {@link ExportCompletedWorksResultType }
     * 
     * @return
     *     the new instance of {@link ExportCompletedWorksResultType }
     */
    public ExportCompletedWorksResultType createExportCompletedWorksResultType() {
        return new ExportCompletedWorksResultType();
    }

    /**
     * Create an instance of {@link WorkingListItemType }
     * 
     * @return
     *     the new instance of {@link WorkingListItemType }
     */
    public WorkingListItemType createWorkingListItemType() {
        return new WorkingListItemType();
    }

    /**
     * Create an instance of {@link MonthlyWorkType }
     * 
     * @return
     *     the new instance of {@link MonthlyWorkType }
     */
    public MonthlyWorkType createMonthlyWorkType() {
        return new MonthlyWorkType();
    }

    /**
     * Create an instance of {@link CompletedWorkType }
     * 
     * @return
     *     the new instance of {@link CompletedWorkType }
     */
    public CompletedWorkType createCompletedWorkType() {
        return new CompletedWorkType();
    }

    /**
     * Create an instance of {@link CompletedWorkExportType }
     * 
     * @return
     *     the new instance of {@link CompletedWorkExportType }
     */
    public CompletedWorkExportType createCompletedWorkExportType() {
        return new CompletedWorkExportType();
    }

    /**
     * Create an instance of {@link ActDetailsType }
     * 
     * @return
     *     the new instance of {@link ActDetailsType }
     */
    public ActDetailsType createActDetailsType() {
        return new ActDetailsType();
    }

    /**
     * Create an instance of {@link ActDetailsExportType }
     * 
     * @return
     *     the new instance of {@link ActDetailsExportType }
     */
    public ActDetailsExportType createActDetailsExportType() {
        return new ActDetailsExportType();
    }

    /**
     * Create an instance of {@link HMServicesTarifsDocType.KU.MServiceType }
     * 
     * @return
     *     the new instance of {@link HMServicesTarifsDocType.KU.MServiceType }
     */
    public HMServicesTarifsDocType.KU.MServiceType createHMServicesTarifsDocTypeKUMServiceType() {
        return new HMServicesTarifsDocType.KU.MServiceType();
    }

    /**
     * Create an instance of {@link HMServicesTarifsDocType.GKU.SKI }
     * 
     * @return
     *     the new instance of {@link HMServicesTarifsDocType.GKU.SKI }
     */
    public HMServicesTarifsDocType.GKU.SKI createHMServicesTarifsDocTypeGKUSKI() {
        return new HMServicesTarifsDocType.GKU.SKI();
    }

    /**
     * Create an instance of {@link CompletedWorksByPeriodExportType.PlannedWork }
     * 
     * @return
     *     the new instance of {@link CompletedWorksByPeriodExportType.PlannedWork }
     */
    public CompletedWorksByPeriodExportType.PlannedWork createCompletedWorksByPeriodExportTypePlannedWork() {
        return new CompletedWorksByPeriodExportType.PlannedWork();
    }

    /**
     * Create an instance of {@link CompletedWorksByPeriodExportType.Act }
     * 
     * @return
     *     the new instance of {@link CompletedWorksByPeriodExportType.Act }
     */
    public CompletedWorksByPeriodExportType.Act createCompletedWorksByPeriodExportTypeAct() {
        return new CompletedWorksByPeriodExportType.Act();
    }

    /**
     * Create an instance of {@link CompletedWorksByPeriodExportType.UnplannedWork.Accident }
     * 
     * @return
     *     the new instance of {@link CompletedWorksByPeriodExportType.UnplannedWork.Accident }
     */
    public CompletedWorksByPeriodExportType.UnplannedWork.Accident createCompletedWorksByPeriodExportTypeUnplannedWorkAccident() {
        return new CompletedWorksByPeriodExportType.UnplannedWork.Accident();
    }

    /**
     * Create an instance of {@link CompletedWorksByPeriodExportType.UnplannedWork.DeliveryRestriction }
     * 
     * @return
     *     the new instance of {@link CompletedWorksByPeriodExportType.UnplannedWork.DeliveryRestriction }
     */
    public CompletedWorksByPeriodExportType.UnplannedWork.DeliveryRestriction createCompletedWorksByPeriodExportTypeUnplannedWorkDeliveryRestriction() {
        return new CompletedWorksByPeriodExportType.UnplannedWork.DeliveryRestriction();
    }

    /**
     * Create an instance of {@link WorkingListBaseType.MonthYearFrom }
     * 
     * @return
     *     the new instance of {@link WorkingListBaseType.MonthYearFrom }
     */
    public WorkingListBaseType.MonthYearFrom createWorkingListBaseTypeMonthYearFrom() {
        return new WorkingListBaseType.MonthYearFrom();
    }

    /**
     * Create an instance of {@link WorkingListBaseType.MonthYearTo }
     * 
     * @return
     *     the new instance of {@link WorkingListBaseType.MonthYearTo }
     */
    public WorkingListBaseType.MonthYearTo createWorkingListBaseTypeMonthYearTo() {
        return new WorkingListBaseType.MonthYearTo();
    }

    /**
     * Create an instance of {@link ExportQualityAssessmentExportType.Works }
     * 
     * @return
     *     the new instance of {@link ExportQualityAssessmentExportType.Works }
     */
    public ExportQualityAssessmentExportType.Works createExportQualityAssessmentExportTypeWorks() {
        return new ExportQualityAssessmentExportType.Works();
    }

    /**
     * Create an instance of {@link ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.MonthYear }
     * 
     * @return
     *     the new instance of {@link ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.MonthYear }
     */
    public ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.MonthYear createExportWorkingPlanResultTypeWorkingPlanReportingPeriodMonthYear() {
        return new ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.MonthYear();
    }

    /**
     * Create an instance of {@link ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.WorkPlanItem }
     * 
     * @return
     *     the new instance of {@link ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.WorkPlanItem }
     */
    public ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.WorkPlanItem createExportWorkingPlanResultTypeWorkingPlanReportingPeriodWorkPlanItem() {
        return new ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.WorkPlanItem();
    }

    /**
     * Create an instance of {@link ExportWorkingListResultType.WorkingList.WorkListItem }
     * 
     * @return
     *     the new instance of {@link ExportWorkingListResultType.WorkingList.WorkListItem }
     */
    public ExportWorkingListResultType.WorkingList.WorkListItem createExportWorkingListResultTypeWorkingListWorkListItem() {
        return new ExportWorkingListResultType.WorkingList.WorkListItem();
    }

    /**
     * Create an instance of {@link ImportQualityAssessmentRequest.QualityAssessment.AnnulmentQualityAssessment }
     * 
     * @return
     *     the new instance of {@link ImportQualityAssessmentRequest.QualityAssessment.AnnulmentQualityAssessment }
     */
    public ImportQualityAssessmentRequest.QualityAssessment.AnnulmentQualityAssessment createImportQualityAssessmentRequestQualityAssessmentAnnulmentQualityAssessment() {
        return new ImportQualityAssessmentRequest.QualityAssessment.AnnulmentQualityAssessment();
    }

    /**
     * Create an instance of {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Work }
     * 
     * @return
     *     the new instance of {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Work }
     */
    public ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Work createImportQualityAssessmentRequestQualityAssessmentPlacingQualityAssessmentWorksWork() {
        return new ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Work();
    }

    /**
     * Create an instance of {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Act }
     * 
     * @return
     *     the new instance of {@link ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Act }
     */
    public ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Act createImportQualityAssessmentRequestQualityAssessmentPlacingQualityAssessmentWorksAct() {
        return new ImportQualityAssessmentRequest.QualityAssessment.PlacingQualityAssessment.Works.Act();
    }

    /**
     * Create an instance of {@link CompletedWorksByPeriodType.PlannedWork }
     * 
     * @return
     *     the new instance of {@link CompletedWorksByPeriodType.PlannedWork }
     */
    public CompletedWorksByPeriodType.PlannedWork createCompletedWorksByPeriodTypePlannedWork() {
        return new CompletedWorksByPeriodType.PlannedWork();
    }

    /**
     * Create an instance of {@link CompletedWorksByPeriodType.UnplannedWork.Accident }
     * 
     * @return
     *     the new instance of {@link CompletedWorksByPeriodType.UnplannedWork.Accident }
     */
    public CompletedWorksByPeriodType.UnplannedWork.Accident createCompletedWorksByPeriodTypeUnplannedWorkAccident() {
        return new CompletedWorksByPeriodType.UnplannedWork.Accident();
    }

    /**
     * Create an instance of {@link CompletedWorksByPeriodType.UnplannedWork.DeliveryRestriction }
     * 
     * @return
     *     the new instance of {@link CompletedWorksByPeriodType.UnplannedWork.DeliveryRestriction }
     */
    public CompletedWorksByPeriodType.UnplannedWork.DeliveryRestriction createCompletedWorksByPeriodTypeUnplannedWorkDeliveryRestriction() {
        return new CompletedWorksByPeriodType.UnplannedWork.DeliveryRestriction();
    }

    /**
     * Create an instance of {@link WorkingPlanType.WorkPlanItem }
     * 
     * @return
     *     the new instance of {@link WorkingPlanType.WorkPlanItem }
     */
    public WorkingPlanType.WorkPlanItem createWorkingPlanTypeWorkPlanItem() {
        return new WorkingPlanType.WorkPlanItem();
    }

    /**
     * Create an instance of {@link ImportWorkingListRequest.ApprovedWorkingListData.WorkListItem }
     * 
     * @return
     *     the new instance of {@link ImportWorkingListRequest.ApprovedWorkingListData.WorkListItem }
     */
    public ImportWorkingListRequest.ApprovedWorkingListData.WorkListItem createImportWorkingListRequestApprovedWorkingListDataWorkListItem() {
        return new ImportWorkingListRequest.ApprovedWorkingListData.WorkListItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/services/", name = "WorkListStatus")
    public JAXBElement<String> createWorkListStatus(String value) {
        return new JAXBElement<>(_WorkListStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/services/", name = "Name", scope = HMServicesTarifsDocType.KU.MServiceType.class)
    public JAXBElement<String> createHMServicesTarifsDocTypeKUMServiceTypeName(String value) {
        return new JAXBElement<>(_HMServicesTarifsDocTypeKUMServiceTypeName_QNAME, String.class, HMServicesTarifsDocType.KU.MServiceType.class, value);
    }

}
