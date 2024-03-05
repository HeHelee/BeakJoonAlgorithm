import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int coins[] = new int[N];
        int count = 0;


        //1.선택 절차 적용 : 가치가 가장 큰 동전부터 선택을 한다.
        for (int i = 0; i<N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        //2.적절성 검사 : 만약 선택된 동전이 K보다 크다면 그 다음 작은 동전으로 선택한다.
        for (int i = N-1; i>=0; i--) {
            if (coins[i] <= K) {
                count += (K/coins[i]);
                K = K % coins[i];
            }
        }
        //3.해답 검사 : 합이 일치하면 문제 해결
        bw.write(String.valueOf(count));
        bw.close();
        br.close();

    }
}
