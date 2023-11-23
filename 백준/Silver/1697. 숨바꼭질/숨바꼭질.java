import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int visited[] = new int[100001];
	static int N;
	static int K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 수빈이 위치
		K = Integer.parseInt(st.nextToken()); // 동생 위치
	    int result = bfs(N);
	    System.out.println(result);
	}

	private static int bfs(int nodeIndex) {
		Queue<Integer> q = new LinkedList<>();

		q.offer(nodeIndex); // 큐에 저장
		int index = nodeIndex;
		int now = 0;
		visited[index] = 1;
		while (!q.isEmpty()) {
			now = q.poll(); // 팝

			if (now == K) {
				return visited[now] - 1;
			}

			if (now-1 >= 0 && visited[now-1] == 0) {
				visited[now - 1] = visited[now] + 1;
				q.offer(now - 1);
			}
			if (now + 1 <= 100000 && visited[now+1]==0) {
				visited[now + 1] = visited[now] + 1;
				q.offer(now + 1);
			}
			if (now*2 <= 100000 && visited[now*2]==0) {
				visited[now * 2] = visited[now] + 1;
				q.offer(now * 2);
			}
			
		}
		return -1;
	}

}
