
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сводный статус объекта жилищного фонда в ГИС ЖКХ (для импорта)
 * 
 * <p>Java class for OGFImportStatusType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OGFImportStatusType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GKNRelationshipStatus">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKNRelationshipStatusType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="EGRPRelationshipStatus" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}EGRPRelationshipStatusType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OGFImportStatusType", propOrder = {
    "gknRelationshipStatus",
    "egrpRelationshipStatus"
})
public class OGFImportStatusType {

    /**
     * Заполняется для операций importHouseUO, importHouseOMS, ImportHouseESP
     * 
     */
    @XmlElement(name = "GKNRelationshipStatus", required = true)
    protected OGFImportStatusType.GKNRelationshipStatus gknRelationshipStatus;
    @XmlElement(name = "EGRPRelationshipStatus", required = true)
    protected EGRPRelationshipStatusType egrpRelationshipStatus;

    /**
     * Заполняется для операций importHouseUO, importHouseOMS, ImportHouseESP
     * 
     * @return
     *     possible object is
     *     {@link OGFImportStatusType.GKNRelationshipStatus }
     *     
     */
    public OGFImportStatusType.GKNRelationshipStatus getGKNRelationshipStatus() {
        return gknRelationshipStatus;
    }

    /**
     * Sets the value of the gknRelationshipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OGFImportStatusType.GKNRelationshipStatus }
     *     
     * @see #getGKNRelationshipStatus()
     */
    public void setGKNRelationshipStatus(OGFImportStatusType.GKNRelationshipStatus value) {
        this.gknRelationshipStatus = value;
    }

    /**
     * Gets the value of the egrpRelationshipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EGRPRelationshipStatusType }
     *     
     */
    public EGRPRelationshipStatusType getEGRPRelationshipStatus() {
        return egrpRelationshipStatus;
    }

    /**
     * Sets the value of the egrpRelationshipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EGRPRelationshipStatusType }
     *     
     */
    public void setEGRPRelationshipStatus(EGRPRelationshipStatusType value) {
        this.egrpRelationshipStatus = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKNRelationshipStatusType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GKNRelationshipStatus
        extends GKNRelationshipStatusType
    {


    }

}
