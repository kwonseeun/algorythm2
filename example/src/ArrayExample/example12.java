package ArrayExample;

public class example12 {
	  public int[] solution(int[] heights) {
	        int[] answer = new int[heights.length];
		        // 수신한 탑 있는지 확인용도
		        boolean flag = false;
		        
		        // 제일 오른쪽부터 왼쪽으로 신호 송신
	            // 첫 번재 탑은 무조건 0으로 기록
		        answer[0] = 0;
		        for(int i=heights.length-1; i>=1; i--){
		            flag = false;
		            // 송신 탑 높이보다 수신 탑 높이가 높으면 수신한 탑 위치 기록 아니면 다음으로 넘어감
		            for(int j=i-1; j>=0; j--){
		                if(heights[j] > heights[i]){
		                    answer[i] = j+1;
		                    flag = true;
		                    break;
		                }
		            }
		        
		            // 첫 번째 탑까지 수신한 탑이 없으면 0으로 기록
		            if(!flag)
		                answer[i] = 0;
		        }
		        
		        
		        return answer;
	    }
}
