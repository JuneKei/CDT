//크기가 작은 부분 문자열
function solution(t, p) {
    var answer = 0;
    tl = t.length
    pl = p.length
    for (i = 0; i < tl - pl + 1; i++) {
        if (t.substr(i, pl) <= p) {
            answer++;
        }
    }
    return answer;
}
var t = "500220839878"
var p = "7"
solution(t,p)
