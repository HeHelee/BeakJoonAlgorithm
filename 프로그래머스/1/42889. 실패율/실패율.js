function solution(N, stages) {
    var answer = [];
    // 1. stages의 배열을 새롭게 정렬한다. 
    const challenge = new Array(N+2).fill(0);
    for (const stage of stages) {
        challenge[stage] += 1;
    }
    // 2. stages에 참여하고 있는 처음 전체 인원 수를 구한다.
    let total = stages.length;
    // 2-1. 실패율 (인덱스, 값)을 담을 객체를 생성한다.
    const obj = {};
    // 3. 각각의 실패율을 구한다. (실패율 공식을 이용한다. 반복문)
    for (let i = 1; i <= N; i++) {
        const failure = challenge[i] / total;
        //4. 실패율을 구해서 객체에 넣는다.
        obj[i] = failure;
        //5. 전체인원수 - 각 스테이지에 있는 사람 차감
        total = total - challenge[i];
    }
    // 5. 실패율 객체를 배열로 변환한 후 내림차순한다.
    const newFailure = Object.entries(obj).sort((a,b) => b[1] - a[1]);
    // 6. 각 인덱스의 번호를 출력한다. (객체를 이용해야 할듯)
    return newFailure.map(item => parseInt(item[0]));
}