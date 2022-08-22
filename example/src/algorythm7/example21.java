package algorythm7;

public class example21 {
	public boolean solution(String s) {
		boolean answer = true;
		
		if (s.length()!=4 && s.length() != 6) {
			return false;
			
		}else {
			try {
				int temp = Integer.parseInt(s);
			} catch (Exception e) {
				return false;
			}
		}
		return answer;
	}

}
