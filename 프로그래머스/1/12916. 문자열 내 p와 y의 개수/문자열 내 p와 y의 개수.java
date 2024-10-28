class Solution {
    boolean solution(String s) {
        //1. 배열 값 선언
        boolean answer = true;
        //2. 문자열 대문자로 변경
        s = s.toUpperCase();
        //3. p와 y의 문자 갯수 구하기 (각각 변수 저장)
        int p,y = 0;
        p = s.length() - s.replace("P", "").length();
        y = s.length() - s.replace("Y", "").length();
        //4. 같거나 없다면 true
        if (p == y) {
        answer = true;
        }
        else {
            //5. 다르면 false
            answer = false;
         }
        
        return answer;
    }
}