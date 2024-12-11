import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = a; i <= b; i++) {
            if (a > b) {
                break;
            }
            else if (i % 2 == 1) {
                System.out.print(a + " ");
                a *= 2;
            }else if (i % 2 == 0) {
                System.out.print(a + " ");
                a += 3;
            }
        }
    }
}