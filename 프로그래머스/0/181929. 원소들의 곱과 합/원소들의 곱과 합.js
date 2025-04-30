function solution(num_list) {
    var answer = 0;
    // 모든 원소들의 곱을 구할 것
    // 모든 원소들의 합을 구한 후 합만큼 곱하기
    // 곱보다 작으면 1, 크면 0
    let multiple = 1;
    let sum = 0;
    for (let i = 0; i < num_list.length; i++) {
        multiple *= num_list[i];
        sum += num_list[i];
    }
    sum *= sum;
    answer = multiple < sum ? 1 : 0;
    return answer;
}