package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter number of rows and columns in the matrix : ");
                int row = in.nextInt();
                int column = in.nextInt();
                // Prepare matrix
                System.out.print("Enter elements of Matrix : ");
                int matrix[][] = new int[row][column];
                for(int i = 0; i < row; i++){
                    for(int j = 0; j < column; j++){
                        matrix[i][j] = in.nextInt();
                    }
                }
                System.out.println("Entered Matrix : " );
                for(int i = 0; i < row; i++){
                    for(int j = 0; j < column; j++){
                        System.out.print(" " +matrix[i][j]+"\t");
                    }
                    System.out.println();
                }
                // call method to find min and max in matrix
                findMinAndMax(matrix);
            }

            // Method to find maximum and minimum in matrix
            private static void findMinAndMax(int[][] matrix){
                int maxNum = matrix[0][0];
                int minNum = matrix[0][0];
                int indexRmax=0;
                int indexCmax=0;
                int indexRmin=0;
                int indexCmin=0;
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if(maxNum < matrix[i][j]){
                            maxNum = matrix[i][j];
                            indexRmax=i+1;
                            indexCmax=j+1;
                        } else if(minNum > matrix[i][j]){
                            minNum = matrix[i][j];
                            indexRmin=i+1;
                            indexCmin=j+1;
                        }
                    }
                }
                System.out.println("Max number: " + maxNum +" in Row "+indexRmax+" in Column "+indexCmax+
                        " Min number: " + minNum+" in Row "+indexRmin+" in Column"+indexCmin);
            }
        }


