package codingtest;

public class Solution0630 {
	   public int solution(long num) {
	       int cnt=0;
	     for(cnt=0;cnt<500;){
	        if(num%2==0){
	          num= num/2;
	            cnt++;
	        }else if(num==1){
	         break;    
	        }else{
	          num=(num*3)+1;
	            cnt++;
	        }
	     }
	        if(cnt==500)
	            cnt= -1;
	        return cnt;
    }
}

def solution(n):
    cnt=0
    while n!=1:
        if n%2==0:
            n=n/2
        else:
            n=n*3+1
        cnt+=1
        if cnt>=500:
            cnt=-1
            break
    return cnt
