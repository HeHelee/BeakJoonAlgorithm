import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[][] = new int[N][M];
		int b[][] = new int[N][M];
        int sum = 0;
        
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i<N; i++) {
			for (int j = 0; j<M; j++) {
				sum = a[i][j] + b[i][j];
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}
