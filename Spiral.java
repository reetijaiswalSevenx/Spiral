package io.sevenx;
import java.util.*;

public class Spiral {

	public static void main(String[] args) {
		
		int inputNumber=9;
		int[][] matrix=new int[100][100];
		
		for(int i=0;i<inputNumber;i++) {
			for(int j=0;j<inputNumber;j++) {
				matrix[i][j]=0;
			}
		}
		int row=0,column=0;
		String direction= "RIGHT";
		
		int counter = 1;
		while(counter <= inputNumber*inputNumber) {
			
			matrix[row][column] = counter;
			
			if(direction == "RIGHT") {
				if(column == inputNumber-1 || matrix[row][column+1]>0) {
					direction = "DOWN";
			        row++;
			        
				}
				else {
					column++;
				}
			}
			else if (direction == "DOWN") {
				 if( row == inputNumber-1 || matrix[row+1][column] > 0 ){
					 direction = "LEFT";
					 column--;
				 }
				 else {
					 row++;
				 }
			}
			else if (direction == "LEFT") {
				 if( column == 0 || matrix[row][column-1] > 0 ){
			     direction = "UP";
			     row--;
				 }else {
					 column--;
				 }
		}else {
			if(matrix[row-1][column]>0) {
				direction = "RIGHT";
				column++;
			}
			else {
				row--;
			}
			}
			counter++;
		}
		for(int i=0;i<inputNumber;i++){
	        for(int j=0;j<inputNumber;j++){
	        	System.out.print(matrix[i][j] + " ");
	        }
	        System.out.println();
	}

	}
}


