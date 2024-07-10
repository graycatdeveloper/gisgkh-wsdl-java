
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoitingType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VoitingType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VotingPlace">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="3000"/>
 *               <minLength value="1"/>
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
@XmlType(name = "VoitingType", propOrder = {
    "votingPlace"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ProtocolType.Meeting.class,
    ru.gosuslugi.dom.schema.integration.house_management.ProtocolExportType.Meeting.class
})
public class VoitingType {

    /**
     * Место проведения собрания
     * 
     */
    @XmlElement(name = "VotingPlace", required = true)
    protected String votingPlace;

    /**
     * Место проведения собрания
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotingPlace() {
        return votingPlace;
    }

    /**
     * Sets the value of the votingPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVotingPlace()
     */
    public void setVotingPlace(String value) {
        this.votingPlace = value;
    }

}
