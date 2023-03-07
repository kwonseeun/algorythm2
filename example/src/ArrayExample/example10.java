package ArrayExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example10 {
	 public int[] solution(int[] numbers) {
	        int[] answer = {};
	    
	        List<Integer> list = new ArrayList<>();
	        
	        for (int i=0; i<numbers.length; i++) {
	            for (int j=i+1; j<numbers.length; j++) {
	                if (i!=numbers.length-1) {
	                    int res = numbers[i] + numbers[j];
	                    if (!list.contains(res)) list.add(res);
	                    }
	                }
	            }
	        answer = new int[list.size()];
	        for (int i=0; i<answer.length; i++) {
	            answer[i] = list.get(i);
	            }
	        Arrays.sort(answer);
	        return answer;
	    }
}
