package list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("listConfig.xml");
		
		Company c = (Company) context.getBean("c1");
		
		System.out.println(c);
			}
}
