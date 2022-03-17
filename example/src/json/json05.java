package json;

import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class json05 {

	public static void main(String[] args) {

		HashMap<String, Object> map1 = new HashMap<String,Object>() ;
		JSONObject obj = new JSONObject();
		JSONArray jArr = new JSONArray();
		JSONObject finalJson = new JSONObject();
		
		
		map1.put("이름", "a");
		map1.put("나이", "1");
		
		obj = new JSONObject(map1);
		jArr.add(obj);
		
		map1 = new HashMap<String,Object>();
		
		map1.put("이름", "b");
		map1.put("나이", "2");
		
		obj = new JSONObject(map1);
		jArr.add(obj);
		
		finalJson.put("jArr", jArr);
		finalJson.put("bb", "bbb");
		finalJson.put("cc", "ccc");
		
		System.out.println(finalJson);
	
	}

}
