package test.service;

import java.util.Map;

public interface WriteService {
	public void write();
	public void writeToFriend();
	public void writeToTeacher(String name);
	public Map<String, Object> writeToMother();
}
