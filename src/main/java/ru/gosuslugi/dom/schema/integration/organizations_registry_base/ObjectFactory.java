
package ru.gosuslugi.dom.schema.integration.organizations_registry_base;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gosuslugi.dom.schema.integration.organizations_registry_base package. 
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

    private static final QName _FullName_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", "FullName");
    private static final QName _CommercialName_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", "CommercialName");
    private static final QName _RegOrg_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", "RegOrg");
    private static final QName _RegOrgVersion_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", "RegOrgVersion");
    private static final QName _OrgRootEntityGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", "orgRootEntityGUID");
    private static final QName _OrgVersionGUID_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", "orgVersionGUID");
    private static final QName _ShortName_QNAME = new QName("http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", "ShortName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gosuslugi.dom.schema.integration.organizations_registry_base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubsidiaryType }
     * 
     * @return
     *     the new instance of {@link SubsidiaryType }
     */
    public SubsidiaryType createSubsidiaryType() {
        return new SubsidiaryType();
    }

    /**
     * Create an instance of {@link RegOrgType }
     * 
     * @return
     *     the new instance of {@link RegOrgType }
     */
    public RegOrgType createRegOrgType() {
        return new RegOrgType();
    }

    /**
     * Create an instance of {@link RegOrgVersionType }
     * 
     * @return
     *     the new instance of {@link RegOrgVersionType }
     */
    public RegOrgVersionType createRegOrgVersionType() {
        return new RegOrgVersionType();
    }

    /**
     * Create an instance of {@link LegalType }
     * 
     * @return
     *     the new instance of {@link LegalType }
     */
    public LegalType createLegalType() {
        return new LegalType();
    }

    /**
     * Create an instance of {@link ForeignBranchType }
     * 
     * @return
     *     the new instance of {@link ForeignBranchType }
     */
    public ForeignBranchType createForeignBranchType() {
        return new ForeignBranchType();
    }

    /**
     * Create an instance of {@link EntpsType }
     * 
     * @return
     *     the new instance of {@link EntpsType }
     */
    public EntpsType createEntpsType() {
        return new EntpsType();
    }

    /**
     * Create an instance of {@link RegOrgRootAndVersionType }
     * 
     * @return
     *     the new instance of {@link RegOrgRootAndVersionType }
     */
    public RegOrgRootAndVersionType createRegOrgRootAndVersionType() {
        return new RegOrgRootAndVersionType();
    }

    /**
     * Create an instance of {@link SubsidiaryType.SourceName }
     * 
     * @return
     *     the new instance of {@link SubsidiaryType.SourceName }
     */
    public SubsidiaryType.SourceName createSubsidiaryTypeSourceName() {
        return new SubsidiaryType.SourceName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", name = "FullName")
    public JAXBElement<String> createFullName(String value) {
        return new JAXBElement<>(_FullName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", name = "CommercialName")
    public JAXBElement<String> createCommercialName(String value) {
        return new JAXBElement<>(_CommercialName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegOrgType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegOrgType }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", name = "RegOrg")
    public JAXBElement<RegOrgType> createRegOrg(RegOrgType value) {
        return new JAXBElement<>(_RegOrg_QNAME, RegOrgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegOrgVersionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegOrgVersionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", name = "RegOrgVersion")
    public JAXBElement<RegOrgVersionType> createRegOrgVersion(RegOrgVersionType value) {
        return new JAXBElement<>(_RegOrgVersion_QNAME, RegOrgVersionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", name = "orgRootEntityGUID")
    public JAXBElement<String> createOrgRootEntityGUID(String value) {
        return new JAXBElement<>(_OrgRootEntityGUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", name = "orgVersionGUID")
    public JAXBElement<String> createOrgVersionGUID(String value) {
        return new JAXBElement<>(_OrgVersionGUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", name = "ShortName")
    public JAXBElement<String> createShortName(String value) {
        return new JAXBElement<>(_ShortName_QNAME, String.class, null, value);
    }

}
