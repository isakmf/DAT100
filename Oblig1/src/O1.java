import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import java.text.DecimalFormat;

public class O1 {
	
	public static void main(String[] args) {
		
		int bru = parseInt (showInputDialog ("Bruttoinntekt:"));
		double tri;
		int triCon = 0;
		DecimalFormat a = new DecimalFormat("#.##");
		
		if (bru > 164100 && bru < 230951)
			triCon = 1;
		if (bru > 230950 && bru < 580651)
			triCon = 2;
		if (bru > 580650 && bru < 934051)
			triCon = 3;
		if (bru > 934050)
			triCon = 4;
		
		switch (triCon) {
			case 1: tri = 0.0093 * bru; break;
			case 2: tri = 0.0241 * bru; break;
			case 3: tri = 0.1152 * bru; break;
			case 4: tri = 0.1452 * bru; break;
			default: tri = 0;
		}
		
		showMessageDialog (null, "Trinnskatt: " + a.format(tri));
	}
}