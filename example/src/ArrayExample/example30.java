package ArrayExample;

import java.util.LinkedList;
import java.util.Queue;

public class example30 {
	 public int solution(int bridge_length, int weight, int[] truck_weights) {
	        int answer = 0;
	        int size = truck_weights.length, idx = 0;
	        int current = 0;
	        Queue<Integer> bridge = new LinkedList<>();

	        do {
	            if (bridge.size() == bridge_length)
	                current -= bridge.poll();
	            if (idx < size && current + truck_weights[idx] <= weight) {
	                bridge.add(truck_weights[idx]);
	                current += truck_weights[idx++];
	            }
	            else
	                bridge.add(0);
	            answer++;
	        }while(current != 0);

	        return answer;
	    }
}
