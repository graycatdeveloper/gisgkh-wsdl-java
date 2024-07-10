
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="Contract" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   </sequence>
 *                   <choice>
 *                     <element name="PlacingContract">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
 *                               <element name="ContractObject" maxOccurs="unbounded">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
 *                                       <sequence>
 *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                         <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                         <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                                 <sequence>
 *                                                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                                 </sequence>
 *                                               </extension>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                         <element name="AddService" maxOccurs="unbounded" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                                 <sequence>
 *                                                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                                 </sequence>
 *                                               </extension>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="EditContract">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
 *                               <element name="ContractObject" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                         <choice>
 *                                           <element name="Add">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
 *                                                   <sequence>
 *                                                     <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                                     <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
 *                                                       <complexType>
 *                                                         <complexContent>
 *                                                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                                             <sequence>
 *                                                               <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                                             </sequence>
 *                                                           </extension>
 *                                                         </complexContent>
 *                                                       </complexType>
 *                                                     </element>
 *                                                     <element name="AddService" maxOccurs="unbounded" minOccurs="0">
 *                                                       <complexType>
 *                                                         <complexContent>
 *                                                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                                             <sequence>
 *                                                               <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                                             </sequence>
 *                                                           </extension>
 *                                                         </complexContent>
 *                                                       </complexType>
 *                                                     </element>
 *                                                   </sequence>
 *                                                 </extension>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="Edit">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
 *                                                   <sequence>
 *                                                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
 *                                                     <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType" minOccurs="0"/>
 *                                                     <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
 *                                                       <complexType>
 *                                                         <complexContent>
 *                                                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                                             <sequence>
 *                                                               <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                                             </sequence>
 *                                                           </extension>
 *                                                         </complexContent>
 *                                                       </complexType>
 *                                                     </element>
 *                                                     <element name="AddService" maxOccurs="unbounded" minOccurs="0">
 *                                                       <complexType>
 *                                                         <complexContent>
 *                                                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                                             <sequence>
 *                                                               <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                                             </sequence>
 *                                                           </extension>
 *                                                         </complexContent>
 *                                                       </complexType>
 *                                                     </element>
 *                                                   </sequence>
 *                                                 </extension>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="Annulment">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                         </choice>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
 *                               <element name="IndicationsAnyDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="ApprovalContract">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApprovalType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="RollOverContract">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RollOverType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
 *                               <element name="RollToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="TerminateContract">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
 *                               <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                               <element name="TerminateAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentContract">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="PlaceContractPaymentsInfo">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentContractPaymentsInfo">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoVersionGUID"/>
 *                               <element name="Reason">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <minLength value="1"/>
 *                                     <maxLength value="1024"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.9.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contract"
})
@XmlRootElement(name = "importContractRequest")
public class ImportContractRequest
    extends BaseType
{

    @XmlElement(name = "Contract", required = true)
    protected List<ImportContractRequest.Contract> contract;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Gets the value of the contract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportContractRequest.Contract }
     * </p>
     * 
     * 
     * @return
     *     The value of the contract property.
     */
    public List<ImportContractRequest.Contract> getContract() {
        if (contract == null) {
            contract = new ArrayList<>();
        }
        return this.contract;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "11.9.0.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         </sequence>
     *         <choice>
     *           <element name="PlacingContract">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
     *                     <element name="ContractObject" maxOccurs="unbounded">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
     *                             <sequence>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                               <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                               <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                                       <sequence>
     *                                         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                                       </sequence>
     *                                     </extension>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                               <element name="AddService" maxOccurs="unbounded" minOccurs="0">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                                       <sequence>
     *                                         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                                       </sequence>
     *                                     </extension>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="EditContract">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
     *                     <element name="ContractObject" maxOccurs="unbounded" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                               <choice>
     *                                 <element name="Add">
     *                                   <complexType>
     *                                     <complexContent>
     *                                       <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
     *                                         <sequence>
     *                                           <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                                           <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
     *                                             <complexType>
     *                                               <complexContent>
     *                                                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                                                   <sequence>
     *                                                     <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                                                   </sequence>
     *                                                 </extension>
     *                                               </complexContent>
     *                                             </complexType>
     *                                           </element>
     *                                           <element name="AddService" maxOccurs="unbounded" minOccurs="0">
     *                                             <complexType>
     *                                               <complexContent>
     *                                                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                                                   <sequence>
     *                                                     <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                                                   </sequence>
     *                                                 </extension>
     *                                               </complexContent>
     *                                             </complexType>
     *                                           </element>
     *                                         </sequence>
     *                                       </extension>
     *                                     </complexContent>
     *                                   </complexType>
     *                                 </element>
     *                                 <element name="Edit">
     *                                   <complexType>
     *                                     <complexContent>
     *                                       <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
     *                                         <sequence>
     *                                           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
     *                                           <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType" minOccurs="0"/>
     *                                           <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
     *                                             <complexType>
     *                                               <complexContent>
     *                                                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                                                   <sequence>
     *                                                     <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                                                   </sequence>
     *                                                 </extension>
     *                                               </complexContent>
     *                                             </complexType>
     *                                           </element>
     *                                           <element name="AddService" maxOccurs="unbounded" minOccurs="0">
     *                                             <complexType>
     *                                               <complexContent>
     *                                                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                                                   <sequence>
     *                                                     <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                                                   </sequence>
     *                                                 </extension>
     *                                               </complexContent>
     *                                             </complexType>
     *                                           </element>
     *                                         </sequence>
     *                                       </extension>
     *                                     </complexContent>
     *                                   </complexType>
     *                                 </element>
     *                                 <element name="Annulment">
     *                                   <complexType>
     *                                     <complexContent>
     *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         <sequence>
     *                                           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
     *                                         </sequence>
     *                                       </restriction>
     *                                     </complexContent>
     *                                   </complexType>
     *                                 </element>
     *                               </choice>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
     *                     <element name="IndicationsAnyDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="ApprovalContract">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApprovalType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="RollOverContract">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RollOverType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
     *                     <element name="RollToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="TerminateContract">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
     *                     <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                     <element name="TerminateAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentContract">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="PlaceContractPaymentsInfo">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentContractPaymentsInfo">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoVersionGUID"/>
     *                     <element name="Reason">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="1024"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
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
    @XmlType(name = "", propOrder = {
        "transportGUID",
        "placingContract",
        "editContract",
        "approvalContract",
        "rollOverContract",
        "terminateContract",
        "annulmentContract",
        "placeContractPaymentsInfo",
        "annulmentContractPaymentsInfo"
    })
    public static class Contract {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Создание ДУ
         * 
         */
        @XmlElement(name = "PlacingContract")
        protected ImportContractRequest.Contract.PlacingContract placingContract;
        /**
         * Внесение изменений в версию ДУ
         * 
         */
        @XmlElement(name = "EditContract")
        protected ImportContractRequest.Contract.EditContract editContract;
        /**
         * Утверждение ДУ, в отношении которого были одобрены заявки на включение управляемых объектов в РЛ
         * 
         */
        @XmlElement(name = "ApprovalContract")
        protected ImportContractRequest.Contract.ApprovalContract approvalContract;
        /**
         * Пролонгация ДУ
         * 
         */
        @XmlElement(name = "RollOverContract")
        protected ImportContractRequest.Contract.RollOverContract rollOverContract;
        /**
         * Расторжение ДУ
         * 
         */
        @XmlElement(name = "TerminateContract")
        protected ImportContractRequest.Contract.TerminateContract terminateContract;
        /**
         * Аннулирование ДУ
         * 
         */
        @XmlElement(name = "AnnulmentContract")
        protected ImportContractRequest.Contract.AnnulmentContract annulmentContract;
        /**
         * Размещение сведений о размере платы
         * 
         */
        @XmlElement(name = "PlaceContractPaymentsInfo")
        protected ImportContractRequest.Contract.PlaceContractPaymentsInfo placeContractPaymentsInfo;
        /**
         * Аннулирование сведений о размере платы
         * 
         */
        @XmlElement(name = "AnnulmentContractPaymentsInfo")
        protected ImportContractRequest.Contract.AnnulmentContractPaymentsInfo annulmentContractPaymentsInfo;

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
        }

        /**
         * Создание ДУ
         * 
         * @return
         *     possible object is
         *     {@link ImportContractRequest.Contract.PlacingContract }
         *     
         */
        public ImportContractRequest.Contract.PlacingContract getPlacingContract() {
            return placingContract;
        }

        /**
         * Sets the value of the placingContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportContractRequest.Contract.PlacingContract }
         *     
         * @see #getPlacingContract()
         */
        public void setPlacingContract(ImportContractRequest.Contract.PlacingContract value) {
            this.placingContract = value;
        }

        /**
         * Внесение изменений в версию ДУ
         * 
         * @return
         *     possible object is
         *     {@link ImportContractRequest.Contract.EditContract }
         *     
         */
        public ImportContractRequest.Contract.EditContract getEditContract() {
            return editContract;
        }

        /**
         * Sets the value of the editContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportContractRequest.Contract.EditContract }
         *     
         * @see #getEditContract()
         */
        public void setEditContract(ImportContractRequest.Contract.EditContract value) {
            this.editContract = value;
        }

        /**
         * Утверждение ДУ, в отношении которого были одобрены заявки на включение управляемых объектов в РЛ
         * 
         * @return
         *     possible object is
         *     {@link ImportContractRequest.Contract.ApprovalContract }
         *     
         */
        public ImportContractRequest.Contract.ApprovalContract getApprovalContract() {
            return approvalContract;
        }

        /**
         * Sets the value of the approvalContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportContractRequest.Contract.ApprovalContract }
         *     
         * @see #getApprovalContract()
         */
        public void setApprovalContract(ImportContractRequest.Contract.ApprovalContract value) {
            this.approvalContract = value;
        }

        /**
         * Пролонгация ДУ
         * 
         * @return
         *     possible object is
         *     {@link ImportContractRequest.Contract.RollOverContract }
         *     
         */
        public ImportContractRequest.Contract.RollOverContract getRollOverContract() {
            return rollOverContract;
        }

        /**
         * Sets the value of the rollOverContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportContractRequest.Contract.RollOverContract }
         *     
         * @see #getRollOverContract()
         */
        public void setRollOverContract(ImportContractRequest.Contract.RollOverContract value) {
            this.rollOverContract = value;
        }

        /**
         * Расторжение ДУ
         * 
         * @return
         *     possible object is
         *     {@link ImportContractRequest.Contract.TerminateContract }
         *     
         */
        public ImportContractRequest.Contract.TerminateContract getTerminateContract() {
            return terminateContract;
        }

        /**
         * Sets the value of the terminateContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportContractRequest.Contract.TerminateContract }
         *     
         * @see #getTerminateContract()
         */
        public void setTerminateContract(ImportContractRequest.Contract.TerminateContract value) {
            this.terminateContract = value;
        }

        /**
         * Аннулирование ДУ
         * 
         * @return
         *     possible object is
         *     {@link ImportContractRequest.Contract.AnnulmentContract }
         *     
         */
        public ImportContractRequest.Contract.AnnulmentContract getAnnulmentContract() {
            return annulmentContract;
        }

        /**
         * Sets the value of the annulmentContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportContractRequest.Contract.AnnulmentContract }
         *     
         * @see #getAnnulmentContract()
         */
        public void setAnnulmentContract(ImportContractRequest.Contract.AnnulmentContract value) {
            this.annulmentContract = value;
        }

        /**
         * Размещение сведений о размере платы
         * 
         * @return
         *     possible object is
         *     {@link ImportContractRequest.Contract.PlaceContractPaymentsInfo }
         *     
         */
        public ImportContractRequest.Contract.PlaceContractPaymentsInfo getPlaceContractPaymentsInfo() {
            return placeContractPaymentsInfo;
        }

        /**
         * Sets the value of the placeContractPaymentsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportContractRequest.Contract.PlaceContractPaymentsInfo }
         *     
         * @see #getPlaceContractPaymentsInfo()
         */
        public void setPlaceContractPaymentsInfo(ImportContractRequest.Contract.PlaceContractPaymentsInfo value) {
            this.placeContractPaymentsInfo = value;
        }

        /**
         * Аннулирование сведений о размере платы
         * 
         * @return
         *     possible object is
         *     {@link ImportContractRequest.Contract.AnnulmentContractPaymentsInfo }
         *     
         */
        public ImportContractRequest.Contract.AnnulmentContractPaymentsInfo getAnnulmentContractPaymentsInfo() {
            return annulmentContractPaymentsInfo;
        }

        /**
         * Sets the value of the annulmentContractPaymentsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportContractRequest.Contract.AnnulmentContractPaymentsInfo }
         *     
         * @see #getAnnulmentContractPaymentsInfo()
         */
        public void setAnnulmentContractPaymentsInfo(ImportContractRequest.Contract.AnnulmentContractPaymentsInfo value) {
            this.annulmentContractPaymentsInfo = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "licenseRequest",
            "contractVersionGUID"
        })
        public static class AnnulmentContract
            extends AnnulmentType
        {

            /**
             * Формировать заявки в реестр лицензий, если сведения об управляемом объекте в договоре управления конфликтуют с реестром лицензий
             * 
             */
            @XmlElement(name = "LicenseRequest")
            protected Boolean licenseRequest;
            /**
             * Идентификатор версии договора
             * 
             */
            @XmlElement(name = "ContractVersionGUID", required = true)
            protected String contractVersionGUID;

            /**
             * Формировать заявки в реестр лицензий, если сведения об управляемом объекте в договоре управления конфликтуют с реестром лицензий
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLicenseRequest() {
                return licenseRequest;
            }

            /**
             * Sets the value of the licenseRequest property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isLicenseRequest()
             */
            public void setLicenseRequest(Boolean value) {
                this.licenseRequest = value;
            }

            /**
             * Идентификатор версии договора
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractVersionGUID() {
                return contractVersionGUID;
            }

            /**
             * Sets the value of the contractVersionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getContractVersionGUID()
             */
            public void setContractVersionGUID(String value) {
                this.contractVersionGUID = value;
            }

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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoVersionGUID"/>
         *         <element name="Reason">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="1024"/>
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
        @XmlType(name = "", propOrder = {
            "contractPaymentsInfoVersionGUID",
            "reason"
        })
        public static class AnnulmentContractPaymentsInfo {

            /**
             * Идентификатор версии сведений о размере платы по ДУ
             * 
             */
            @XmlElement(name = "ContractPaymentsInfoVersionGUID", required = true)
            protected String contractPaymentsInfoVersionGUID;
            @XmlElement(name = "Reason", required = true)
            protected String reason;

            /**
             * Идентификатор версии сведений о размере платы по ДУ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractPaymentsInfoVersionGUID() {
                return contractPaymentsInfoVersionGUID;
            }

            /**
             * Sets the value of the contractPaymentsInfoVersionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getContractPaymentsInfoVersionGUID()
             */
            public void setContractPaymentsInfoVersionGUID(String value) {
                this.contractPaymentsInfoVersionGUID = value;
            }

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReason(String value) {
                this.reason = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApprovalType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contractVersionGUID"
        })
        public static class ApprovalContract
            extends ApprovalType
        {

            /**
             * Идентификатор версии договора
             * 
             */
            @XmlElement(name = "ContractVersionGUID", required = true)
            protected String contractVersionGUID;

            /**
             * Идентификатор версии договора
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractVersionGUID() {
                return contractVersionGUID;
            }

            /**
             * Sets the value of the contractVersionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getContractVersionGUID()
             */
            public void setContractVersionGUID(String value) {
                this.contractVersionGUID = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
         *         <element name="ContractObject" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                   <choice>
         *                     <element name="Add">
         *                       <complexType>
         *                         <complexContent>
         *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
         *                             <sequence>
         *                               <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                               <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
         *                                 <complexType>
         *                                   <complexContent>
         *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                                       <sequence>
         *                                         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                                       </sequence>
         *                                     </extension>
         *                                   </complexContent>
         *                                 </complexType>
         *                               </element>
         *                               <element name="AddService" maxOccurs="unbounded" minOccurs="0">
         *                                 <complexType>
         *                                   <complexContent>
         *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                                       <sequence>
         *                                         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                                       </sequence>
         *                                     </extension>
         *                                   </complexContent>
         *                                 </complexType>
         *                               </element>
         *                             </sequence>
         *                           </extension>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                     <element name="Edit">
         *                       <complexType>
         *                         <complexContent>
         *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
         *                             <sequence>
         *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
         *                               <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType" minOccurs="0"/>
         *                               <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
         *                                 <complexType>
         *                                   <complexContent>
         *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                                       <sequence>
         *                                         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                                       </sequence>
         *                                     </extension>
         *                                   </complexContent>
         *                                 </complexType>
         *                               </element>
         *                               <element name="AddService" maxOccurs="unbounded" minOccurs="0">
         *                                 <complexType>
         *                                   <complexContent>
         *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                                       <sequence>
         *                                         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                                       </sequence>
         *                                     </extension>
         *                                   </complexContent>
         *                                 </complexType>
         *                               </element>
         *                             </sequence>
         *                           </extension>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                     <element name="Annulment">
         *                       <complexType>
         *                         <complexContent>
         *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             <sequence>
         *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
         *                             </sequence>
         *                           </restriction>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                   </choice>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
         *         <element name="IndicationsAnyDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "licenseRequest",
            "contractObject",
            "contractVersionGUID",
            "indicationsAnyDay"
        })
        public static class EditContract
            extends ContractType
        {

            /**
             * Формировать заявки на проверки сведений для ГЖИ при возникновении конфликтов сведений об управляемых объектов с реестром лицензий/реестром информации о способах управления МКД
             * 
             */
            @XmlElement(name = "LicenseRequest")
            protected Boolean licenseRequest;
            /**
             * Управляемый объект
             * 
             */
            @XmlElement(name = "ContractObject")
            protected List<ImportContractRequest.Contract.EditContract.ContractObject> contractObject;
            /**
             * Идентификатор версии договора
             * 
             */
            @XmlElement(name = "ContractVersionGUID", required = true)
            protected String contractVersionGUID;
            /**
             * Разрешить (true) или запретить (false) передачу гражданам текущих показаний по индивидуальным приборам учета в любой день месяца. Если признак не передан, исползуется значение глобальной настройки "Разрешить передачу гражданам показаний индивидуальных или общих (квартирных) приборов учета в любой день месяца по всем договорам". Может быть передан только если есть хотя бы один объект управления в статусе "Утвержден".
             * 
             */
            @XmlElement(name = "IndicationsAnyDay")
            protected Boolean indicationsAnyDay;

            /**
             * Формировать заявки на проверки сведений для ГЖИ при возникновении конфликтов сведений об управляемых объектов с реестром лицензий/реестром информации о способах управления МКД
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLicenseRequest() {
                return licenseRequest;
            }

            /**
             * Sets the value of the licenseRequest property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isLicenseRequest()
             */
            public void setLicenseRequest(Boolean value) {
                this.licenseRequest = value;
            }

            /**
             * Управляемый объект
             * 
             * Gets the value of the contractObject property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contractObject property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getContractObject().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportContractRequest.Contract.EditContract.ContractObject }
             * </p>
             * 
             * 
             * @return
             *     The value of the contractObject property.
             */
            public List<ImportContractRequest.Contract.EditContract.ContractObject> getContractObject() {
                if (contractObject == null) {
                    contractObject = new ArrayList<>();
                }
                return this.contractObject;
            }

            /**
             * Идентификатор версии договора
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractVersionGUID() {
                return contractVersionGUID;
            }

            /**
             * Sets the value of the contractVersionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getContractVersionGUID()
             */
            public void setContractVersionGUID(String value) {
                this.contractVersionGUID = value;
            }

            /**
             * Разрешить (true) или запретить (false) передачу гражданам текущих показаний по индивидуальным приборам учета в любой день месяца. Если признак не передан, исползуется значение глобальной настройки "Разрешить передачу гражданам показаний индивидуальных или общих (квартирных) приборов учета в любой день месяца по всем договорам". Может быть передан только если есть хотя бы один объект управления в статусе "Утвержден".
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIndicationsAnyDay() {
                return indicationsAnyDay;
            }

            /**
             * Sets the value of the indicationsAnyDay property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIndicationsAnyDay()
             */
            public void setIndicationsAnyDay(Boolean value) {
                this.indicationsAnyDay = value;
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
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
             *         <choice>
             *           <element name="Add">
             *             <complexType>
             *               <complexContent>
             *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
             *                   <sequence>
             *                     <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
             *                     <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
             *                       <complexType>
             *                         <complexContent>
             *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *                             <sequence>
             *                               <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
             *                             </sequence>
             *                           </extension>
             *                         </complexContent>
             *                       </complexType>
             *                     </element>
             *                     <element name="AddService" maxOccurs="unbounded" minOccurs="0">
             *                       <complexType>
             *                         <complexContent>
             *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *                             <sequence>
             *                               <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
             *                             </sequence>
             *                           </extension>
             *                         </complexContent>
             *                       </complexType>
             *                     </element>
             *                   </sequence>
             *                 </extension>
             *               </complexContent>
             *             </complexType>
             *           </element>
             *           <element name="Edit">
             *             <complexType>
             *               <complexContent>
             *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
             *                   <sequence>
             *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
             *                     <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType" minOccurs="0"/>
             *                     <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
             *                       <complexType>
             *                         <complexContent>
             *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *                             <sequence>
             *                               <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
             *                             </sequence>
             *                           </extension>
             *                         </complexContent>
             *                       </complexType>
             *                     </element>
             *                     <element name="AddService" maxOccurs="unbounded" minOccurs="0">
             *                       <complexType>
             *                         <complexContent>
             *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *                             <sequence>
             *                               <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
             *                             </sequence>
             *                           </extension>
             *                         </complexContent>
             *                       </complexType>
             *                     </element>
             *                   </sequence>
             *                 </extension>
             *               </complexContent>
             *             </complexType>
             *           </element>
             *           <element name="Annulment">
             *             <complexType>
             *               <complexContent>
             *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   <sequence>
             *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
             *                   </sequence>
             *                 </restriction>
             *               </complexContent>
             *             </complexType>
             *           </element>
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
            @XmlType(name = "", propOrder = {
                "transportGUID",
                "add",
                "edit",
                "annulment"
            })
            public static class ContractObject {

                /**
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;
                /**
                 * Добавление
                 * 
                 */
                @XmlElement(name = "Add")
                protected ImportContractRequest.Contract.EditContract.ContractObject.Add add;
                /**
                 * Изменение
                 * 
                 */
                @XmlElement(name = "Edit")
                protected ImportContractRequest.Contract.EditContract.ContractObject.Edit edit;
                /**
                 * Аннулирование
                 * 
                 */
                @XmlElement(name = "Annulment")
                protected ImportContractRequest.Contract.EditContract.ContractObject.Annulment annulment;

                /**
                 * Транспортный идентификатор
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransportGUID() {
                    return transportGUID;
                }

                /**
                 * Sets the value of the transportGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getTransportGUID()
                 */
                public void setTransportGUID(String value) {
                    this.transportGUID = value;
                }

                /**
                 * Добавление
                 * 
                 * @return
                 *     possible object is
                 *     {@link ImportContractRequest.Contract.EditContract.ContractObject.Add }
                 *     
                 */
                public ImportContractRequest.Contract.EditContract.ContractObject.Add getAdd() {
                    return add;
                }

                /**
                 * Sets the value of the add property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportContractRequest.Contract.EditContract.ContractObject.Add }
                 *     
                 * @see #getAdd()
                 */
                public void setAdd(ImportContractRequest.Contract.EditContract.ContractObject.Add value) {
                    this.add = value;
                }

                /**
                 * Изменение
                 * 
                 * @return
                 *     possible object is
                 *     {@link ImportContractRequest.Contract.EditContract.ContractObject.Edit }
                 *     
                 */
                public ImportContractRequest.Contract.EditContract.ContractObject.Edit getEdit() {
                    return edit;
                }

                /**
                 * Sets the value of the edit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportContractRequest.Contract.EditContract.ContractObject.Edit }
                 *     
                 * @see #getEdit()
                 */
                public void setEdit(ImportContractRequest.Contract.EditContract.ContractObject.Edit value) {
                    this.edit = value;
                }

                /**
                 * Аннулирование
                 * 
                 * @return
                 *     possible object is
                 *     {@link ImportContractRequest.Contract.EditContract.ContractObject.Annulment }
                 *     
                 */
                public ImportContractRequest.Contract.EditContract.ContractObject.Annulment getAnnulment() {
                    return annulment;
                }

                /**
                 * Sets the value of the annulment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportContractRequest.Contract.EditContract.ContractObject.Annulment }
                 *     
                 * @see #getAnnulment()
                 */
                public void setAnnulment(ImportContractRequest.Contract.EditContract.ContractObject.Annulment value) {
                    this.annulment = value;
                }


                /**
                 * <p>Java class for anonymous complex type</p>.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.</p>
                 * 
                 * <pre>{@code
                 * <complexType>
                 *   <complexContent>
                 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
                 *       <sequence>
                 *         <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
                 *         <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
                 *           <complexType>
                 *             <complexContent>
                 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                 *                 <sequence>
                 *                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
                 *                 </sequence>
                 *               </extension>
                 *             </complexContent>
                 *           </complexType>
                 *         </element>
                 *         <element name="AddService" maxOccurs="unbounded" minOccurs="0">
                 *           <complexType>
                 *             <complexContent>
                 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                 *                 <sequence>
                 *                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
                 *                 </sequence>
                 *               </extension>
                 *             </complexContent>
                 *           </complexType>
                 *         </element>
                 *       </sequence>
                 *     </extension>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "baseMService",
                    "houseService",
                    "addService"
                })
                public static class Add
                    extends ManageObjectType
                {

                    /**
                     * Основание
                     * 
                     */
                    @XmlElement(name = "BaseMService", required = true)
                    protected BaseServiceType baseMService;
                    /**
                     * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
                     * 
                     */
                    @XmlElement(name = "HouseService")
                    protected List<ImportContractRequest.Contract.EditContract.ContractObject.Add.HouseService> houseService;
                    /**
                     * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
                     * 
                     */
                    @XmlElement(name = "AddService")
                    protected List<ImportContractRequest.Contract.EditContract.ContractObject.Add.AddService> addService;

                    /**
                     * Основание
                     * 
                     * @return
                     *     possible object is
                     *     {@link BaseServiceType }
                     *     
                     */
                    public BaseServiceType getBaseMService() {
                        return baseMService;
                    }

                    /**
                     * Sets the value of the baseMService property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BaseServiceType }
                     *     
                     * @see #getBaseMService()
                     */
                    public void setBaseMService(BaseServiceType value) {
                        this.baseMService = value;
                    }

                    /**
                     * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
                     * 
                     * Gets the value of the houseService property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the houseService property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getHouseService().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ImportContractRequest.Contract.EditContract.ContractObject.Add.HouseService }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the houseService property.
                     */
                    public List<ImportContractRequest.Contract.EditContract.ContractObject.Add.HouseService> getHouseService() {
                        if (houseService == null) {
                            houseService = new ArrayList<>();
                        }
                        return this.houseService;
                    }

                    /**
                     * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
                     * 
                     * Gets the value of the addService property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the addService property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getAddService().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ImportContractRequest.Contract.EditContract.ContractObject.Add.AddService }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the addService property.
                     */
                    public List<ImportContractRequest.Contract.EditContract.ContractObject.Add.AddService> getAddService() {
                        if (addService == null) {
                            addService = new ArrayList<>();
                        }
                        return this.addService;
                    }


                    /**
                     * <p>Java class for anonymous complex type</p>.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.</p>
                     * 
                     * <pre>{@code
                     * <complexType>
                     *   <complexContent>
                     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                     *       <sequence>
                     *         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
                     *       </sequence>
                     *     </extension>
                     *   </complexContent>
                     * </complexType>
                     * }</pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "baseService"
                    })
                    public static class AddService
                        extends ContractServiceType
                    {

                        /**
                         * Основание
                         * 
                         */
                        @XmlElement(name = "BaseService", required = true)
                        protected BaseServiceType baseService;

                        /**
                         * Основание
                         * 
                         * @return
                         *     possible object is
                         *     {@link BaseServiceType }
                         *     
                         */
                        public BaseServiceType getBaseService() {
                            return baseService;
                        }

                        /**
                         * Sets the value of the baseService property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BaseServiceType }
                         *     
                         * @see #getBaseService()
                         */
                        public void setBaseService(BaseServiceType value) {
                            this.baseService = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type</p>.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.</p>
                     * 
                     * <pre>{@code
                     * <complexType>
                     *   <complexContent>
                     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                     *       <sequence>
                     *         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
                     *       </sequence>
                     *     </extension>
                     *   </complexContent>
                     * </complexType>
                     * }</pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "baseService"
                    })
                    public static class HouseService
                        extends ContractServiceType
                    {

                        /**
                         * Основание
                         * 
                         */
                        @XmlElement(name = "BaseService", required = true)
                        protected BaseServiceType baseService;

                        /**
                         * Основание
                         * 
                         * @return
                         *     possible object is
                         *     {@link BaseServiceType }
                         *     
                         */
                        public BaseServiceType getBaseService() {
                            return baseService;
                        }

                        /**
                         * Sets the value of the baseService property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BaseServiceType }
                         *     
                         * @see #getBaseService()
                         */
                        public void setBaseService(BaseServiceType value) {
                            this.baseService = value;
                        }

                    }

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
                 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
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
                    "contractObjectVersionGUID"
                })
                public static class Annulment {

                    /**
                     * Идентификатор версии объекта управления  в ГИС ЖКХ
                     * 
                     */
                    @XmlElement(name = "ContractObjectVersionGUID", required = true)
                    protected String contractObjectVersionGUID;

                    /**
                     * Идентификатор версии объекта управления  в ГИС ЖКХ
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContractObjectVersionGUID() {
                        return contractObjectVersionGUID;
                    }

                    /**
                     * Sets the value of the contractObjectVersionGUID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     * @see #getContractObjectVersionGUID()
                     */
                    public void setContractObjectVersionGUID(String value) {
                        this.contractObjectVersionGUID = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type</p>.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.</p>
                 * 
                 * <pre>{@code
                 * <complexType>
                 *   <complexContent>
                 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
                 *       <sequence>
                 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
                 *         <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType" minOccurs="0"/>
                 *         <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
                 *           <complexType>
                 *             <complexContent>
                 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                 *                 <sequence>
                 *                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
                 *                 </sequence>
                 *               </extension>
                 *             </complexContent>
                 *           </complexType>
                 *         </element>
                 *         <element name="AddService" maxOccurs="unbounded" minOccurs="0">
                 *           <complexType>
                 *             <complexContent>
                 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                 *                 <sequence>
                 *                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
                 *                 </sequence>
                 *               </extension>
                 *             </complexContent>
                 *           </complexType>
                 *         </element>
                 *       </sequence>
                 *     </extension>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "contractObjectVersionGUID",
                    "baseMService",
                    "houseService",
                    "addService"
                })
                public static class Edit
                    extends ManageObjectType
                {

                    /**
                     * Идентификатор версии объекта управления  в ГИС ЖКХ
                     * 
                     */
                    @XmlElement(name = "ContractObjectVersionGUID", required = true)
                    protected String contractObjectVersionGUID;
                    /**
                     * Основание
                     * 
                     */
                    @XmlElement(name = "BaseMService")
                    protected BaseServiceType baseMService;
                    /**
                     * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
                     * 
                     */
                    @XmlElement(name = "HouseService")
                    protected List<ImportContractRequest.Contract.EditContract.ContractObject.Edit.HouseService> houseService;
                    /**
                     * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
                     * 
                     */
                    @XmlElement(name = "AddService")
                    protected List<ImportContractRequest.Contract.EditContract.ContractObject.Edit.AddService> addService;

                    /**
                     * Идентификатор версии объекта управления  в ГИС ЖКХ
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContractObjectVersionGUID() {
                        return contractObjectVersionGUID;
                    }

                    /**
                     * Sets the value of the contractObjectVersionGUID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     * @see #getContractObjectVersionGUID()
                     */
                    public void setContractObjectVersionGUID(String value) {
                        this.contractObjectVersionGUID = value;
                    }

                    /**
                     * Основание
                     * 
                     * @return
                     *     possible object is
                     *     {@link BaseServiceType }
                     *     
                     */
                    public BaseServiceType getBaseMService() {
                        return baseMService;
                    }

                    /**
                     * Sets the value of the baseMService property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BaseServiceType }
                     *     
                     * @see #getBaseMService()
                     */
                    public void setBaseMService(BaseServiceType value) {
                        this.baseMService = value;
                    }

                    /**
                     * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
                     * 
                     * Gets the value of the houseService property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the houseService property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getHouseService().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ImportContractRequest.Contract.EditContract.ContractObject.Edit.HouseService }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the houseService property.
                     */
                    public List<ImportContractRequest.Contract.EditContract.ContractObject.Edit.HouseService> getHouseService() {
                        if (houseService == null) {
                            houseService = new ArrayList<>();
                        }
                        return this.houseService;
                    }

                    /**
                     * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
                     * 
                     * Gets the value of the addService property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the addService property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getAddService().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ImportContractRequest.Contract.EditContract.ContractObject.Edit.AddService }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the addService property.
                     */
                    public List<ImportContractRequest.Contract.EditContract.ContractObject.Edit.AddService> getAddService() {
                        if (addService == null) {
                            addService = new ArrayList<>();
                        }
                        return this.addService;
                    }


                    /**
                     * <p>Java class for anonymous complex type</p>.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.</p>
                     * 
                     * <pre>{@code
                     * <complexType>
                     *   <complexContent>
                     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                     *       <sequence>
                     *         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
                     *       </sequence>
                     *     </extension>
                     *   </complexContent>
                     * </complexType>
                     * }</pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "baseService"
                    })
                    public static class AddService
                        extends ContractServiceType
                    {

                        /**
                         * Основание
                         * 
                         */
                        @XmlElement(name = "BaseService", required = true)
                        protected BaseServiceType baseService;

                        /**
                         * Основание
                         * 
                         * @return
                         *     possible object is
                         *     {@link BaseServiceType }
                         *     
                         */
                        public BaseServiceType getBaseService() {
                            return baseService;
                        }

                        /**
                         * Sets the value of the baseService property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BaseServiceType }
                         *     
                         * @see #getBaseService()
                         */
                        public void setBaseService(BaseServiceType value) {
                            this.baseService = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type</p>.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.</p>
                     * 
                     * <pre>{@code
                     * <complexType>
                     *   <complexContent>
                     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                     *       <sequence>
                     *         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
                     *       </sequence>
                     *     </extension>
                     *   </complexContent>
                     * </complexType>
                     * }</pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "baseService"
                    })
                    public static class HouseService
                        extends ContractServiceType
                    {

                        /**
                         * Основание
                         * 
                         */
                        @XmlElement(name = "BaseService", required = true)
                        protected BaseServiceType baseService;

                        /**
                         * Основание
                         * 
                         * @return
                         *     possible object is
                         *     {@link BaseServiceType }
                         *     
                         */
                        public BaseServiceType getBaseService() {
                            return baseService;
                        }

                        /**
                         * Sets the value of the baseService property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BaseServiceType }
                         *     
                         * @see #getBaseService()
                         */
                        public void setBaseService(BaseServiceType value) {
                            this.baseService = value;
                        }

                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contractVersionGUID"
        })
        public static class PlaceContractPaymentsInfo
            extends ContractPaymentsInfoType
        {

            /**
             * Идентификатор версии договора
             * 
             */
            @XmlElement(name = "ContractVersionGUID", required = true)
            protected String contractVersionGUID;

            /**
             * Идентификатор версии договора
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractVersionGUID() {
                return contractVersionGUID;
            }

            /**
             * Sets the value of the contractVersionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getContractVersionGUID()
             */
            public void setContractVersionGUID(String value) {
                this.contractVersionGUID = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
         *         <element name="ContractObject" maxOccurs="unbounded">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
         *                 <sequence>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                   <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                   <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                           <sequence>
         *                             <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                           </sequence>
         *                         </extension>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                   <element name="AddService" maxOccurs="unbounded" minOccurs="0">
         *                     <complexType>
         *                       <complexContent>
         *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                           <sequence>
         *                             <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                           </sequence>
         *                         </extension>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "licenseRequest",
            "contractObject"
        })
        public static class PlacingContract
            extends ContractType
        {

            /**
             * Формировать заявки в реестр лицензий, если сведения об управляемом объекте в договоре управления конфликтуют с реестром лицензий
             * 
             */
            @XmlElement(name = "LicenseRequest")
            protected Boolean licenseRequest;
            /**
             * Объект управления
             * 
             */
            @XmlElement(name = "ContractObject", required = true)
            protected List<ImportContractRequest.Contract.PlacingContract.ContractObject> contractObject;

            /**
             * Формировать заявки в реестр лицензий, если сведения об управляемом объекте в договоре управления конфликтуют с реестром лицензий
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLicenseRequest() {
                return licenseRequest;
            }

            /**
             * Sets the value of the licenseRequest property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isLicenseRequest()
             */
            public void setLicenseRequest(Boolean value) {
                this.licenseRequest = value;
            }

            /**
             * Объект управления
             * 
             * Gets the value of the contractObject property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contractObject property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getContractObject().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportContractRequest.Contract.PlacingContract.ContractObject }
             * </p>
             * 
             * 
             * @return
             *     The value of the contractObject property.
             */
            public List<ImportContractRequest.Contract.PlacingContract.ContractObject> getContractObject() {
                if (contractObject == null) {
                    contractObject = new ArrayList<>();
                }
                return this.contractObject;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
             *       <sequence>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
             *         <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
             *         <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *                 <sequence>
             *                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
             *                 </sequence>
             *               </extension>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *         <element name="AddService" maxOccurs="unbounded" minOccurs="0">
             *           <complexType>
             *             <complexContent>
             *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *                 <sequence>
             *                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
             *                 </sequence>
             *               </extension>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *       </sequence>
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "transportGUID",
                "baseMService",
                "houseService",
                "addService"
            })
            public static class ContractObject
                extends ManageObjectType
            {

                /**
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;
                /**
                 * Основание
                 * 
                 */
                @XmlElement(name = "BaseMService", required = true)
                protected BaseServiceType baseMService;
                /**
                 * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
                 * 
                 */
                @XmlElement(name = "HouseService")
                protected List<ImportContractRequest.Contract.PlacingContract.ContractObject.HouseService> houseService;
                /**
                 * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
                 * 
                 */
                @XmlElement(name = "AddService")
                protected List<ImportContractRequest.Contract.PlacingContract.ContractObject.AddService> addService;

                /**
                 * Транспортный идентификатор
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransportGUID() {
                    return transportGUID;
                }

                /**
                 * Sets the value of the transportGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getTransportGUID()
                 */
                public void setTransportGUID(String value) {
                    this.transportGUID = value;
                }

                /**
                 * Основание
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaseServiceType }
                 *     
                 */
                public BaseServiceType getBaseMService() {
                    return baseMService;
                }

                /**
                 * Sets the value of the baseMService property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaseServiceType }
                 *     
                 * @see #getBaseMService()
                 */
                public void setBaseMService(BaseServiceType value) {
                    this.baseMService = value;
                }

                /**
                 * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
                 * 
                 * Gets the value of the houseService property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the houseService property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getHouseService().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ImportContractRequest.Contract.PlacingContract.ContractObject.HouseService }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the houseService property.
                 */
                public List<ImportContractRequest.Contract.PlacingContract.ContractObject.HouseService> getHouseService() {
                    if (houseService == null) {
                        houseService = new ArrayList<>();
                    }
                    return this.houseService;
                }

                /**
                 * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
                 * 
                 * Gets the value of the addService property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the addService property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getAddService().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ImportContractRequest.Contract.PlacingContract.ContractObject.AddService }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the addService property.
                 */
                public List<ImportContractRequest.Contract.PlacingContract.ContractObject.AddService> getAddService() {
                    if (addService == null) {
                        addService = new ArrayList<>();
                    }
                    return this.addService;
                }


                /**
                 * <p>Java class for anonymous complex type</p>.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.</p>
                 * 
                 * <pre>{@code
                 * <complexType>
                 *   <complexContent>
                 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                 *       <sequence>
                 *         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
                 *       </sequence>
                 *     </extension>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "baseService"
                })
                public static class AddService
                    extends ContractServiceType
                {

                    /**
                     * Основание
                     * 
                     */
                    @XmlElement(name = "BaseService", required = true)
                    protected BaseServiceType baseService;

                    /**
                     * Основание
                     * 
                     * @return
                     *     possible object is
                     *     {@link BaseServiceType }
                     *     
                     */
                    public BaseServiceType getBaseService() {
                        return baseService;
                    }

                    /**
                     * Sets the value of the baseService property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BaseServiceType }
                     *     
                     * @see #getBaseService()
                     */
                    public void setBaseService(BaseServiceType value) {
                        this.baseService = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type</p>.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.</p>
                 * 
                 * <pre>{@code
                 * <complexType>
                 *   <complexContent>
                 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
                 *       <sequence>
                 *         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
                 *       </sequence>
                 *     </extension>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "baseService"
                })
                public static class HouseService
                    extends ContractServiceType
                {

                    /**
                     * Основание
                     * 
                     */
                    @XmlElement(name = "BaseService", required = true)
                    protected BaseServiceType baseService;

                    /**
                     * Основание
                     * 
                     * @return
                     *     possible object is
                     *     {@link BaseServiceType }
                     *     
                     */
                    public BaseServiceType getBaseService() {
                        return baseService;
                    }

                    /**
                     * Sets the value of the baseService property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BaseServiceType }
                     *     
                     * @see #getBaseService()
                     */
                    public void setBaseService(BaseServiceType value) {
                        this.baseService = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RollOverType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
         *         <element name="RollToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "licenseRequest",
            "contractVersionGUID",
            "rollToDate"
        })
        public static class RollOverContract
            extends RollOverType
        {

            /**
             * Формировать заявки в реестр лицензий, если сведения об управляемом объекте в договоре управления конфликтуют с реестром лицензий
             * 
             */
            @XmlElement(name = "LicenseRequest")
            protected Boolean licenseRequest;
            /**
             * Идентификатор версии договора
             * 
             */
            @XmlElement(name = "ContractVersionGUID", required = true)
            protected String contractVersionGUID;
            /**
             * Пролонгировать до даты. Если не указано, то договор пролонгируется на срок, равный Дата окончания действия - Дата вступления в силу.
             * 
             */
            @XmlElement(name = "RollToDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar rollToDate;

            /**
             * Формировать заявки в реестр лицензий, если сведения об управляемом объекте в договоре управления конфликтуют с реестром лицензий
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLicenseRequest() {
                return licenseRequest;
            }

            /**
             * Sets the value of the licenseRequest property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isLicenseRequest()
             */
            public void setLicenseRequest(Boolean value) {
                this.licenseRequest = value;
            }

            /**
             * Идентификатор версии договора
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractVersionGUID() {
                return contractVersionGUID;
            }

            /**
             * Sets the value of the contractVersionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getContractVersionGUID()
             */
            public void setContractVersionGUID(String value) {
                this.contractVersionGUID = value;
            }

            /**
             * Пролонгировать до даты. Если не указано, то договор пролонгируется на срок, равный Дата окончания действия - Дата вступления в силу.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getRollToDate() {
                return rollToDate;
            }

            /**
             * Sets the value of the rollToDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getRollToDate()
             */
            public void setRollToDate(XMLGregorianCalendar value) {
                this.rollToDate = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}LicenseRequest" minOccurs="0"/>
         *         <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *         <element name="TerminateAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "licenseRequest",
            "reasonRef",
            "terminateAttachment",
            "contractVersionGUID"
        })
        public static class TerminateContract
            extends TerminateType
        {

            /**
             * Формировать заявки в реестр лицензий, если сведения об управляемом объекте в договоре управления конфликтуют с реестром лицензий
             * 
             */
            @XmlElement(name = "LicenseRequest")
            protected Boolean licenseRequest;
            /**
             * Ссылка на НСИ "54	Причина расторжения договор" (реестровый номер 54)
             * 
             */
            @XmlElement(name = "ReasonRef", required = true)
            protected NsiRef reasonRef;
            /**
             * Основание
             * 
             */
            @XmlElement(name = "TerminateAttachment", required = true)
            protected List<AttachmentType> terminateAttachment;
            /**
             * Идентификатор версии договора
             * 
             */
            @XmlElement(name = "ContractVersionGUID", required = true)
            protected String contractVersionGUID;

            /**
             * Формировать заявки в реестр лицензий, если сведения об управляемом объекте в договоре управления конфликтуют с реестром лицензий
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLicenseRequest() {
                return licenseRequest;
            }

            /**
             * Sets the value of the licenseRequest property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isLicenseRequest()
             */
            public void setLicenseRequest(Boolean value) {
                this.licenseRequest = value;
            }

            /**
             * Ссылка на НСИ "54	Причина расторжения договор" (реестровый номер 54)
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getReasonRef() {
                return reasonRef;
            }

            /**
             * Sets the value of the reasonRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getReasonRef()
             */
            public void setReasonRef(NsiRef value) {
                this.reasonRef = value;
            }

            /**
             * Основание
             * 
             * Gets the value of the terminateAttachment property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the terminateAttachment property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getTerminateAttachment().add(newItem);
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
             *     The value of the terminateAttachment property.
             */
            public List<AttachmentType> getTerminateAttachment() {
                if (terminateAttachment == null) {
                    terminateAttachment = new ArrayList<>();
                }
                return this.terminateAttachment;
            }

            /**
             * Идентификатор версии договора
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractVersionGUID() {
                return contractVersionGUID;
            }

            /**
             * Sets the value of the contractVersionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getContractVersionGUID()
             */
            public void setContractVersionGUID(String value) {
                this.contractVersionGUID = value;
            }

        }

    }

}
