package jaxb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class TestJAXB {

	public static void main(String[] args) {
		
		UserDto userDto = setUser();
		
		try {
			
			File file = new File("C:\\userDto.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(UserDto.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			jaxbMarshaller.marshal(userDto, file);
			jaxbMarshaller.marshal(userDto, System.out);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static UserDto setUser() {
		
		UserDto userDto = new UserDto();
		
		userDto.setName("XMLstudy");
		userDto.setAge(25);
		
		List<String> list = new ArrayList<String>();
		list.add("XML list 01");
		list.add("XML list 02");
		list.add("XML list 03");
		userDto.setMessages(list);
		
		return userDto;
	}
}
