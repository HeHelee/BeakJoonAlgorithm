import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//현재 위치를 파악할 때 사용
class Point {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int MAX = 100+10;
    static int [][] board, dis;
    static int N,M;
    static int dx[] = {-1,0,1,0};
    static int dy[] = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        //1은 이동, 0은 이동 불가
        //(1,1)에서 출발 -> (N,M)의 최소 칸수
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //0-1. 행과 열 입력
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        //0-2.board,dis 초기화
        board = new int[MAX][MAX];
        dis = new int[MAX][MAX];

        //0-3 값을 입력
        for (int i = 1; i<=N; i++) {
                String input[] = br.readLine().split("");
                for (int j = 1; j <= M; j++) {
                    board[i][j] = Integer.parseInt(input[j-1]);
                }
        }

        //1.BFS 호출
        //(1,1)에서 출발
        BFS(1,1);

        //2.출력 - 최단 거리 값
        bw.write(String.valueOf(dis[N][M]));
        bw.close();
        br.close();
    }

    private static void BFS(int x, int y) {
        //0.큐 생성
        Queue<Point> q = new LinkedList<>();
        //1.값 넣기
        q.offer(new Point(x,y));
        //2.시작점의 거리를 1로 설정, 1로 설정하면서 재방문 방지
        dis[x][y] = 1;
    
        while (!q.isEmpty()) {
            //3.팝
            Point tmp = q.poll();
            //4.상하좌우로 움직이기
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                //5. 나가는 거 방지
                if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && board[nx][ny] == 1 && dis[nx][ny] == 0) {
                    q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }

            }
        }
    }
}