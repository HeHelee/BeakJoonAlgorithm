import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    final static int MAX = 1000 + 10;
    static boolean graph [][];
    static boolean visited [];
    static ArrayList<Integer> queue;
    static int N,M,V;

    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        //1.graph에 연결 정보 채우기
        for (int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        //2.dfs(재귀함수 호출)
        dfs(V);
        System.out.println();
        
        //3.bfs
        bfs();

    }

    private static void bfs() {
        //0.초기화 작업
        queue = new ArrayList<>();
        visited = new boolean[MAX];

        queue.add(V);
        visited[V] = true;

        while(!queue.isEmpty()) {
            int idx = queue.remove(0);
            System.out.print(idx + " ");

            for (int i = 1; i<=N; i++) {
                if (visited[i] == false && graph[idx][i] == true) {
                    queue.add(i);
                    visited[i] = true;
                }
            }

        }

    }

    private static void dfs(int depth) {
        visited[depth] = true;
        System.out.print(depth + " ");
        for (int i = 1; i<=N; i++) {
            if (visited[i] == false && graph[depth][i] == true) {
                dfs(i);
            }
        }
    }
}
