package algorythm6;

public class example02 {
	public static final String Male ="MALE";
	public static final String Female = "FEAMLE";
	
	public static void main(String[] args) {
		String gender1;
		

		gender1 = example02.Female;

		Gender gender2;
		
		gender2 = Gender.MALE;
		gender2 = Gender.FEAMLE;
		
		System.out.println(gender2);
	}
	
	enum Gender{
		MALE,FEAMLE;
	}

}
