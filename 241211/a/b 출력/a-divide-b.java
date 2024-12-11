import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a / b + ".");

        // a를 b로 나눈 나머지를 시작으로 소수점 자리를 하나씩 계산합니다.
        a %= b;
        for (int i = 0; i < 20; i++) {
            // 나머지에 10을 곱한 값을 기준으로
            // b를 나누었을 떄의 몫을 구합니다.
            a *= 10;
            System.out.print(a/b);

            //나머지 값 갱신
            a %= b;

        }








    }
}