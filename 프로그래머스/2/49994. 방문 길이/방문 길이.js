function isValid(nx, ny) {
    //3. 좌표를 넘어가면 안됨. => 함수로 빼기
    return (nx >= -5 && nx <= 5 && ny >= -5 && ny <= 5);
}

function move (x,y,dir) {
    //1. U,D,R,L 의 값을 정의해 줘야 함. => 함수로 빼기
    switch(dir) {
        case "U":
            return [x,y+1];
        case "D":
            return [x,y-1];
        case "R":
            return [x+1,y]
        case "L":
            return [x-1,y];
    }
}

function solution(dirs) {
    // 1. 시작점 정의 
    let x = 0;
    let y = 0;
    
    const answer = new Set();
    
    //4. 배열을 각각을 쪼개야 함.
    for (const dir of dirs) {
        //4-1. 쪼갠 후에 호출
        const [nx,ny] = move(x,y,dir);
        
        //4-2. 값이 유효한지 확인
        if (!isValid(nx,ny)) {
            continue;
        }
        
        //5. 거리 연결하기
        answer.add(`${x}${y}${nx}${ny}`);
        answer.add(`${nx}${ny}${x}${y}`);
    
        //6. 좌표 업데이트
        [x,y] = [nx,ny];
    }
   
    return answer.size/2;
}