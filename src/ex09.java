
public class ex09 {
	public static void main (String[] args) {
		int i=1;
		int divisible;
		while(i>=1 && i<=100) {
			divisible=i;
			if(divisible%2==0 || divisible%3==0) {
				System.out.print(divisible+ " ");
			}
			i++;
		}
	}
}
