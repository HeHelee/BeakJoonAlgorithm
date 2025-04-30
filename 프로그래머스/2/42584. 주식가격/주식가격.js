function solution(prices) {
    var answer = [];
    //1. 이중 for문으로 현재값, 다음값 구하기
    //2. 만약 현재값이 상승이거나 유지, 마지막 값이면 전체 배열의 길이 - 현재 초의 값
    //3. 만약 하락이면 다음 값 - 현재 값
    
    for (let i = 0; i < prices.length; i++) {
        let time = 0;
        for (let j = i+1; j < prices.length; j++) {
            time++;
            if (prices[j] < prices[i])
                break;
        }
        answer.push(time);
    }
    return answer;
}