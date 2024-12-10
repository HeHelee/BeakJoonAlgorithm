import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //중앙값 구하기 
        // a가 b보다 클경우
        // 26 22 21 or 26 22 30
        if (a >= b) {
            if (a >= c) {
                System.out.println(b);
            }else {
                System.out.println(a);
            }
        }
        // b가 a보다 클 경우
        // 22 26 30 or 22 26 21
        else {
            if (a <= c) {
                System.out.println(a);
            }else {
                System.out.println(b);
            }


        }
    }
}