package com.pac;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "abba";
		String res ="";
		for(int i=data.length()-1;i>=0;i--) {
		res = res + data.charAt(i);
		}
		System.out.println(res);
		if(data.equalsIgnoreCase(res) == true) {
			System.out.println("Yes ..It is Polyndrome");
		}
		else {
			System.out.println("Not");
		}

	}

}
