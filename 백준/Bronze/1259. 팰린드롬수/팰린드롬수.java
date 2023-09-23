import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 반복문
		while (true) {

			String s = sc.next();
			Boolean bool = true;

			if (s.charAt(0) == '0')
				break;
			for (int i = 0; i < s.length() / 2; i++) {
				if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
					bool = false;
				}
			}
			if(bool)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}