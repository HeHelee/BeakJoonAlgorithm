import java.io.*;
import java.util.*;

public class Main{
    static int MAX = 100000;
    static int N,M,R;
    static ArrayList<Integer>[] arr;
    static int visited[];
    static int count = 1;

    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //정점의 수
        M = Integer.parseInt(st.nextToken()); //간선의 수
        R = Integer.parseInt(st.nextToken()); //사작 정점


        //ArrayList 초기화
        arr = new ArrayList[N+1];
        visited = new int[N+1];

        //정점에 대한 ArrayList 초기화
        for (int i = 1; i<=N; i++){
            arr[i] = new ArrayList<>();
        }


        //1.간선 정보 연결
        for (int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u].add(v);
            arr[v].add(u);
        }

        //2.오름차순 정렬
        for (int i = 1; i<=N; i++) {
            Collections.sort(arr[i]);
        }

        //3.bfs 호출
        bfs(R);

        //4.출력
        for (int i = 1; i<=N; i++) {
            bw.write(String.valueOf(visited[i]+"\n"));
        }
        bw.close();
        br.close();
    }

    private static void bfs(int depth) {
        //1. 큐 생성
        Queue<Integer> q = new LinkedList<>();
        //2.큐에 값 추가
        q.offer(depth);
        visited[depth] = count++; //방문 순서
        //3.반복 bfs
        while (!q.isEmpty()) {
           int current = q.poll();
           for (int i = 0; i<arr[current].size(); i++) {
               int next = arr[current].get(i);
               if (visited[next] == 0) {
                   q.offer(next);
                   visited[next] = count++;

               }
           }
        }
    }
}

