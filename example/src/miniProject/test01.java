package miniProject;

public class test01 {
	public static void main(String[] args) {
		for (int i = 2; i < args.length; i++) {
			for (int j = 1; j < i; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println("?");
		}
	}
}
