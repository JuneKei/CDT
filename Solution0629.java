package codingtest;

public class Solution0629 {
    public boolean solution(int x) {
    	int h5=x/10000;
	    int h4=(x/1000)%10;
	    int h3=(x/100)%10;
	    int h2=(x/10)%10;
	    int h1=(x/1)%10; 
    	// %10�� �ؾ��� ���� 1���ڸ����� ��
	    // h4�� %10 �ؾ� ���� 10000�϶� 0�� ����
	    
	    boolean answer = false;
	    
	    if((x%(h5+h4+h3+h2+h1))==0) {
	    	answer = true;
	    }

        return answer;
    }
}