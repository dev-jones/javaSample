package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Class user = Class.forName("reflection.UserDto");	// UserDto.class도 가능
		
		System.out.println("====Field List====");
		
		for(Field field : user.getFields()) {
			System.out.println(field.getName());
		}
		
		System.out.println("\n==== Constructor ====");
		
		for(Constructor constructor : user.getConstructors()) {
			System.out.println("개수 : " + constructor.getParameterCount() + " = ");
			
			for(Class parameter : constructor.getParameterTypes()) {
				System.out.println(parameter.getName() + " / ");
			}
			
			System.out.println();
		}
		
		System.out.println("\n==== Method List ====");
		
		for(Method method : user.getMethods()) {
			System.out.println(method.getName());
		}
	}
}
