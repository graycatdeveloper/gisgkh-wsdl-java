
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EGRPRelationshipStatusType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EGRPRelationshipStatusType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Status" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="1"/>
 *               <enumeration value="C"/>
 *               <enumeration value="D"/>
 *               <enumeration value="N"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EGRPRelationshipStatusType", propOrder = {
    "status"
})
public class EGRPRelationshipStatusType {

    /**
     * Статус связи объекта с ЕГРП:
     * (C)reated - найдена запись в ЕГРП, доля(и)/обремененения(и) создана(ы)
     * (D)roped - связь с долей/обремененением  разорвана
     * (N)o relationship - связь с долей/обремененением не устанавливалась
     * 
     */
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Статус связи объекта с ЕГРП:
     * (C)reated - найдена запись в ЕГРП, доля(и)/обремененения(и) создана(ы)
     * (D)roped - связь с долей/обремененением  разорвана
     * (N)o relationship - связь с долей/обремененением не устанавливалась
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
