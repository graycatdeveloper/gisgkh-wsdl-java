
package ru.gosuslugi.dom.schema.integration.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Результат экспорта автоматически формируемого черновика с перечнем работ и услуг поставщика данных
 * 
 * <p>Java class for exportWorkingListResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportWorkingListResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WorkingList">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}WorkingListBaseType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ModificationDate"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/services/}WorkListStatus"/>
 *                   <element name="WorkListItem" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}WorkingListItemType">
 *                           <sequence>
 *                             <element name="WorkListItemGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportWorkingListResultType", propOrder = {
    "workingList"
})
public class ExportWorkingListResultType {

    /**
     * Перечень работ/услуг
     * 
     */
    @XmlElement(name = "WorkingList", required = true)
    protected ExportWorkingListResultType.WorkingList workingList;

    /**
     * Перечень работ/услуг
     * 
     * @return
     *     possible object is
     *     {@link ExportWorkingListResultType.WorkingList }
     *     
     */
    public ExportWorkingListResultType.WorkingList getWorkingList() {
        return workingList;
    }

    /**
     * Sets the value of the workingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportWorkingListResultType.WorkingList }
     *     
     * @see #getWorkingList()
     */
    public void setWorkingList(ExportWorkingListResultType.WorkingList value) {
        this.workingList = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}WorkingListBaseType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ModificationDate"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/services/}WorkListStatus"/>
     *         <element name="WorkListItem" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}WorkingListItemType">
     *                 <sequence>
     *                   <element name="WorkListItemGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "modificationDate",
        "workListStatus",
        "workListItem"
    })
    public static class WorkingList
        extends WorkingListBaseType
    {

        /**
         * Дата модификации объекта
         * 
         */
        @XmlElement(name = "ModificationDate", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar modificationDate;
        /**
         * Статус:
         * (A)PPROVED - Утверждён
         * (C)ANCELLED - Отменён
         * (AN)NULLED - Аннулирован
         * 
         */
        @XmlElement(name = "WorkListStatus", required = true)
        protected String workListStatus;
        /**
         * Работа/услуга перечня
         * 
         */
        @XmlElement(name = "WorkListItem")
        protected List<ExportWorkingListResultType.WorkingList.WorkListItem> workListItem;

        /**
         * Дата модификации объекта
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getModificationDate() {
            return modificationDate;
        }

        /**
         * Sets the value of the modificationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getModificationDate()
         */
        public void setModificationDate(XMLGregorianCalendar value) {
            this.modificationDate = value;
        }

        /**
         * Статус:
         * (A)PPROVED - Утверждён
         * (C)ANCELLED - Отменён
         * (AN)NULLED - Аннулирован
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkListStatus() {
            return workListStatus;
        }

        /**
         * Sets the value of the workListStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getWorkListStatus()
         */
        public void setWorkListStatus(String value) {
            this.workListStatus = value;
        }

        /**
         * Работа/услуга перечня
         * 
         * Gets the value of the workListItem property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workListItem property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getWorkListItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportWorkingListResultType.WorkingList.WorkListItem }
         * </p>
         * 
         * 
         * @return
         *     The value of the workListItem property.
         */
        public List<ExportWorkingListResultType.WorkingList.WorkListItem> getWorkListItem() {
            if (workListItem == null) {
                workListItem = new ArrayList<>();
            }
            return this.workListItem;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}WorkingListItemType">
         *       <sequence>
         *         <element name="WorkListItemGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "workListItemGUID"
        })
        public static class WorkListItem
            extends WorkingListItemType
        {

            /**
             * Идентификатор работы/услуги перечня
             * 
             */
            @XmlElement(name = "WorkListItemGUID", required = true)
            protected String workListItemGUID;

            /**
             * Идентификатор работы/услуги перечня
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWorkListItemGUID() {
                return workListItemGUID;
            }

            /**
             * Sets the value of the workListItemGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getWorkListItemGUID()
             */
            public void setWorkListItemGUID(String value) {
                this.workListItemGUID = value;
            }

        }

    }

}
