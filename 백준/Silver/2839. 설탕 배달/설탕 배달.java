import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //갯수
	    //DP를 이용
		int DP[] = new int[N+1]; 
		if (N>=3)
			DP[3] = 1;
		if (N>=5)
			DP[5] = 1;
		
		for (int i = 6; i<=N; i++) {
			if(i%5 == 0) {
				DP[i] = DP[i-5] + 1;
			}
			else if (i%3 == 0) {
				DP[i] = DP[i-3] + 1;
			}
			else {
				if(DP[i-3] != 0 && DP[i-5] != 0) {
					DP[i] = Math.min(DP[i-3], DP[i-5]) + 1;
				}
			}
		}
		if (DP[N] == 0) {
			System.out.println("-1");
			return;
		}
		System.out.println(DP[N]);
		
		
	}

}
