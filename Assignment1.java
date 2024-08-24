package com.pac;

public class Assignment1 {

    public static void main(String[] args) {
        int[] salaries = {4000, 2300, 5000, 23000, 45000, 8000, 9000, 4700, 5600};
        int avg, add, sal, sum = 0;
        int len = salaries.length;

        // Calculate the sum of all salaries
        for (int i = 0; i < len; i++) {
            sum += salaries[i];
        }

        // Calculate the average salary
        avg = sum / len;
        System.out.println("The average salary is -----> " + avg);

        // Iterate through the salaries and update if below average
        for (int i = 0; i < len; i++) {
            if (salaries[i] < avg) {
                add = salaries[i] / 2;
                sal = salaries[i] + add;
                System.out.println("Your previous salary was " + salaries[i] + ". Updated salary: " + sal);
            } else {
                System.out.println("Your previous salary is " + salaries[i] + ". Salary not updated.");
            }
        }
    }
}
