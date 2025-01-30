function solution(arr, divisor) {
    // 목적 : array 배열의 원소 중에서 divisor로 나누어 떨어지는 배열을 반환하기
    // 1. array 배열의 원소마다 접근하기
    // 2. 그 원소를 divisor로 나누기
    // 3. 나누어 떨어진다면 answer 배열에 집어넣어서 반환하기
    // 4. 오름차순
    let answer = [];
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] % divisor == 0) {
            answer.push(arr[i]);
        }
    }
    if (answer.length === 0) {
       return[-1];
    }
      answer.sort((a,b) => a-b);
      return answer;
}