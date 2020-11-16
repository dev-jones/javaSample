package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main01 {

	public static void main(String[] args) throws NoSuchMethodException {
		
		Class userClass = UserDto.class;
		
		Constructor cs = userClass.getConstructor(new Class[] {String.class, String.class, String.class, Integer.class});
		
		try {
			UserDto userDto = (UserDto)cs.newInstance("alpha", "beta", "gamma", 99);
			System.out.println(userDto.toString());
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
