function solution(answers) {
    // 문제 분석 : 정답 배열 answers가 주어졌을 때, 가장 많이 문제를 맞힌 사람을 배열에 넣어야 함.
    // 1. patterns 배열 생성 => 정답 배열과 비교해야 해서 필요함.
    const patterns = [[1,2,3,4,5],[2,1,2,3,2,4,2,5],[3,3,1,1,2,2,4,4,5,5]];
    
    //2. 점수를 저장할 배열 추가
    const scores = [0,0,0];
    //2. 정답 배열과 패턴 배열과 비교해야 함.
    for (const [i, answer] of answers.entries()) {
        for (const [j, pattern] of patterns.entries()) {
            //3. 비교를 해서 맞으면 정답을 올려줘야 하고 각각의 점수를 저장해야 함.
            if (answer == pattern[i%pattern.length]) {
                scores[j] += 1;
            }   
        }
    }
    //4. 최대값을 저장
    const highestScore = Math.max(...scores);
    
    //5. 최대값과 일치하는 사람을 출력
    const maxScore = []
    for (let i = 0; i < scores.length; i++) {
        if (highestScore === scores[i]) {
            maxScore.push(i+1);
        }
    }
    return maxScore;
}