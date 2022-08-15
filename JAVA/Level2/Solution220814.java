public class Solution220814 {
    
}

//하노이의 탑
class Solution220814 {
    static int[][] answer;
    static int cnt=0;
    public void hanoi(int from,int to,int mid,int n){
        //마지막 원판(가장 위에 있는 원판)인 경우 
        if(n==1){
            answer[cnt++]=new int[]{from,to};
            return;
        }
        else{
            hanoi(from, mid, to, n-1);
            //마지막 원판이 옮겨진 이후 
            answer[cnt++]=new int[]{from,to};
            hanoi(mid, to, from, n-1);   
        }
    }

    public int[][] solution(int n) {
        //하노이의 탑 이동 횟수 2^n-1
        int[][] answer = new int[(int)Math.pow(2,n)-1][2];
        //원판을 1에서 3으로 이동
        hanoi(1,3,2,n);
        return answer;
    }
}
