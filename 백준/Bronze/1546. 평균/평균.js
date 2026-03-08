// N을 입력받고
// 자신의 점수 중 최고점을 고르고 이 값은 M
// 모든 점수를 점수/M*100으로 고쳐서 평균을 구하는 프로그램

let fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

let N = Number(input[0]);
let scores = input[1].split(" ").map(Number);

let M = Math.max(...scores);
let newScores = scores.map((score) => (score / M) * 100);
let average = newScores.reduce((a, b) => a + b, 0) / N;

console.log(average);
