import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //1부터 n까지 게임 진행
        for (int i = 1; i <= n; i++) {
            //수가 3의 배수
            if (i % 3 == 0) {
                System.out.print(0 + " "); 
            } else if (i % 10 == 3 || i % 6 == 6 || i % 9 == 9){
                System.out.print(0 + " ");
            }else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                System.out.print(0 + " ")
            }
            else {
                System.out.print(i + " ");
            }
        }

    }
}