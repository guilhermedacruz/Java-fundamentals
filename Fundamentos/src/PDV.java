import java.text.DateFormat;
import java.util.Date;

public class PDV {

	public static void main(String[] args) {
		// Date -> trabalhar com data
		Date data = new Date();
		//Formatar data
		DateFormat formatador = 
		DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(formatador.format(data));
		
	}

}
