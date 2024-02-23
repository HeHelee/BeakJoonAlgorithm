import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    final static int MAX = 25 + 10;
    static int map [][];
    static boolean visited [][];
    static int N,count;
    static int dirY[] = {-1,1,0,0};
    static int dirX[] = {0,0,-1,1};
    static int answer;

    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        map = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];


        //1.맵 정보 입력
        for (int i = 1; i<=N; i++) {
            //문자열이 연속일 때 이 코드 사용하기
            String[] input = br.readLine().split("");
            for (int j = 1; j<=N; j++) {
                map[i][j] = Integer.parseInt(input[j-1]);
            }
        }
        
        //2.dfs호출
        ArrayList<Integer> arr = new ArrayList<>();
        answer = 0;
        for (int i = 1; i<=N; i++) {
            for (int j = 1; j<=N; j++) {
                count = 0;
                if (map[i][j] == 1 && visited[i][j] == false) {
                    dfs(i, j);
                    arr.add(count);
                    answer++;
                }
            }
        }

        //3.출력
        bw.write(String.valueOf(answer));
        bw.newLine();

        Collections.sort(arr);
        for (int i : arr) {
            bw.write(String.valueOf(i) + "\n");
        }


        bw.close();
        br.close();
    }

    private static void dfs(int y, int x) {
        visited[y][x] = true;
        count += 1;

        for (int i = 0; i<4; i++) {
           int newY = y + dirY[i];
           int newX = x + dirX[i];

           if (map[newY][newX] == 1 && visited[newY][newX] == false) {
               dfs(newY,newX);

           }
        }

    }
}
