package FizzBuzzBonus;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// consegna bonus
		/*chiediamo all’utente di dirci fino a quale numero dobbiamo giocare, 
		 * purché quel numero sia maggiore di 1 e minore di 200.
		 * chiedere il numero al giocator e non chiudere il ciclo fino a 
		 * che il giocatore non inserisce un numero valido*/
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		boolean chiedi = true;
		int numero = 0;
		
		while (chiedi) {
			System.out.println("Scegli un numero fino al quale vuoi giocare: ");
			numero = scan.nextInt();
			if (numero > 1 && numero <= 200) {
				chiedi = false;
			} else {
				System.out.println("Riprova, il numero selezionato deve essere compreso tra 1 e 200");
			}
		}
		System.out.println("Iniziamo: ");
		
		for (int i = 1; i <= numero; i++) {
				
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
		scan.close();
		}
  
	}
