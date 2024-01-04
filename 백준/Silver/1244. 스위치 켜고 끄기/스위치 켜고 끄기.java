import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //스위치 갯수
		int switches[] = new int[N]; //스위치 번호
		StringTokenizer st = new StringTokenizer(br.readLine());
		//스위치 상태 입력받기
		for (int i = 0; i<switches.length; i++) {
			switches[i] = Integer.parseInt(st.nextToken());
		}
		//학생 수
		int StuCnt = Integer.parseInt(br.readLine()); //학생의 명수
		for (int i = 0; i<StuCnt; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken()); //성별
			int number = Integer.parseInt(st.nextToken()); //숫자
			//남학생
			if(gender == 1) {
			    for(int j = 0; j<switches.length; j++) {
			    	if ((j+1) % number == 0) {
			    		switches[j] = switches[j] == 0? 1 : 0;
			    	}
			    }
			}
			//여학생
			else {
				switches[number-1] = switches[number-1] == 0 ? 1 : 0;
				for(int j = 0; j<switches.length/2; j++) {
					if (number - 1 + j >= N || number- 1 - j < 0)
						break;
					if (switches[number-1-j] == switches[number-1+j]) {
						switches[number-1-j] = switches[number-1-j] == 0 ? 1 : 0;
						switches[number-1+j] = switches[number-1+j] == 0 ? 1 : 0;
					}
					else break; //대칭 아닌 것이 나오면 바로 끝낸다.
				}
				
			
			}
			
		}
		//출력
		for (int i = 0; i<switches.length; i++) {
			System.out.print(switches[i] + " ");
			if ((i+1) % 20 == 0)
				System.out.println();
		}
		

	}

}