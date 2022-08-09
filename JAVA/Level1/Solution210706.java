package Level1;

public class Solution210706 {
    public int solution(int n) {

	int cnt = 0;
	boolean[] arr= new boolean[n+1];
	//n+1 �ڸ��� ���߱� �迭��
	arr[0]=true;
	arr[1]=true;
	//0,1�� �Ҽ��� �ƴϱ⶧���� ture;
	for(int i=2; i*i<=n; i++) {
		//2���� �Ǻ��ؼ� 2�� �����... 3�� �����..
		//10�� ������� ó���ϹǷ� i*i <=n
		for(int j=i*i; j<=n; j+=i ) {
			//����� ���� �־���ϹǷ� i*i
			//3�� ����̸� 9,18,27ó���ϱ⋚��
			//3�� ��� 6�� 2�� ����϶��� ó����
			arr[j]=true;
		}
	}
	for(int i=0; i<=n;i++) {
		if(arr[i]==false) {
			cnt++;
		}
	}
	   return cnt;
	}
}
