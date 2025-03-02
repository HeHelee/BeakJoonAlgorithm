function solution(arr1, arr2) {
    // arr1, arr2 각각의 행과 열의 길이
    const ax = arr1.length;
    const ay = arr1[0].length;
    const bx = arr2.length;
    const by = arr2[0].length;
  
    // 결과값을 반환할 배열을 생성하고 초기화
    let answer = Array.from(new Array(ax), () => new Array(by).fill(0));
    
    // 반복문 돌면서 곱해야 함.
    // 1) arr1의 열을 돌아야함.
    // 2) arr2의 행을 돌아야함.
    for (let i = 0; i < ax; i++) {
        for (let j = 0; j < by; j++) {
             for (let k = 0; k < ay; k++) {
                 answer[i][j] += arr1[i][k] * arr2[k][j];
             }
        }
     }
    // 곱한 결과값을 answer 배열에 넣어야 함.
    
    return answer;
}


