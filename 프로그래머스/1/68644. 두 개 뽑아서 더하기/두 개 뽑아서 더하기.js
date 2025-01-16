function solution(numbers) {
    var answer = [];
    // 1. 배열에서 모든 경우의 수를 구한다.
    for (let i = 0; i < numbers.length; i++) {
        for (let j = i + 1; j < numbers.length; j++) {
            answer.push(numbers[i] + numbers[j]);
        }
    }
    // 2. 중복값을 제거한다.
    answer = [...new Set(answer)];
    // 3. 오름차순으로 정렬한다.
    answer.sort((a,b) => a-b);
    return answer;
}