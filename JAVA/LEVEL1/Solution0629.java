package codingtest;

public class Solution0629 {
    public boolean solution(int x) {
    	int h5=x/10000;
	    int h4=(x/1000)%10;
	    int h3=(x/100)%10;
	    int h2=(x/10)%10;
	    int h1=(x/1)%10; 
    	// %10을 해야지 값의 1의자리까지 됨
	    // h4도 %10 해야 값이 10000일때 0이 나옴
	    
	    boolean answer = false;
	    
	    if((x%(h5+h4+h3+h2+h1))==0) {
	    	answer = true;
	    }

        return answer;
    }
}

def solution(x):
    b=str(x)
    sum=0
    flag=False
    for i in b:  #스트링 글자 하나씩 가져오기
        sum+=int(i)
    if(x%sum==0):
        flag=True
    return flag
