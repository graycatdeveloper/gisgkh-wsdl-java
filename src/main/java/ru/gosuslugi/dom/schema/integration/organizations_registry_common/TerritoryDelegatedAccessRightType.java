
package ru.gosuslugi.dom.schema.integration.organizations_registry_common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Сведения о территориях из заявок на делегирование прав
 * 
 * <p>Java class for TerritoryDelegatedAccessRightType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TerritoryDelegatedAccessRightType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccessRightGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <sequence>
 *           <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="AllTerritories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "TerritoryDelegatedAccessRightType", propOrder = {
    "accessRightGUID",
    "oktmo",
    "region",
    "allTerritories"
})
public class TerritoryDelegatedAccessRightType {

    /**
     * ИД делегированного права.
     * Можно получить в результате выполнения exportDelegatedAccess
     * 
     */
    @XmlElement(name = "AccessRightGUID", required = true)
    protected String accessRightGUID;
    /**
     * Перечень территорий действия
     * 
     */
    @XmlElement(name = "OKTMO")
    protected List<OKTMORefType> oktmo;
    /**
     * Перечень субъектов РФ, на которых дейсвтуют права.  (Ссылка на справочник Субъекты РФ). НСИ 237
     * 
     */
    @XmlElement(name = "Region")
    protected List<NsiRef> region;
    /**
     * Для всех территорий
     * 
     */
    @XmlElement(name = "AllTerritories")
    protected Boolean allTerritories;

    /**
     * ИД делегированного права.
     * Можно получить в результате выполнения exportDelegatedAccess
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessRightGUID() {
        return accessRightGUID;
    }

    /**
     * Sets the value of the accessRightGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccessRightGUID()
     */
    public void setAccessRightGUID(String value) {
        this.accessRightGUID = value;
    }

    /**
     * Перечень территорий действия
     * 
     * Gets the value of the oktmo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oktmo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOKTMO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OKTMORefType }
     * </p>
     * 
     * 
     * @return
     *     The value of the oktmo property.
     */
    public List<OKTMORefType> getOKTMO() {
        if (oktmo == null) {
            oktmo = new ArrayList<>();
        }
        return this.oktmo;
    }

    /**
     * Перечень субъектов РФ, на которых дейсвтуют права.  (Ссылка на справочник Субъекты РФ). НСИ 237
     * 
     * Gets the value of the region property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRegion().add(newItem);
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
     *     The value of the region property.
     */
    public List<NsiRef> getRegion() {
        if (region == null) {
            region = new ArrayList<>();
        }
        return this.region;
    }

    /**
     * Для всех территорий
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllTerritories() {
        return allTerritories;
    }

    /**
     * Sets the value of the allTerritories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllTerritories()
     */
    public void setAllTerritories(Boolean value) {
        this.allTerritories = value;
    }

}
