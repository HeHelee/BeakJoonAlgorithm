import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
		// 수 입력
		int N = Integer.parseInt(br.readLine());
		int i = 1;
		
		StringBuilder sb = new StringBuilder();
		
		while (i <= N) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int menu = Integer.parseInt(st.nextToken());
			switch (menu) {
			case 1:
				int n = Integer.parseInt(st.nextToken());
				stack.push(n);
				break;
			case 2:
				sb.append(stack.isEmpty()?-1:stack.pop()).append('\n');
				break;
			case 3:
				sb.append(stack.size()).append('\n');
				break;
			case 4:
				sb.append(stack.isEmpty() ? 1 : 0).append('\n');
				break;
			case 5:
				sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
				break;
			}
			i++;
		}
		System.out.print(sb);
		br.close();
	}

}
