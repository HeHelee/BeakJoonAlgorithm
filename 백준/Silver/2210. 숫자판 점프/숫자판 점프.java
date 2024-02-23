import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int map[][];
    static HashSet<String> result;
    static int dirY[] = {-1,1,0,0};
    static int dirX[] = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        map = new int[5][5];
        result = new HashSet<String>();

        //1.맵 정보 입력
        for (int i = 0; i<5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j<5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //2.dfs 호출
        String s = new String();
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                dfs(i,j,0,s);
            }
        }

        //3.출력
        System.out.println(result.size());
        bw.close();
        br.close();
    }

    private static void dfs(int y, int x, int depth, String s) {
        if (depth == 6) {
            result.add(s);
            return;
        }

        for (int i = 0; i<4; i++) {
            int newY = y+dirY[i];
            int newX = x+dirX[i];
            if (newY < 0 || newY >= 5 || newX < 0 || newX >= 5) {
                continue;
            }
            dfs (newY,newX,depth+1,s+map[y][x]);

        }
    }
}
