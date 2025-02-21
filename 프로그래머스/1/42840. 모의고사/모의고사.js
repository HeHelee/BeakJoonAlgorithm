function solution(answers) {
    //1. 수포자의 정답 배열을 나열하기
    const patterns = [[1,2,3,4,5],[2,1,2,3,2,4,2,5],[3,3,1,1,2,2,4,4,5,5]];
    
    //2. 점수를 담는 배열
    const scores = [0,0,0];
    
    //3. 답과 각각의 수포자의 답안을 비교해서 scores 배열에 점수 올리기
    for (const [i, answer] of answers.entries()) {
        for (const [j,pattern] of patterns.entries()) {
            if (answer === pattern[i % pattern.length]) {
                scores[j] += 1;
            }
        }
    }
    
    //4. 점수 배열 중 가장 많이 맞은 사람의 인덱스 번호 + 1을 내보내기
    const maxScore = Math.max(...scores);
    
    const answer = scores.map
    ((scores,index) => scores === maxScore ? index+1 : null)
    .filter(index => index !== null)
    
    
    return answer;
}