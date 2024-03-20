import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static boolean map[][];
    static boolean visited[];
    static int answer;

    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        map = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        answer = 0;

        //1. 맵 정보 입력
        for (int i = 1; i<=M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = true;
            map[y][x] = true;
        }

        //2. dfs 호출
        dfs(1);

        //3. 답 출력
        bw.write(String.valueOf(answer));
        bw.close();
        br.close();
    }

    private static void dfs(int depth) {
        visited[depth] = true;


        for (int i = 1; i<=N; i++) {
            if(visited[i] == false && map[depth][i] == true) {
                answer ++;
                dfs(i);

            }

        }
    }
}
