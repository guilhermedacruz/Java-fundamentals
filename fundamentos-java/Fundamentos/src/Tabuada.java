
import javax.swing.JOptionPane;
public class Tabuada {
	public static void main(String args[]) {
		int x = 1;
		int y = 0;
		int result = 0;
		String mostrar = "";
		while (x <= 10) {
			while (y < 10) {
				y = y + 1;
				result = x * y;
				mostrar = mostrar + "\n" + x + " x " + y + " = " + result;
			}
			JOptionPane.showMessageDialog(null, "Tabuada do " + x + mostrar);
			y = 0;
			x = x + 1;
			mostrar = "";
		}
	}
}

