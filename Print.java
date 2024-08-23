package com.pac;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6;  // Number of rows
        int cols = 5;  // Number of columns

        for (int r = 1; r <= rows; r++) { // Iterate over rows
            for (int c = 1; c <= cols; c++) { // Iterate over columns
                // Print a star if it's on the border or the first/last row/column
                if (r == 1 || r == rows || c == 1 || c == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for inner part
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
	}

}
