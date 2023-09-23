import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String room = br.readLine(); //방번호
		int a[] = new int[10]; //0~9까지의 세트
		
		for (int i = 0; i<room.length(); i++)
		{
			int num = room.charAt(i)-'0';
			if (num == 6) {
				num = 9;
				a[num]++;
			}
			else {
				a[num]++;
			}
		}
		a[9] = a[9]/2 + a[9] % 2;
		Arrays.sort(a);
		System.out.print(a[9]);
	}

}
