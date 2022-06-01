package algorythm7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class example04 {
	
	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    List<Integer> list = new ArrayList<>();
		    int num;
		    int cnt = 0;

		    while (true) {
		      num = sc.nextInt();

		      if (num == -1) break;
		      if (num == 0) {
		        for (int i = 0; i < list.size(); i++) {
		          for (int j = 0; j < list.size(); j++) {
		            if (i != j && list.get(i) * 2 == list.get(j)) cnt++;
		          }
		        }
		        System.out.println(cnt);

		        list.clear();
		        cnt = 0;
		      } else {
		        list.add(num);
		      }
		    }
		  }
}
