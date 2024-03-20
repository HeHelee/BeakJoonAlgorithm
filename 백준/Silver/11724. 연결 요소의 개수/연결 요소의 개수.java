import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int MAX = 1000 + 100;
    static int N,M;
    static int answer;
    static boolean map[][];
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        //0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        //1. 맵 정보 입력
        for (int i = 1; i<=M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = true;
            map[y][x] = true;
        }

        //2. dfs 호출
        for(int i = 1; i<=N; i++) {
            if(!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        //3. 출력
        bw.write(String.valueOf(answer));
        bw.close();
        br.close();
    }

    private static void dfs(int depth) {
        visited[depth] = true;

        for (int i = 1; i<=N; i++) {
            if(!visited[i] && map[depth][i] == true) {
                dfs(i);
            }
        }
    }

}
