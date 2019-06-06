import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		System.out.println("====TABUADA====");
		Scanner leia = new Scanner(System.in);
		// dica: <ctrl><shift><o> importação
		int valor;
		System.out.print("Digite o valor da tabuada: ");
		valor = leia.nextInt();
		// Estrutura de repetição for
		//For(inicio;Condição;Incremento)
		//i++ (i=i+1) 
		for (int i = 0; i <= 10; i++) {
			 System.out.println(valor + "x" + i + " = " + (valor*i));
			
		}
			leia.close();

	}

}
