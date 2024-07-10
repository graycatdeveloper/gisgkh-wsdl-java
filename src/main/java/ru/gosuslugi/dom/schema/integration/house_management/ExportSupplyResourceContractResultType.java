
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Результат экспорта договоров ресурсоснабжения
 * 
 * <p>Java class for exportSupplyResourceContractResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportSupplyResourceContractResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ExportSupplyResourceContractType">
 *       <sequence>
 *         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ContractState">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="NotTakeEffect"/>
 *               <enumeration value="Proceed"/>
 *               <enumeration value="Expired"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="VersionNumber">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="VersionStatus">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Posted"/>
 *               <enumeration value="Terminated"/>
 *               <enumeration value="Draft"/>
 *               <enumeration value="Annul"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TerminateContract" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
 *                 <sequence>
 *                   <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AnnulmentContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ExportAnnulmentType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportSupplyResourceContractResultType", propOrder = {
    "contractRootGUID",
    "contractGUID",
    "contractState",
    "versionNumber",
    "versionStatus",
    "terminateContract",
    "annulmentContract"
})
public class ExportSupplyResourceContractResultType
    extends ExportSupplyResourceContractType
{

    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractRootGUID", required = true)
    protected String contractRootGUID;
    /**
     * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractGUID", required = true)
    protected String contractGUID;
    /**
     * Состояние договора
     * 
     */
    @XmlElement(name = "ContractState", required = true)
    protected String contractState;
    /**
     * Номер версии договора
     * 
     */
    @XmlElement(name = "VersionNumber", required = true)
    protected BigInteger versionNumber;
    /**
     * Статус версии договора
     * 
     */
    @XmlElement(name = "VersionStatus", required = true)
    protected String versionStatus;
    /**
     * Информация о расторжении
     * 
     */
    @XmlElement(name = "TerminateContract")
    protected ExportSupplyResourceContractResultType.TerminateContract terminateContract;
    /**
     * Аннулирование
     * 
     */
    @XmlElement(name = "AnnulmentContract")
    protected ExportAnnulmentType annulmentContract;

    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractRootGUID() {
        return contractRootGUID;
    }

    /**
     * Sets the value of the contractRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractRootGUID()
     */
    public void setContractRootGUID(String value) {
        this.contractRootGUID = value;
    }

    /**
     * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractGUID() {
        return contractGUID;
    }

    /**
     * Sets the value of the contractGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractGUID()
     */
    public void setContractGUID(String value) {
        this.contractGUID = value;
    }

    /**
     * Состояние договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractState() {
        return contractState;
    }

    /**
     * Sets the value of the contractState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractState()
     */
    public void setContractState(String value) {
        this.contractState = value;
    }

    /**
     * Номер версии договора
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getVersionNumber()
     */
    public void setVersionNumber(BigInteger value) {
        this.versionNumber = value;
    }

    /**
     * Статус версии договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionStatus() {
        return versionStatus;
    }

    /**
     * Sets the value of the versionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersionStatus()
     */
    public void setVersionStatus(String value) {
        this.versionStatus = value;
    }

    /**
     * Информация о расторжении
     * 
     * @return
     *     possible object is
     *     {@link ExportSupplyResourceContractResultType.TerminateContract }
     *     
     */
    public ExportSupplyResourceContractResultType.TerminateContract getTerminateContract() {
        return terminateContract;
    }

    /**
     * Sets the value of the terminateContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSupplyResourceContractResultType.TerminateContract }
     *     
     * @see #getTerminateContract()
     */
    public void setTerminateContract(ExportSupplyResourceContractResultType.TerminateContract value) {
        this.terminateContract = value;
    }

    /**
     * Аннулирование
     * 
     * @return
     *     possible object is
     *     {@link ExportAnnulmentType }
     *     
     */
    public ExportAnnulmentType getAnnulmentContract() {
        return annulmentContract;
    }

    /**
     * Sets the value of the annulmentContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportAnnulmentType }
     *     
     * @see #getAnnulmentContract()
     */
    public void setAnnulmentContract(ExportAnnulmentType value) {
        this.annulmentContract = value;
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
     *         <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
        "reasonRef"
    })
    public static class TerminateContract
        extends TerminateType
    {

        /**
         * Ссылка на НСИ "54	Причина расторжения договора" (реестровый номер 54)
         * 
         */
        @XmlElement(name = "ReasonRef", required = true)
        protected NsiRef reasonRef;

        /**
         * Ссылка на НСИ "54	Причина расторжения договора" (реестровый номер 54)
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

    }

}
