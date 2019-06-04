import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		// Date -> trabalhar com data
		Date data = new Date();
		//Formatar data
		DateFormat formatador =
		DateFormat.getDateInstance(DateFormat.FULL);
		DecimalFormat resultado = new DecimalFormat("0,00");
		double total, desconto, totalDesconto, pago, troco;
		Scanner leia = new Scanner(System.in);
		System.out.println(formatador.format(data));
		System.out.println("========");
		System.out.println("===PDV===");
		System.out.println("========");
		System.out.println("");
		System.out.print("Valor total: ");
			total = leia.nextDouble();
		
		System.out.print("Desconto em %: ");
			desconto = leia.nextDouble();
		
			totalDesconto = total - (desconto / 100 * (total));
		System.out.println("Total com desconto: " + totalDesconto);
		System.out.println("__________________________");
		System.out.println("");
		System.out.print("Valor Pago: ");
			pago = leia.nextDouble();
		
			troco = (pago - total);
		System.out.println("Troco: " + troco);
		
	}

}
