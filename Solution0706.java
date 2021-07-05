package july;

public class Solution0706 {
    public int solution(int n) {

	int cnt = 0;
	boolean[] arr= new boolean[n+1];
	//n+1 자리수 맞추기 배열과
	arr[0]=true;
	arr[1]=true;
	//0,1은 소수가 아니기때문에 ture;
	for(int i=2; i*i<=n; i++) {
		//2부터 판별해서 2의 배수들... 3의 배수들..
		//10의 배수까지 처리하므로 i*i <=n
		for(int j=i*i; j<=n; j+=i ) {
			//배수의 값을 넣어야하므로 i*i
			//3의 배수이면 9,18,27처리하기떄문
			//3의 배수 6은 2의 배수일때도 처리됨
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
