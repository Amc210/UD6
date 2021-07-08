import javax.swing.JOptionPane;

public class Ejercicio3App {
	public static boolean numeroPrimo (int n) {
		boolean primo = true;
		
		 for(int i = 2; i < (n / 2) && primo; i++) {
			 if (n % i == 0) {
				 primo = false;
			 }
		 }
		return primo;
	}
	public static void main(String[] args) {
		//Declaración variables
		String num = JOptionPane.showInputDialog("Introduce un número");
		int n = Integer.parseInt(num);
		
		JOptionPane.showMessageDialog(null, "El numero "+ n +" es primo? " + numeroPrimo(n));
	}

}
