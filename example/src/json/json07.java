package json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class json07 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException {

		// JSON 으로 파싱할 문자열 
		String str = "{\"name\" : \"apple\", \"id\" : 1, \"price\" : 1000}";

		// JSONParser로 JSONObject로 변
		JSONObject jsonObject = (JSONObject) new JSONParser().parse(str);
		
		// 추가 
		jsonObject.put("count", 5);
		
		// 변경
		jsonObject.put("id", 2);
		jsonObject.replace("name", "banana");
		
		// 삭제
		jsonObject.remove("price");
		
		// 결과 출력
		System.out.println(jsonObject);
		
	}

}
