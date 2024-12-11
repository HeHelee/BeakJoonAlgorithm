import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int c = a + n;

        for (int i = a; i < c; i++) {
            a += n;
            System.out.println(a);
        }
    }
}