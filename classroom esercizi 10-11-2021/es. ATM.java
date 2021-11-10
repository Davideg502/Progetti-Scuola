// Esercizio ATM

//Realizzare un programma che permetta di simulare la gestione di un ATM (Automated Teller Machine).
//L'ATM ha una disponibilità iniziale di: 6000€;
//L'utente può effettuare sia prelievi che versamenti;
//Il limite giornaliero di prelievo è di: 250€;
//Per ogni transazione è necessario indicare il PIN.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		int capacita_atm = 6000;
		int pin = 5254;
		
		System.out.println("BENVENUTO - BANCO POPOLARE DI LODI");
		System.out.println("- - - - - - - - - - - - - - - - - ");
		System.out.println("Seleziona:");
		System.out.println("1 per prelievo");
		System.out.println("2 per versamenti");
		
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		
		switch (n) {
		    
		    case 1:
		        System.out.println("Hai selezionato prelievo bancario - limite giornaliero di E 250");
		        System.out.println("Per continuare nelle operazioni, si prega di Inserire il PIN");
		        
		       	int tentativo_pin;
	        	tentativo_pin = input.nextInt();
	        	
	        	System.out.println("- - - - - - - - - - - - - - - - - ");
	        	
	        	    if (tentativo_pin == pin) {
	        	
	        	System.out.println("PIN CORRETTO");
	        	System.out.println("- - - - - - - - - - - - - - - - - ");
	        	System.out.println("Hai selezionato prelievo bancario - limite giornaliero di E 250");
		        System.out.println("Scegli l'importo");
		        System.out.println("50 - 100 - 150 - 200 - 250");
		        int importo;
	        	importo = input.nextInt();
	        	
	        	    if (importo == 50) {
	        	          capacita_atm=6000-50;
	        	    System.out.println("Hai prelevato E " + importo);
	        	    System.out.println("E rimanenti nel conto: " + capacita_atm);
	        	    System.out.println("- - - - - - - - - - - - - - - - - ");
	        	    System.out.println("Ritira le banconote entro 25 sec ... per motivi di sicurezza ");
	        	    } else if (importo == 100) {
	        	        
	        	        capacita_atm=6000-100;
	        	    System.out.println("Hai prelevato E " + importo);
	        	    System.out.println("E rimanenti nel conto: " + capacita_atm);
	        	    System.out.println("- - - - - - - - - - - - - - - - - ");
	        	    System.out.println("Ritira le banconote entro 25 sec ... per motivi di sicurezza ");
	        	    } else if (importo == 150) {
	        	        
	        	        capacita_atm=6000-150;
	        	    System.out.println("Hai prelevato E " + importo);
	        	    System.out.println("E rimanenti nel conto: " + capacita_atm);
	        	    System.out.println("- - - - - - - - - - - - - - - - - ");
	        	    System.out.println("Ritira le banconote entro 25 sec ... per motivi di sicurezza ");
	        	    } else if (importo == 200) {
	        	        
	        	        capacita_atm=6000-200;
	        	    System.out.println("Hai prelevato E " + importo);
	        	    System.out.println("E rimanenti nel conto: " + capacita_atm);
	        	    System.out.println("- - - - - - - - - - - - - - - - - ");
	        	    System.out.println("Ritira le banconote entro 25 sec ... per motivi di sicurezza ");
	        	    } else if (importo == 250) {
	        	        
	        	        capacita_atm=6000-250;
	        	    System.out.println("Hai prelevato E " + importo);
	        	    System.out.println("E rimanenti nel conto: " + capacita_atm);
	        	    System.out.println("- - - - - - - - - - - - - - - - - ");
	        	    System.out.println("Ritira le banconote entro 25 sec ... per motivi di sicurezza ");
	        	    }
	        	    } else {
	        	        
	        	        System.out.println("- - - - - - - - - - - - - - - - - ");
	        	        System.out.println("PIN ERRATO - REINSERIRE CARTA PER CONTINUARE NELLE OPERAZIONI");
	        	        
	        	        break;
	        	    }
		       
	        	    
		    break;
		    
		       case 2:
		           
		        System.out.println("Hai selezionato versamento di denaro");
		        System.out.println("- - - - - - - - - - - - - - - - - ");
		        System.out.println("Per continuare nelle operazioni, si prega di Inserire il PIN");
		        
		        int versamento = 0;
		        int tentativo2_pin;
		        
		        System.out.println("- - - - - - - - - - - - - - - - - ");
		        
	        	tentativo2_pin = input.nextInt();
	        	
	        	    if (tentativo2_pin == pin) {
	        	        
	        	          System.out.println("PIN CORRETTO");
	        	          System.out.println("- - - - - - - - - - - - - - - - - ");
		                  System.out.println("Inserisci la quantita' di denaro che desideri versare");
		                  
		                  versamento = input.nextInt();
		                  capacita_atm+=versamento;
		                  
		                  System.out.println("Dopo il tuo ultimo versamento bancario, il tuo patrimonio totale e' di E " + capacita_atm);
		                  
	        	    } else {
	        	        
	        	        System.out.println("- - - - - - - - - - - - - - - - - ");
	        	        System.out.println("PIN ERRATO - REINSERIRE CARTA PER CONTINUARE NELLE OPERAZIONI");
	        	        
	        	        break;
	        	    }
	        	    
	        break;
	            
	            default: 
	                System.out.println("Hai selezionato un'operazione inesistente, si prega di reinserire la carta e riprovare.");
	                break;
		
}
}
}
