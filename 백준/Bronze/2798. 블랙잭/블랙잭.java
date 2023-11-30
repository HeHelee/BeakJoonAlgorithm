import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 카드의 갯수
		int M = sc.nextInt(); // 카드의 합
		int arr[] = new int[N]; // 배열 생성
		int result = 0;
		int temp = 0;
		// 값 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// 카드 고르기
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					temp = arr[i] + arr[j] + arr[k];
					if (result <= temp && temp <= M) {
						result = temp;
					}
				}
			}
		}
		System.out.println(result);

	}

}
