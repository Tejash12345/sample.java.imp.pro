package com.pac;

public class Assingnment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String[] dept = {"HR", "IT", "sales", "HR", "IT", "HR", "sales"};
		        
		        String[] uniqueDepts = new String[dept.length];
		        int index = 0;
		        
		        for (int i = 0; i < dept.length; i++) {
		            boolean isUnique = true;
		            for (int j = 0; j < i; j++) {
		                if (dept[i].equals(uniqueDepts[j])) {
		                    isUnique = false;
		                    break;
		                }
		            }
		            if (isUnique) {
		                uniqueDepts[index++] = dept[i];
		            }
		        }
		        
		        System.out.print("Unique Departments: ");
		        for (int i = 0; i < index; i++) {
		            System.out.print(uniqueDepts[i]);
		            if (i < index - 1) {
		                System.out.print(", ");
		            }
		        }
		    }
		}
