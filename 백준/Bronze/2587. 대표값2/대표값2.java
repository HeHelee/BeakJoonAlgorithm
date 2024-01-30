import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[5];
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine());
		// 정렬
		Arrays.sort(arr);
		// 평균값과 중앙값 출력
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		System.out.println(sum / arr.length);
		System.out.println(arr[2]);

	}

}
