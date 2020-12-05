package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class TestJAXBsample {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("C:\\userDto.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(UserDto.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			UserDto customer = (UserDto) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(customer.toString());
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
