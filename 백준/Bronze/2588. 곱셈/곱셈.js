// 입력
let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let a = input[0];
let b = input[1];

num_1 = b[2];
num_2 = b[1];
num_3 = b[0];

console.log(Number(a) * Number(num_1));
console.log(Number(a) * Number(num_2));
console.log(Number(a) * Number(num_3));
console.log(Number(a) * Number(b));
