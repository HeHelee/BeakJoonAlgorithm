import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String,String> morsemap = Map.ofEntries(
                Map.entry(".-", "A"), Map.entry("-...", "B"),
                Map.entry("-.-.", "C"), Map.entry("-..", "D"),
                Map.entry(".", "E"), Map.entry("..-.", "F"),
                Map.entry("--.", "G"), Map.entry("....", "H"),
                Map.entry("..", "I"), Map.entry(".---", "J"),
                Map.entry("-.-", "K"), Map.entry(".-..", "L"),
                Map.entry("--", "M"), Map.entry("-.", "N"),
                Map.entry("---", "O"), Map.entry(".--.", "P"),
                Map.entry("--.-", "Q"), Map.entry(".-.", "R"),
                Map.entry("...", "S"), Map.entry("-", "T"),
                Map.entry("..-", "U"), Map.entry("...-", "V"),
                Map.entry(".--", "W"), Map.entry("-..-", "X"),
                Map.entry("-.--", "Y"), Map.entry("--..", "Z"),
                Map.entry(".----", "1"), Map.entry("..---", "2"),
                Map.entry("...--", "3"), Map.entry("....-", "4"),
                Map.entry(".....", "5"), Map.entry("-....", "6"),
                Map.entry("--...", "7"), Map.entry("---..", "8"),
                Map.entry("----.", "9"), Map.entry("-----", "0"),
                Map.entry("--..--", ","), Map.entry(".-.-.-", "."),
                Map.entry("..--..", "?"), Map.entry("---...", ":"),
                Map.entry("-....-", "-"), Map.entry(".--.-.", "@")
                );
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String[] words = new String[input];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < input; i++) {
            words[i] = st.nextToken();
        }

        for (int i = 0; i<input; i++) {
            String[] tokens = words[i].split(" ");
            for (String token : tokens) {
                String letter = morsemap.get(token);
                System.out.print((letter != null ? letter : "?"));
            }// 각 줄의 끝에 줄 바꿈 추가
        }

    }
}
