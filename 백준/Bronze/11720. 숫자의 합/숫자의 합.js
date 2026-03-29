let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let N = Number(input[0]);
let numbers = input[1].trim();

let sum = 0;
for (let i = 0; i < N; i++) {
  sum += Number(numbers[i]);
}

console.log(sum);
