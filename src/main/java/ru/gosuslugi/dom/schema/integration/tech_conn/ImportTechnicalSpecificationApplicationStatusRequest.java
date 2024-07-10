
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="importTechnicalSpecificationApplicationStatus" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="ApplicationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </sequence>
 *                   <choice>
 *                     <element name="AssignExecutor">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String255Type"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="TakeToWork" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="SendAnswer" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}TechnicalSpecificationApplicationAnswerType"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version fixed="13.2.5.0""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importTechnicalSpecificationApplicationStatus"
})
@XmlRootElement(name = "importTechnicalSpecificationApplicationStatusRequest")
public class ImportTechnicalSpecificationApplicationStatusRequest
    extends BaseType
{

    /**
     * Импорт сведений о работе с заявлением
     * 
     */
    @XmlElement(required = true)
    protected List<ImportTechnicalSpecificationApplicationStatusRequest.ImportTechnicalSpecificationApplicationStatus> importTechnicalSpecificationApplicationStatus;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String version;

    /**
     * Импорт сведений о работе с заявлением
     * 
     * Gets the value of the importTechnicalSpecificationApplicationStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importTechnicalSpecificationApplicationStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportTechnicalSpecificationApplicationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportTechnicalSpecificationApplicationStatusRequest.ImportTechnicalSpecificationApplicationStatus }
     * </p>
     * 
     * 
     * @return
     *     The value of the importTechnicalSpecificationApplicationStatus property.
     */
    public List<ImportTechnicalSpecificationApplicationStatusRequest.ImportTechnicalSpecificationApplicationStatus> getImportTechnicalSpecificationApplicationStatus() {
        if (importTechnicalSpecificationApplicationStatus == null) {
            importTechnicalSpecificationApplicationStatus = new ArrayList<>();
        }
        return this.importTechnicalSpecificationApplicationStatus;
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
            return "13.2.5.0";
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
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *           <element name="ApplicationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         </sequence>
     *         <choice>
     *           <element name="AssignExecutor">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String255Type"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="TakeToWork" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="SendAnswer" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}TechnicalSpecificationApplicationAnswerType"/>
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
    @XmlType(name = "", propOrder = {
        "transportGUID",
        "applicationGUID",
        "assignExecutor",
        "takeToWork",
        "sendAnswer"
    })
    public static class ImportTechnicalSpecificationApplicationStatus {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Уникальный идентификатор заявления в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ApplicationGUID", required = true)
        protected String applicationGUID;
        /**
         * Сведения о назначенном исполнителе
         * 
         */
        @XmlElement(name = "AssignExecutor")
        protected ImportTechnicalSpecificationApplicationStatusRequest.ImportTechnicalSpecificationApplicationStatus.AssignExecutor assignExecutor;
        /**
         * Сведения о взятии заявления в работу исполнителем
         * 
         */
        @XmlElement(name = "TakeToWork")
        protected Boolean takeToWork;
        /**
         * Ответ по заявлению на предоставление технических условий подключения
         * 
         */
        @XmlElement(name = "SendAnswer")
        protected TechnicalSpecificationApplicationAnswerType sendAnswer;

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
         * Уникальный идентификатор заявления в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicationGUID() {
            return applicationGUID;
        }

        /**
         * Sets the value of the applicationGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getApplicationGUID()
         */
        public void setApplicationGUID(String value) {
            this.applicationGUID = value;
        }

        /**
         * Сведения о назначенном исполнителе
         * 
         * @return
         *     possible object is
         *     {@link ImportTechnicalSpecificationApplicationStatusRequest.ImportTechnicalSpecificationApplicationStatus.AssignExecutor }
         *     
         */
        public ImportTechnicalSpecificationApplicationStatusRequest.ImportTechnicalSpecificationApplicationStatus.AssignExecutor getAssignExecutor() {
            return assignExecutor;
        }

        /**
         * Sets the value of the assignExecutor property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportTechnicalSpecificationApplicationStatusRequest.ImportTechnicalSpecificationApplicationStatus.AssignExecutor }
         *     
         * @see #getAssignExecutor()
         */
        public void setAssignExecutor(ImportTechnicalSpecificationApplicationStatusRequest.ImportTechnicalSpecificationApplicationStatus.AssignExecutor value) {
            this.assignExecutor = value;
        }

        /**
         * Сведения о взятии заявления в работу исполнителем
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTakeToWork() {
            return takeToWork;
        }

        /**
         * Sets the value of the takeToWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isTakeToWork()
         */
        public void setTakeToWork(Boolean value) {
            this.takeToWork = value;
        }

        /**
         * Ответ по заявлению на предоставление технических условий подключения
         * 
         * @return
         *     possible object is
         *     {@link TechnicalSpecificationApplicationAnswerType }
         *     
         */
        public TechnicalSpecificationApplicationAnswerType getSendAnswer() {
            return sendAnswer;
        }

        /**
         * Sets the value of the sendAnswer property.
         * 
         * @param value
         *     allowed object is
         *     {@link TechnicalSpecificationApplicationAnswerType }
         *     
         * @see #getSendAnswer()
         */
        public void setSendAnswer(TechnicalSpecificationApplicationAnswerType value) {
            this.sendAnswer = value;
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
         *         <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String255Type"/>
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
            "fio"
        })
        public static class AssignExecutor {

            /**
             * Фамилия И.О. назначенного исполнителя
             * 
             */
            @XmlElement(name = "FIO", required = true)
            protected String fio;

            /**
             * Фамилия И.О. назначенного исполнителя
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFIO() {
                return fio;
            }

            /**
             * Sets the value of the fio property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getFIO()
             */
            public void setFIO(String value) {
                this.fio = value;
            }

        }

    }

}
