package Level1;

public class Solution210721 {
    public int solution(int n) {
        String s ="";
	    //3����  n���� �����ؼ� �������� ���ϰ� ������ ���� ����
	    for(int i=n;i>0;i/=3) {
		    s += (i%3); 
	    }
	    char[] arr = s.toCharArray();
	    //char�� ��� �ش簪 *3
	    int answer = 0;
	    for(int i=s.length()-1,j=1;i>=0;i--,j*=3) {
		answer += (arr[i]-48) *j;
	}
        return answer;
    }
}