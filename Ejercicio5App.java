import javax.swing.JOptionPane;

public class Ejercicio5App {
	
	public static String obtenerBinario(int n){
		//de decimal a binario
		    String binario = Integer.toBinaryString(n);
		    System.out.println(binario); 
	    return binario;
	 }
	
	public static void main(String[] args) {
		//Declaraci�n variables
		String num = JOptionPane.showInputDialog("Introduce un n�mero");
		int n = Integer.parseInt(num);
		
		JOptionPane.showMessageDialog(null, obtenerBinario(n));
	}

}
