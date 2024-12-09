import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (12 <= month || month <= 2) {
            System.out.println("Winter");
        }else if (month <= 5) {
            System.out.println("Spring");
        }else if (month <= 8) {
            System.out.println("Summer");
        }else {
            System.out.println("Fall");
        }
    }
}