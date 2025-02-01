package constructor_map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constMap.xml");
		Team t = (Team) context.getBean("t1");
		System.out.println(t);
	}
}
