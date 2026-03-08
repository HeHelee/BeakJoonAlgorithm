let fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

let C = Number(input[0]);

for (let i = 1; i <= C; i++) {
  let line = input[i].split(" ").map(Number);

  let N = line[0]; //학생 수
  let scores = line.slice(1);

  //평균을 구하기
  let sum = scores.reduce((a, b) => a + b, 0);
  let average = sum / N;

  // 평균 넘는 학생 수의 비율을 계산하여 셋째 자리까지 올림
  let count = scores.filter((score) => score > average).length;
  let percentage = ((count / N) * 100).toFixed(3);
  console.log(`${percentage}%`);
}
