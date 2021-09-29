import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2a {
	
	public static void main(String[] args) {
		
		int poe = parseInt (showInputDialog ("Poengsum:"));
		String kar = "Ugyldig poengsum";
		
		if (poe >= 0 && poe < 40)
			kar = "F";
		if (poe > 39 && poe < 50)
			kar = "E";
		if (poe > 49 && poe < 60)
			kar = "D";
		if (poe > 59 && poe < 80)
			kar = "C";
		if (poe > 79 && poe < 90)
			kar = "B";
		if (poe > 89 && poe < 101)
			kar = "A";
		
		showMessageDialog (null, kar);
	}
}