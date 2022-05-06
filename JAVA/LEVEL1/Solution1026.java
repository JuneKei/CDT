package october;

class Solution1026 {
    public long solution(int price, int money, int count) {
        
        long sum = 0;
        long p=price;
        for(int i=0;i<count;i++){
            sum+=price;
            price+=p;
        }
        long answer = (sum>=money) ? sum-money : 0;
        return answer;
    }
}