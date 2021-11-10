// N.4 Programma Java che chiede un intero in ingresso e 
// lo stampa in lettere se il valore è compreso tra 1 e 3 , altrimenti stampa un messaggio d'errore.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

    System.out.println ("Inserisci un mese | forma numerica");
	    Scanner input = new Scanner(System.in);
      	int x; 
     	x = input.nextInt();

    switch (x) {
        case 1: System.out.println ("GENNAIO - 31 GIORNI");
        break;
        
        case 2: System.out.println ("FEBBRAIO - 28 GIORNI / 29 SE ANNO BISESTILE");
        break;
        
        case 3: System.out.println ("MARZO - 31 GIORNI");
        break;
        
        case 4: System.out.println ("APRILE - 30 GIORNI");
        break;
        
        case 5: System.out.println ("MAGGIO - 31 GIORNI");
        break;
        
        case 6: System.out.println ("GIUGNO - 30 GIORNI");
        break;
        
        case 7: System.out.println ("LUGLIO - 31 GIORNI");
        break;
        
        case 8: System.out.println ("AGOSTO - 30 GIORNI");
        break;
        
        case 9: System.out.println ("SETTEMBRE - 30 GIORNI");
        break;
        
        case 10: System.out.println ("OTTOBRE - 31 GIORNI");
        break;
        
        case 11: System.out.println ("NOVEMBRE - 30 GIORNI");
        break;
        
        case 12: System.out.println ("DICEMBRE - 31 GIORNI");
        break;
        
        default: System.out.println ("non esistono mesi oltre 12");
       
    }
    }

}


