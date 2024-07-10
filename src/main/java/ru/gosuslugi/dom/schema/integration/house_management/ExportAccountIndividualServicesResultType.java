
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос экспорта индивидуальных услуг лицевого счета
 * 
 * <p>Java class for exportAccountIndividualServicesResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportAccountIndividualServicesResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountIndividualServiceType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountIndividualServiceGUID"/>
 *         <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="IsActual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportAccountIndividualServicesResultType", propOrder = {
    "accountIndividualServiceGUID",
    "accountGUID",
    "isActual"
})
public class ExportAccountIndividualServicesResultType
    extends AccountIndividualServiceType
{

    /**
     * Идентификатор индивидуальной услуги ЛС
     * 
     */
    @XmlElement(name = "AccountIndividualServiceGUID", required = true)
    protected String accountIndividualServiceGUID;
    /**
     * Идентификатор ЛС в ГИС ЖКХ (при обновлении данных ЛС)
     * 
     */
    @XmlElement(name = "AccountGUID", required = true)
    protected String accountGUID;
    /**
     * Услуга связана с лицевыс счетом?
     * 
     */
    @XmlElement(name = "IsActual")
    protected boolean isActual;

    /**
     * Идентификатор индивидуальной услуги ЛС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountIndividualServiceGUID() {
        return accountIndividualServiceGUID;
    }

    /**
     * Sets the value of the accountIndividualServiceGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountIndividualServiceGUID()
     */
    public void setAccountIndividualServiceGUID(String value) {
        this.accountIndividualServiceGUID = value;
    }

    /**
     * Идентификатор ЛС в ГИС ЖКХ (при обновлении данных ЛС)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountGUID() {
        return accountGUID;
    }

    /**
     * Sets the value of the accountGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountGUID()
     */
    public void setAccountGUID(String value) {
        this.accountGUID = value;
    }

    /**
     * Услуга связана с лицевыс счетом?
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

}
