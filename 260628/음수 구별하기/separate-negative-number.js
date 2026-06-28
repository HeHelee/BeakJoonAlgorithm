const fs = require("fs");
let num = Number(fs.readFileSync(0).toString().trim());

if (num < 0) {
    console.log(num);
    console.log("minus");
} else {
    console.log(num);
}