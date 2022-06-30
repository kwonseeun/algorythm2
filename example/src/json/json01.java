package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class json01 {
	public static void main(String[] args) {
        //JSON으로 Parsing 처리할 문자열 데이터
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
			
			System.out.println("===== Members =====");
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject temp = (JSONObject) jsonArray.get(i);
				System.out.println(""+(i+1)+"번째 멤버의 이름:" +temp.get("name"));
				System.out.println(""+(i+1)+"번째 멤버의 메일:" +temp.get("email"));
				System.out.println(""+(i+1)+"번째 멤버의 나이:" +temp.get("age"));
				System.out.println("-------------------------------");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
