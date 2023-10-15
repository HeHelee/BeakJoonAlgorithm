import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 정점을 기록하는
																	// 그래프
	static int[] visited; // 방문할 정점들을 기록할 배열
	static int count; // 방문 순서

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()); // 정점의 수
		int N = Integer.parseInt(st.nextToken()); // 간선의 수
		int R = Integer.parseInt(st.nextToken()); // 시작 정점
		// 방문 배열 생성
		visited = new int[M + 1];
		// 그래프 배열 생성
		for (int i = 0; i < M+1; i++) {
			graph.add(new ArrayList<>());
		}
		// 간선의 수 받기
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			// 그래프 연결
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		// 내림차순
		for (int i = 0; i < graph.size(); i++) {
			Collections.sort(graph.get(i), Collections.reverseOrder());
		}

		count = 1; // 노드 순서 저장
		dfs(R);
		//출력
		for (int i = 1; i<visited.length; i++) {
			sb.append(visited[i]).append("\n");
		}
		System.out.println(sb);

	}

	private static void dfs(int nodeIndex) {
		//방문 처리
		visited[nodeIndex] = count;
		//인접한 노드 찾기
		for(int i = 0; i<graph.get(nodeIndex).size();i++){
			int newNode = graph.get(nodeIndex).get(i);
		//방문하지 않았다면
		if(visited[newNode] == 0) {
			count++;
			dfs(newNode);
		}

		}
	}

}