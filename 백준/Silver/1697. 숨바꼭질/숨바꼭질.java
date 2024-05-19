import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N,K;
    static int dis[] = new int[100000+10];
    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //나
        K = Integer.parseInt(st.nextToken()); //동생

        //1.bfs 호출
        int result = bfs(N);

        //2.출력
        bw.write(String.valueOf(result));
        bw.close();
        br.close();

    }

    private static int bfs(int depth) {
        //1.큐 생성
        Queue<Integer> q = new LinkedList<>();
        int now = 0;
        //2.값 넣기
        q.offer(depth);
        //3.방문 처리를 함으로서 거리를 구함
        dis[depth] = 1;
        //3.팝
        while(!q.isEmpty()) {
            now = q.poll();
            //now == K 랑 동일할 때
            if (now == K) {
                return dis[now]-1;
            }
            //x-1로 이동할 때
            if(now-1 >= 0 && dis[now-1] == 0) {
                dis[now-1] = dis[now]+1;
                q.offer(now-1);
            }
            //x+1로 이동할 때
            if(now+1 <= 100000 && dis[now+1] == 0){
                dis[now+1] = dis[now]+1;
                q.offer(now+1);
            }
            //2*X로 이동할 때
            if(now*2 <= 100000 && dis[2*now] == 0) {
                dis[now*2] = dis[now]+1;
                q.offer(2*now);

            }
        }
        return -1;
    }
}
