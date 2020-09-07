package oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Oppgave5 {

	public static void main(String[] args) {
		
		for (int i =1; i <=10; i++) {
		
			int input = 0;
		
			do { 
					input = parseInt(showInputDialog("Skriv inn en poengsum."));
				
					if((input>=0) && (input < 40)){
						showMessageDialog(null,"Du har fått karakteren F");
					}
					else if(input >= 40 && input <50) {
						showMessageDialog(null,"Du har fått karakter E");
					}
					else if(input >= 50 && input <60) {
						showMessageDialog(null,"Du har fått karakter D");
					}
					else if(input >= 60 && input <80) {
						showMessageDialog(null,"Du har fått karakter C");
					}
					else if(input >= 80 && input <90) {
						showMessageDialog(null,"Du har fått karakter B");
					}
					else if(input >= 90 && input <100) {
						showMessageDialog(null,"Du har fått karakter A");
					}
					if (input > 100 || input <0) 
						showMessageDialog(null,"Ugyldig poengsum");
					
			}while (input <0 || input >100);
		}		
	}
}
		



