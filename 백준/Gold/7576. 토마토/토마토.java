import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//현재 일자를 파악할 때 사용
class Day {
    public int x, y;
    Day(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int MAX = 1001;
    static int N,M;
    static int map[][]; //2차원 배열
    static int dis[][]; //일수 배열
    static int dirX[] = {-1,0,1,0};
    static int dirY[] = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 가로 길이
        N = Integer.parseInt(st.nextToken()); // 세로 길이

        map = new int[MAX][MAX];
        dis = new int[MAX][MAX];

        //1.map 입력
        for (int i = 1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j<=M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        //2. 큐에 익은 토마토 넣기
        Queue<Day> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (map[i][j] == 1) {
                    q.offer(new Day(i, j));
                    dis[i][j] = 1; // 익은 토마토의 시작 일수는 1로 설정
                }
            }
        }

        // 3. BFS 수행
        bfs(q);

        // 4. 결과 계산 및 출력
        int maxDays = 0;
        boolean isAllRipe = true;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (map[i][j] == 0 && dis[i][j] == 0) {
                    isAllRipe = false;
                }
                maxDays = Math.max(maxDays, dis[i][j]);
            }
        }

        if (isAllRipe) {
            bw.write((maxDays - 1) + "\n"); // 시작일이 1이므로 결과에서 1을 빼줍니다.
        } else {
            bw.write("-1\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }


    private static void bfs(Queue<Day> q) {
        while (!q.isEmpty()) {
            Day tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dirX[i];
                int ny = tmp.y + dirY[i];
                if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && map[nx][ny] == 0 && dis[nx][ny] == 0) {
                    q.offer(new Day(nx, ny));
                    map[nx][ny] = 1; // 익은 토마토로 변환
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
}
