public class Main {
    public static void main(String[] args) {
        double ft = 30.48;
        int m = 160934;

        String result1 = String.format("%.1f",(9.2*ft));
        String result2 = String.format("%.1f",(1.3*m));

        System.out.println("9.2ft = " + result1 +"cm");
         System.out.println("1.3mi = " + result2 + "cm");
    }
}