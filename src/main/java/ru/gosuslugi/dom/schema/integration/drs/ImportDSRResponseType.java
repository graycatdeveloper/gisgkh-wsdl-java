
package ru.gosuslugi.dom.schema.integration.drs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Данные подзапроса о наличии задолженности за ЖКУ для импорта в ГИС ЖКХ
 * 
 * <p>Java class for ImportDSRResponseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportDSRResponseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="hasDebt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="additionalFile" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="description" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="executorGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <choice>
 *           <element name="debtInfo" type="{http://dom.gosuslugi.ru/schema/integration/drs/}DebtInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="debtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ImportDSRResponseType", propOrder = {
    "hasDebt",
    "additionalFile",
    "description",
    "executorGUID",
    "debtInfo",
    "debtGUID"
})
public class ImportDSRResponseType {

    /**
     * Признак наличия задолженности, подтвержденной судебным актом
     * 
     */
    protected boolean hasDebt;
    /**
     * Дополнительный файл.
     * 
     * 						Может быть указан, только если hasDebt=TRUE
     * 
     */
    protected List<AttachmentType> additionalFile;
    /**
     * Дополнительная информация
     * 
     */
    protected String description;
    /**
     * Идентификатор сотрудника, сформировавшего ответ
     * 
     */
    @XmlElement(required = true)
    protected String executorGUID;
    /**
     * Информация о непогашенной задолженности, подтвержденной судебным актом. Указывается, если ответ направляется без учета реестра сведений о задолженности.
     * 
     * Может быть указан, только если hasDebt=TRUE. В этом случае элемент обязателен
     * 
     */
    protected List<DebtInfoType> debtInfo;
    /**
     * Идентификатор записи реестра сведений о задолженности. Указывается при направлении ответа с учетом реестра сведений о задолженности. Может быть указан, только если hasDebt=TRUE. Необязателен для заполнения
     * 
     */
    protected List<String> debtGUID;

    /**
     * Признак наличия задолженности, подтвержденной судебным актом
     * 
     */
    public boolean isHasDebt() {
        return hasDebt;
    }

    /**
     * Sets the value of the hasDebt property.
     * 
     */
    public void setHasDebt(boolean value) {
        this.hasDebt = value;
    }

    /**
     * Дополнительный файл.
     * 
     * 						Может быть указан, только если hasDebt=TRUE
     * 
     * Gets the value of the additionalFile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalFile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdditionalFile().add(newItem);
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
     *     The value of the additionalFile property.
     */
    public List<AttachmentType> getAdditionalFile() {
        if (additionalFile == null) {
            additionalFile = new ArrayList<>();
        }
        return this.additionalFile;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Идентификатор сотрудника, сформировавшего ответ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutorGUID() {
        return executorGUID;
    }

    /**
     * Sets the value of the executorGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExecutorGUID()
     */
    public void setExecutorGUID(String value) {
        this.executorGUID = value;
    }

    /**
     * Информация о непогашенной задолженности, подтвержденной судебным актом. Указывается, если ответ направляется без учета реестра сведений о задолженности.
     * 
     * Может быть указан, только если hasDebt=TRUE. В этом случае элемент обязателен
     * 
     * Gets the value of the debtInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDebtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebtInfoType }
     * </p>
     * 
     * 
     * @return
     *     The value of the debtInfo property.
     */
    public List<DebtInfoType> getDebtInfo() {
        if (debtInfo == null) {
            debtInfo = new ArrayList<>();
        }
        return this.debtInfo;
    }

    /**
     * Идентификатор записи реестра сведений о задолженности. Указывается при направлении ответа с учетом реестра сведений о задолженности. Может быть указан, только если hasDebt=TRUE. Необязателен для заполнения
     * 
     * Gets the value of the debtGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDebtGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the debtGUID property.
     */
    public List<String> getDebtGUID() {
        if (debtGUID == null) {
            debtGUID = new ArrayList<>();
        }
        return this.debtGUID;
    }

}
