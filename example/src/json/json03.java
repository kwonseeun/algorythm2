package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class json03 {

	public static void main(String[] args) {
		
		 String jsonStr = "{\"members\":["
	             + "{\"name\":\"홍길동\","
	             + "\"email\":\"gildong@hong.com\","
	             + "\"age\":\"25\""
	             + "},"
	             + "{\"name\":\"홍길서\","
	             + "\"email\":\"gilseo@hong.com\","
	             + "\"age\":\"23\""
	             + "}]}";
		 
		 
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonStr);
			JSONArray jsonArray = (JSONArray) jsonObject.get("members");
			for (int i = 0; i < jsonArray.size(); i++) {
			 JSONObject temp = (JSONObject) jsonArray.get(i);
			 System.out.println((i+1)+"번째 이름" +temp.get("name"));
			 System.out.println((i+1)+"번째 메일" +temp.get("email"));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
