let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let N = Number(input[0]);

for (let i = 1; i <= N; i++) {
  let [A, B] = input[i].split(" ");
  // A만큼 B의 문자열 각각을 반복해야 함.
  let result = "";
  for (let j = 0; j <= B.length; j++) {
    result += B.charAt(j).repeat(A);
  }
  console.log(result);
}
