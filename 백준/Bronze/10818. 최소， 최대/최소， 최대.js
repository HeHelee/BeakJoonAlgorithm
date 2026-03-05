let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let n = Number(input[0]);

const arr = input[1].split(" ").map(Number);

let min = arr[0];
let max = arr[0];

// 배열의 요소를 조사해야 함.
for (let i = 0; i < arr.length; i++) {
  if (arr[i] > max) {
    max = arr[i];
  }
  if (arr[i] < min) {
    min = arr[i];
  }
}

console.log(min, max);
