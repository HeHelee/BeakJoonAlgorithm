import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			if (BinarySearch(arr, key, N)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	}

	private static boolean BinarySearch(int[] arr, int key, int n) {
		int pl = 0;
		int pr = n - 1;
		do {
			int pc = (pl + pr) / 2;
			if (arr[pc] == key)
				return true;
			else if (arr[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);
		return false;
	}

}
