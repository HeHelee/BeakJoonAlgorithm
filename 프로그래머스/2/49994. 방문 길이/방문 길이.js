// 좌표 범위를 벗어나는지 확인하기
function isValid(nx, ny) {
    return nx >= -5 && nx <= 5 && ny >= -5 && ny <= 5;
}

// 이동 거리 계산
function move(x, y, dir) {
    switch (dir) {
        case "U" :
            return [x,y+1];
        case "D" : 
            return [x, y-1];
        case "R" :
            return [x+1, y];
        case "L" :
            return [x-1, y];
    }
}

function solution(dirs) {
    // 원점
    let x = 0;
    let y = 0;
    // 중복된거 하나로 합침
    const visited = new Set();
    // 돌면서 좌표값 저장
    for (const dir of dirs) {
    const[nx,ny] = move(x,y,dir);
    // 유효하지 않는 값 저장하지 않음.
    if (!isValid(nx,ny)) {
        continue;
    }
    visited.add(`${x}${y}${nx}${ny}`);
    visited.add(`${nx}${ny}${x}${y}`);
    // 좌표 업데이트
    [x,y] = [nx,ny];
   
}
    // 우리가 구해야 하는 것 : 캐릭터가 처음 가본 길이
    // 조건 : 중복된 길이 안됨, 범위를 넘어서면 안됨
    // 1. 이동 거리를 계산해야 함.
    // 2. 범위에 맞게 값이 조율되도록 한다.
    // 3. 중복된다면 즉시 종료.
    
    return visited.size/2;
}