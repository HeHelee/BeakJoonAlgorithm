import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int count;
    static int MAX = 1000 + 100;
    static int N,M;
    static boolean graph[][];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        //0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        count = 0;

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        //1. 그래프 연결
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        //2. dfs 호출
        for (int i = 1; i<=N; i++) {
            if (!visited[i]) {
                dfs(i);
                count ++;
            }
        }
        //3. 출력
        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }

    private static void dfs(int depth) {
        //0.visited 배열 참
        visited[depth] = true;

        for (int i = 1; i<=N; i++) {
            if(!visited[i] && graph[depth][i]) {
                dfs(i);
            }
        }
    }
}
