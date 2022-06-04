package algorythm7;

import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        
        p--; //0번부터 시작하기 위해
        
        String temp = ""; // n진수 변환 스트링
        for(int i = 0; temp.length() < t*m; i++){ // t번 고를 숫자까지 변환
            temp += Integer.toString(i,n).toUpperCase();
        }
        
        // t개 고르기
        for(int i = 0; i < t; i++){
            sb.append(temp.charAt(i*m+p));
        }
        
        return sb.toString();
    }
    
}