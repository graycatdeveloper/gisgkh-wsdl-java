
package ru.gosuslugi.dom.schema.integration.individual_registry_base;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gosuslugi.dom.schema.integration.individual_registry_base package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _SNILS_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", "SNILS");
    private static final QName _Ind_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", "Ind");
    private static final QName _Surname_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", "Surname");
    private static final QName _FirstName_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", "FirstName");
    private static final QName _Patronymic_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", "Patronymic");
    private static final QName _Sex_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", "Sex");
    private static final QName _DateOfBirth_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", "DateOfBirth");
    private static final QName _PlaceBirth_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", "PlaceBirth");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gosuslugi.dom.schema.integration.individual_registry_base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ID }
     * 
     * @return
     *     the new instance of {@link ID }
     */
    public ID createID() {
        return new ID();
    }

    /**
     * Create an instance of {@link IndType }
     * 
     * @return
     *     the new instance of {@link IndType }
     */
    public IndType createIndType() {
        return new IndType();
    }

    /**
     * Create an instance of {@link FIOType }
     * 
     * @return
     *     the new instance of {@link FIOType }
     */
    public FIOType createFIOType() {
        return new FIOType();
    }

    /**
     * Create an instance of {@link FIOExportType }
     * 
     * @return
     *     the new instance of {@link FIOExportType }
     */
    public FIOExportType createFIOExportType() {
        return new FIOExportType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", name = "SNILS")
    public JAXBElement<String> createSNILS(String value) {
        return new JAXBElement<>(_SNILS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndType }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", name = "Ind")
    public JAXBElement<IndType> createInd(IndType value) {
        return new JAXBElement<>(_Ind_QNAME, IndType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", name = "Surname")
    public JAXBElement<String> createSurname(String value) {
        return new JAXBElement<>(_Surname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", name = "FirstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", name = "Patronymic")
    public JAXBElement<String> createPatronymic(String value) {
        return new JAXBElement<>(_Patronymic_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", name = "Sex")
    public JAXBElement<String> createSex(String value) {
        return new JAXBElement<>(_Sex_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", name = "DateOfBirth")
    public JAXBElement<XMLGregorianCalendar> createDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<>(_DateOfBirth_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/", name = "PlaceBirth")
    public JAXBElement<String> createPlaceBirth(String value) {
        return new JAXBElement<>(_PlaceBirth_QNAME, String.class, null, value);
    }

}
