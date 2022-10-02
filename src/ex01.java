
public class ex01 {

		public static void main (String[] args) {
			int num1=10;
			int num2=4;
			
			System.out.println("El primer número es " +num1+ " y el segundo es "+num2);
			
			if (num1==num2) {
				System.out.println("Los números son iguales");
			}else if(num1>num2) {
				System.out.println(num1+ " es mayor que "+num2);
			}else{
				System.out.println(num1+ " es menor que "+num2);
			}
		}
}
