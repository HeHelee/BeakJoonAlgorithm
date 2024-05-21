import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0; //회의 가능한 갯수

        int N = Integer.parseInt(br.readLine()); //회의 개수
        int H[][] = new int[N][2]; //회의 배열 생성 [0][1] = [0] 시작 [1] 종료

        for (int i = 0; i<H.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H[i][0] = Integer.parseInt(st.nextToken()); //시작 시간
            H[i][1] = Integer.parseInt(st.nextToken()); //종료 시간
        }

        //1.끝나는 시간을 기준으로 배열을 오름차순한다.
        //람다 표기식 이용
        Arrays.sort(H, (a,b) -> {
            //끝나는 시간이 같다면 시작 시간이 빠른 순으로 정렬
            if(a[1] == b[1]) {
                return a[0] - b[0];
            }else {
                return a[1] - b[1];
            }
        });

        //2.첫번째 회의 끝나는 시간 선택하고 초기화
        count = 1;
        int lastFinish = H[0][1]; 

        //3. 각 활동을 확인하여 선택
        for (int i = 1; i < H.length; i++) {
            //두번째 회의 시작이 첫번째 활동 끝나는 시간보다 크다면
            if (H[i][0] >= lastFinish) {
                count ++; //회의 일정 하나 추가
                lastFinish = H[i][1]; //회의 끝나는 시간 업데이트
            }
        }

        //4.출력
        bw.write(String.valueOf(count));
        bw.close();
        br.close();

    }
}
