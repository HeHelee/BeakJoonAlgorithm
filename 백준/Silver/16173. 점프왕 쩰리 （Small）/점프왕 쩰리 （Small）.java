import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int num; // 수
	static int map[][]; // 맵 크기
	static boolean[][] visited; // 방문 저장 배열

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		num = Integer.parseInt(st.nextToken()); // 크기
		map = new int[num][num]; // 배열 생성
		visited = new boolean[num][num]; //방문 저장 배열
		// 값 입력
		for (int i = 0; i < map.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < map[i].length; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		System.out.println(dfs(0, 0));

	}

	private static String dfs(int x, int y) {
		int count = map[x][y];
		visited[x][y] = true;
		//성공 조건(종료)
		if(count == -1) {
			return "HaruHaru";
		}
		//이동 조건
		if (x+count < num && !visited[x+count][y] && !dfs(x+count,y).equals("Hing")) {
			return "HaruHaru";
		} //행
		if(y+count < num && !visited[x][y+count] && !dfs(x,y+count).equals("Hing")) {
			return "HaruHaru";
		} //열

		return "Hing";
	}

}
