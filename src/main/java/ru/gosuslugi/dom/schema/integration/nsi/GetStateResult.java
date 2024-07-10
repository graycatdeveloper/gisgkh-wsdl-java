
package ru.gosuslugi.dom.schema.integration.nsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseAsyncResponseType;
import ru.gosuslugi.dom.schema.integration.base.CommonResultType;
import ru.gosuslugi.dom.schema.integration.base.ErrorMessageType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiItemType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiListType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseAsyncResponseType">
 *       <choice minOccurs="0">
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *         <element name="ImportResult" type="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType" maxOccurs="unbounded"/>
 *         <element name="NsiItem" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemType"/>
 *         <element name="NsiPagingItem">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemType">
 *                 <sequence>
 *                   <element name="TotalItemsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="CurrentPage" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="NsiList" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiListType"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorMessage",
    "importResult",
    "nsiItem",
    "nsiPagingItem",
    "nsiList"
})
@XmlRootElement(name = "getStateResult")
public class GetStateResult
    extends BaseAsyncResponseType
{

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     */
    @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected ErrorMessageType errorMessage;
    @XmlElement(name = "ImportResult")
    protected List<CommonResultType> importResult;
    @XmlElement(name = "NsiItem")
    protected NsiItemType nsiItem;
    @XmlElement(name = "NsiPagingItem")
    protected GetStateResult.NsiPagingItem nsiPagingItem;
    @XmlElement(name = "NsiList")
    protected NsiListType nsiList;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageType }
     *     
     */
    public ErrorMessageType getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageType }
     *     
     * @see #getErrorMessage()
     */
    public void setErrorMessage(ErrorMessageType value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the importResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the importResult property.
     */
    public List<CommonResultType> getImportResult() {
        if (importResult == null) {
            importResult = new ArrayList<>();
        }
        return this.importResult;
    }

    /**
     * Gets the value of the nsiItem property.
     * 
     * @return
     *     possible object is
     *     {@link NsiItemType }
     *     
     */
    public NsiItemType getNsiItem() {
        return nsiItem;
    }

    /**
     * Sets the value of the nsiItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiItemType }
     *     
     */
    public void setNsiItem(NsiItemType value) {
        this.nsiItem = value;
    }

    /**
     * Gets the value of the nsiPagingItem property.
     * 
     * @return
     *     possible object is
     *     {@link GetStateResult.NsiPagingItem }
     *     
     */
    public GetStateResult.NsiPagingItem getNsiPagingItem() {
        return nsiPagingItem;
    }

    /**
     * Sets the value of the nsiPagingItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStateResult.NsiPagingItem }
     *     
     */
    public void setNsiPagingItem(GetStateResult.NsiPagingItem value) {
        this.nsiPagingItem = value;
    }

    /**
     * Gets the value of the nsiList property.
     * 
     * @return
     *     possible object is
     *     {@link NsiListType }
     *     
     */
    public NsiListType getNsiList() {
        return nsiList;
    }

    /**
     * Sets the value of the nsiList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiListType }
     *     
     */
    public void setNsiList(NsiListType value) {
        this.nsiList = value;
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
            return "10.0.1.2";
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemType">
     *       <sequence>
     *         <element name="TotalItemsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="CurrentPage" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
        "totalItemsCount",
        "totalPages",
        "currentPage"
    })
    public static class NsiPagingItem
        extends NsiItemType
    {

        /**
         * Количество записей в справочнике
         * 
         */
        @XmlElement(name = "TotalItemsCount")
        protected int totalItemsCount;
        /**
         * Количество страниц
         * 
         */
        @XmlElement(name = "TotalPages")
        protected int totalPages;
        /**
         * Номер текущей страницы
         * 
         */
        @XmlElement(name = "CurrentPage", required = true)
        protected Object currentPage;

        /**
         * Количество записей в справочнике
         * 
         */
        public int getTotalItemsCount() {
            return totalItemsCount;
        }

        /**
         * Sets the value of the totalItemsCount property.
         * 
         */
        public void setTotalItemsCount(int value) {
            this.totalItemsCount = value;
        }

        /**
         * Количество страниц
         * 
         */
        public int getTotalPages() {
            return totalPages;
        }

        /**
         * Sets the value of the totalPages property.
         * 
         */
        public void setTotalPages(int value) {
            this.totalPages = value;
        }

        /**
         * Номер текущей страницы
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCurrentPage() {
            return currentPage;
        }

        /**
         * Sets the value of the currentPage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         * @see #getCurrentPage()
         */
        public void setCurrentPage(Object value) {
            this.currentPage = value;
        }

    }

}
