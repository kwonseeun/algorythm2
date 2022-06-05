package algorythm7;

class example06 {
	/**
    1. n*n배열 생성(최종 정답 배열은 n*(n+1)/2)
    
    2. 높이 증가하면서 0이거나 배열안이면 +1씩 증가된 숫자 넣기
    
    3. 그다음 가로방향 증가(0이거나 배열안이면)
    
    4. 가로 -1 높이 -1 하면서 움직이기
    
    5. 2~4번 반복하며 진행
**/
	
    public int[] solution(int n) {
        int[][] map = new int[n][n];
        
        int num = 1;
        int x= -1, y = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i % 3 == 0){
                    x++;
                }else if(i % 3 == 1){
                    y++;
                }else{
                    x--;
                    y--;
                }
                
                map[x][y] = num++;
            }
        }
        
        
        int[] answer = new int[n*(n+1)/2];
        int idx = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                answer[idx++] = map[i][j];
            }
        }
        
        return answer;
    }
}