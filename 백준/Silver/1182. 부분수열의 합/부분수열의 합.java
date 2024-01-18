import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N;
	public static int S;
	public static int arr[];
    public static int count;
    public static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		//배열 생성
		arr = new int[N];
		//값 입력
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0,0);
		
		System.out.println(S == 0 ? count-1 : count);
		
	}
	
	private static void dfs(int n, int s) {
		if (n == N) {
	    	  if (S == s) {
	    		  count ++;
	    	  }
	          return;
	    	  
	    }

		dfs(n+1,s+arr[n]); //선택했을때
		dfs(n+1,s); //선택안했을때
	}

}
