
package ru.gosuslugi.dom.schema.integration.drs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


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
 *         <element name="action" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element name="requestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <element name="actionType" type="{http://dom.gosuslugi.ru/schema/integration/drs/}DRActionType"/>
 *                   <element name="requestData" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ImportDRType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "action"
})
@XmlRootElement(name = "importDRsRequest")
public class ImportDRsRequest
    extends BaseType
{

    /**
     * Операция над запросом  о наличии задолженности за ЖКУ
     * 
     */
    @XmlElement(required = true)
    protected List<ImportDRsRequest.Action> action;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Операция над запросом  о наличии задолженности за ЖКУ
     * 
     * Gets the value of the action property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportDRsRequest.Action }
     * </p>
     * 
     * 
     * @return
     *     The value of the action property.
     */
    public List<ImportDRsRequest.Action> getAction() {
        if (action == null) {
            action = new ArrayList<>();
        }
        return this.action;
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
        return version;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element name="requestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <element name="actionType" type="{http://dom.gosuslugi.ru/schema/integration/drs/}DRActionType"/>
     *         <element name="requestData" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ImportDRType" minOccurs="0"/>
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
        "requestGUID",
        "actionType",
        "requestData"
    })
    public static class Action {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор запроса о наличии задолженности за ЖКУ.
         * 
         * 												Обязателен для операции Revoke.
         * 
         * 												Для операции Send указывается в том случае, если поставщикам ЖКУ направляется уже существующий в ГИС ЖКХ запрос
         * 
         */
        protected String requestGUID;
        /**
         * Тип операции над запросом о наличии задолженности за ЖКУ.
         * 
         * 												Допустимые значения:
         * 												Send - Направить запрос поставщикам ЖКУ;
         * 												Revoke - Отозвать запрос, ранее направленный поставщикам ЖКУ.
         * 
         * 												Для операции Send должен быть указан хотя бы один из элементов requestGUID или requestData
         * 
         */
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected DRActionType actionType;
        /**
         * Данные запроса о наличии задолженности за ЖКУ.
         * 
         * 												Указывается только для операции Send.
         * 
         * 												Если операция связана с уже существующим в ГИС ЖКХ запросом (указан элемент requestGUID), то контент элемента используется для изменения запроса перед его направлением поставщикам ЖКУ. В противном случае, контент элемента используется для создания в ГИС ЖКХ нового запроса, который направляется поставщикам ЖКУ
         * 
         */
        protected ImportDRType requestData;

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
         * Идентификатор запроса о наличии задолженности за ЖКУ.
         * 
         * 												Обязателен для операции Revoke.
         * 
         * 												Для операции Send указывается в том случае, если поставщикам ЖКУ направляется уже существующий в ГИС ЖКХ запрос
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestGUID() {
            return requestGUID;
        }

        /**
         * Sets the value of the requestGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRequestGUID()
         */
        public void setRequestGUID(String value) {
            this.requestGUID = value;
        }

        /**
         * Тип операции над запросом о наличии задолженности за ЖКУ.
         * 
         * 												Допустимые значения:
         * 												Send - Направить запрос поставщикам ЖКУ;
         * 												Revoke - Отозвать запрос, ранее направленный поставщикам ЖКУ.
         * 
         * 												Для операции Send должен быть указан хотя бы один из элементов requestGUID или requestData
         * 
         * @return
         *     possible object is
         *     {@link DRActionType }
         *     
         */
        public DRActionType getActionType() {
            return actionType;
        }

        /**
         * Sets the value of the actionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link DRActionType }
         *     
         * @see #getActionType()
         */
        public void setActionType(DRActionType value) {
            this.actionType = value;
        }

        /**
         * Данные запроса о наличии задолженности за ЖКУ.
         * 
         * 												Указывается только для операции Send.
         * 
         * 												Если операция связана с уже существующим в ГИС ЖКХ запросом (указан элемент requestGUID), то контент элемента используется для изменения запроса перед его направлением поставщикам ЖКУ. В противном случае, контент элемента используется для создания в ГИС ЖКХ нового запроса, который направляется поставщикам ЖКУ
         * 
         * @return
         *     possible object is
         *     {@link ImportDRType }
         *     
         */
        public ImportDRType getRequestData() {
            return requestData;
        }

        /**
         * Sets the value of the requestData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDRType }
         *     
         * @see #getRequestData()
         */
        public void setRequestData(ImportDRType value) {
            this.requestData = value;
        }

    }

}
