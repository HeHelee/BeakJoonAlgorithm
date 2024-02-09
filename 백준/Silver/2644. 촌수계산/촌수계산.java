import java.io.*;
import java.util.StringTokenizer;

public class Main {
    final static int MAX = 100+10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N,M,start,end,answer;

    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(br.readLine());

        //1. 그래프에 연결 정보 채우기
        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        answer = -1;

        for (int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        //2.dfs재귀 함수 호출
        dfs(start,0);

        //3.출력
        bw.write(String.valueOf(answer));
        bw.close();;
        br.close();

    }

    private static void dfs(int start, int count) {
        visited[start] = true;
        if (start == end) {
            answer = count;
            return;
        }

        for (int i = 1; i<=N; i++) {
            if (visited[i] == false && graph[start][i] == true) {
                dfs(i,count + 1);
            }

        }

    }
}
