
package ru.gosuslugi.dom.schema.integration.drs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип для результата экспорта из ГИС ЖКХ подзапросов о наличии задолженности за ЖКУ, сформированных ГИС ЖКХ
 * 
 * <p>Java class for exportDSRsResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportDSRsResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="subrequestData" type="{http://dom.gosuslugi.ru/schema/integration/drs/}DSRType" maxOccurs="unbounded"/>
 *         <element name="notFound" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="subrequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
 *                   <element name="nextSubrequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
@XmlType(name = "exportDSRsResultType", propOrder = {
    "subrequestData",
    "notFound",
    "pagedOutput"
})
public class ExportDSRsResultType {

    /**
     * Данные подзапроса о наличии задолженности за ЖКУ
     * 
     */
    @XmlElement(required = true)
    protected List<DSRType> subrequestData;
    /**
     * Запросы и подзапросы о наличии задолженности за ЖКУ, данные о которых не найдены в ГИС ЖКХ
     * 
     */
    protected ExportDSRsResultType.NotFound notFound;
    /**
     * Параметры, необходимые для  экспорта следующего блока данных (см. аннотацию элемента exportDSRsRequest/ exportSubrequestGUID).
     * 
     * 						Заполняется, если в элементе exportDSRsRequest указаны условия отбора по атрибутам запроса / подзапроса
     * 
     */
    protected ExportDSRsResultType.PagedOutput pagedOutput;

    /**
     * Данные подзапроса о наличии задолженности за ЖКУ
     * 
     * Gets the value of the subrequestData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subrequestData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSubrequestData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSRType }
     * </p>
     * 
     * 
     * @return
     *     The value of the subrequestData property.
     */
    public List<DSRType> getSubrequestData() {
        if (subrequestData == null) {
            subrequestData = new ArrayList<>();
        }
        return this.subrequestData;
    }

    /**
     * Запросы и подзапросы о наличии задолженности за ЖКУ, данные о которых не найдены в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link ExportDSRsResultType.NotFound }
     *     
     */
    public ExportDSRsResultType.NotFound getNotFound() {
        return notFound;
    }

    /**
     * Sets the value of the notFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDSRsResultType.NotFound }
     *     
     * @see #getNotFound()
     */
    public void setNotFound(ExportDSRsResultType.NotFound value) {
        this.notFound = value;
    }

    /**
     * Параметры, необходимые для  экспорта следующего блока данных (см. аннотацию элемента exportDSRsRequest/ exportSubrequestGUID).
     * 
     * 						Заполняется, если в элементе exportDSRsRequest указаны условия отбора по атрибутам запроса / подзапроса
     * 
     * @return
     *     possible object is
     *     {@link ExportDSRsResultType.PagedOutput }
     *     
     */
    public ExportDSRsResultType.PagedOutput getPagedOutput() {
        return pagedOutput;
    }

    /**
     * Sets the value of the pagedOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDSRsResultType.PagedOutput }
     *     
     * @see #getPagedOutput()
     */
    public void setPagedOutput(ExportDSRsResultType.PagedOutput value) {
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
     *         <element name="subrequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
        "subrequestGUID",
        "requestNumber"
    })
    public static class NotFound {

        /**
         * Идентификатор подзапроса, сформированного ГИС ЖКХ
         * 
         */
        protected List<String> subrequestGUID;
        /**
         * Номер запроса о наличии задолженности за ЖКУ, направленного в ГИС ЖКХ
         * 
         */
        protected List<String> requestNumber;

        /**
         * Идентификатор подзапроса, сформированного ГИС ЖКХ
         * 
         * Gets the value of the subrequestGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subrequestGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSubrequestGUID().add(newItem);
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
         *     The value of the subrequestGUID property.
         */
        public List<String> getSubrequestGUID() {
            if (subrequestGUID == null) {
                subrequestGUID = new ArrayList<>();
            }
            return this.subrequestGUID;
        }

        /**
         * Номер запроса о наличии задолженности за ЖКУ, направленного в ГИС ЖКХ
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
     *         <element name="nextSubrequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "nextSubrequestGUID",
        "lastPage"
    })
    public static class PagedOutput {

        /**
         * Идентификатор, который необходимо указать в элементе exportDSRsRequest/ exportSubrequestGUID для экспорта следующего блока данных
         * 
         */
        protected String nextSubrequestGUID;
        /**
         * Признак того, что текущий экспортируемый блок является последним
         * 
         */
        protected Boolean lastPage;

        /**
         * Идентификатор, который необходимо указать в элементе exportDSRsRequest/ exportSubrequestGUID для экспорта следующего блока данных
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextSubrequestGUID() {
            return nextSubrequestGUID;
        }

        /**
         * Sets the value of the nextSubrequestGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNextSubrequestGUID()
         */
        public void setNextSubrequestGUID(String value) {
            this.nextSubrequestGUID = value;
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
