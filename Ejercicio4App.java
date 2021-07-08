import javax.swing.JOptionPane;

public class Ejercicio4App {
	public static void menosNum (int num) {
		int total = num;
		
		while (num != 1) {
			total = total * (num - 1);
			num--;
		}
		//Mostramos el mensaje con los numeros
		JOptionPane.showMessageDialog(null, "El total es: " + total);
	}
	public static void main(String[] args) {
		//Declaración variables
		String n = JOptionPane.showInputDialog("Introduce el número");
		int num = Integer.parseInt(n);

		//Funcion para calcular el factorial
		menosNum (num);
	}

}
