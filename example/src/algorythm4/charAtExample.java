package algorythm4;

public class charAtExample {

	public static void main(String[] args) {
	
		String aaa ="안녕 하세요,반갑-습니다";
		
		String[ ] data = aaa.split("|,|-");
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
