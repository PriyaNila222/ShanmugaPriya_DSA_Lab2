package Main;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array: ");
		int transactionSize = scanner.nextInt();
		
		System.out.print("Enter the values of array: ");
		
		int[] arrayValue = new int[transactionSize];
		for(int i = 0; i < transactionSize; i++) {
			arrayValue[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the total number of targets that needs to be achieved: ");
		int targetNumber = scanner.nextInt();
		
		for(int i = 0 ; i < targetNumber; i++) {
			System.out.println("Enter the value of target: ");
			int targetValue = scanner.nextInt();
			
			int sumOfTarget = 0;			
			for(int j = 0; j < transactionSize; j++) {				
				sumOfTarget = sumOfTarget + arrayValue[j];				
				if(sumOfTarget >= targetValue) {
					System.out.println("Target achieved after " + (j+1) + " transaction");
					break;
				}							
			}
			
			if(sumOfTarget < targetValue) {
				System.out.println("Given target is not achieved");
			}			
			System.out.println(" ");
			
		}		
	scanner.close();	
	}
}
