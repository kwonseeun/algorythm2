package algorythm5;

public class example02 {

	public static void main(String[] args) {

		String data = "abc,def,ghi";
		
		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == ',') {
				count ++;
			}
		}
		
		if (count > 0) {
			for (int j = 0; j <= count; j++) {
				System.out.println("콤마: " + data.split("[,]")[j]);
			}
		}
	}

}
