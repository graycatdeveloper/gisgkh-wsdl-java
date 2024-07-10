
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Параметры для импорта записи о деактуализации
 * 
 * <p>Java class for DeactalizationDetailsImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeactalizationDetailsImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DeactualizationEntryGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}CancelReasonType" minOccurs="0"/>
 *         <element name="AnnulPeriodLater" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeactalizationDetailsImportType", propOrder = {
    "deactualizationEntryGUID",
    "cancelReason",
    "annulPeriodLater"
})
public class DeactalizationDetailsImportType {

    /**
     * Идентификатор реестровой записи, для которой выполнялась деактуализация. Не заполняется при исправлении технической ошибки в записи о деактуализации.
     * 
     */
    @XmlElement(name = "DeactualizationEntryGUID")
    protected String deactualizationEntryGUID;
    /**
     * Причина аннулирования дома в лицензии. Обязательно заполняется при деактуализации записи о включеии дома. При деактуализации записей других типов не заполняется.
     * 
     */
    @XmlElement(name = "CancelReason")
    protected String cancelReason;
    /**
     * Признак используется при выполнении отмены деактуализации записи о включении дома или отмены деактуализации лицензии. В указанных операциях Будет выполнена попытка включить в лицензию дома, которые были аннулированы. При выполнении других операций признак не будет влиять на размещение информации.
     * 
     * Признак обозначает необходимость аннулировать периодны управления домами другими организациями, позже включаемого периода, при наличии таких периодов. 
     * 
     *  1) Если таких периодов нет, то признак не влияет на внесение информации.
     *  2) Если такие периоды есть и признак выставлен, то информация об управлении другими организациями, позже даты InclusionDate будет аннулирована.
     *  3) Если периоды есть и признак не выставлен, то при размещении сведений о включении дома будет автоматически добавлена информация об окончании периода управления и исключении дома из лицензии с датой на 1 день меньше ближайшего периода управления другой организацией.
     * 
     */
    @XmlElement(name = "AnnulPeriodLater")
    protected Boolean annulPeriodLater;

    /**
     * Идентификатор реестровой записи, для которой выполнялась деактуализация. Не заполняется при исправлении технической ошибки в записи о деактуализации.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeactualizationEntryGUID() {
        return deactualizationEntryGUID;
    }

    /**
     * Sets the value of the deactualizationEntryGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDeactualizationEntryGUID()
     */
    public void setDeactualizationEntryGUID(String value) {
        this.deactualizationEntryGUID = value;
    }

    /**
     * Причина аннулирования дома в лицензии. Обязательно заполняется при деактуализации записи о включеии дома. При деактуализации записей других типов не заполняется.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCancelReason()
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Признак используется при выполнении отмены деактуализации записи о включении дома или отмены деактуализации лицензии. В указанных операциях Будет выполнена попытка включить в лицензию дома, которые были аннулированы. При выполнении других операций признак не будет влиять на размещение информации.
     * 
     * Признак обозначает необходимость аннулировать периодны управления домами другими организациями, позже включаемого периода, при наличии таких периодов. 
     * 
     *  1) Если таких периодов нет, то признак не влияет на внесение информации.
     *  2) Если такие периоды есть и признак выставлен, то информация об управлении другими организациями, позже даты InclusionDate будет аннулирована.
     *  3) Если периоды есть и признак не выставлен, то при размещении сведений о включении дома будет автоматически добавлена информация об окончании периода управления и исключении дома из лицензии с датой на 1 день меньше ближайшего периода управления другой организацией.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnulPeriodLater() {
        return annulPeriodLater;
    }

    /**
     * Sets the value of the annulPeriodLater property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAnnulPeriodLater()
     */
    public void setAnnulPeriodLater(Boolean value) {
        this.annulPeriodLater = value;
    }

}
