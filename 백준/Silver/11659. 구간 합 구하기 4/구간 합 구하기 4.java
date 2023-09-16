import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //n의 값 입력
		int m = sc.nextInt(); //m의 값 입력
		
		int[] arr = new int[n+1]; //부분 합을 저장할 배열 생성
		arr[0] = 0; //0번째 인덱스는 0으로 초기화
		for(int i = 0; i<n; i++) {
			arr[i+1] = arr[i] + sc.nextInt(); //합으로 배열 생성
		}
		
		for(int i = 0; i<m; i++) {
			int a = sc.nextInt(); //a의 값 입력
			int b = sc.nextInt(); //b의 값 입력
			System.out.println(arr[b]-arr[a-1]);
		}

	}
}
