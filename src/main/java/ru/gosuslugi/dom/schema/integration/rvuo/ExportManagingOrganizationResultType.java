
package ru.gosuslugi.dom.schema.integration.rvuo;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Результат экспорта информации об управляющих организациях
 * 
 * <p>Java class for exportManagingOrganizationResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportManagingOrganizationResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ManagingOrganization" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}ManagingOrganizationExportType" maxOccurs="1000"/>
 *         <choice>
 *           <element name="ExportOrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="IsLastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "exportManagingOrganizationResultType", propOrder = {
    "managingOrganization",
    "exportOrgGUID",
    "isLastPage"
})
public class ExportManagingOrganizationResultType {

    @XmlElement(name = "ManagingOrganization", required = true)
    protected List<ManagingOrganizationExportType> managingOrganization;
    /**
     * Идентификатор управляющей организации для экспорта следующей 1000 управляющих организаций
     * 
     */
    @XmlElement(name = "ExportOrgGUID")
    protected String exportOrgGUID;
    /**
     * Последняя страница экспорта
     * 
     */
    @XmlElement(name = "IsLastPage")
    protected Boolean isLastPage;

    /**
     * Gets the value of the managingOrganization property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managingOrganization property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getManagingOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagingOrganizationExportType }
     * </p>
     * 
     * 
     * @return
     *     The value of the managingOrganization property.
     */
    public List<ManagingOrganizationExportType> getManagingOrganization() {
        if (managingOrganization == null) {
            managingOrganization = new ArrayList<>();
        }
        return this.managingOrganization;
    }

    /**
     * Идентификатор управляющей организации для экспорта следующей 1000 управляющих организаций
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportOrgGUID() {
        return exportOrgGUID;
    }

    /**
     * Sets the value of the exportOrgGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExportOrgGUID()
     */
    public void setExportOrgGUID(String value) {
        this.exportOrgGUID = value;
    }

    /**
     * Последняя страница экспорта
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLastPage() {
        return isLastPage;
    }

    /**
     * Sets the value of the isLastPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsLastPage()
     */
    public void setIsLastPage(Boolean value) {
        this.isLastPage = value;
    }

}
