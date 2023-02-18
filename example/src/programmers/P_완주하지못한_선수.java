package programmers;

public class P_완주하지못한_선수 {
	 public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        boolean[] check = new boolean[participant.length];
	        
	        for(int i = 0 ; i < completion.length ; i++){
	           Loop1 : for(int j = 0 ; j < participant.length ;j++){
	                if(!check[j]&&completion[i].equals(participant[j])){
	                    check[j]=true;
	                    break Loop1;
	                }
	            }
	        }
	        
	        for(int i = 0 ; i < participant.length ; i ++){
	            if(!check[i])
	                answer = participant[i];
	        }
	        
	        
	        
	        return answer;
	    }
}
