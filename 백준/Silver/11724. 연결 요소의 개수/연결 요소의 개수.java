import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
final static int MAX = 1000+10; //예외처리
public static int N;
public static int M;
public static boolean graph [][];
public static boolean visit[];
public static int answer;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//0.입력 및 초기화
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		//1. graph에 연결정보 채우기
	    graph = new boolean[MAX][MAX];
	    visit = new boolean[MAX];
	   
	
	    for (int i = 0; i < M; i++) {
	        st = new StringTokenizer(br.readLine());
	        int x = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());
	        graph [x][y] = true;
	        graph [y][x] = true;	
	    }
	    
	    //2.재귀 함수 호출
	    for (int i = 1; i<=N; i++) {
	    	if (visit[i] == false) {
	        dfs(i);
	    	answer++;
	    }
	  }
	    
	    //3.출력
	    bw.write(String.valueOf(answer));
	    br.close();
	    bw.close();
	}
	
	private static void dfs(int depth) {
		visit[depth] = true; //방문 처리
		
		for (int i = 1; i<=N; i++) {
			if(!visit[i] && graph[depth][i]) {
				dfs(i);
			}
			
		}
		
		
	}

}
