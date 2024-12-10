import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1,3,5,7 => 31일
        // 4,6=> 30일

        // 7월 이상부터 바뀜 
        // 8 ,10 , 12 => 31일
        // 9, 11 => 30일

        if (n == 2) {
            System.out.println("28");
        }else if (n >= 7) {
            if (n % 2 == 0) {
                System.out.println("31");
            }else {
                System.out.println("30");
            }
        }else {
            if (n % 2 == 0) {
                System.out.println("30");
            }else {
                System.out.println("31");
            }
        }


    }
}