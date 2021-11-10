//n.1 Programma Java che chiede un intero in ingresso e 
// lo stampa in lettere se il valore è compreso tra 1 e 3 , altrimenti stampa un messaggio d'errore.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

    System.out.println ("Inserisci un numero in ingresso");
	    Scanner input = new Scanner(System.in);
      	int x; 
     	x = input.nextInt();

    switch (x) {
        case 1: System.out.println ("uno");
        break;
        
        case 2: System.out.println ("due");
        break;
        
        case 3: System.out.println ("tre");
        break;
        
        default: System.out.println ("ERRORE");
        System.out.println ("________________");
	    System.out.println ("il numero inserito non e' compreso tra 1 e 3.");
    }
    }

}
