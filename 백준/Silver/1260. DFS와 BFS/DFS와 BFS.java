import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 배열 생성
	static int count;
	static boolean visited[];
	static boolean visited2[];

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 정점의 갯수
		int M = Integer.parseInt(st.nextToken()); // 간선의 갯수
		int V = Integer.parseInt(st.nextToken()); // 시작 정점
		// 방문배열 생성
		visited = new boolean[N + 1];
		visited2 = new boolean[N + 1];
		// 그래프 초기화
		for (int i = 0; i < N + 1; i++) {
			graph.add(new ArrayList<>());
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()); // 간선1
			int v = Integer.parseInt(st.nextToken()); // 간선2
			graph.get(u).add(v); // 그래프 연결
			graph.get(v).add(u);

		}
		// 오름차순 해준다.
		for (int i = 0; i < graph.size(); i++) {
			Collections.sort(graph.get(i));
		}
		count = 1;
		dfs(V); 
		System.out.println();
	    bfs(V);
	}

	private static void bfs(int nodeIndex) {
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(nodeIndex); //팝
		visited2[nodeIndex] = true;
		System.out.print(nodeIndex + " ");
		
		while(!q.isEmpty()) {
			int a = q.poll(); //삽입
			//인접 노드 찾기
			for(int newNode:graph.get(a)) {
				if(visited2[newNode] == false) {
				q.offer(newNode);
		        System.out.print(newNode + " ");
				visited2[newNode] = true;
				}
			}
		}
		

	}

	private static void dfs(int nodeIndex) {
		System.out.print(nodeIndex + " ");
		visited[nodeIndex] = true;
		// 인접 노드 찾기 
		for (int newNode : graph.get(nodeIndex)) {
			if (visited[newNode] == false) {
				dfs(newNode);
			}
		}

	}

}