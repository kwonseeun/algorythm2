package algorythm5;

public class example03 {

	public static void main(String[] args) {
		String str = " Hello This is DelfStack";
        str = str.trim();
        String[] newStr = str.split("\\s+");
        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i]);
        }
	}

}
