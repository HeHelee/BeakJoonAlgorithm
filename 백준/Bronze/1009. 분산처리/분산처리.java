import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int T,a,b,r;
    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        //1.반복문
        while(T -- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            r = 1;

            //1-1. a^b 형식으로 값을 곱해줘야 함.
            for (int j = 0; j<b; j++)
                r = (r * a) % 10;
            if (r == 0)
                r = 10;


            //1.2출력
            bw.write(String.valueOf(r));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
