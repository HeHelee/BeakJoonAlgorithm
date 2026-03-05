let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let a = parseInt(input[0]);

for (let i = 1; i <= a; i++) {
  console.log("*".repeat(i));
}
