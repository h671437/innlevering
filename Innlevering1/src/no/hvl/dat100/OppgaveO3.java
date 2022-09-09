package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO3 {

	public static void main(String[] args) {

		String tallTxt = showInputDialog("Tall:");
		int ntall = parseInt(tallTxt);
		int antall = 1;

		System.out.print(ntall + "! = ");

		for (int i = 0; i < ntall; i++) {
			antall = antall * (ntall - i);
			System.out.print(i + 1 + " * ");
		}
		System.out.print("= " + antall);
	}
}
