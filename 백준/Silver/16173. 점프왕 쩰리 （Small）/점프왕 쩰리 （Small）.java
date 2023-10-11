import java.util.*;
public class Main {
static int num;
static int[][] a; //맵
static boolean[][] vistied; //방문 횟수

	public static void main(String[] args) {
		//배열 생성(값 입력)
		Scanner sc = new Scanner(System.in);
		//요솟값 입력
		num = sc.nextInt();
		a = new int[num][num];
		
		vistied = new boolean[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++)
				a[i][j] = sc.nextInt();
		}
		
		System.out.println(dfs(0,0));
	}

	private static String dfs(int x, int y) {
		int count = a[x][y];
		
		vistied[x][y] = true;
		//성공 (종료 조건)
		if(count == -1) {
			return "HaruHaru";
		}
		if(x + count < num && !vistied[x+count][y] && !dfs(x+count,y).equals("Hing")) {
			return "HaruHaru";
		}
		if(y+count < num && !vistied[x][y+count] && !dfs(x,y+count).equals("Hing")){
			return "HaruHaru";
		}
		//실패(종료 조건)
		return "Hing";
		
		
	}


}
