import javax.swing.JOptionPane;

public class ex06 {

		public static void main (String[] args) {
			
			final double IVA=0.21;
			
			String precioInicialString=JOptionPane.showInputDialog("Introduzca el precio del producto");
			double precioInicial=Double.parseDouble(precioInicialString);
			double precioFinal=precioInicial+(precioInicial*IVA);
			System.out.println("El precio con IVA de "+precioInicial+" es " +precioFinal);
					
		}
}
