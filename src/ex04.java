import javax.swing.JOptionPane;

public class ex04 {

		public static void main (String[] args) {
			
			double area;
			
			System.out.println("Calcula el area de un circulo.");
			String radioString=JOptionPane.showInputDialog("Introduce el radio del circulo");
			double radio=Double.parseDouble(radioString);
			area=Math.PI*Math.pow(radio, 2);
			System.out.println("El area del circulo es: "+area);
			
		}
}
