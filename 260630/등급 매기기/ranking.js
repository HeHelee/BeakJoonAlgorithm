const fs = require("fs");
let score = fs.readFileSync(0).toString().trim();

if (score >= 90) {
    console.log('A');
}else if (score >= 80) {
    console.log('B');
}else if (score >= 70) {
    console.log('C');
}else if (score >= 60) {
    console.log('D');
}else {
    console.log('F');
}