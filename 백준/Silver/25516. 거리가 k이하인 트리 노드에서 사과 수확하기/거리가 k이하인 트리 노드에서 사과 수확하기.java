import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    final static int MAX = 100000+10;
    static int N,K;
    static ArrayList<Integer> graph[];
    static boolean visited[];
    static int apple[];
    static int answer;

    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        //1.그래프 입력 정보
        graph = new ArrayList[MAX];
        for (int i = 0; i<N; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[MAX];
        apple = new int[MAX];

        for (int i = 0; i<N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<N; i++) {
            apple[i] = Integer.parseInt(st.nextToken());
        }

        //2.dfs 호출
        answer = 0;
        dfs(0,0);
        //3. 출력

        bw.write(String.valueOf(answer));
        bw.close();
        br.close();
    }

    private static void dfs(int depth,int count) {

        visited[depth] = true;

        if (apple[depth] == 1 && count <= K) {
            answer ++;
        }

        for (int i = 0; i<graph[depth].size(); i++) {
            int next = graph[depth].get(i);
            if (!visited[next]) {
                dfs(next,count+1);
            }
        }
    }
}
