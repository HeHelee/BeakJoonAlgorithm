import com.sun.jdi.IntegerValue;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int N;
    static int graph[][];
    static boolean visited[][];
    static int count;
    static int answer;
    static int dirX[] = {-1,1,0,0};
    static int dirY[] = {0,0,-1,1};
    static int MAX = 25 + 10;


    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        count = 0;
        graph = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];

        //1.그래프 정보 입력
        for (int i = 1; i<=N; i++) {
            String input[] = br.readLine().split("");
            for (int j = 1; j<=N; j++) {
                graph[i][j] = Integer.parseInt(input[j-1]);
            }
        }

        //2.dfs 호출
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i<=N; i++) {
            for (int j = 1; j<=N; j++) {
                answer = 0;
                if (!visited[i][j] && graph[i][j] == 1) {
                    dfs(i, j);
                    count ++;
                    arr.add(answer);
                }
            }
        }

        //3. 오름차순 정렬
        Collections.sort(arr);

        //4.출력
        bw.write(String.valueOf(count));
        bw.newLine();
        for (int A : arr) {
            bw.write(String.valueOf(A));
            bw.newLine();
        }
        bw.close();
        br.close();
    }

    private static void dfs(int y, int x) {
        //1. 방문 처리
        visited[y][x] = true;
        answer ++;
        //2. 상하좌우 돌기
        for (int i = 0; i < 4; i++) {
            int newX = dirX[i] + x;
            int newY = dirY[i] + y;
            if (visited[newY][newX] == false && graph[newY][newX] == 1) {
                dfs(newY, newX);
            }

        }

    }
}
