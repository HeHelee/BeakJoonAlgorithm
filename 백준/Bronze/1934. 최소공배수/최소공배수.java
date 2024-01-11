import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i<T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt(); 
			int gcd = getGCD(A,B);
			System.out.println((A*B)/gcd);
		}

	}

	private static int getGCD(int a, int b) {
		if (a % b == 0)
			return b;
		return getGCD(b,a%b);
	}

}