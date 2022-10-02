import javax.swing.JOptionPane;

public class ex10 {
	public static void main (String[] args) {
		
		int i=1;
		int ventasTotal=0;
		
		String numVentasString=JOptionPane.showInputDialog("¿Cuantas ventas?");
		int numVentas=Integer.parseInt(numVentasString);
		while(i<=numVentas) {
			String ventaString=JOptionPane.showInputDialog("Venta numero "+i);
			int venta=Integer.parseInt(ventaString);
			ventasTotal=ventasTotal+venta;
			i++;
		}
		System.out.println("El total de ventas es de "+ventasTotal);
	}
}
