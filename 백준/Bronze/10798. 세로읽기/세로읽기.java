
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    char [][]a = new char[5][15]; //행과 열
	    
	    for(int i = 0; i<a.length; i++) {
	    	//행
	    	String str = br.readLine();
	    	//문자 하나씩 검사하기 위해 문자열을 문자배열에 넣어주기
	    	for (int j = 0; j<str.length(); j++)
	    	{
	    		a[i][j] = str.charAt(j);
	    	}
	    }
	    //출력
	    for(int i = 0; i<15; i++) {
	    	for(int j = 0; j<5; j++){
	    		if(a[j][i] == '\0')
	    			continue;
	    		System.out.print(a[j][i]);
	    	}
	    }
	    
	
		
		
		
	} 
}