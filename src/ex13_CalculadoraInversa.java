import javax.swing.JOptionPane;

public class ex13_CalculadoraInversa {
	public static void main (String[] args) {
		double resultado;
		String num1String=JOptionPane.showInputDialog("Introduce el primer operando");
		int num1=Integer.parseInt(num1String);
		String num2String=JOptionPane.showInputDialog("Introduce el segundo operando");
		int num2=Integer.parseInt(num2String);
		String signo=JOptionPane.showInputDialog("Introduce el signo aritmetico (+ - * / ^ %)");
			switch(signo){
			case "+":
				resultado=num1+num2;
				System.out.println(num1+" + "+num2+" = "+resultado);
				break;
			case "-":
				resultado=num1-num2;
				System.out.println(num1+" - "+num2+" = "+resultado);
				break;
			case "*":
				resultado=num1*num2;
				System.out.println(num1+" * "+num2+" = "+resultado);
				break;
			case "/":
				resultado=(double)num1/num2;
				System.out.println(num1+" / "+num2+" = "+resultado);
				break;
			case "^":
				resultado=Math.pow(num1, num2);
				System.out.println(num1+" ^ "+num2+" = "+resultado);
				break;
			case "%":
				resultado=num1%num2;
				System.out.println(num1+" % "+num2+" = "+resultado);
				break;
			default:
				System.out.println(signo+" no es un signo valido");
				break;			
			}
	}
}
