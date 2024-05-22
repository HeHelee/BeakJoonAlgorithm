import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //문제 요약
        //동전의 갯수 N종류
        //그 가치의 합을 K로 만듬
        //필요한 동전의 최소 갯수
        //=> 전형적인 동전 그리디 문제

        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //동전 갯수
        int total = Integer.parseInt(st.nextToken()); //총합
        int coin[] = new int[N]; //동전의 가치를 저장할 배열
        int count = 0; //동전의 갯수를 저장

        //동전의 가치를 저장함
        for (int i = 0; i<coin.length; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        //1.총합을 동전의 제일 큰수부터 나눈다.
        //총합보다 동전의 가치가 크면 안됨.
        //총합보다 동전의 가치가 작지만 그 중에서도 큰 동전의 가치로 나누고
        //count 배열에 동전의 갯수를 추가한다.
        //그리고 total은 동전의 가치로 나눈 나머지로 업데이트 한다. = 거스름돈.
        for (int i = N-1; i >= 0; i--) {
            if (total >= coin[i]) {
                count += (total / coin[i]);
                total = (total % coin[i]);
            }
        }

        //2. 출력
        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }
}