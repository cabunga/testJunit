package org.gradle;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAxbData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file= new File("C:\\testParameters\\Data.xml");
			JAXBContext jaxbContext= JAXBContext.newInstance(Data.class);
			Marshaller jaxMarshaller= jaxbContext.createMarshaller();
			jaxMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			Data data= new Data();
			data.setNumero1(1);
			data.setNumero2(2);
			data.setEsperado(3);
			jaxMarshaller.marshal(data, file);
			jaxMarshaller.marshal(data, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
