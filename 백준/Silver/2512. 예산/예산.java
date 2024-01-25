import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = 0;
		int N = Integer.parseInt(br.readLine());
		int area[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i<area.length; i++) {
			area[i] = Integer.parseInt(st.nextToken());
			max = Math.max(area[i], max);
		}
		int M = Integer.parseInt(br.readLine());
		System.out.println(BinSearch(M,area,0,max));
}

	private static int BinSearch(int M, int[] area,int left,int right) {
		while (left <= right) {
			int mid = (left+right)/2; //상환액
			long budget = 0; 
			for (int i = 0; i<area.length; i++) {
				if (area[i] > mid)
					budget += mid;
				else
					budget += area[i];
			}
			if (budget <= M) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		return right;
	}
}