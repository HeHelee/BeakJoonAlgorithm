import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Deque<int[]> list = new ArrayDeque<>();
       	StringTokenizer st = new StringTokenizer(br.readLine());
       	
        int[] poong = new int[N+1];
        for (int i = 1; i <= N; i++) {
            poong[i] = Integer.parseInt(st.nextToken());
        }
        
    	StringBuilder sb = new StringBuilder();
        sb.append("1 ");
        int move = poong[1]; //움직여야 하는 이동값
        
        //큐에 값을 넣어줘야 함.
        for (int i = 2; i <= N; i++) {
             list.add(new int[] {i, poong[i]});
        }
     
        //양수일 때 
        while (!list.isEmpty()) {
        	if (move > 0) {
        		//순서 앞으로 돌리기
        		for (int i = 1; i<move; i++) {
        			list.add(list.poll());
        		}
        			int[] nxt = list.poll();
        			move = nxt[1];
        			sb.append(nxt[0] + " ");
        		
        		
        		
        	}
        	else {
        		//순서 뒤로 돌리기
        		for (int i = 1; i < -move; i++) {
        			list.addFirst(list.pollLast());
        		}
        		int[] nxt = list.pollLast();
        		move = nxt[1];
        		sb.append(nxt[0]+ " ");
        		
        	}
        }
        br.close();
        System.out.println(sb);
        

    }
}

