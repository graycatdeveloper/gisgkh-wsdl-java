
package ru.gosuslugi.dom.schema.integration.device_metering;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100" minOccurs="0"/>
 *         <element name="ExportMeteringDeviceRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <choice>
 *           <element name="MeteringDeviceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="100"/>
 *           <element name="MunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="100"/>
 *           <element name="MeteringDeviceRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100"/>
 *         </choice>
 *         <element name="CommissioningDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="CommissioningDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="SerchArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ArchiveDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ArchiveDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="inputDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="inputDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ExcludePersonAsDataSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ExcludeCurrentOrgAsDataSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ExcludeOtherOrgAsDataSource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="excludeISValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fiasHouseGuid",
    "exportMeteringDeviceRootGUID",
    "meteringDeviceType",
    "municipalResource",
    "meteringDeviceRootGUID",
    "commissioningDateFrom",
    "commissioningDateTo",
    "serchArchived",
    "archiveDateFrom",
    "archiveDateTo",
    "inputDateFrom",
    "inputDateTo",
    "excludePersonAsDataSource",
    "excludeCurrentOrgAsDataSource",
    "excludeOtherOrgAsDataSource",
    "excludeISValues"
})
@XmlRootElement(name = "exportMeteringDeviceHistoryRequest")
public class ExportMeteringDeviceHistoryRequest
    extends BaseType
{

    /**
     * Глобальный уникальный идентификатор дома по ФИАС, в котором установлен ПУ пользователя. Допускается указание нескольких элементов. Если не указан, то будут экспортироваться данные по всем ПУ пользователя
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected List<String> fiasHouseGuid;
    /**
     * Идентификатор ПУ в ГИС ЖКХ, используемый для экспорта 2-го и последующих блоков данных (см. аннотацию корневого элемента). Должно указываться значение, полученное в элементе exportMeteringDeviceHistoryResult/PagedOutput/ExportMeteringDeviceRootGUID при экспорте предыдущего блока данных. Для выгрузки первого блока данных элемент не указывается
     * 
     */
    @XmlElement(name = "ExportMeteringDeviceRootGUID")
    protected String exportMeteringDeviceRootGUID;
    /**
     * Тип прибора учета (НСИ 27)
     * 
     */
    @XmlElement(name = "MeteringDeviceType")
    protected List<NsiRef> meteringDeviceType;
    /**
     * Вид коммунального ресурса (НСИ 2)
     * 
     */
    @XmlElement(name = "MunicipalResource")
    protected List<NsiRef> municipalResource;
    /**
     * Идентификатор ПУ
     * 
     */
    @XmlElement(name = "MeteringDeviceRootGUID")
    protected List<String> meteringDeviceRootGUID;
    /**
     * Дата ввода в эксплуатацию «С»
     * 
     */
    @XmlElement(name = "CommissioningDateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commissioningDateFrom;
    /**
     * Дата ввода в эксплуатацию «По»
     * 
     */
    @XmlElement(name = "CommissioningDateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commissioningDateTo;
    /**
     * Выгружать архивированные
     * 
     */
    @XmlElement(name = "SerchArchived")
    protected Boolean serchArchived;
    /**
     * Дата архивации «С»
     * 
     */
    @XmlElement(name = "ArchiveDateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar archiveDateFrom;
    /**
     * Дата архивации «По»
     * 
     */
    @XmlElement(name = "ArchiveDateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar archiveDateTo;
    /**
     * Дата начала периода, за который выгружаются показания и поверки ПУ (по дате снятия показаний). Значение по умолчанию: 1-е число предыдущего календарного месяца. Период выгрузки показаний ПУ (определяемый элементами inputDateFrom и inputDateTo) не должен выходить за пределы двух последовательных календарных месяцев
     * 
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inputDateFrom;
    /**
     * Дата окончания периода, за который выгружаются показания и поверки ПУ (по дате снятия показаний). Значение по умолчанию: текущая дата. Период выгрузки показаний ПУ (определяемый элементами inputDateFrom и inputDateTo) не должен выходить за пределы двух последовательных календарных месяцев
     * 
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inputDateTo;
    /**
     * Если флаг сброшен или отсутствует, то показания, введенные в Систему гражданином, включаются в выгрузку. Если флаг установлен, то такие показания в выгрузку не включаются
     * 
     */
    @XmlElement(name = "ExcludePersonAsDataSource")
    protected Boolean excludePersonAsDataSource;
    /**
     * Если флаг сброшен или отсутствует, то показания, введенные в Систему текущей организацией, включаются в выгрузку (при условии, что не установлен флаг excludeISValues). Если флаг установлен, то такие показания в выгрузку не включаются
     * 
     */
    @XmlElement(name = "ExcludeCurrentOrgAsDataSource")
    protected Boolean excludeCurrentOrgAsDataSource;
    /**
     * Если флаг сброшен или отсутствует, то показания, введенные в Систему организациями отличной от текущей, включаются в выгрузку. Если флаг установлен, то такие показания в выгрузку не включаются
     * 
     */
    @XmlElement(name = "ExcludeOtherOrgAsDataSource")
    protected Boolean excludeOtherOrgAsDataSource;
    /**
     * Если флаг установлен, то в выгрузку включаются только показания, введенные в личном кабинете или загруженные организациями отличной от текущей. В остальных случаях выгружаются все показания. (Устаревшая функциональность, которая перекрывается флагами ExcludePersonAsDataSource, ExcludeCurrentOrgAsDataSource, ExcludeOtherOrgAsDataSource)
     * 
     */
    protected Boolean excludeISValues;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Глобальный уникальный идентификатор дома по ФИАС, в котором установлен ПУ пользователя. Допускается указание нескольких элементов. Если не указан, то будут экспортироваться данные по всем ПУ пользователя
     * 
     * Gets the value of the fiasHouseGuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiasHouseGuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFIASHouseGuid().add(newItem);
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
     *     The value of the fiasHouseGuid property.
     */
    public List<String> getFIASHouseGuid() {
        if (fiasHouseGuid == null) {
            fiasHouseGuid = new ArrayList<>();
        }
        return this.fiasHouseGuid;
    }

    /**
     * Идентификатор ПУ в ГИС ЖКХ, используемый для экспорта 2-го и последующих блоков данных (см. аннотацию корневого элемента). Должно указываться значение, полученное в элементе exportMeteringDeviceHistoryResult/PagedOutput/ExportMeteringDeviceRootGUID при экспорте предыдущего блока данных. Для выгрузки первого блока данных элемент не указывается
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportMeteringDeviceRootGUID() {
        return exportMeteringDeviceRootGUID;
    }

    /**
     * Sets the value of the exportMeteringDeviceRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExportMeteringDeviceRootGUID()
     */
    public void setExportMeteringDeviceRootGUID(String value) {
        this.exportMeteringDeviceRootGUID = value;
    }

    /**
     * Тип прибора учета (НСИ 27)
     * 
     * Gets the value of the meteringDeviceType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meteringDeviceType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMeteringDeviceType().add(newItem);
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
     *     The value of the meteringDeviceType property.
     */
    public List<NsiRef> getMeteringDeviceType() {
        if (meteringDeviceType == null) {
            meteringDeviceType = new ArrayList<>();
        }
        return this.meteringDeviceType;
    }

    /**
     * Вид коммунального ресурса (НСИ 2)
     * 
     * Gets the value of the municipalResource property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the municipalResource property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMunicipalResource().add(newItem);
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
     *     The value of the municipalResource property.
     */
    public List<NsiRef> getMunicipalResource() {
        if (municipalResource == null) {
            municipalResource = new ArrayList<>();
        }
        return this.municipalResource;
    }

    /**
     * Идентификатор ПУ
     * 
     * Gets the value of the meteringDeviceRootGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meteringDeviceRootGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMeteringDeviceRootGUID().add(newItem);
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
     *     The value of the meteringDeviceRootGUID property.
     */
    public List<String> getMeteringDeviceRootGUID() {
        if (meteringDeviceRootGUID == null) {
            meteringDeviceRootGUID = new ArrayList<>();
        }
        return this.meteringDeviceRootGUID;
    }

    /**
     * Дата ввода в эксплуатацию «С»
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommissioningDateFrom() {
        return commissioningDateFrom;
    }

    /**
     * Sets the value of the commissioningDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCommissioningDateFrom()
     */
    public void setCommissioningDateFrom(XMLGregorianCalendar value) {
        this.commissioningDateFrom = value;
    }

    /**
     * Дата ввода в эксплуатацию «По»
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommissioningDateTo() {
        return commissioningDateTo;
    }

    /**
     * Sets the value of the commissioningDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCommissioningDateTo()
     */
    public void setCommissioningDateTo(XMLGregorianCalendar value) {
        this.commissioningDateTo = value;
    }

    /**
     * Выгружать архивированные
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSerchArchived() {
        return serchArchived;
    }

    /**
     * Sets the value of the serchArchived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSerchArchived()
     */
    public void setSerchArchived(Boolean value) {
        this.serchArchived = value;
    }

    /**
     * Дата архивации «С»
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchiveDateFrom() {
        return archiveDateFrom;
    }

    /**
     * Sets the value of the archiveDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getArchiveDateFrom()
     */
    public void setArchiveDateFrom(XMLGregorianCalendar value) {
        this.archiveDateFrom = value;
    }

    /**
     * Дата архивации «По»
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchiveDateTo() {
        return archiveDateTo;
    }

    /**
     * Sets the value of the archiveDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getArchiveDateTo()
     */
    public void setArchiveDateTo(XMLGregorianCalendar value) {
        this.archiveDateTo = value;
    }

    /**
     * Дата начала периода, за который выгружаются показания и поверки ПУ (по дате снятия показаний). Значение по умолчанию: 1-е число предыдущего календарного месяца. Период выгрузки показаний ПУ (определяемый элементами inputDateFrom и inputDateTo) не должен выходить за пределы двух последовательных календарных месяцев
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInputDateFrom() {
        return inputDateFrom;
    }

    /**
     * Sets the value of the inputDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getInputDateFrom()
     */
    public void setInputDateFrom(XMLGregorianCalendar value) {
        this.inputDateFrom = value;
    }

    /**
     * Дата окончания периода, за который выгружаются показания и поверки ПУ (по дате снятия показаний). Значение по умолчанию: текущая дата. Период выгрузки показаний ПУ (определяемый элементами inputDateFrom и inputDateTo) не должен выходить за пределы двух последовательных календарных месяцев
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInputDateTo() {
        return inputDateTo;
    }

    /**
     * Sets the value of the inputDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getInputDateTo()
     */
    public void setInputDateTo(XMLGregorianCalendar value) {
        this.inputDateTo = value;
    }

    /**
     * Если флаг сброшен или отсутствует, то показания, введенные в Систему гражданином, включаются в выгрузку. Если флаг установлен, то такие показания в выгрузку не включаются
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludePersonAsDataSource() {
        return excludePersonAsDataSource;
    }

    /**
     * Sets the value of the excludePersonAsDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExcludePersonAsDataSource()
     */
    public void setExcludePersonAsDataSource(Boolean value) {
        this.excludePersonAsDataSource = value;
    }

    /**
     * Если флаг сброшен или отсутствует, то показания, введенные в Систему текущей организацией, включаются в выгрузку (при условии, что не установлен флаг excludeISValues). Если флаг установлен, то такие показания в выгрузку не включаются
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeCurrentOrgAsDataSource() {
        return excludeCurrentOrgAsDataSource;
    }

    /**
     * Sets the value of the excludeCurrentOrgAsDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExcludeCurrentOrgAsDataSource()
     */
    public void setExcludeCurrentOrgAsDataSource(Boolean value) {
        this.excludeCurrentOrgAsDataSource = value;
    }

    /**
     * Если флаг сброшен или отсутствует, то показания, введенные в Систему организациями отличной от текущей, включаются в выгрузку. Если флаг установлен, то такие показания в выгрузку не включаются
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeOtherOrgAsDataSource() {
        return excludeOtherOrgAsDataSource;
    }

    /**
     * Sets the value of the excludeOtherOrgAsDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExcludeOtherOrgAsDataSource()
     */
    public void setExcludeOtherOrgAsDataSource(Boolean value) {
        this.excludeOtherOrgAsDataSource = value;
    }

    /**
     * Если флаг установлен, то в выгрузку включаются только показания, введенные в личном кабинете или загруженные организациями отличной от текущей. В остальных случаях выгружаются все показания. (Устаревшая функциональность, которая перекрывается флагами ExcludePersonAsDataSource, ExcludeCurrentOrgAsDataSource, ExcludeOtherOrgAsDataSource)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeISValues() {
        return excludeISValues;
    }

    /**
     * Sets the value of the excludeISValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExcludeISValues()
     */
    public void setExcludeISValues(Boolean value) {
        this.excludeISValues = value;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
