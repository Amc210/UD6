import javax.swing.JOptionPane;

public class Ejercicio7App {
	
	public static void cambioMoneda(int e, String moneda) {
		double resultado = 0;
		final double libra = 0.86, dolar = 1.28611, yen = 129.852;
		
	switch (moneda) {
		case "libra": 
			resultado = e * libra;
			break;
		case "dolar": 
			resultado = e * dolar;
			break;
		case "yen": 
			resultado = e * yen;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Error!!");
		}
	if (resultado != 0) {
		JOptionPane.showMessageDialog(null, "El total despues de la conversion: " + resultado + " " + moneda);
	}
	}
	public static void main(String[] args) {
	//Declaración variables i preguntamos los euros
	String eu = JOptionPane.showInputDialog("Introduce los euros");
	int e = Integer.parseInt(eu);
	
	//preguntamos a que lo quiere pasar
	String moneda = JOptionPane.showInputDialog("A que moneda lo quieres convertir? ").toLowerCase();
	
	//Llamamos al metodo
	cambioMoneda(e, moneda);
	}

}
