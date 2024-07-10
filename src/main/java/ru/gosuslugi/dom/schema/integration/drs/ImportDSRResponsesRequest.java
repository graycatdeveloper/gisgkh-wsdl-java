
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
 *                   <element name="subrequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="actionType" type="{http://dom.gosuslugi.ru/schema/integration/drs/}DSRResponseActionType"/>
 *                   <element name="responseData" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ImportDSRResponseType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="14.0.0.0""/>
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
@XmlRootElement(name = "importDSRResponsesRequest")
public class ImportDSRResponsesRequest
    extends BaseType
{

    /**
     * Действие с ответом на подзапрос о наличии задолженности
     * 
     */
    @XmlElement(required = true)
    protected List<ImportDSRResponsesRequest.Action> action;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Действие с ответом на подзапрос о наличии задолженности
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
     * {@link ImportDSRResponsesRequest.Action }
     * </p>
     * 
     * 
     * @return
     *     The value of the action property.
     */
    public List<ImportDSRResponsesRequest.Action> getAction() {
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
        if (version == null) {
            return "14.0.0.0";
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element name="subrequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="actionType" type="{http://dom.gosuslugi.ru/schema/integration/drs/}DSRResponseActionType"/>
     *         <element name="responseData" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ImportDSRResponseType" minOccurs="0"/>
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
        "subrequestGUID",
        "actionType",
        "responseData"
    })
    public static class Action {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор подзапроса о наличии задолженности, сформированного ГИС ЖКХ
         * 
         */
        @XmlElement(required = true)
        protected String subrequestGUID;
        /**
         * Тип операции с ответом на подзапрос.
         * 
         * 												Допустимые значения:
         * 												Send - Отправить ответ;
         * 												Revoke - Отозвать ранее отправленный ответ
         * 
         */
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected DSRResponseActionType actionType;
        /**
         * Ответ на подзапрос.
         * 
         * 												Указывается только для операции Send.
         * 
         * 												Если для подзапроса ответ уже существует в ГИС ЖКХ, то контент элемента используется для изменения ответа перед его отправкой. В противном случае, контент элемента используется для создания и отправки нового ответа
         * 
         */
        protected ImportDSRResponseType responseData;

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
         * Идентификатор подзапроса о наличии задолженности, сформированного ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubrequestGUID() {
            return subrequestGUID;
        }

        /**
         * Sets the value of the subrequestGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSubrequestGUID()
         */
        public void setSubrequestGUID(String value) {
            this.subrequestGUID = value;
        }

        /**
         * Тип операции с ответом на подзапрос.
         * 
         * 												Допустимые значения:
         * 												Send - Отправить ответ;
         * 												Revoke - Отозвать ранее отправленный ответ
         * 
         * @return
         *     possible object is
         *     {@link DSRResponseActionType }
         *     
         */
        public DSRResponseActionType getActionType() {
            return actionType;
        }

        /**
         * Sets the value of the actionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSRResponseActionType }
         *     
         * @see #getActionType()
         */
        public void setActionType(DSRResponseActionType value) {
            this.actionType = value;
        }

        /**
         * Ответ на подзапрос.
         * 
         * 												Указывается только для операции Send.
         * 
         * 												Если для подзапроса ответ уже существует в ГИС ЖКХ, то контент элемента используется для изменения ответа перед его отправкой. В противном случае, контент элемента используется для создания и отправки нового ответа
         * 
         * @return
         *     possible object is
         *     {@link ImportDSRResponseType }
         *     
         */
        public ImportDSRResponseType getResponseData() {
            return responseData;
        }

        /**
         * Sets the value of the responseData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDSRResponseType }
         *     
         * @see #getResponseData()
         */
        public void setResponseData(ImportDSRResponseType value) {
            this.responseData = value;
        }

    }

}
