
public class Escopo {

	public static void main(String[] args) {
		// No java toda vari�vel precisa ser iniciada
		int x;
		boolean gameOver;
		x = 0;
		System.out.println(x);
		if (x == 0) {
			gameOver = false;
		} else {
			gameOver = true;
		}
		System.out.println(gameOver);
	}

}
