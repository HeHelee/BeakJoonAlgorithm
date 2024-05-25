import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        //0.입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //10^5개의 숫자이다. 1000000000000000개라는 뜻
        //이를 입력받을 자료형이 없어서 문자열로 입력을 받는다.
        String N = br.readLine();
        int sum = 0; //자리수의 합을 더할 배열

        //1.각 자리수의 합을 더한다.
        //N은 문자열이므로 자릿수를 숫자로 변환해야 한다.
        for (int i = 0; i<N.length(); i++) {
            //각 문자를 숫자로 변환하여 합산
            int digit = Character.getNumericValue(N.charAt(i));
            sum += digit;
        }

        //2.뒤에 숫자가 0이 오도록 해야 하므로 문자열을 내림차순 한다.
        //문자열을 문자 배열로 전환
        Character[] charArray = new Character[N.length()];
        for (int i = 0; i<N.length(); i++) {
            charArray[i] = N.charAt(i);
        }

        //문자 배열을 내림차순 정렬
        Arrays.sort(charArray, Collections.reverseOrder());

        //정렬된 문자 배열을 다시 문자열로 변환
        StringBuilder sortedString = new StringBuilder(charArray.length);
        for (char c : charArray) {
            sortedString.append(c);
        }

        //3.조건을 만든다. 각 자리수의 합이 3의 배수인지, 뒤에 자리수가 0인지 확인해야 한다.
        if (sum % 3 == 0 && sortedString.charAt(sortedString.length()-1) == '0') {
            bw.write(sortedString.toString() + "\n");
        } else {
            bw.write("-1\n");
        }

        bw.close();
        br.close();

    }
}
