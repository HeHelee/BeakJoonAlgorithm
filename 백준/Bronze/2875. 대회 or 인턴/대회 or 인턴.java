import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //문제 요약
        //여학생 2명, 남학생 1명 -> 총 3명이 한팀
        //그 중 K명은 인턴으로 대회 참여 불가
        //최대한 많은 팀을 만들어야함.

        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //여학생
        int M = Integer.parseInt(st.nextToken()); //남학생
        int K = Integer.parseInt(st.nextToken()); //인턴쉽
        int count = 0; //팀 갯수

        //1. 팀을 만들 조건
        //여학생은 두명 이상, 남학생은 한명 이상, 전체 학생들 중 인턴쉽에 참여할 학생 K명을 제외한게 3명 이상이어야 함.
        while(N >= 2 && M>=1 && (M+N-K) >= 3) {
            N -= 2;
            M--;
            count ++;
        }

        //2.출력
        bw.write(String.valueOf(count));
        bw.close();
        br.close();
    }
}
