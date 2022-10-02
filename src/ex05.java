import javax.swing.JOptionPane;

public class ex05 {

		public static void main (String[] args) {
			
			String num1String=JOptionPane.showInputDialog("Introduce un numero");
			int num1=Integer.parseInt(num1String);
			double resultado=num1%2;
			if (resultado==0) {
				System.out.println("El numero "+num1+" es divisible entre 2");
			}else {
				System.out.println("El numero "+num1+" no es divisible entre 2");
			}
		}
}
