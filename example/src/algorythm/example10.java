package algorythm;

public class example10 {
	public static void main(String[] args) {
		int z = 13;
	    for(int i=1; i<=z/2; i++){
	      for(int j=0; j<i; j++) System.out.print("*");
	      for(int j=0; j<z-2*i; j++) System.out.print(" ");
	      for(int j=0; j<i; j++) System.out.print("*");
	      System.out.println();
	    }
	}
}
