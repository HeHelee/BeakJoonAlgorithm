import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()); //조카의 수
		int N = Integer.parseInt(st.nextToken()); //과자의 갯수
		int snack[] = new int[N+1]; //과자 배열
		int max = 0; //최대값
		//입력받기
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i<snack.length; i++) {
			snack[i] = Integer.parseInt(st.nextToken());
			max = Math.max(snack[i],max);
		}

		System.out.println(BinSearch(M,snack,1,max));
		

	}

	private static int BinSearch(int M,int[] snack,int left, int right) {
		int result = 0;
		while (left <= right) {
			int mid = (left + right)/2;
			int cnt = 0;
			for (int i = 0; i<snack.length; i++) {
				cnt += snack[i] / mid;
			}
			if(cnt >= M) {
				result = mid;
				left = mid+1;
			}
			else
				right = mid-1;
		}
	
		
		return result;
	}

}