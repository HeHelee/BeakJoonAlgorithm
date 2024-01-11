import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int dp[][] = new int[30][30]; //배열
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
	    StringTokenizer st;
	   
	    
		for (int i = 0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			//조건
			System.out.println(Combi(M,N));
			}
		}

	private static int Combi(int n, int m) {
		if (dp[n][m] > 0)
			return dp[n][m];
		
		if (n == m || m == 0)
			return dp[n][m] = 1;
		
	    return dp[n][m] = Combi(n-1,m-1) + Combi(n-1,m);
		
	}

	}
