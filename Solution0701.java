package codingtest;

public class Solution0701 {
    public int[] solution(int n, int m) {
		int temp; 
		int[] answer= new int[2];		
		int result = 0;
			 if(n>m) {
				 temp=n;
				 n=m;
				 m=temp;
			 }
			 //n �� m �� �ּҰ����� ��ȯ

		for(int i=1; i<=m;i++) { 
			//1���� ������Ű�� ���ÿ� 0�̵Ǵ� ����  ã��
			if( n%i==0 && m%i==0) {
				answer[0]= i;
			}
		}
		answer[0]=result;
		answer[1]=(n*m)/result;
		//�ּ� ������� ���� ���� ������
        return answer;
    }
}


