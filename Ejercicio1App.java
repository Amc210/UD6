import javax.swing.JOptionPane;

public class Ejercicio1App {
	public static void areaCirculo() {
		//Declaración de variables 
		String r = JOptionPane.showInputDialog("Introduce el radio");
		int radio = Integer.parseInt(r);
		double areaC;
		
		//Calculamos el area 
		areaC = (Math.PI * (Math.pow(radio, 2)));
		
		//Mostramos el mensaje
		JOptionPane.showMessageDialog(null, "El area es: " + areaC);
	}
	
	public static void areaTriangulo() {
		//Declaración de variables 
		String b = JOptionPane.showInputDialog("Introduce la base");
		int base = Integer.parseInt(b);
		String a = JOptionPane.showInputDialog("Introduce la altura");
		int altura = Integer.parseInt(a);
		double areaT;
		
		//Calculamos el area 
		areaT = ((base * altura)/2);
		
		//Mostramos el mensaje
		JOptionPane.showMessageDialog(null, "El area es: " + areaT);
	}
	public static void areaCuadrado() {
		//Declaración de variables 
		String l1 = JOptionPane.showInputDialog("Introduce el lado 1");
		int lado1 = Integer.parseInt(l1);
		String l2 = JOptionPane.showInputDialog("Introduce el lado 2");
		int lado2 = Integer.parseInt(l2);
		double areaCU;
		
		//Calculamos el area 
		areaCU = (lado1 * lado2);
		
		//Mostramos el mensaje
		JOptionPane.showMessageDialog(null, "El area es: " + areaCU);
	}
	public static void main(String[] args) {
		String figura = JOptionPane.showInputDialog("Introduce el nombre de la figura");
		
		switch (figura) {
		
		case "circulo": 
			areaCirculo();
			break;
		case "triangulo": 
			areaTriangulo();
			break;
		case "cuadrado": 
			areaCuadrado();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Error!!");
		}
	}

}
