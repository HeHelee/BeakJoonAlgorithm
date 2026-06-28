const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split(' ');

let a = Number(input[0]);
let b = Number(input[1]);

let r1 = a < b ? 1 : 0;
let r2 = a === b ? 1 : 0;

console.log(r1 + " " + r2);