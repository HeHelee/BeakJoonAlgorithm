import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    final static int MAX = 10000000 + 10;
    static int N, M, R;
    static boolean [] visited;
    static int [] answer;
    static ArrayList<Integer>[] graph;
    static int order;

    public static void main(String[] args) throws IOException {
        // 0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //정점
        int M = Integer.parseInt(st.nextToken()); //간선
        int R = Integer.parseInt(st.nextToken()); //시작 정점

        // 1.graph에 연결 정보 채우기
        graph = new ArrayList[MAX];
        for (int i = 1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[MAX]; //방문 배열
        answer = new int[MAX]; //출력배열
        order = 1; //현재 dfs를 방문하는 순서

        for (int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }
        // 2.오름차순 정렬
        for (int i = 1; i<=N; i++) {
            Collections.sort(graph[i]);
        }

        // 3.dfs(재귀함수 호출)
        dfs(R);
        // 4.출력
        for (int i = 1; i<=N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }
        bw.close();
        br.close();
    }

    private static void dfs(int depth) {
        visited[depth] = true;
        answer[depth] = order;
        order ++;

        for (int i = 0; i<graph[depth].size(); i++) {
            int next = graph[depth].get(i);
            if (visited[next] == false) {
                dfs(next);
            }
        }

    }
}
