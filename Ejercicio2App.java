import javax.swing.JOptionPane;

public class Ejercicio2App {

	public static void main(String[] args) {
		//Declaración variables
		String cant = JOptionPane.showInputDialog("Introduce la cantidad");
		int cantidad = Integer.parseInt(cant);
		String nP = JOptionPane.showInputDialog("Introduce el número pequeño");
		int numP = Integer.parseInt(nP);
		String nG = JOptionPane.showInputDialog("Introduce el número grande");
		int numG = Integer.parseInt(nG);
		
		//hacemos un bucle que mostrara la cantidad de numeros aleatorios
		for (int i = 0; i < cantidad; i++) {
			//Usamos la función Math.random() para que nos de un numero aleatorio
			//entre los proporcionados
			int num = (int)(Math.random()*numG+numP);
			
			//Mostramos el mensaje con los numeros
			JOptionPane.showMessageDialog(null, "El numero aleatrorio entre " + numP + " y " + numG + " es: " + num);
		}
	}

}
