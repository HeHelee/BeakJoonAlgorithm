import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mTest = sc.nextInt();
        int fTest = sc.nextInt();

        if (mTest >= 90 && fTest >= 95) {
            System.out.println(100000);
        }else if (mTest >= 90 && fTest >= 90) {
            System.out.println(50000);
        }else {
            System.out.println(0);
        }



    }
}