package oppgaver;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave4 {

	public static void main(String[] args) {
		String inputBrutto = showInputDialog("Input brutto inntekt");
		int brutto = parseInt(inputBrutto);
		double trinskatt = 0.0;
		int trinn = 0;
		if ((brutto > 0) && (brutto <= 180800)) {
			trinskatt = 0.0;
			trinn = 0;
			}
			else if ((brutto > 180800)&& (brutto<=254500)) {
				trinskatt = 0.019;
				trinn = 1;
			}
			else if ((brutto >254500)&& (brutto<=639750)) {
				trinskatt = 0.042;
				trinn = 2;
			}
			else if ((brutto >639750)&& (brutto<=999550)) {
				trinskatt = 0.132;
				trinn = 2;
			}
			else {
				trinskatt = 0.162;
				trinn = 3;
			}

		double netto = brutto*(1-trinskatt);
		String outputTxt =("Du er i trinn:"+trinn +" med skatte %" +(trinskatt*100)+" din netto vil være"+ netto+"kr");
	
		showMessageDialog(null, outputTxt);
	}


}
