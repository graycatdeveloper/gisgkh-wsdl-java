
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Акт выполненных работ (оказанных услуг)
 * 
 * <p>Java class for CertificateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CertificateType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ShortCertificateType">
 *       <sequence>
 *         <element name="Work" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkCertificateType">
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
@XmlType(name = "CertificateType", propOrder = {
    "work"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.capital_repair.ImportCertificatesRequest.ImportCertificate.LoadCertificate.class
})
public class CertificateType
    extends ShortCertificateType
{

    /**
     * Работа в акте
     * 
     */
    @XmlElement(name = "Work", required = true)
    protected List<CertificateType.Work> work;

    /**
     * Работа в акте
     * 
     * Gets the value of the work property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the work property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateType.Work }
     * </p>
     * 
     * 
     * @return
     *     The value of the work property.
     */
    public List<CertificateType.Work> getWork() {
        if (work == null) {
            work = new ArrayList<>();
        }
        return this.work;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkCertificateType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Work
        extends WorkCertificateType
    {


    }

}
