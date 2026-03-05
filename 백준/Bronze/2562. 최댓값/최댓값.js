let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n").map(Number);

let max = input[0];
let count = 1;

for (let i = 0; i < input.length; i++) {
  if (max < input[i]) {
    max = input[i];
    count = i + 1;
  }
}

console.log(max + "\n" + count);
