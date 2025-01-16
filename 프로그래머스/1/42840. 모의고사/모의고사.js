function solution(answers) {
   //1. 수포자 패턴을 분석
   patterns = [[1,2,3,4,5],[2,1,2,3,2,4,2,5],[3,3,1,1,2,2,4,4,5,5]];
   //2. 문제를 많이 맞힌 수포자를 담을 배열
   const scores = [0,0,0];
    
   //3. 정답과 패턴을 비교
   for (const [i,answer] of answers.entries()){
       for (const [j,pattern] of patterns.entries()) {
           if (answer === pattern[i%pattern.length]) {
               scores[j] += 1;
           }
       }
   }
   //4. 최고점을 저장
    const maxScores = Math.max(...scores);
   //5. 최고점에 해당하는 사람 answer 배열에 추가하기
    const highestScore = [];
    for (let i = 0; i < scores.length; i++) {
        if (maxScores === scores[i]) {
            highestScore.push(i+1);
        }
    }
   return highestScore;
}