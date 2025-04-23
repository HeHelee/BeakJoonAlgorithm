function solution(s) {
    var answer = 0;
    const n = s.length;
    
    //0. 회전해야 함.
    for (let i = 0; i < s.length; i++) {
        const stack = [];
        let isCorrect = true;
 
        for (let j = 0; j < s.length; j++) {
            const c = s[(i+j)%n];
            
            //1. 열린 괄호이면 stack에 push
            if (c === '(' || c === '{' || c === '['){
                stack.push(c);
            }else {
                if (stack.length === 0) {
                    isCorrect = false;
                    break;
                }
            //2. 닫힌 괄호이면 stack을 pop 함 위의 괄호와 맞아야 함.
                const top = stack[stack.length-1];
                if (c === ')' && top === '(') {
                    stack.pop();
                }else if (c === ']' && top === '[') {
                    stack.pop();
                }else if (c === '}' && top === '{') {
                    stack.pop();
                }
                else {
                    isCorrect = false;
                    break;
                }
                
            }
          
        }
          if (isCorrect && stack.length === 0) {
                answer += 1;
            }

    }

    return answer;
}