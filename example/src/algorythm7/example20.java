package algorythm7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class example20 {

	public static void main(String[] args) {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        String[] lr = br.readLine().split(" ");

	        char[] l = lr[0].toCharArray();
	        char[] r = lr[1].toCharArray();
	        
	        int answer = 0;
	        if(l.length == r.length) {
	            for (int i = 0; i < l.length; i++) {
	                if(l[i] == r[i] && l[i] == '8') {
	                    answer++;
	                }else if(l[i] != r[i]){
	                    break;
	                }
	            }
	        }

	}

}
