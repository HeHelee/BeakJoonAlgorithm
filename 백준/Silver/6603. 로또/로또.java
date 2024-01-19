import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 

public class Main {
	static int S[]; // 집합
	static int result[]; // 결과배열
	static int k; // 집합의 갯수
	static boolean visit[]; // 방문 배열
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
		    
			k = Integer.parseInt(st.nextToken());
			if (k == 0)
				break;
           
			S = new int[k];
			for (int i = 0; i < k; i++) {
				S[i] = Integer.parseInt(st.nextToken());
			}
			
			result = new int[6];
			visit = new boolean[k];
			dfs(0, 0);
			
			System.out.println(sb);
			sb = new StringBuilder();
            
		}

	}

	private static void dfs(int start, int depth) {
		if (depth == 6) {
			for (int val : result) {
				sb.append(val).append(' ');
			}
			sb.append("\n");
			return;
		}
		for (int i = start; i < k; i++) {
			if (!visit[i]) {
				visit[i] = true;
				result[depth] = S[i];
				dfs(i, depth + 1);
				visit[i] = false;
			}

		}

	}

}

