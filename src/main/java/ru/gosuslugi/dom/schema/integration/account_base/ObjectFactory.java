
package ru.gosuslugi.dom.schema.integration.account_base;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gosuslugi.dom.schema.integration.account_base package. 
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

    private static final QName _AccountGuid_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/account-base/", "AccountGuid");
    private static final QName _AccountNumber_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/account-base/", "AccountNumber");
    private static final QName _UnifiedAccountNumber_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/account-base/", "UnifiedAccountNumber");
    private static final QName _CheckingAccount_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/account-base/", "CheckingAccount");
    private static final QName _ServiceID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/account-base/", "ServiceID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gosuslugi.dom.schema.integration.account_base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentReasonType }
     * 
     * @return
     *     the new instance of {@link PaymentReasonType }
     */
    public PaymentReasonType createPaymentReasonType() {
        return new PaymentReasonType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", name = "AccountGuid")
    public JAXBElement<String> createAccountGuid(String value) {
        return new JAXBElement<>(_AccountGuid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", name = "AccountNumber")
    public JAXBElement<String> createAccountNumber(String value) {
        return new JAXBElement<>(_AccountNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", name = "UnifiedAccountNumber")
    public JAXBElement<String> createUnifiedAccountNumber(String value) {
        return new JAXBElement<>(_UnifiedAccountNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", name = "CheckingAccount")
    public JAXBElement<String> createCheckingAccount(String value) {
        return new JAXBElement<>(_CheckingAccount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", name = "ServiceID")
    public JAXBElement<String> createServiceID(String value) {
        return new JAXBElement<>(_ServiceID_QNAME, String.class, null, value);
    }

}
