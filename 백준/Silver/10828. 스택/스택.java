import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1. 반복해야할 수
        int n = Integer.parseInt(br.readLine());
        //2.스택 선언
        Stack<Integer> stack = new Stack<>();
        //출력
        StringBuilder sb = new StringBuilder();
        //3.반복문
        for(int i = 0; i < n; i++) {
            //4.명령어 입력 받기
            String[] command = br.readLine().split(" ");

            //5.명령어별로 들어가도록
            switch(command[0]) {
                case "push":
                    int num = Integer.parseInt(command[1]);
                    stack.push(num);
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
            }
        }
        // 마지막 줄에는 개행 문자를 추가하지 않습니다.
        System.out.print(sb.toString().trim());
    }
}

