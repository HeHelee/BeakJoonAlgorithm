import util.java.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        int p1 = sc.nextInt();
        char c2 = sc.next().charAt(0);
        int p2 = sc.nextInt();
        char c3 = sc.next().charAt(0);
        int p3 = sc.nextInt();

        // 첫번째 사람이 A라면
        if (c1 == 'Y' && p1 >= 37) {
            // 첫번째 사람이 A라면 두번째, 새번째가 A라면 Emergency
            if ((c2 == 'Y' && p2 >= 37) || (c3 == 'Y' && p3 >= 37)) {
                System.out.println('E');
            }else {
                System.out.println('N');
            }
        }else {
            if ((c2 == 'Y' && p2 >= 37) && (c3 == 'Y' && p3 >= 37)) {
                System.out.println('E');
            }else {
                System.out.println('N');
            }
        }







    }
}