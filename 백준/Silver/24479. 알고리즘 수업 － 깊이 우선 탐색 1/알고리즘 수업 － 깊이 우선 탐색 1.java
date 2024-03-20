import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int MAX = 100000 + 100;
    static int N,M,R;
    static ArrayList<Integer>[] map;
    static int visited[];
    static int order;

    public static void main(String[] args) throws IOException {
        //0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        //1. 맵 정보 입력하기
        map = new ArrayList[MAX];
        for (int i = 1; i<=N; i++) {
            map[i] = new ArrayList<>();
        }

        visited = new int[MAX];
        order = 1;

        for (int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map[u].add(v);
            map[v].add(u);
        }
        //2.오름차순
        for (int i = 1; i<=N; i++) {
            Collections.sort(map[i]);
        }

        //3. dfs호출
        dfs(R);

        //4. 출력
        for (int i = 1; i<=N; i++) {
            bw.write(String.valueOf(visited[i]));
            bw.newLine();
        }
        bw.close();
        br.close();

    }

    private static void dfs(int depth) {
        visited[depth] = order;
        order ++;
        for (int i = 0; i<map[depth].size(); i++) {
            int next = map[depth].get(i);
            if (visited[next] == 0)
                dfs(next);
        }
    }
}
