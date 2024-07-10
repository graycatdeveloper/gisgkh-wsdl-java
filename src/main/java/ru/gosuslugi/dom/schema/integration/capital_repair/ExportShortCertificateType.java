
package ru.gosuslugi.dom.schema.integration.capital_repair;

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
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Экспортируемый акт выполненных работ (оказанных услуг)
 * 
 * <p>Java class for ExportShortCertificateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportShortCertificateType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String512Type"/>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String512Type"/>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="SumAcceptedWorks" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
 *         <element name="PerformerPenalties" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *         <element name="CustomerPenalties" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *         <element name="AttachCertificate" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AttachPhotoBefore" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AttachPhotoAfter" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <choice>
 *           <element name="ActSignedRepresentativeOfOwners">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="SurnameRepresentativeOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
 *                     <element name="NameRepresentativeOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
 *                     <element name="PatronymicRepresentativeOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="ActNotSignedRepresentativeOfOwners" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <choice>
 *           <element name="InstallmentInfo" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}InstallmentInfoType" maxOccurs="unbounded"/>
 *           <element name="InstallmenNotGiven" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportShortCertificateType", propOrder = {
    "name",
    "number",
    "date",
    "sumAcceptedWorks",
    "performerPenalties",
    "customerPenalties",
    "attachCertificate",
    "attachPhotoBefore",
    "attachPhotoAfter",
    "actSignedRepresentativeOfOwners",
    "actNotSignedRepresentativeOfOwners",
    "installmentInfo",
    "installmenNotGiven"
})
@XmlSeeAlso({
    ExportCertificateType.class
})
public class ExportShortCertificateType {

    /**
     * Наименование акта
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Номер акта
     * 
     */
    @XmlElement(name = "Number", required = true)
    protected String number;
    /**
     * Дата акта
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Сумма акта по составу принятых работ
     * 
     */
    @XmlElement(name = "SumAcceptedWorks", required = true)
    protected BigDecimal sumAcceptedWorks;
    /**
     * Штрафные санкции Исполнителю (Если санкции не предъявлены, вводится 0)
     * 
     */
    @XmlElement(name = "PerformerPenalties", required = true)
    protected BigDecimal performerPenalties;
    /**
     * Штрафные санкции Заказчику (Если санкции не предъявлены, вводится 0)
     * 
     */
    @XmlElement(name = "CustomerPenalties", required = true)
    protected BigDecimal customerPenalties;
    /**
     * Файлы акта
     * 
     */
    @XmlElement(name = "AttachCertificate")
    protected List<AttachmentType> attachCertificate;
    /**
     * Фото "до"
     * 
     */
    @XmlElement(name = "AttachPhotoBefore")
    protected List<AttachmentType> attachPhotoBefore;
    /**
     * Фото "после"
     * 
     */
    @XmlElement(name = "AttachPhotoAfter")
    protected List<AttachmentType> attachPhotoAfter;
    /**
     * Акт подписан представителем собственников
     * 
     */
    @XmlElement(name = "ActSignedRepresentativeOfOwners")
    protected ExportShortCertificateType.ActSignedRepresentativeOfOwners actSignedRepresentativeOfOwners;
    /**
     * Акт не подписан представителем собственников
     * 
     */
    @XmlElement(name = "ActNotSignedRepresentativeOfOwners")
    protected Boolean actNotSignedRepresentativeOfOwners;
    /**
     * Предоставлена рассрочка по оплате выполненных работ
     * 
     */
    @XmlElement(name = "InstallmentInfo")
    protected List<InstallmentInfoType> installmentInfo;
    /**
     * Рассрочка по оплате выполненных работ не предоставлена
     * 
     */
    @XmlElement(name = "InstallmenNotGiven")
    protected Boolean installmenNotGiven;

    /**
     * Наименование акта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Номер акта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Дата акта
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Сумма акта по составу принятых работ
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumAcceptedWorks() {
        return sumAcceptedWorks;
    }

    /**
     * Sets the value of the sumAcceptedWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSumAcceptedWorks()
     */
    public void setSumAcceptedWorks(BigDecimal value) {
        this.sumAcceptedWorks = value;
    }

    /**
     * Штрафные санкции Исполнителю (Если санкции не предъявлены, вводится 0)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerformerPenalties() {
        return performerPenalties;
    }

    /**
     * Sets the value of the performerPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPerformerPenalties()
     */
    public void setPerformerPenalties(BigDecimal value) {
        this.performerPenalties = value;
    }

    /**
     * Штрафные санкции Заказчику (Если санкции не предъявлены, вводится 0)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomerPenalties() {
        return customerPenalties;
    }

    /**
     * Sets the value of the customerPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCustomerPenalties()
     */
    public void setCustomerPenalties(BigDecimal value) {
        this.customerPenalties = value;
    }

    /**
     * Файлы акта
     * 
     * Gets the value of the attachCertificate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachCertificate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachCertificate().add(newItem);
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
     *     The value of the attachCertificate property.
     */
    public List<AttachmentType> getAttachCertificate() {
        if (attachCertificate == null) {
            attachCertificate = new ArrayList<>();
        }
        return this.attachCertificate;
    }

    /**
     * Фото "до"
     * 
     * Gets the value of the attachPhotoBefore property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachPhotoBefore property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachPhotoBefore().add(newItem);
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
     *     The value of the attachPhotoBefore property.
     */
    public List<AttachmentType> getAttachPhotoBefore() {
        if (attachPhotoBefore == null) {
            attachPhotoBefore = new ArrayList<>();
        }
        return this.attachPhotoBefore;
    }

    /**
     * Фото "после"
     * 
     * Gets the value of the attachPhotoAfter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachPhotoAfter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachPhotoAfter().add(newItem);
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
     *     The value of the attachPhotoAfter property.
     */
    public List<AttachmentType> getAttachPhotoAfter() {
        if (attachPhotoAfter == null) {
            attachPhotoAfter = new ArrayList<>();
        }
        return this.attachPhotoAfter;
    }

    /**
     * Акт подписан представителем собственников
     * 
     * @return
     *     possible object is
     *     {@link ExportShortCertificateType.ActSignedRepresentativeOfOwners }
     *     
     */
    public ExportShortCertificateType.ActSignedRepresentativeOfOwners getActSignedRepresentativeOfOwners() {
        return actSignedRepresentativeOfOwners;
    }

    /**
     * Sets the value of the actSignedRepresentativeOfOwners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportShortCertificateType.ActSignedRepresentativeOfOwners }
     *     
     * @see #getActSignedRepresentativeOfOwners()
     */
    public void setActSignedRepresentativeOfOwners(ExportShortCertificateType.ActSignedRepresentativeOfOwners value) {
        this.actSignedRepresentativeOfOwners = value;
    }

    /**
     * Акт не подписан представителем собственников
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActNotSignedRepresentativeOfOwners() {
        return actNotSignedRepresentativeOfOwners;
    }

    /**
     * Sets the value of the actNotSignedRepresentativeOfOwners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isActNotSignedRepresentativeOfOwners()
     */
    public void setActNotSignedRepresentativeOfOwners(Boolean value) {
        this.actNotSignedRepresentativeOfOwners = value;
    }

    /**
     * Предоставлена рассрочка по оплате выполненных работ
     * 
     * Gets the value of the installmentInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installmentInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInstallmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstallmentInfoType }
     * </p>
     * 
     * 
     * @return
     *     The value of the installmentInfo property.
     */
    public List<InstallmentInfoType> getInstallmentInfo() {
        if (installmentInfo == null) {
            installmentInfo = new ArrayList<>();
        }
        return this.installmentInfo;
    }

    /**
     * Рассрочка по оплате выполненных работ не предоставлена
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstallmenNotGiven() {
        return installmenNotGiven;
    }

    /**
     * Sets the value of the installmenNotGiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInstallmenNotGiven()
     */
    public void setInstallmenNotGiven(Boolean value) {
        this.installmenNotGiven = value;
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
     *         <element name="SurnameRepresentativeOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
     *         <element name="NameRepresentativeOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
     *         <element name="PatronymicRepresentativeOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type" minOccurs="0"/>
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
        "surnameRepresentativeOwners",
        "nameRepresentativeOwners",
        "patronymicRepresentativeOwners"
    })
    public static class ActSignedRepresentativeOfOwners {

        /**
         * Фамилия представителя собственника
         * 
         */
        @XmlElement(name = "SurnameRepresentativeOwners", required = true)
        protected String surnameRepresentativeOwners;
        /**
         * Имя представителя собственника
         * 
         */
        @XmlElement(name = "NameRepresentativeOwners", required = true)
        protected String nameRepresentativeOwners;
        /**
         * Отчество представителя собственника
         * 
         */
        @XmlElement(name = "PatronymicRepresentativeOwners")
        protected String patronymicRepresentativeOwners;

        /**
         * Фамилия представителя собственника
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurnameRepresentativeOwners() {
            return surnameRepresentativeOwners;
        }

        /**
         * Sets the value of the surnameRepresentativeOwners property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSurnameRepresentativeOwners()
         */
        public void setSurnameRepresentativeOwners(String value) {
            this.surnameRepresentativeOwners = value;
        }

        /**
         * Имя представителя собственника
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameRepresentativeOwners() {
            return nameRepresentativeOwners;
        }

        /**
         * Sets the value of the nameRepresentativeOwners property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNameRepresentativeOwners()
         */
        public void setNameRepresentativeOwners(String value) {
            this.nameRepresentativeOwners = value;
        }

        /**
         * Отчество представителя собственника
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPatronymicRepresentativeOwners() {
            return patronymicRepresentativeOwners;
        }

        /**
         * Sets the value of the patronymicRepresentativeOwners property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPatronymicRepresentativeOwners()
         */
        public void setPatronymicRepresentativeOwners(String value) {
            this.patronymicRepresentativeOwners = value;
        }

    }

}
