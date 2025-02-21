function solution(numbers) {
    // 정답 배열 : 오름 차순으로 정렬한 배열
    // 1. 배열을 돌아야 함. (조건은 해당 인덱스보다 크게)
    // 2. 해당 값을 다음 값과 더해서 새로운 배열에 넣기
    // 3. 새로운 배열에서 중복 값 제거하고 오름차순으로 정렬해서 반환하기
    
    let arr = new Array();
    let sum = 0;
    
    for (let i = 0; i < numbers.length; i++) {
       for (let j = i + 1; j < numbers.length; j++) {
          sum = numbers[i] + numbers[j];
          arr.push(sum);
       }
    }
    
    var answer = [...new Set(arr)];
    answer.sort((a,b) => a-b);
    return answer;
}