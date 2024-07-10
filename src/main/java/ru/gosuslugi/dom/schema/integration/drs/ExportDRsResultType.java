
package ru.gosuslugi.dom.schema.integration.drs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип для результата экспорта из ГИС ЖКХ запросов о наличии задолженности за ЖКУ
 * 
 * <p>Java class for exportDRsResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportDRsResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="requestData" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ExportDRType" maxOccurs="unbounded"/>
 *         <element name="notFound" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="requestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                   <element name="requestNumber" type="{http://dom.gosuslugi.ru/schema/integration/drs/}RequestNumberType" maxOccurs="unbounded"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="pagedOutput" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="nextRequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="lastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
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
@XmlType(name = "exportDRsResultType", propOrder = {
    "requestData",
    "notFound",
    "pagedOutput"
})
public class ExportDRsResultType {

    /**
     * Данные запроса о наличии задолженности за ЖКУ
     * 
     */
    @XmlElement(required = true)
    protected List<ExportDRType> requestData;
    /**
     * Запросы о наличии задолженности за ЖКУ, данные о которых не найдены в ГИС ЖКХ
     * 
     */
    protected ExportDRsResultType.NotFound notFound;
    /**
     * Параметры, необходимые для  экспорта следующего блока данных (см. аннотацию элемента exportDRsRequest/ exportRequestGUID).
     * 
     * 						Заполняется, если в элементе exportDRsRequest указаны условия отбора по атрибутам запроса
     * 
     */
    protected ExportDRsResultType.PagedOutput pagedOutput;

    /**
     * Данные запроса о наличии задолженности за ЖКУ
     * 
     * Gets the value of the requestData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequestData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDRType }
     * </p>
     * 
     * 
     * @return
     *     The value of the requestData property.
     */
    public List<ExportDRType> getRequestData() {
        if (requestData == null) {
            requestData = new ArrayList<>();
        }
        return this.requestData;
    }

    /**
     * Запросы о наличии задолженности за ЖКУ, данные о которых не найдены в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link ExportDRsResultType.NotFound }
     *     
     */
    public ExportDRsResultType.NotFound getNotFound() {
        return notFound;
    }

    /**
     * Sets the value of the notFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDRsResultType.NotFound }
     *     
     * @see #getNotFound()
     */
    public void setNotFound(ExportDRsResultType.NotFound value) {
        this.notFound = value;
    }

    /**
     * Параметры, необходимые для  экспорта следующего блока данных (см. аннотацию элемента exportDRsRequest/ exportRequestGUID).
     * 
     * 						Заполняется, если в элементе exportDRsRequest указаны условия отбора по атрибутам запроса
     * 
     * @return
     *     possible object is
     *     {@link ExportDRsResultType.PagedOutput }
     *     
     */
    public ExportDRsResultType.PagedOutput getPagedOutput() {
        return pagedOutput;
    }

    /**
     * Sets the value of the pagedOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDRsResultType.PagedOutput }
     *     
     * @see #getPagedOutput()
     */
    public void setPagedOutput(ExportDRsResultType.PagedOutput value) {
        this.pagedOutput = value;
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
     *       <choice>
     *         <element name="requestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
     *         <element name="requestNumber" type="{http://dom.gosuslugi.ru/schema/integration/drs/}RequestNumberType" maxOccurs="unbounded"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "requestGUID",
        "requestNumber"
    })
    public static class NotFound {

        /**
         * Идентификатор запроса о наличии задолженности за ЖКУ
         * 
         */
        protected List<String> requestGUID;
        /**
         * Номер запроса, присвоенный ГИС ЖКХ
         * 
         */
        protected List<String> requestNumber;

        /**
         * Идентификатор запроса о наличии задолженности за ЖКУ
         * 
         * Gets the value of the requestGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requestGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRequestGUID().add(newItem);
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
         *     The value of the requestGUID property.
         */
        public List<String> getRequestGUID() {
            if (requestGUID == null) {
                requestGUID = new ArrayList<>();
            }
            return this.requestGUID;
        }

        /**
         * Номер запроса, присвоенный ГИС ЖКХ
         * 
         * Gets the value of the requestNumber property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requestNumber property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRequestNumber().add(newItem);
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
         *     The value of the requestNumber property.
         */
        public List<String> getRequestNumber() {
            if (requestNumber == null) {
                requestNumber = new ArrayList<>();
            }
            return this.requestNumber;
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
     *       <choice>
     *         <element name="nextRequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="lastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nextRequestGUID",
        "lastPage"
    })
    public static class PagedOutput {

        /**
         * Идентификатор, который необходимо указать в элементе exportDRsRequest/ exportRequestGUID для экспорта следующего блока данных
         * 
         */
        protected String nextRequestGUID;
        /**
         * Признак того, что текущий экспортируемый блок является последним
         * 
         */
        protected Boolean lastPage;

        /**
         * Идентификатор, который необходимо указать в элементе exportDRsRequest/ exportRequestGUID для экспорта следующего блока данных
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextRequestGUID() {
            return nextRequestGUID;
        }

        /**
         * Sets the value of the nextRequestGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNextRequestGUID()
         */
        public void setNextRequestGUID(String value) {
            this.nextRequestGUID = value;
        }

        /**
         * Признак того, что текущий экспортируемый блок является последним
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLastPage() {
            return lastPage;
        }

        /**
         * Sets the value of the lastPage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isLastPage()
         */
        public void setLastPage(Boolean value) {
            this.lastPage = value;
        }

    }

}
