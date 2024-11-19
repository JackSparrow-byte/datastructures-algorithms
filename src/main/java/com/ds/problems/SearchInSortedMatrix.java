package com.ds.problems;

public class SearchInSortedMatrix {
	
	public static void search(int[][] matrix, int n,int x) {//here n is matrix size and x is search element
		int i=0;
		int j = n-1;
		
		while(i< n && j >=0) {
			if(matrix[i][j] == x) {
				System.out.println(String.format("The Search Key %s available at %s %s", x,i,j));
				return;
			}
			
			if(matrix[i][j] > x) {
				j--;
			}else {
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
						  {10,20,30,40},
						  {15,25,35,45},
						  {27,29,37,48},
						  {32,33,39,51}
						  }; 
		search(matrix, 4, 32);
		
	}

}
