package com.pac;

public class CountDistinctChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "111233577";
		
		char ch,chK;
		int count=0,uTot=0;
		for(int i=0;i<str.length();i++) {
			 ch = str.charAt(i);
			 
			 count=0;
			 for(int k=0;k<str.length();k++) {
				 chK = str.charAt(k); 
				 if(ch == chK) count++;
			 }
			 if(count ==1) uTot++; 
		}
		
		System.out.println("Unique Elements---->"+uTot);

	}

}
