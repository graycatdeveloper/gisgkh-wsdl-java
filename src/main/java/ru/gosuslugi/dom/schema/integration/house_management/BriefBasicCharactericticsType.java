
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Краткая информация о базовых характеристиках дома в реестре адресных объектов ГИС ЖКХ
 * 
 * <p>Java class for BriefBasicCharactericticsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BriefBasicCharactericticsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HouseUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="State" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="LifeCycleStage" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" minOccurs="0"/>
 *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="AnnulmentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DemolishionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="DemolishionReason" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
 *         <element name="IsAsyncProcessed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ExportHostelData" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ExportHostelDataType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BriefBasicCharactericticsType", propOrder = {
    "houseUniqueNumber",
    "state",
    "lifeCycleStage",
    "oktmo",
    "orgPPAGUID",
    "terminationDate",
    "annulmentReason",
    "annulmentInfo",
    "demolishionDate",
    "demolishionReason",
    "isAsyncProcessed",
    "exportHostelData"
})
public class BriefBasicCharactericticsType {

    /**
     * Уникальный номер дома
     * 
     */
    @XmlElement(name = "HouseUniqueNumber", required = true)
    protected String houseUniqueNumber;
    /**
     * Состояние (НСИ 24)
     * 
     */
    @XmlElement(name = "State")
    protected NsiRef state;
    /**
     * Стадия жизненного цикла (НСИ 338)
     * 
     */
    @XmlElement(name = "LifeCycleStage")
    protected NsiRef lifeCycleStage;
    /**
     * ОКТМО (обязательное для всех территорий, за исключением города и космодрома "Байконур"). Значение из ФИАС при наличии.
     * 
     */
    @XmlElement(name = "OKTMO")
    protected OKTMORefType oktmo;
    /**
     * Идентификатор управляющей организации
     * 
     */
    protected String orgPPAGUID;
    /**
     * Дата аннулирования объекта в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "TerminationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationDate;
    /**
     * Причина аннулирования объекта жилищного фонда (НСИ 330)
     * 
     */
    @XmlElement(name = "AnnulmentReason")
    protected NsiRef annulmentReason;
    /**
     * Причина аннулирования.Дополнительная информация
     * 
     */
    @XmlElement(name = "AnnulmentInfo")
    protected String annulmentInfo;
    /**
     * Дата сноса
     * 
     */
    @XmlElement(name = "DemolishionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar demolishionDate;
    /**
     * Основание сноса (описание)
     * 
     */
    @XmlElement(name = "DemolishionReason")
    protected String demolishionReason;
    /**
     * Признак асинхронной обработки - для дома запущена процедура аннулирования или сохранения информации о сносе
     * 
     */
    @XmlElement(name = "IsAsyncProcessed")
    protected Boolean isAsyncProcessed;
    /**
     * Данные общежития
     * 
     */
    @XmlElement(name = "ExportHostelData")
    protected ExportHostelDataType exportHostelData;

    /**
     * Уникальный номер дома
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseUniqueNumber() {
        return houseUniqueNumber;
    }

    /**
     * Sets the value of the houseUniqueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHouseUniqueNumber()
     */
    public void setHouseUniqueNumber(String value) {
        this.houseUniqueNumber = value;
    }

    /**
     * Состояние (НСИ 24)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getState()
     */
    public void setState(NsiRef value) {
        this.state = value;
    }

    /**
     * Стадия жизненного цикла (НСИ 338)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getLifeCycleStage() {
        return lifeCycleStage;
    }

    /**
     * Sets the value of the lifeCycleStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getLifeCycleStage()
     */
    public void setLifeCycleStage(NsiRef value) {
        this.lifeCycleStage = value;
    }

    /**
     * ОКТМО (обязательное для всех территорий, за исключением города и космодрома "Байконур"). Значение из ФИАС при наличии.
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getOKTMO()
     */
    public void setOKTMO(OKTMORefType value) {
        this.oktmo = value;
    }

    /**
     * Идентификатор управляющей организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPPAGUID() {
        return orgPPAGUID;
    }

    /**
     * Sets the value of the orgPPAGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgPPAGUID()
     */
    public void setOrgPPAGUID(String value) {
        this.orgPPAGUID = value;
    }

    /**
     * Дата аннулирования объекта в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTerminationDate()
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
    }

    /**
     * Причина аннулирования объекта жилищного фонда (НСИ 330)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getAnnulmentReason() {
        return annulmentReason;
    }

    /**
     * Sets the value of the annulmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getAnnulmentReason()
     */
    public void setAnnulmentReason(NsiRef value) {
        this.annulmentReason = value;
    }

    /**
     * Причина аннулирования.Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnulmentInfo() {
        return annulmentInfo;
    }

    /**
     * Sets the value of the annulmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnnulmentInfo()
     */
    public void setAnnulmentInfo(String value) {
        this.annulmentInfo = value;
    }

    /**
     * Дата сноса
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDemolishionDate() {
        return demolishionDate;
    }

    /**
     * Sets the value of the demolishionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDemolishionDate()
     */
    public void setDemolishionDate(XMLGregorianCalendar value) {
        this.demolishionDate = value;
    }

    /**
     * Основание сноса (описание)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemolishionReason() {
        return demolishionReason;
    }

    /**
     * Sets the value of the demolishionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDemolishionReason()
     */
    public void setDemolishionReason(String value) {
        this.demolishionReason = value;
    }

    /**
     * Признак асинхронной обработки - для дома запущена процедура аннулирования или сохранения информации о сносе
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAsyncProcessed() {
        return isAsyncProcessed;
    }

    /**
     * Sets the value of the isAsyncProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsAsyncProcessed()
     */
    public void setIsAsyncProcessed(Boolean value) {
        this.isAsyncProcessed = value;
    }

    /**
     * Данные общежития
     * 
     * @return
     *     possible object is
     *     {@link ExportHostelDataType }
     *     
     */
    public ExportHostelDataType getExportHostelData() {
        return exportHostelData;
    }

    /**
     * Sets the value of the exportHostelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportHostelDataType }
     *     
     * @see #getExportHostelData()
     */
    public void setExportHostelData(ExportHostelDataType value) {
        this.exportHostelData = value;
    }

}
