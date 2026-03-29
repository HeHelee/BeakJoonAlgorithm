let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().split("\n");
let N = Number(input[0]);

let count = 0;

for (let i = 1; i <= N; i++) {
  let str = input[i].trim();
  if (check(str)) {
    count++;
  }
}

console.log(count);

// 그룹 단어인지 확인하는 함수
function check(str) {
  //이전의 문자를 기억해놨다가
  //다음 문자가 이전 문자와 다르면 return true
  //다음 문자가 이전 문자와 같으면 return false
  let prev = str[0];
  let visited = new Set();
  visited.add(prev);

  for (let i = 1; i < str.length; i++) {
    if (str[i] !== prev) {
      if (visited.has(str[i])) {
        return false;
      }
      visited.add(str[i]);
      prev = str[i];
    }
  }
  return true;
}
