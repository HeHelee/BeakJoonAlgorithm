import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()); //숫자 카드
		int a[] = new int[N]; //배열 생성
        st = new StringTokenizer(br.readLine());
		for (int i = 0; i<a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken()); //숫자 카드 입력
		}
		Arrays.sort(a); //정렬
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i<M; i++) {
			int key = Integer.parseInt(st.nextToken());
			if (BinSearch(a,key,N)) {
				System.out.print(1 + " ");
			}
			else {
				System.out.print(0 + " ");
			}
		}
	}

	

	private static boolean BinSearch(int[] a, int key, int N) {
		int pl = 0;
		int pr = N-1;
		
		do {
			int pc = (pl+pr)/2;
			if (a[pc] == key)
				return true;
			else if (a[pc] < key)
				pl = pc+1;
			else 
				pr = pc-1;
		}while (pl <= pr);
		return false;
	}

}
