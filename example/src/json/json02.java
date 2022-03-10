package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class json02 {

	public static void main(String[] args) {
	
		String json2 = "{ 'Object' : { 'Child1' : 'Object 안에 Object'},"
				+ "'Array1' : ["
				+ "{'ArrayChild1' : 'Object 안에 Array 안에 Object1'},"
				+ "{'ArrayChild2' : 'Object 안에 Array 안에 Object2'},"
				+ "{'ArrayChild3' : 'Object 안에 Array 안에 Object3'},"
				+ "],"
				+ "'Array2' : ["
				+ "'Object 안에 Array 1행', "
				+ "'Object 안에 Array 2행', "
				+ "'Object 안에 Array 3행'"
				+ "]}";
		
		JSONObject jsonObj = new JSONObject();
		JSONObject Object = (JSONObject) jsonObj.get("Object");
		JSONArray Array1 = (JSONArray) jsonObj.get("Array1");
		JSONArray Array2 = (JSONArray) jsonObj.get("Array2");
		
		System.out.println("Object to String: " + jsonObj.get("Object").toString());
		
	
		System.out.println("child1: " + Object.get("Child1"));
		System.out.println("Array1: " +Array1.get(0));
		System.out.println("Array2: " + Array2.get(1));	
	}
}
