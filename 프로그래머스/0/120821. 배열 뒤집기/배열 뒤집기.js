function solution(num_list) {
    var answer = [];
    // 구하는 것 : 배열 뒤집기
    // 값을 뒤집어서 출력해야 함.
    for (let i = num_list.length-1; i >= 0; i--) {
        answer.push(num_list[i]);
    }
    return answer;
}