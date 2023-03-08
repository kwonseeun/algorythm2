package ArrayExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class example11 {
	static int cnt;
	static int search;
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T;

		T = Integer.parseInt(bf.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			cnt = 0;
			//search = 0;
			String[] l_r = bf.readLine().split(" ");
			int left = Integer.parseInt(l_r[0]), right = Integer.parseInt(l_r[1]);
			int good = left;
			solution(right, left, 0, good);
			//sb.append(cnt + " : " + search + "\n");
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}

	public static void solution(int right, int left, int select, int good) {
		//search++;
		if (right <= 0 || left <= 0||select==good) {
			if (select == good) {
				cnt++;
			}
			return;
		} else {
			solution(right - 1, left - 1, select + 1, good);
			if(select + right > good)
				solution(right - 1, left, select, good);
		}
	}
}
