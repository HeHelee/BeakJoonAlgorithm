import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int A;
	static int K;
	static int visited[] = new int[10000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		int result = bfs(A);
		System.out.println(result);

	}

	private static int bfs(int nodeIndex) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(nodeIndex);
		visited[nodeIndex] = 1;
		int now = 0;
		while(!q.isEmpty()) {
			now = q.poll();
			if(now == K) {
				return visited[now]-1;
			}
			if(now+1 <= 10000000 && visited[now+1] == 0) {
				visited[now+1] = visited[now] + 1;
				q.offer(now+1);
			}
			if(now*2 <= 10000000 && visited[now*2] == 0) {
				visited[now*2] = visited[now] + 1;
				q.offer(now*2);
			}
		}
		
		return 0;
	}

}