const fs = require("fs");
let a = fs.readFileSync(0).toString().trim();

if (a < 0) {
    console.log('ice');
} else if (a >= 100) {
    console.log('vapor');
}else{
    console.log('water');
}