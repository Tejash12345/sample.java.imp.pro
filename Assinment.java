package com.pac;

public class Assinment {

	public static void main(String[] args) {
		        String str = "19122284000555";
		        int[] count = new int[10];
		        int duplicates = 0;
		        int singles = 0;

		        char ch;
		        for (int i = 0; i < str.length(); i++) {
		            ch = str.charAt(i);
		            count[ch - '0']++;
		        }

		        for (int c = 0; c < 10; c++) {
		            if (count[c] > 1) {
		                System.out.println(c + "--->" + count[c]);
		                duplicates++;
		            } else if (count[c] == 1) {
		                singles++;
		            }
		        }

		        System.out.println("Total number of duplicate digits: " + duplicates);
		        System.out.println("Total number of single digits: " + singles);
		    }
		}


