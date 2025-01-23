function solution(N, stages) {
    // 문제의 요지 : 실패율이 높은 스테이지부터 내림차순으로 스테이지 번호가 담긴 
    // 배열을 반환해라
    // 먼저 실패율을 구해야 할듯
    // 실패율 구하는 법 :  클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어의 수
    // 1. 각 스테이지별로 도달한 사람들의 수
    const challenge = new Array(N+2).fill(0);
    for (stage of stages) {
        challenge[stage] += 1;
    }
    // 2. 클리어하지 못한 플레이어의 수
    const fails = {};
    let total = stages.length;
    
    // 3. 실패율 계산
    for (let i = 1; i <= N; i++) {
        if (challenge[i] === 0) {
            fails[i] = 0;
            continue;
        }
        fails[i] = challenge[i]/total;
      
        //3-1 total을 갱신
        total -= challenge[i];
    }
    // 4. 실패율이 높은 것부터 배열에 저장하기 (내림차순)
    const result = Object.entries(fails)
    .sort((a,b) => b[1] - a[1])
    .map((item) => Number(item[0]));

    return result;
}