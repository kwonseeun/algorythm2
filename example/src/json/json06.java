package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

public class json06 {

	public static void main(String[] args) {
		
		// professor
		Map<String,Object> professor = new HashMap<>();
		professor.put("name", "kim");
		professor.put("office", "203");
		
		// students (List<Map>)
		Map<String, Object> student1 = new HashMap<>();
		student1.put("name", "lee");
		student1.put("grade", "A");
		
		Map<String, Object> student2 = new HashMap<>();
		student2.put("name", "park");
		student2.put("grade", "B");
		
		List<Map> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		
		// map에 데이터 받기 
		Map<String,Object> map = new HashMap<>();
		map.put("major", "CS");
		map.put("professor", professor);
		map.put("students", students);

		JSONObject jsonObject = new JSONObject(map);
		
		// 결과 출력 
		System.out.println(jsonObject);
	}
}
