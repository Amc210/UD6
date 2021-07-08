import javax.swing.JOptionPane;

public class Ejercicio12App {
	//Metodo para llenar el array
	public static void llenarArrayNum(int array1[], int n){
	 int cont = 0;
	
		for (int i = 0; i < array1.length; i++){
			array1[i] = (int)(Math.random()*300+1);
		}
		//miramos que los numeros acaben con el numero introducido
		for (int i = 0; i < array1.length; i++){
			if (array1[i] % 10 == n) {
		      cont++;
		     }		    
		}
		int array2[]= new int [cont];
		int a = 0;
		for (int i = 0; i < array1.length; i++){
			if (array1[i] % 10 == n) {
				array2[a] = array1[i];
				a++;
			}
		}
		
		for (int i = 0; i < array2.length; i++){
			System.out.println(array2[i]);
		}
	}
	public static void main(String[] args) {
		//declaramos
		String cant = JOptionPane.showInputDialog("Introduce la cantidad de posiciones");
		int cantidad = Integer.parseInt(cant);
		int array1[]= new int [cantidad];
		

		String num = JOptionPane.showInputDialog("Que numero quieres en el array?");
		int n = Integer.parseInt(num);
		
		llenarArrayNum(array1, n);
	}

}
