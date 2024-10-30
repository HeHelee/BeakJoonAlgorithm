class Solution {
    public int solution(String s) {
        int answer = 0; //누적값
        //기존 문자와 아닌 문자의 개수를 셈.
        int count = 0;
        int diff = 0;
        //첫글자 x 변수에 넣어줌.
        char x = s.charAt(0);
        //문자열 반복문
        for (int i = 0; i<s.length(); i++) {
            //첫 문자와 그 다음 문자가 같은지 인식
            if (x == s.charAt(i)) {
                //같으면 count 값 증가
                count++;
            } 
            else {
                //다르면 diff 값 증가
                diff++;
            }
            //기존 문자의 개수와 다른 문자의 개수가 같다면
            if (count == diff) {
                answer++;
                count = 0;
                diff = 0;
                
                //처음값 갱신
                if(i+1 < s.length()) {
                    x = s.charAt(i+1);
                }
            }
            
        }
        if (count != 0 || diff != 0) {
            answer++;
        }
        
        return answer;
    }
}