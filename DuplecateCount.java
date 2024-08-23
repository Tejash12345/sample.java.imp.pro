package com.pac;

public class DuplecateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "111222489000555";// 489---3
		
		//"1##2##4890##5##"
		
		char chI,chJ,chK;
		int dupCount=0;
		for(int i=0;i<str.length();i++) {// 2
			chI = str.charAt(i);
			// backword
			boolean isBFound = false;
			for(int k=0;k<i;k++) {
				chK = str.charAt(k);
				if(chI == chK) isBFound= true;
			}
			if(isBFound == true) continue;
			// forward
			int countJ=0;
			for(int j=0;j<str.length();j++) {
				chJ = str.charAt(j);
				if(chI == chJ) countJ++;
			}
			if(countJ > 1) dupCount++; // 
		}
		
		
		System.out.println("Duplicate Elements--->"+dupCount);


	}

}
