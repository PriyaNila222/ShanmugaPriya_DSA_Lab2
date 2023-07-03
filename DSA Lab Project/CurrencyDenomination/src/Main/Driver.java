package Main;

import java.util.Scanner;

import Service.PaymentCalculator;
import Service.MergeSort;

public class Driver {
	public static void main (String[] args) {		
		MergeSort mergeSort = new MergeSort();	
		PaymentCalculator calculator = new PaymentCalculator();  
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("Enter the size of currency denominations: ");
		int numberOfDenomination = scanner.nextInt();
		
		System.out.println("Enter the currency denominations value: ");
		
		int[] currencyValue = new int[numberOfDenomination];
		for(int i = 0; i < numberOfDenomination ; i++) {
			currencyValue[i] = scanner.nextInt();
		}		
			
		mergeSort.mergeSort(currencyValue, 0, currencyValue.length - 1);
		
		System.out.println("Enter the amount you want to pay: ");
		int amount = scanner.nextInt();
		
		calculator.calculatorImplementation(currencyValue, amount);		
		scanner.close();
		
	}
	

}
