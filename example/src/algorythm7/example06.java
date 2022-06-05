package algorythm7;

class example06 {
	
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
        return null;
    }
}