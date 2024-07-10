
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Данные запроса о наличии задолженности за ЖКУ для импорта в ГИС ЖКХ
 * 
 * <p>Java class for ImportDRType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportDRType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="applicantInfo" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ApplicantInfoType"/>
 *         <element name="housingFundObject" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ImportHousingFundObjectInfoType"/>
 *         <element name="executorGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportDRType", propOrder = {
    "applicantInfo",
    "housingFundObject",
    "executorGUID"
})
public class ImportDRType {

    /**
     * Информация о заявителе
     * 
     */
    @XmlElement(required = true)
    protected ApplicantInfoType applicantInfo;
    /**
     * Сведения об объекте жилищного фонда (ОЖФ), по которому осуществляется запрос
     * 
     */
    @XmlElement(required = true)
    protected ImportHousingFundObjectInfoType housingFundObject;
    /**
     * Идентификатор сотрудника, сформировавшего запрос
     * 
     */
    @XmlElement(required = true)
    protected String executorGUID;

    /**
     * Информация о заявителе
     * 
     * @return
     *     possible object is
     *     {@link ApplicantInfoType }
     *     
     */
    public ApplicantInfoType getApplicantInfo() {
        return applicantInfo;
    }

    /**
     * Sets the value of the applicantInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantInfoType }
     *     
     * @see #getApplicantInfo()
     */
    public void setApplicantInfo(ApplicantInfoType value) {
        this.applicantInfo = value;
    }

    /**
     * Сведения об объекте жилищного фонда (ОЖФ), по которому осуществляется запрос
     * 
     * @return
     *     possible object is
     *     {@link ImportHousingFundObjectInfoType }
     *     
     */
    public ImportHousingFundObjectInfoType getHousingFundObject() {
        return housingFundObject;
    }

    /**
     * Sets the value of the housingFundObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportHousingFundObjectInfoType }
     *     
     * @see #getHousingFundObject()
     */
    public void setHousingFundObject(ImportHousingFundObjectInfoType value) {
        this.housingFundObject = value;
    }

    /**
     * Идентификатор сотрудника, сформировавшего запрос
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutorGUID() {
        return executorGUID;
    }

    /**
     * Sets the value of the executorGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExecutorGUID()
     */
    public void setExecutorGUID(String value) {
        this.executorGUID = value;
    }

}
