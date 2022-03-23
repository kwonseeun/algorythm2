package algorythm4;

public class subString02 {

	public static void main(String[] args) {
		String str = "dream coding";
		
		// 스페이스바 인덱스 구하기 
		int index = str.indexOf("c");
		
		// 원하는 인덱스부터 끝까지 문자열 자르기 
		String cutStr = str.substring(index);
		
		System.out.println(cutStr);
		
		int start = str.indexOf("e");
		
		int end = str.indexOf("m");
		
		String startToEnd = str.substring(start, end);
		
		System.out.println(startToEnd);
	}

}
