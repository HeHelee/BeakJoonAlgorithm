import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int count = 0;
        
		for (int i = 0; i < N; i++) {
			int prime = sc.nextInt();
			if (CheckPrime(prime)) {
				count ++;
		    }
		} 
		System.out.println(count);
	}

	private static boolean CheckPrime(int prime) {
		if (prime == 1)
			return false;
		for (int j = 2; j<prime; j++) {
			if (prime % j == 0)
				return false;
		}
		return true;
	}
}

