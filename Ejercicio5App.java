import javax.swing.JOptionPane;

public class Ejercicio5App {
	
	public static String obtenerBinario(int n){
		//de decimal a binario
		    String binario = Integer.toBinaryString(n);
		    System.out.println(binario); 
	    return binario;
	 }
	
	public static void main(String[] args) {
		//Declaración variables
		String num = JOptionPane.showInputDialog("Introduce un número");
		int n = Integer.parseInt(num);
		
		JOptionPane.showMessageDialog(null, obtenerBinario(n));
	}

}
