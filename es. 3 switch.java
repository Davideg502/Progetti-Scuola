// n.3 In un albergo il prezzo della camera dipende dal piano in cui ci si trova
//secondo la seguente tabella.
//piano 1 € 35
//piano 2 € 45
//piano 3 € 55
//piano 4 € 65
//Calcola il prezzo del conto sapendo il numero di giorni di soggiorno e il piano della camera.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	        System.out.println ("Inserisci il piano");
	    	Scanner input = new Scanner(System.in);
      	    int piano; 
     		piano = input.nextInt();
     		
	        System.out.println ("Inserisci numero giorni di soggiorno");
      	    int numgiorni; 
     		numgiorni = input.nextInt();
	        
	        int prezzofinale=0;
	        
	        System.out.println("inserisci il piano da 1 a 4");
	        
	        switch (piano) {
	            case 1:
	                
	                prezzofinale=numgiorni*35;
	                System.out.println("prezzo: "+ prezzofinale +"euro");
	                break;
	                
	            case 2:
	  
	                 prezzofinale=numgiorni*45;
	                System.out.println("prezzo: "+ prezzofinale +"euro");
	                break;
	                
	            case 3:
	                
	               prezzofinale=numgiorni*55;
	                System.out.println("prezzo: "+ prezzofinale +"euro");
	                break;
	              
	            case 4:
	                
	               prezzofinale=numgiorni*65;
	                System.out.println("prezzo: "+ prezzofinale +"euro");
	                break;
	               
	               default:
	               System.out.println("piano non disponibile");
	               
	        }
	        
	            
	}
}
