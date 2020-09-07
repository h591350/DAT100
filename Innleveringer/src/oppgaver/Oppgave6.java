package oppgaver;

import static javax.swing.JOptionPane.*;
public class Oppgave6 {

	public static void main(String[] args) {
		int Tall = Integer.parseInt(showInputDialog("tast inn ett heltall"));
		int fakulitet = Tall;
		if (Tall > 0) {
			for( int i =1; i <Tall; i++) {
				fakulitet *= i;
				System.out.println(fakulitet);
			}
		
		}
		else {
			showMessageDialog(null, "Tast inn tall høyere enn 0");
		}
		showMessageDialog(null, "Fakulitet av: " +Tall + " er " + fakulitet);
	}

}
