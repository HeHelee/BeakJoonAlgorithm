import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int MAX = 3 + 100 + 10;
    static int N;
    static int [][] map;
    static boolean [][] visited;
    static int dirY[] = {1,0};
    static int dirX[] = {0,1};

    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        map = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];

        //1.맵 정보 반영
        for (int i = 1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j<=N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //2. dfs수행
        dfs(1,1);

        //3.출력
        if(visited[N][N]) bw.write("HaruHaru");
        else bw.write("Hing");

        bw.close();
        br.close();
    }

    private static void dfs(int y, int x) {
        visited[y][x] = true;
        int count = map[y][x];

        for (int i = 0; i<2; i++) {
            int newY = y + dirY[i] * count;
            int newX = x + dirX[i] * count;
            if (visited[newY][newX] == false) {
                dfs(newY,newX);
            }
        }
    }


}

