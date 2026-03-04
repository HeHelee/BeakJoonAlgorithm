let fs = require("fs");
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

let line = input[0].split(' ');

let H = parseInt(line[0]);
let M = parseInt(line[1]);

if (H >= 0 && H <= 23 && M >= 0 && M <= 59) {
    if (M < 45) {
        H -= 1;
        M += 15;
        
        if (H < 0) {
        H = 23;
       }
    } else {
        M -= 45;
    }
 console.log(H + " " + M);
}
