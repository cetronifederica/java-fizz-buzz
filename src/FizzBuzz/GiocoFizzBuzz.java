package FizzBuzz;

public class GiocoFizzBuzz {

	public static void main(String[] args) {
		// consegna base FizzBuzz

		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizz Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		
		
		
	}

}
