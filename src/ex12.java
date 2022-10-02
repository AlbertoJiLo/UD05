import javax.swing.JOptionPane;
public class ex12 {
	public static void main (String[] args) {
		int i=1;
		
		String password=JOptionPane.showInputDialog("Elige una contraseña");
		while(i<=3) {
			String passwordCoincide=JOptionPane.showInputDialog("Escribe la contraseña 3 veces (Intento "+i+ " )");
			boolean passwordCheck=password.equals(passwordCoincide);
			if(passwordCheck) {			
			i++;
			}else {
				System.out.println("La contraseña no coincide");
			}
		}
		System.out.println("Enhorabuena");
	}
}
