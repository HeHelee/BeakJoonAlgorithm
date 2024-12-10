import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a가 b보다 큰 경우
        if (a >= b) {
            if (a >= c) {
                System.out.println(a);
            }else {
                System.out.println(c);
            }
        }
        // b가 a보다 큰 경우
        else {
            if (b >= c) {
                System.out.println(b);
            }else {
                System.out.println(c);
            }

        }


    }
}