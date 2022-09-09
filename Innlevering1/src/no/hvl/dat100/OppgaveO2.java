package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO2 {

	public static void main(String[] args) {

		for (int s = 1; s <= 10; s++) {

			String poengsum = showInputDialog("Poengsum:");
			int poeng = parseInt(poengsum);

			if (poeng <= 39) {
				System.out.println("F");
			} else if (poeng >= 40 && poeng <= 49) {
				System.out.println("E");
			} else if (poeng >= 50 && poeng <= 59) {
				System.out.println("D");
			} else if (poeng >= 60 && poeng <= 79) {
				System.out.println("C");
			} else if (poeng >= 80 && poeng <= 89) {
				System.out.println("B");
			} else if (poeng >= 90 && poeng <= 100) {
				System.out.println("A");
			} else {
				System.out.println("FEIL");
			}
		}
	}
}
