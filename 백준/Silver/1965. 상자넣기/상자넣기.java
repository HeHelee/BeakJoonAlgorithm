import java.util.Scanner;

public class Main {
static int N;
static int[] arr,dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		//배열 생성
	    int arr[] = new int[N];
	    int dp[] = new int[N];
	    int answer = Integer.MIN_VALUE;
	    //값 입력
	    for (int i = 0; i<N; i++) {
	    	arr[i] = sc.nextInt();
	    	dp[i] = 1;
	    	for (int j = 0; j<i; j++) {
	    		if(arr[i] > arr[j]) {
	    			dp[i] = Math.max(dp[i], dp[j]+1);
	    		}
	    	}
	    	answer = Math.max(answer,dp[i]);
	    }
	    System.out.println(answer);
	    //dp 테이블 채우기
	    
		

	}

}
