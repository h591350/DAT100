package oppgaver;
import static javax.swing.JOptionPane.*;
public class Oppgave2 {

	public static void main(String[] args) {
		int ovreGrense = Integer.parseInt(showInputDialog("Tast inn øvre grense:"));
		int nedreGrense = Integer.parseInt(showInputDialog("Tast inn nedre grense:"));
	
		
		System.out.println("Nedre grense: " + nedreGrense + "\nØvre grense: " + ovreGrense);
		
		if(nedreGrense%2 == 0) {
			nedreGrense++;
		}
		
		for(int i = nedreGrense; i <=ovreGrense; i+=2) {
			System.out.println(i);
		}
		
	}

}
