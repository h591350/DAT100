package oppgaver;
import static javax.swing.JOptionPane.*;
public class Oppgave3 {

	public static void main(String[] args) {
		int x = Integer.parseInt(showInputDialog("Tast in tall verdi:"));
		int n = Integer.parseInt(showInputDialog("Tast in potens verdi:"));
		
		//Ved bruker av pow funk
	 	double resultatPow = Math.pow(x,n);
		System.out.println("Her er resultatet ved bruk av Math.pow funksjon: " + resultatPow);
		
		//Ved bruk av while settning
		double resultatLoop1 = 1;
		
		for(int i = 0; i < n; i++) {
			resultatLoop1*=x;
		
		}
		
		System.out.println("Her er resultatet ved bruk av while loop: " + resultatLoop1);
	}
	

}
