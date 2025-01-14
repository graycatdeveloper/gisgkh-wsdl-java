
package ru.gosuslugi.dom.schema.integration.nsi_common;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gosuslugi.dom.schema.integration.nsi_common package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gosuslugi.dom.schema.integration.nsi_common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStateResult }
     * 
     * @return
     *     the new instance of {@link GetStateResult }
     */
    public GetStateResult createGetStateResult() {
        return new GetStateResult();
    }

    /**
     * Create an instance of {@link ExportNsiListRequest }
     * 
     * @return
     *     the new instance of {@link ExportNsiListRequest }
     */
    public ExportNsiListRequest createExportNsiListRequest() {
        return new ExportNsiListRequest();
    }

    /**
     * Create an instance of {@link ExportNsiItemRequest }
     * 
     * @return
     *     the new instance of {@link ExportNsiItemRequest }
     */
    public ExportNsiItemRequest createExportNsiItemRequest() {
        return new ExportNsiItemRequest();
    }

    /**
     * Create an instance of {@link ExportNsiPagingItemRequest }
     * 
     * @return
     *     the new instance of {@link ExportNsiPagingItemRequest }
     */
    public ExportNsiPagingItemRequest createExportNsiPagingItemRequest() {
        return new ExportNsiPagingItemRequest();
    }

    /**
     * Create an instance of {@link GetStateResult.NsiPagingItem }
     * 
     * @return
     *     the new instance of {@link GetStateResult.NsiPagingItem }
     */
    public GetStateResult.NsiPagingItem createGetStateResultNsiPagingItem() {
        return new GetStateResult.NsiPagingItem();
    }

}
