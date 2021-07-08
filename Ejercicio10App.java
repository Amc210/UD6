import javax.swing.JOptionPane;

public class Ejercicio10App {
	
	//Metodo para numeros aleatorios
		public static void numerosAleatorios(int array[], int cantidad){
			int naleatorio;
			
			for (int i = 0; i < array.length; i++){
				naleatorio = (int)(Math.random()*9+0);
				if (numeroPrimo(naleatorio)) {
					array[i] = naleatorio;
				}
			}	
		}
	//Miramos si el numero es primo
	public static boolean numeroPrimo (double n) {
		boolean primo = true;
		
		 for(int i = 2; i < (n / 2) && primo; i++) {
			 if (n % i == 0) {
				 primo = false;
			 }
		 }
		return primo;
	}	
	//Miramos si el numero es mayor
		public static int numeroMayor (int array[]) {
			int mayor = 0;
			for (int i = 0; i < array.length; i++){
				if (array[i] > mayor) {
					mayor = array[i];
				}
			}
			return mayor;
		}	
		//Metodo para mostrar los datos
		public static void mostrarArray(int array[]){
			for (int i = 0; i < array.length; i++){
				JOptionPane.showMessageDialog(null, "Indice: " + i + " i valor " + array[i]);
			}
		}
		
	public static void main(String[] args) {
		//declaracion
		String cant = JOptionPane.showInputDialog("Introduce la cantidad de posiciones");
		int cantidad = Integer.parseInt(cant);
		int array[]= new int [cantidad];
		
		//Llamamos a los metodos
		numerosAleatorios(array, cantidad);
		mostrarArray(array);
		JOptionPane.showMessageDialog(null, "El numero mayor és: " + numeroMayor(array));
	}

}
