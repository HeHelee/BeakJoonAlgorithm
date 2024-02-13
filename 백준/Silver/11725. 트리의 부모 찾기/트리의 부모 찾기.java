import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    final static int MAX = 100000 + 10;
    static int N;
    static boolean visited[]; //방문 처리 배열
    static ArrayList<Integer>[] graph; //그래프
    static int answer[]; //답변

    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        //1. graph에 연결 정보 채우기
        graph = new ArrayList[MAX];
        for (int i = 1; i<= N; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[MAX]; //방문 처리
        answer = new int [MAX]; //출력

        for (int i = 0; i<N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        //2. dfs(재귀함수 호출)
        dfs(1);
        //3. 출력
        for (int i = 2; i<=N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }
        bw.close();
        br.close();
    }

    private static void dfs(int depth) {
        visited[depth] = true;

        for (int i = 0; i < graph[depth].size(); i++) {
            int next = graph[depth].get(i);
            if (visited[next] == false) {
                answer[next] = depth;
                dfs(next);
            }
        }
    }
}
