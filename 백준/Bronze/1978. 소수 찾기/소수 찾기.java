import java.util.Scanner;

public class Main {
static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 0;
		
		for (int i = 0; i<N; i++) {
			num = sc.nextInt();
			if(CheckIsPrimeNumber(num))
				count++;
		}
		System.out.println(count);
		
	}

	private static boolean CheckIsPrimeNumber(int num) {
		if(num<2)
			return false;
		for (int i = 2; i*i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
		
		
		
	}
}
 