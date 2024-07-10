
package ru.gosuslugi.dom.schema.integration.organizations_registry_common;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Результат экспорта сведений о поставщиках информации ИС
 * 
 * <p>Java class for exportDataProviderResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportDataProviderResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataProviderGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="IsActual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrg"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportDataProviderResultType", propOrder = {
    "dataProviderGUID",
    "isActual",
    "regOrg"
})
public class ExportDataProviderResultType {

    /**
     * Идентификатор поставщика данных
     * 
     */
    @XmlElement(name = "DataProviderGUID", required = true)
    protected String dataProviderGUID;
    /**
     * Статус связи: 1 - активен, 0- отключен
     * 
     */
    @XmlElement(name = "IsActual")
    protected boolean isActual;
    /**
     * Организация в реестре организаций
     * 
     */
    @XmlElement(name = "RegOrg", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", required = true)
    protected RegOrgType regOrg;

    /**
     * Идентификатор поставщика данных
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProviderGUID() {
        return dataProviderGUID;
    }

    /**
     * Sets the value of the dataProviderGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDataProviderGUID()
     */
    public void setDataProviderGUID(String value) {
        this.dataProviderGUID = value;
    }

    /**
     * Статус связи: 1 - активен, 0- отключен
     * 
     */
    public boolean isIsActual() {
        return isActual;
    }

    /**
     * Sets the value of the isActual property.
     * 
     */
    public void setIsActual(boolean value) {
        this.isActual = value;
    }

    /**
     * Организация в реестре организаций
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getRegOrg() {
        return regOrg;
    }

    /**
     * Sets the value of the regOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getRegOrg()
     */
    public void setRegOrg(RegOrgType value) {
        this.regOrg = value;
    }

}
