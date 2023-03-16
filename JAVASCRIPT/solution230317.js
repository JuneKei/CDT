//바탕화면 정리
function solution(wallpaper) {
    var answer = []; // [시작 행,시작 열, 중단 행,중단 열]

    var minX = minY = 51;
    var maxX = maxY = -1;
    var map = [];
    for(var i=0;i<wallpaper.length;i++){
        for(var j=0;j<wallpaper[0].length;j++){
            if(wallpaper[i].charAt(j)=='#') {
                minX=Math.min(minX,i);
                minY=Math.min(minY,j);
                maxX=Math.max(maxX,i);
                maxY=Math.max(maxY,j);
            }
        }
    }

    answer= [minX,minY,maxX+1,maxY+1];

    return answer;
}

wallpaper = [".#...", "..#..", "...#."]

solution(wallpaper)

