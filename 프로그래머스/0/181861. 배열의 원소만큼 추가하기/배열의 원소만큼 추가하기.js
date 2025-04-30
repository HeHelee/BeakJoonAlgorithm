function solution(arr) {
    //1. 원소가 a라면 a만큼 반복한 원소를 배열에 추가하기
    return arr.reduce((list,num) => [
        ...list, ...new Array(num).fill(num)],[])
}