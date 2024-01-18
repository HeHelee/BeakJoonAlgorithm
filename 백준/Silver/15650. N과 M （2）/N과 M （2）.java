import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int M;
    public static boolean visit[];
    public static int arr[];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visit = new boolean[N+1]; //방문 처리
		arr = new int[M]; //문자열 길이를 담을 변수
		
		recursion(0);
		bw.flush();
		bw.close();
		}

	private static void recursion(int depth) throws IOException {
		if (M == depth) {
			for (int i = 0; i<M; i++) {
				bw.write(arr[i] + " ");
			}
			bw.write("\n");
			return;
		}
		
		for (int i = 1; i<=N; i++)  {
			if (!visit[i]) {
				arr[depth] = i;
				visit[i] = true;
				recursion(depth + 1);
				for (int j = i + 1; j<=N; j++) {
					visit[j] = false;
				}
			}
		
		}
		
	}

}
