package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO1 {

	public static void main(String[] args) {

		String bruttolonn = showInputDialog("Bruttolønn:");
		int brutto = parseInt(bruttolonn);

		if (brutto <= 164100) {
			System.out.println("Trinnskatt:" + brutto * 0);
		} else if (brutto >= 164101 && brutto <= 230950) {
			System.out.println("Trinnskatt:" + brutto * 0.0093);
		} else if (brutto >= 230951 && brutto <= 580650) {
			System.out.println("Trinnskatt:" + brutto * 0.0241);
		} else if (brutto >= 580651 && brutto <= 934050) {
			System.out.println("Trinnskatt:" + brutto * 0.1152);
		} else if (brutto >= 934051) {
			System.out.println("Trinnskatt:" + brutto * 0.1452);
		}
	}
}
