const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().trim().split("\n");
const n = parseInt(input[0]);

const stack = [];
const result = [];

for (let i = 1; i <= n; i++) {
  const command = input[i].split(" ").map(Number);

  switch (command[0]) {
    case 1:
      stack.push(command[1]);
      break;
    case 2:
      result.push(stack.length > 0 ? stack.pop() : -1);
      break;
    case 3:
      result.push(stack.length);
      break;
    case 4:
      result.push(stack.length === 0 ? 1 : 0);
      break;
    case 5:
      result.push(stack.length > 0 ? stack[stack.length - 1] : -1);
      break;
  }
}

console.log(result.join("\n"));
