import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //1.입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //2. 큐 선언
        Queue<Integer> queue = new LinkedList<>();

        //3.큐 푸쉬
        for (int i = 1; i<=N; i++) {
            queue.offer(i);
        }

        //3.출력
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        //3.로직 구현
        while (queue.size() > 1) {
            //4.K-1번째 값을 Poll
            for (int i = 0; i<K-1; i++) {
                int var = queue.poll();
                queue.offer(var);
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append('>');
        System.out.println(sb);
    }
}

