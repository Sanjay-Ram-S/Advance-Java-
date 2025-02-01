package constructor_set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constSet.xml");
		Employee e = (Employee) context.getBean("e1");
		System.out.println(e);
	}
}
