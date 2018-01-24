package test.main;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.service.WriteService;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test/main/init.xml");
		
		WriteService wService = context.getBean(WriteService.class);
		
		wService.write();
		System.out.println("------");
		wService.writeToFriend();
		System.out.println("------");
		wService.writeToTeacher("김구라");
		
		Map<String, Object> map = wService.writeToMother();
		
		String msg = (String)map.get("msg");
		System.out.println("최종 msg:"+msg);
	}
}
