let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");

let [A, B] = input[0].split(" ");

A = A.split("").reverse().join("");
B = B.split("").reverse().join("");

A = parseInt(A);
B = parseInt(B);
console.log(Math.max(A, B));
