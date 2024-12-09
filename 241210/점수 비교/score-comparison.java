import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int matA = sc.nextInt();
       int engA = sc.nextInt();
       int matB = sc.nextInt();
       int engB = sc.nextInt();

       if (matA > matB && engA > engB) {
        System.out.println(1);
       }else {
        System.out.println(0);
       }

    }
}