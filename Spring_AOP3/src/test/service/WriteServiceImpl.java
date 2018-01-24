package test.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class WriteServiceImpl implements WriteService{

	@Override
	public void write() {
		System.out.println("글쓰기 작업중...");
		
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void writeToFriend() {
		System.out.println("친구에게 글쓰기 작업중...");
			
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void writeToTeacher(String name) {
		System.out.println(name+"이(가) 선생님에게 글쓰기 작업중...");
		
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public Map<String, Object> writeToMother() {
		System.out.println("엄마에게 글쓰기 작업을...");
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "Hello, MaMa!");
		return map;
	}

}
