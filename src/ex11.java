import javax.swing.JOptionPane;

public class ex11 {
	public static void main(String[] args) {

		boolean diaValido=false;
		while(!diaValido){
			String dia=JOptionPane.showInputDialog("¿Que dia de la semana eliges?");
			boolean diaCheck=dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles") || 
					dia.equals("Jueves") || dia.equals("Viernes") || dia.equals("Sabado") || 
					dia.equals("Domingo");
				if(diaCheck){
					diaValido=true;
					switch(dia) {
					case "Lunes":
						System.out.println("El " +dia+ " es laborable");
						break;
					case "Martes":
						System.out.println("El " +dia+ " es laborable");
						break;
					case "Miercoles":
						System.out.println("El " +dia+ " es laborable");
						break;
					case "Jueves":
						System.out.println("El " +dia+ " es laborable");
						break;
					case "Viernes":
						System.out.println("El " +dia+ " es laborable");
						break;
					case "Sabado":
						System.out.println("El " +dia+ " no es laborable");
						break;
					case "Domingo":
						System.out.println("El " +dia+ " no es laborable");
						break;
					}
				}else {
					System.out.println(dia+" no es un dia de la semana valido.");
				}
		}
			
		
	}
}
