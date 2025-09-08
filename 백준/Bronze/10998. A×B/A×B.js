let fs = require("fs");
let input1 = fs.readFileSync("/dev/stdin").toString().split(" ");

let c = Number(input1[0]);
let d = Number(input1[1]);

console.log(c * d);
