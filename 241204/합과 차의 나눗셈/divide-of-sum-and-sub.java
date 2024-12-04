import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();

       double result1 = a+b;
       double result2 = a-b;

       double result3 = result1/result2;

       System.out.printf("%.2f",result3);
    }
}