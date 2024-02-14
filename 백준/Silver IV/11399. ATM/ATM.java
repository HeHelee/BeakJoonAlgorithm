import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int people[];
    static int sum;
    static int answer;
    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine()); //사람 수
        people = new int[N+1]; //시간 배열
        StringTokenizer st = new StringTokenizer(br.readLine());
        //1. 시간 입력
        people[0] = 0;
        for (int i = 1; i <= N; i++) {
                people[i] = Integer.parseInt(st.nextToken());
        }
        sum = 0; //시간 합계
        answer = 0;
        //2. 정렬
        Arrays.sort(people);
        Time(people);
        //3. 출력
        bw.write(String.valueOf(answer));
        bw.close();
        br.close();
    }

    private static void Time(int[] people) {
        for (int i = 0; i<=N; i++) {
            sum += people[i];
            answer += sum;

        }

    }
}
