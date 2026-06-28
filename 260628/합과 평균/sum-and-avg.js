const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split(" ");
let a = Number(input[0]);
let b = Number(input[1]);
let sum = a + b;
let avg = sum/2;

console.log(sum + " " + avg.toFixed(1));