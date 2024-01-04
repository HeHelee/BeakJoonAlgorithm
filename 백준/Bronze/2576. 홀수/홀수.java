
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int min = 100; //최소값
		
		for(int i = 0; i<7; i++) {
			int prime = sc.nextInt();
			
			if (prime % 2 == 1) {
				sum += prime;
				min = Math.min(min, prime);

			}
		}
		
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
