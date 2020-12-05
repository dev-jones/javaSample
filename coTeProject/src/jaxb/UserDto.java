package jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDto {

	private String name;
	private int age;
	private List<String> messages;
	
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<String> getMessages() {
		return messages;
	}
	
	@XmlElementWrapper(name="messages")
	@XmlElement(name="message")
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "UserDto [name=" + name + ", age=" + age + ", messages=" + messages + "]";
	}
}
