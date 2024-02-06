import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int N;
	public static int M;
	public static boolean visit[];
	public static int out[];
	public static int a[];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		a = new int[N]; // 배열 생성 입력받기
		visit = new boolean[N]; // 방문 처리
		out = new int[M]; // 문자열 길이 출력 배열

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(a);

		dfs(0); 
		bw.flush();
		bw.close();
	}

	private static void dfs(int depth) throws IOException {
		if (depth == M) { // 출력
			for (int i = 0; i < M; i++) {
				bw.write(out[i] + " "); 
			}
			bw.write("\n");
			return;
		}

			int before = 0; // 이전 값
			for (int i = 0; i < N; i++) {
				if (visit[i])
					continue;

				if (before != a[i]) {
					visit[i] = true;
					out[depth] = a[i];
					before = a[i];
					dfs(depth + 1);
					visit[i] = false;
				}

			}
		}

	}

