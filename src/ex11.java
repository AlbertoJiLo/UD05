import javax.swing.JOptionPane;

public class ex11 {
	public static void main(String[] args) {

		boolean diaValido=false;
		while(!diaValido){
			String dia=JOptionPane.showInputDialog("¿Que dia de la semana eliges?");
			dia=dia.toLowerCase();
			boolean diaCheck=dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || 
					dia.equals("jueves") || dia.equals("viernes") || dia.equals("sabado") || 
					dia.equals("domingo"); //Comprobamos que el dato introducido es un día de la semana
				if(diaCheck){
					diaValido=true;
					switch(dia) {
					case "lunes":
						System.out.println("El " +dia+ " es laborable");
						break;
					case "martes":
						System.out.println("El " +dia+ " es laborable");
						break;
					case "miercoles":
						System.out.println("El " +dia+ " es laborable");
						break;
					case "jueves":
						System.out.println("El " +dia+ " es laborable");
						break;
					case "viernes":
						System.out.println("El " +dia+ " es laborable");
						break;
					case "sabado":
						System.out.println("El " +dia+ " no es laborable");
						break;
					case "domingo":
						System.out.println("El " +dia+ " no es laborable");
						break;
					}
				}else {
					System.out.println(dia+" no es un dia de la semana valido.");
				}
		}
			
		
	}
}
