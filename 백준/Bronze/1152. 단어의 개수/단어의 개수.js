let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

// 공백을 기준으로 문자열을 나눠야 함.
// 나눠진 문자열의 개수를 세어야 함.
let line = input[0]
  .trim()
  .split(" ")
  .filter((word) => word !== "");
console.log(line.length);

