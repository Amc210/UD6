import javax.swing.JOptionPane;

public class Ejercicio6App {
	public static int contarCifras (int n) {
		int cifras = 0;
		
		while(n != 0){   
          n = n / 10;         
          cifras++;          
       }
		return cifras;
	}
	public static void main(String[] args) {
		//Declaraci�n variables
		String num = JOptionPane.showInputDialog("Introduce un n�mero");
		int n = Integer.parseInt(num);
		
		JOptionPane.showMessageDialog(null, contarCifras(n));
	}

}
