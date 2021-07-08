import javax.swing.JOptionPane;

public class Ejercicio11App {
	//Metodo para llenar el array
	public static void llenarArray(int array1[], int cantidad){
		for (int i = 0; i < array1.length; i++){
			array1[i] = (int)(Math.random()*cantidad+0);
		}

	}
	//Metodo para copiar i comprovar el array 2
	public static void copiarDatos(int array1[], int array2[], int cantidad){
		int [] n = new int [cantidad];
		int aleatorio, cont = 0;
		boolean esta;
		
		//Ponemos un valor inicial al vector
		for (int i = 0; i < array1.length; i++){
			n[i] = 0;
		}
		
		while(cont < n.length) {
			esta = false; //Comprovar si el num ha aparecido
			aleatorio = (int)(Math.random() * n.length);
			
			//recorremos el array y comprovamos si el numero esta
			for (int i = 0; i < array1.length; i++){
				if(aleatorio == n[cont]) {
					//Si esta la variable pasa a ser true si no seguira false
					esta = true;
				}
			}
			//Si no lo ha encontrado asignara el valor a la posicion 
			if (!esta) {
				n[cont] = aleatorio;
				array2[aleatorio] = array1[cont];
				cont++;
			}
		}
	}
	//Metodo para mostrar los datos
	public static void mostrarArray(int array[]){
		for (int i = 0; i < array.length; i++){
			JOptionPane.showMessageDialog(null, "Indice: " + i + " i valor " + array[i]);
		}
		
	}
	public static void multiplicarNumeros(int array1[], int array2[]) {
		int [] array3 = new int [array1.length];
		
		for (int i = 0; i < array3.length; i++) {
			array3[i] = array1[i] * array2[i];
		}
		mostrarArray(array1);
		mostrarArray(array2);
		mostrarArray(array3);
	}
	public static void main(String[] args) {
		//declaracion
		String cant = JOptionPane.showInputDialog("Introduce la cantidad de posiciones del array 1");
		int cantidad = Integer.parseInt(cant);
		int array1[]= new int [cantidad];
		int array2[]= new int [cantidad];

		//Llamamos a los metodos
		llenarArray(array1, cantidad);
		copiarDatos(array1, array2, cantidad);
		multiplicarNumeros(array1, array2);
	}

}
