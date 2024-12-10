import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pAge1 = sc.nextInt();
        String pGender1 = sc.next();
        int pAge2 = sc.nextInt();
        String pGender2 = sc.next();

        if ((pAge1>=19 && pGender1.equals("M")) || (pAge2>=19 && pGender2.equals("M"))) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}