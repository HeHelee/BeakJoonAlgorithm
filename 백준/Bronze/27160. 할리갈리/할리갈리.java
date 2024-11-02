import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 0. 초기화 (입력)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. Map 생성
        Map<String, Integer> map = new HashMap<>();
        // 2. 입력 갯수 값
        int N = Integer.parseInt(br.readLine());
        String key = null;;
        int value = 0;

        // 3. 반복문 돌면서 Key와 Value 값 저장
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
             key = st.nextToken();
             value = Integer.parseInt(st.nextToken());
            addToMap(map, key, value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 5) {
            System.out.println("YES");
            return;
           }
        }
        System.out.println("NO");
    }

    // 4. Key 값이 같으면 Value 값만 갱신하기
    private static void addToMap(Map<String, Integer> map, String key, int value) {
        map.put(key, map.getOrDefault(key,0)+value);
    }
}
