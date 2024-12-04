import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        double b = (10000 * w) / (h*h);

        if (b>25) {
            System.out.printf("%.0f\n",b);
            System.out.println("Obesity");
        }else{
            System.out.printf("%.0f\n",b);
        }
    }
}