package july;

public class Solution0704 {
    public int solution(int n) {
    
    	int x=0;
    	
		for(int i=0;i<(int)(Math.log10(n)+1);i++) {
		//(int)(Math.log(n)+1) int n�� ����
			
			x+=(Integer.toString(n).charAt(i)-48);
			//n�� toString[����] -> charAt����[���� �̱�]
			// -48�� ���ϸ� 5�϶� �ƽ�Ű�ڵ尪 53���� ����
		}
        return n;
    }
}