import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        //문제 요약
        //A에 카드 B를 덧붙이기
        //두 카드는 인접한 카드
        //업그레이드 된 카드 A의 레벨은 안바뀜
        //카드 합성을 할 때마다 두 카드 레벨의 합만큼 골드를 받는다.
        //골드를 최대한 많이 받도록 하라
        //ATM 문제와 비슷하다.

        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); //카드 개수
        int sum = 0; //
        //카드 배열 생성
        int card[] = new int[N];
        //카드 값 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i<N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        //1. 내림차순으로 정렬
        card = IntStream.of(card)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        //2. 카드 합성
        //인덱스 0번은 무조건 고정
        //[0] + [1]
        //[0] + [2] 이렇게 답을 구한다.
        for (int i = 1; i<N; i++) {
            sum += card[0] + card[i];
        }

        //3. 출력
        bw.write(String.valueOf(sum));
        bw.close();
        br.close();
    }
}
