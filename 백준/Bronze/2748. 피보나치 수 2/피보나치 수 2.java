import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] arr = new long[91]; //배열 생성
		arr[0] = 0;
		arr[1] = 1;
		int num = Integer.parseInt(br.readLine());
		for (int i = 2; i<=num; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println(arr[num]);
		

	}

}
