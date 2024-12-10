import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //중앙값 구하기 
        //22 26 30 A < B and B < C => B
        //30 26 22 A > B and B > C => B
        //26 22 30 A > B and A < C => A
        //26 30 22 A < B and A < B => A
        //22 30 26 A < B and B > C => C


        if ((b <= a && a <= c) || (c <= a && a <= b)) {
            System.out.println(a);
        }else if ((a <= b && b <= c) || (b <= a && c <= b)) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}