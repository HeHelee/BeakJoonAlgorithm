const fs = require("fs");
let money = fs.readFileSync(0).toString().trim();

if (money >= 3000) {
    console.log('book');
}else if (money >= 1000) {
    console.log('mask');
}else {
    console.log('no');
}