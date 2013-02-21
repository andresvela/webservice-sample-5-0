
package com.bdoc.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bdoc.service package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _BDocWebException_QNAME = new QName("http://service.bdoc.com/", "BDocWebException");
    private final static QName _ValidateTextForm_QNAME = new QName("http://service.bdoc.com/", "validateTextForm");
    private final static QName _BDocResourceException_QNAME = new QName("http://service.bdoc.com/", "BDocResourceException");
    private final static QName _GetTemplate_QNAME = new QName("http://service.bdoc.com/", "getTemplate");
    private final static QName _BDocNetworkException_QNAME = new QName("http://service.bdoc.com/", "BDocNetworkException");
    private final static QName _ValidateDataFormResponse_QNAME = new QName("http://service.bdoc.com/", "validateDataFormResponse");
    private final static QName _ValidateDataForm_QNAME = new QName("http://service.bdoc.com/", "validateDataForm");
    private final static QName _ValidateTextFormResponse_QNAME = new QName("http://service.bdoc.com/", "validateTextFormResponse");
    private final static QName _GenerationResponse_QNAME = new QName("http://service.bdoc.com/", "generationResponse");
    private final static QName _GetRepositoryResponse_QNAME = new QName("http://service.bdoc.com/", "getRepositoryResponse");
    private final static QName _Generation_QNAME = new QName("http://service.bdoc.com/", "generation");
    private final static QName _GetTemplateResponse_QNAME = new QName("http://service.bdoc.com/", "getTemplateResponse");
    private final static QName _GetRepository_QNAME = new QName("http://service.bdoc.com/", "getRepository");
    private final static QName _GenerationArg4_QNAME = new QName("", "arg4");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bdoc.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MapItem }
     * 
     */
    public MapItem createMapItem() {
        return new MapItem();
    }

    /**
     * Create an instance of {@link TemplateInfos.TranslateDescriptions }
     * 
     */
    public TemplateInfos.TranslateDescriptions createTemplateInfosTranslateDescriptions() {
        return new TemplateInfos.TranslateDescriptions();
    }

    /**
     * Create an instance of {@link GenerationResponse }
     * 
     */
    public GenerationResponse createGenerationResponse() {
        return new GenerationResponse();
    }

    /**
     * Create an instance of {@link NodeItem.TranslateDescriptions }
     * 
     */
    public NodeItem.TranslateDescriptions createNodeItemTranslateDescriptions() {
        return new NodeItem.TranslateDescriptions();
    }

    /**
     * Create an instance of {@link TechnicalEntity.TranslateDescriptions }
     * 
     */
    public TechnicalEntity.TranslateDescriptions createTechnicalEntityTranslateDescriptions() {
        return new TechnicalEntity.TranslateDescriptions();
    }

    /**
     * Create an instance of {@link InputDataForm }
     * 
     */
    public InputDataForm createInputDataForm() {
        return new InputDataForm();
    }

    /**
     * Create an instance of {@link DataField }
     * 
     */
    public DataField createDataField() {
        return new DataField();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link GetTemplate }
     * 
     */
    public GetTemplate createGetTemplate() {
        return new GetTemplate();
    }

    /**
     * Create an instance of {@link GetRepository }
     * 
     */
    public GetRepository createGetRepository() {
        return new GetRepository();
    }

    /**
     * Create an instance of {@link NodeItem.TranslateDescriptions.Entry }
     * 
     */
    public NodeItem.TranslateDescriptions.Entry createNodeItemTranslateDescriptionsEntry() {
        return new NodeItem.TranslateDescriptions.Entry();
    }

    /**
     * Create an instance of {@link InputTextForm }
     * 
     */
    public InputTextForm createInputTextForm() {
        return new InputTextForm();
    }

    /**
     * Create an instance of {@link TemplateInfos.TranslateDescriptions.Entry }
     * 
     */
    public TemplateInfos.TranslateDescriptions.Entry createTemplateInfosTranslateDescriptionsEntry() {
        return new TemplateInfos.TranslateDescriptions.Entry();
    }

    /**
     * Create an instance of {@link Template }
     * 
     */
    public Template createTemplate() {
        return new Template();
    }

    /**
     * Create an instance of {@link NodeItem }
     * 
     */
    public NodeItem createNodeItem() {
        return new NodeItem();
    }

    /**
     * Create an instance of {@link ValidateTextForm }
     * 
     */
    public ValidateTextForm createValidateTextForm() {
        return new ValidateTextForm();
    }

    /**
     * Create an instance of {@link GetTemplateResponse }
     * 
     */
    public GetTemplateResponse createGetTemplateResponse() {
        return new GetTemplateResponse();
    }

    /**
     * Create an instance of {@link ValidateTextFormResponse }
     * 
     */
    public ValidateTextFormResponse createValidateTextFormResponse() {
        return new ValidateTextFormResponse();
    }

    /**
     * Create an instance of {@link BDocDocument }
     * 
     */
    public BDocDocument createBDocDocument() {
        return new BDocDocument();
    }

    /**
     * Create an instance of {@link Generation }
     * 
     */
    public Generation createGeneration() {
        return new Generation();
    }

    /**
     * Create an instance of {@link TechnicalEntity }
     * 
     */
    public TechnicalEntity createTechnicalEntity() {
        return new TechnicalEntity();
    }

    /**
     * Create an instance of {@link ValidateDataFormResponse }
     * 
     */
    public ValidateDataFormResponse createValidateDataFormResponse() {
        return new ValidateDataFormResponse();
    }

    /**
     * Create an instance of {@link ValidateDataForm }
     * 
     */
    public ValidateDataForm createValidateDataForm() {
        return new ValidateDataForm();
    }

    /**
     * Create an instance of {@link BDocWebException }
     * 
     */
    public BDocWebException createBDocWebException() {
        return new BDocWebException();
    }

    /**
     * Create an instance of {@link TemplateInfos }
     * 
     */
    public TemplateInfos createTemplateInfos() {
        return new TemplateInfos();
    }

    /**
     * Create an instance of {@link Domain }
     * 
     */
    public Domain createDomain() {
        return new Domain();
    }

    /**
     * Create an instance of {@link BDocResourceException }
     * 
     */
    public BDocResourceException createBDocResourceException() {
        return new BDocResourceException();
    }

    /**
     * Create an instance of {@link GetRepositoryResponse }
     * 
     */
    public GetRepositoryResponse createGetRepositoryResponse() {
        return new GetRepositoryResponse();
    }

    /**
     * Create an instance of {@link TechnicalEntity.TranslateDescriptions.Entry }
     * 
     */
    public TechnicalEntity.TranslateDescriptions.Entry createTechnicalEntityTranslateDescriptionsEntry() {
        return new TechnicalEntity.TranslateDescriptions.Entry();
    }

    /**
     * Create an instance of {@link DocumentInfo }
     * 
     */
    public DocumentInfo createDocumentInfo() {
        return new DocumentInfo();
    }

    /**
     * Create an instance of {@link BDocNetworkException }
     * 
     */
    public BDocNetworkException createBDocNetworkException() {
        return new BDocNetworkException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BDocWebException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "BDocWebException")
    public JAXBElement<BDocWebException> createBDocWebException(BDocWebException value) {
        return new JAXBElement<BDocWebException>(_BDocWebException_QNAME, BDocWebException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateTextForm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "validateTextForm")
    public JAXBElement<ValidateTextForm> createValidateTextForm(ValidateTextForm value) {
        return new JAXBElement<ValidateTextForm>(_ValidateTextForm_QNAME, ValidateTextForm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BDocResourceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "BDocResourceException")
    public JAXBElement<BDocResourceException> createBDocResourceException(BDocResourceException value) {
        return new JAXBElement<BDocResourceException>(_BDocResourceException_QNAME, BDocResourceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "getTemplate")
    public JAXBElement<GetTemplate> createGetTemplate(GetTemplate value) {
        return new JAXBElement<GetTemplate>(_GetTemplate_QNAME, GetTemplate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BDocNetworkException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "BDocNetworkException")
    public JAXBElement<BDocNetworkException> createBDocNetworkException(BDocNetworkException value) {
        return new JAXBElement<BDocNetworkException>(_BDocNetworkException_QNAME, BDocNetworkException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDataFormResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "validateDataFormResponse")
    public JAXBElement<ValidateDataFormResponse> createValidateDataFormResponse(ValidateDataFormResponse value) {
        return new JAXBElement<ValidateDataFormResponse>(_ValidateDataFormResponse_QNAME, ValidateDataFormResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDataForm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "validateDataForm")
    public JAXBElement<ValidateDataForm> createValidateDataForm(ValidateDataForm value) {
        return new JAXBElement<ValidateDataForm>(_ValidateDataForm_QNAME, ValidateDataForm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateTextFormResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "validateTextFormResponse")
    public JAXBElement<ValidateTextFormResponse> createValidateTextFormResponse(ValidateTextFormResponse value) {
        return new JAXBElement<ValidateTextFormResponse>(_ValidateTextFormResponse_QNAME, ValidateTextFormResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "generationResponse")
    public JAXBElement<GenerationResponse> createGenerationResponse(GenerationResponse value) {
        return new JAXBElement<GenerationResponse>(_GenerationResponse_QNAME, GenerationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRepositoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "getRepositoryResponse")
    public JAXBElement<GetRepositoryResponse> createGetRepositoryResponse(GetRepositoryResponse value) {
        return new JAXBElement<GetRepositoryResponse>(_GetRepositoryResponse_QNAME, GetRepositoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Generation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "generation")
    public JAXBElement<Generation> createGeneration(Generation value) {
        return new JAXBElement<Generation>(_Generation_QNAME, Generation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "getTemplateResponse")
    public JAXBElement<GetTemplateResponse> createGetTemplateResponse(GetTemplateResponse value) {
        return new JAXBElement<GetTemplateResponse>(_GetTemplateResponse_QNAME, GetTemplateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRepository }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.bdoc.com/", name = "getRepository")
    public JAXBElement<GetRepository> createGetRepository(GetRepository value) {
        return new JAXBElement<GetRepository>(_GetRepository_QNAME, GetRepository.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg4", scope = Generation.class)
    public JAXBElement<byte[]> createGenerationArg4(byte[] value) {
        return new JAXBElement<byte[]>(_GenerationArg4_QNAME, byte[].class, Generation.class, ((byte[]) value));
    }

}
