package algorythm7;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class example27 {

	public static void main(String[] args) {
		
		int min, max;
		
		HashMap<String, String> TEMP = new HashMap<String, String>();
		ArrayList TLIST = new ArrayList();
		String[] sName = {"홍길동", "장길산", "이순신", "임꺽정", "이성계"};
		String[] sPaySt = {"Y", "Y", "N", "Y", "N"};
		String[] sPayAmt = {"10000", "20000", "30000", "15000", "20000"};

		
	        
		for (int i=0; i < sName.length; i++) {
			TEMP = new HashMap<String, String>();
			TEMP.put("NAME", sName[i]);
			TEMP.put("PAY_ST", sPaySt[i]);
			TEMP.put("PAY_AMT", sPayAmt[i]);
			TLIST.add(TEMP);	
				
		}
		
		min = (int) Collections.min(TLIST);
		
	}

}
