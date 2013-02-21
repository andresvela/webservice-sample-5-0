package com.bdoc.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Vector;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import com.bdoc.service.BDocDocument;
import com.bdoc.service.BDocNetworkException_Exception;
import com.bdoc.service.BDocResourceException_Exception;
import com.bdoc.service.BDocWebException_Exception;
import com.bdoc.service.BdocWebWS;
import com.bdoc.service.BdocWebWSService;
import com.bdoc.service.DocumentInfo;
import com.bdoc.service.Domain;
import com.bdoc.service.InteractionResult;
import com.bdoc.service.MapItem;
import com.bdoc.service.TemplateInfos;
import com.bdoc.service.ValidationType;

public class Main {
	final static String BW_DOMAIN = "SOUSCRIPTION_IARD_AP";
	final static String BW_TEMPLATE = "SOU_TEMD_QUITTANCE_SEPA_FR";

	public static void main(String[] args) throws Exception {



		//		URL url = new URL("file:/C:/Workspace/sample-client-ws/bin/BdocWebWSService.wsdl");//(1)config url with path of wsdl.
		URL url = new URL("http://localhost:8180/bdocweb-ws-5.0/BdocWebWS");//(2)config url with adresse of ws.
		QName qname = new QName("http://service.bdoc.com/", "BdocWebWSService");		
		BdocWebWSService service = new BdocWebWSService(url, qname);

		//		BdocWebWSService service = new BdocWebWSService();
		BdocWebWS port=service.getBdocWebWSPort();
		//		BindingProvider bp = (BindingProvider)port;//(3)config with set property ENDPOINT_ADDRESS_PROPERTY.
		//		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/BdocWebServices/BdocWebWS");

		@SuppressWarnings("unused")
		List<Domain> domainList=null;
		try{
			domainList=port.getRepository();
		}catch(BDocNetworkException_Exception e){
			e.printStackTrace();
		}catch(BDocWebException_Exception e){
			e.printStackTrace();
		}

		@SuppressWarnings("unused")
		TemplateInfos templateInfos=null;
		try{
			templateInfos=port.getTemplate(BW_DOMAIN, BW_TEMPLATE);
		}catch(BDocNetworkException_Exception e){
			e.printStackTrace();
		}catch(BDocWebException_Exception e){
			e.printStackTrace();
		}catch(BDocResourceException_Exception e){
			e.printStackTrace();
		}

		List<MapItem> datasM = new Vector<MapItem>();
		/*MapItem d1=new MapItem();
		d1.setKey("NOM");
		d1.setValue("GHORBEL");
		MapItem d2=new MapItem();
		d2.setKey("PRENOM");
		d2.setValue("bilel");
		datasM.add(d1);
		datasM.add(d2);
*/
		List<Integer> optionalItems = new Vector<Integer>();
		//optionalItems.add(471);
		//optionalItems.add(474);
		String path="C:/bdoc/Repository/Production/";
		String fileName="34014.xml";
		File file= new File(path.concat(fileName));
		byte[] dataBytes = getBytesFromFile(file);		
		List<MapItem> generationOptionsM = new Vector<MapItem>();
		MapItem m1=new MapItem();
		m1.setKey("bwisHtmlEdition");
		m1.setValue("true");
		MapItem m2=new MapItem();
		m2.setKey("bwTitle");
		m2.setValue("a");
		MapItem m3=new MapItem();
		m3.setKey("bwSubject");
		m3.setValue("b");
		MapItem m4=new MapItem();
		m4.setKey("bwAuthor");
		m4.setValue("c");
		MapItem m5=new MapItem();
		m5.setKey("bwCreator");
		m5.setValue("d");
		MapItem m6=new MapItem();
		m6.setKey("bwKeywords");
		m6.setValue("a,b,c");
		MapItem m7=new MapItem();
		m7.setKey("bwFormat");
		m7.setValue("PDF");//DOCX
		MapItem m8=new MapItem();
		m8.setKey("bwCanPrint");
		m8.setValue("true");
		MapItem m9=new MapItem();
		m9.setKey("bwCanModify");
		m9.setValue("false");
		MapItem m10=new MapItem();
		m10.setKey("bwOwnerPassword");
		m10.setValue("bwOwnerPassword");
		MapItem m11=new MapItem();
		m11.setKey("bwUserPassword");
		m11.setValue("bwUserPassword");
		generationOptionsM.add(m1);
		generationOptionsM.add(m2);
		generationOptionsM.add(m3);
		generationOptionsM.add(m4);
		generationOptionsM.add(m5);
		generationOptionsM.add(m6);
		generationOptionsM.add(m7);
		generationOptionsM.add(m8);
		generationOptionsM.add(m9);
		generationOptionsM.add(m10);
		generationOptionsM.add(m11);

		String sessionId="9999";
		InteractionResult interactionResult=null;
		try{
			interactionResult=port.generation(BW_DOMAIN, BW_TEMPLATE, sessionId, datasM, dataBytes, optionalItems, generationOptionsM);
		}catch(BDocNetworkException_Exception e){
			e.printStackTrace();
		}catch(BDocWebException_Exception e){
			e.printStackTrace();
		}catch(BDocResourceException_Exception e){
			e.printStackTrace();
		}

		/*sessionId="9999";
		String formId="1041_MODELE_INTERACTIF_0_1_DATA";		
		List<MapItem> fields= new Vector<MapItem>();
		MapItem m12=new MapItem();
		m12.setKey("M_23400000000000000000000000086");
		m12.setValue("v1");
		MapItem m13=new MapItem();
		m13.setKey("M_23400000000000000000000000087");
		m13.setValue("v2");
		fields.add(m12);
		fields.add(m13);		
		try{
			interactionResult=port.validateDataForm(sessionId, formId, fields, ValidationType.VALIDATE);
		}catch(BDocNetworkException_Exception e){
			e.printStackTrace();
		}catch(BDocWebException_Exception e){
			e.printStackTrace();
		}
		sessionId="9999";
		formId="1043_MODELE_INTERACTIF_0_1_DATA";		
		fields= new Vector<MapItem>();
		m12=new MapItem();
		m12.setKey("M_16000000000000000000000000005");
		m12.setValue("chaine obligatoire test");
		m13=new MapItem();
		m13.setKey("M_23800000000000000000000000089");
		m13.setValue("v2");
		MapItem m14=new MapItem();
		m14.setKey("M_23800000000000000000000000090");
		m14.setValue("v3");
		fields.add(m12);
		fields.add(m13);
		fields.add(m14);
		try{
			interactionResult=port.validateDataForm(sessionId, formId, fields, ValidationType.VALIDATE);
		}catch(BDocNetworkException_Exception e){
			e.printStackTrace();
		}catch(BDocWebException_Exception e){
			e.printStackTrace();
		}
		sessionId="9999";		
		String htmlContent="htmlContent";
		path="C:/";
		fileName="htmlContent.txt";
		file= new File(path.concat(fileName));
		htmlContent = new String(getBytesFromFile(file));		
		String templateName=BW_TEMPLATE;
		String textName="SAISISSABLE";
		formId="474_MODELE_INTERACTIF_0_1_KEYENTRY";
		try{
			interactionResult=port.validateTextForm(sessionId, htmlContent, templateName, textName, formId, ValidationType.CONTINUE);
		}catch(BDocNetworkException_Exception e){
			e.printStackTrace();
		}catch(BDocWebException_Exception e){
			e.printStackTrace();
		}
*/
		// write document to disk
		DocumentInfo documentInfo = (DocumentInfo) interactionResult;
		BDocDocument document = documentInfo.getDocuments().get(0);

		file = File.createTempFile(BW_TEMPLATE + "_", ".pdf");
		FileOutputStream fosDocument = new FileOutputStream(file);
		fosDocument.write(document.getDocument());
		fosDocument.close();

		System.out.println("Result file: " + file.getCanonicalPath());

	}

	// Returns the contents of the file in a byte array.
	public static byte[] getBytesFromFile(File file) throws IOException {        
		// Get the size of the file
		long length = file.length();

		// You cannot create an array using a long type.
		// It needs to be an int type.
		// Before converting to an int type, check
		// to ensure that file is not larger than Integer.MAX_VALUE.
		if (length > Integer.MAX_VALUE) {
			// File is too large
			throw new IOException("File is too large!");
		}

		// Create the byte array to hold the data
		byte[] bytes = new byte[(int)length];

		// Read in the bytes
		int offset = 0;
		int numRead = 0;

		InputStream is = new FileInputStream(file);
		try {
			while (offset < bytes.length
					&& (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
				offset += numRead;
			}
		} finally {
			is.close();
		}

		// Ensure all the bytes have been read in
		if (offset < bytes.length) {
			throw new IOException("Could not completely read file "+file.getName());
		}
		return bytes;
	}
}