function move (x, y, dir) {
        switch(dir) {
            case "U":
                return [x, y+1];
            case "D":
                return [x, y-1];
            case "R":
                return [x+1, y];
            case "L":
                return [x-1, y];
        }
}
    
function isValid(nx,ny) {
   return nx <= 5 && nx >= -5 && ny <= 5 && ny >= -5

}
function solution(dirs) {
    // 구해야 하는 것 : 최초로 간 경로 길이
    // 조건1 : 중복된 조건이 없어야 함.
    // 조건2 : 범위를 벗어나면 안됨.
    
    // 원점 
    let x = 0;
    let y = 0;
    const visited = new Set();
    
    // 이동 거리를 계산해야 함.
    for (const dir of dirs) {
        const [nx, ny] = move(x,y,dir);
        
    // 유효한지 계산
    if (!isValid(nx,ny)) {
        continue;
    }
    
    // 방문 거리 값 넣어주기 
    // 방향성이 없기 때문에 A->B B->A 추가하기
    visited.add(`${x}${y}${nx}${ny}`);
    visited.add(`${nx}${ny}${x}${y}`);
        
    // 배열 값 업데이트
    [x,y] = [nx,ny];
  }
    return visited.size/2;
}