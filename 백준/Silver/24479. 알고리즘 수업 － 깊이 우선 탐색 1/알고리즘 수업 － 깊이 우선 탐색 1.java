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

	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 정점들의 정보를													// 기록할 그래프
	static int[] visited; // 방문할 정점들을 기록할 배열
	static int count; // 방문 순서

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());

		int M = Integer.parseInt(st.nextToken()); // 정점의 수
		int N = Integer.parseInt(st.nextToken()); // 간선의 수
		int R = Integer.parseInt(st.nextToken()); // 시작 정점

		visited = new int[M + 1];

		// graph의 인덱스를 정점의 개수만큼 만들어줌
		for (int i = 0; i < M+1; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			// 그래프를 서로 연결해준다.
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		// 오름 차순 해준다.
		for (int i = 0; i < graph.size(); i++) {
			Collections.sort(graph.get(i));
		}
		// 시작 정점도 순서에 포함하므로 count 1추가
		count = 1;

		// 깊이 우선 탐색 재귀 시작
		dfs(R);
		
		for (int i = 1; i< visited.length; i++) {
			sb.append(visited[i]).append("\n");
		}
		System.out.println(sb);

	}

	private static void dfs(int nodeIndex) {
		visited[nodeIndex] = count;// 현재 방문하고 있는 정점에 순서 저장

		// 노드에 인접한 노드 찾기
	    for(int i = 0; i<graph.get(nodeIndex).size();i++) {
	    	int newNode = graph.get(nodeIndex).get(i);
	    	if(visited[newNode] == 0) {
	    		count++;
	    	    dfs(newNode);
	    	}
	    }

	}
}
