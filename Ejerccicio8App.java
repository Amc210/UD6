import javax.swing.JOptionPane;

public class Ejerccicio8App {
	
	//Metodo para llenar el array
	public static void llenarArray(int array[]){
		for (int i = 0; i < array.length; i++){
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para la posicion "+ i));
		}

	}
	//Metodo para mostrar los datos
	public static void mostrarArray(int array[]){
		for (int i = 0; i < array.length; i++){
			JOptionPane.showMessageDialog(null, "Indice: " + i + " i valor " + array[i]);
		}

	}
	
	public static void main(String[] args) {
		//declaramos
		int array[]= new int [10];
		
		llenarArray(array);
		mostrarArray(array);
	}

}
