import javax.swing.JOptionPane;

public class Ejercicio9App {
	//Metodo para llenar el array
	public static void llenarArray(int array[]){
		for (int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*9+0);
		}
	}
	//Metodo para mostrar los datos
	public static void mostrarArray(int array[]){
		int suma = 0;			
	
		for (int i = 0; i < array.length; i++){
			JOptionPane.showMessageDialog(null, "Indice: " + i + " i valor " + array[i]);
			suma += array[i];
		}
		
		//Mostramos la suma
		JOptionPane.showMessageDialog(null, "Suma valores aleatorios: " + suma);
		
	}
	
	public static void main(String[] args) {
		//declaramos
		String cant = JOptionPane.showInputDialog("Introduce la cantidad de posiciones");
		int cantidad = Integer.parseInt(cant);
		int array[]= new int [cantidad];
		
		//Llamamos a los metodos
		llenarArray(array);
		mostrarArray(array);
	}

}
