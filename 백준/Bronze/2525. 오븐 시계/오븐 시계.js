let fs = require("fs");
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

let line = input[0].split(' ');

let a = parseInt(line[0]);
let b = parseInt(line[1]);
let c = parseInt(input[1]);

let time = a*60 + b + c;
let H = Math.floor(time / 60);
let M = time % 60;

if (H >= 24) {
    H -= 24;
}

console.log(H, M);