
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApprovalType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Approval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalType", propOrder = {
    "approval"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.ApprovalContract.class
})
public class ApprovalType {

    /**
     * Признак утверждения ДУ
     * 
     */
    @XmlElement(name = "Approval")
    protected boolean approval;

    /**
     * Признак утверждения ДУ
     * 
     */
    public boolean isApproval() {
        return approval;
    }

    /**
     * Sets the value of the approval property.
     * 
     */
    public void setApproval(boolean value) {
        this.approval = value;
    }

}
