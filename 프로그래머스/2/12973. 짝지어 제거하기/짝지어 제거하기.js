function solution(s)
{
    //1. 답
    var answer = 0;
    //2. 스택 정의
    const stack = [];
    //3. 알파벳 2개 붙어있는 짝을 찾기
    for (let i = 0; i < s.length; i++) {
        const c = s.charAt(i); 
        //2. 스택이 비어있지 않고 최근 문자와 이전 문자가 같다면 pop
        if (stack.length > 0 && stack[stack.length-1] == c) {
            stack.pop();
        } else {
            //1. 스택이 비어있거나 이전 문자랑 같지 않다면 push
            stack.push(c);
        }
    }
    //5. 남아있는 문자열이 없으면 1, 있으면 0을 반환
    if (stack.length == 0) {
        answer = 1;
    }else {
        answer = 0;
    }
    return answer;
}