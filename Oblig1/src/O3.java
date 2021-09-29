import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {
	
	public static void main(String[] args) {
		
		int n = parseInt (showInputDialog ("Tall:"));
		int f = 1;
		
		for (int x = 1; x < n+1; x++)
			f *= x;
		
		if (n > 0)
			showMessageDialog (null, f);
		else
			showMessageDialog (null, "Ugyldig verdi");
	}
}