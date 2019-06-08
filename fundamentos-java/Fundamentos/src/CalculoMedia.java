import java.util.Scanner;
public class CalculoMedia {

	public static void main(String[] args) {
		double nota1, nota2, media;
		System.out.println("Calculo da Media");
		//Criando um objeto para entrada de dados
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a nota1: ");
		nota1=teclado.nextDouble();
		System.out.print("Digite a nota2: ");
		nota2=teclado.nextDouble();
		media=(nota1+nota2)/2;
		System.out.print("Média: "+ media);
		if (media <5) {
			System.out.println(" REPROVADO");
		} else {
			System.out.println(" APROVADO");

		}
		teclado.close();
		
	}
}
