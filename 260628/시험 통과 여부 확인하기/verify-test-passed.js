const fs = require("fs");
let score = fs.readFileSync(0).toString().trim();

if (score >= 80) {
    console.log("pass");
}else {
    console.log(80-score + " more score")
}

