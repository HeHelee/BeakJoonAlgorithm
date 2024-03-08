import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int MAX = 25 + 10;
    static int N;
    static int map[][];
    static boolean visited[][];
    static int answer;
    static int dirX[] = {-1,1,0,0};
    static int dirY[] = {0,0,-1,1};
    static int count;
    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        map = new int[MAX][MAX];
        visited = new boolean[MAX][MAX];



        //1.맵 정보 입력하기
        for (int i = 1; i<=N; i++) {
            String[] input = br.readLine().split("");
            for (int j = 1; j<=N; j++) {
                map[i][j] = Integer.parseInt(input[j-1]);
            }
        }

        //2.dfs 호출

        ArrayList<Integer>arr = new ArrayList<>();
        answer = 0;
        for (int i = 1; i<=N; i++) {
            for (int j = 1; j<=N; j++) {
                count = 0;
                if(map[i][j] == 1 && !visited[i][j]) {
                    dfs(i,j);
                    arr.add(count);
                    answer ++;

                }
            }
        }

        //3.출력
        bw.write(String.valueOf(answer));
        bw.newLine();

        Collections.sort(arr);
        for (int a : arr) {
            bw.write(String.valueOf(a) + "\n");
        }
        bw.close();
        br.close();


    }

    private static void dfs(int y, int x) {
        visited[y][x] = true;
        count += 1;

        for (int i = 0; i<4; i++) {
            int newX = x + dirX[i];
            int newY = y + dirY[i];

            if (map[newY][newX] == 1 && visited[newY][newX] == false) {
                dfs(newY,newX);

            }
        }





    }


}
