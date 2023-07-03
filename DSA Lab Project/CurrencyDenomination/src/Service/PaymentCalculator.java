package Service;

public class PaymentCalculator {
	public void calculatorImplementation(int[] currencyValue, int amount) {
		int[] noteCounter = new int[currencyValue.length];
		
		for(int i = 0; i < currencyValue.length; i++) {
			if(amount >= currencyValue[i]) {
				noteCounter[i] = amount / currencyValue[i];
				amount = amount - noteCounter[i] * currencyValue[i];
			}
		}
		
		if(amount > 0) {			
			System.out.println("Exact amount cannot be paid with the given currency value");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i = 0; i < currencyValue.length; i++) {
				if(noteCounter[i]!= 0) {
					System.out.println(currencyValue[i] + ":" + noteCounter[i]);
				}
			}
		}
	}
}
