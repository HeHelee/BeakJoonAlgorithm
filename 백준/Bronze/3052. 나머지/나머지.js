// 배열에 입력을 받음
let fs = require("fs");
const input = fs
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split("\n")
  .map(Number);

//해당 배열 각각의 원소에 접근해서 42%로 나누고 그거를 배열에 다시 저장
// 그리고 배열의 원소가 같다면 count 값을 누적함.
let arr = [];
for (let i = 0; i < input.length; i++) {
  arr[i] = input[i] % 42;
}

let result = new Set(arr);
console.log(result.size);
