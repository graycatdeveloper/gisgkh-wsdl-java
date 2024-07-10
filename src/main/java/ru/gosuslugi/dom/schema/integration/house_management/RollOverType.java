
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RollOverType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RollOverType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RollOver" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RollOverType", propOrder = {
    "rollOver"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.RollOverContract.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.RollOverCharter.class
})
public class RollOverType {

    /**
     * Признак пролонгации
     * 
     */
    @XmlElement(name = "RollOver")
    protected boolean rollOver;

    /**
     * Признак пролонгации
     * 
     */
    public boolean isRollOver() {
        return rollOver;
    }

    /**
     * Sets the value of the rollOver property.
     * 
     */
    public void setRollOver(boolean value) {
        this.rollOver = value;
    }

}
