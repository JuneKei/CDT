package codingtest;

import java.util.Arrays;

class Solution0703 {
    public long solution(long n) {
    	String x= String.valueOf(n);
			//스트링으로 변환시키기
		String[] arr = new String[x.length()];
			//String 배열을 String길이 값으로 만들기
		for(int i=0;i<arr.length;i++) {
			arr[i]=Character.toString(x.charAt(i));		
		}
		// i 에 해당하는 글자 하나씩 넣기
		
		Arrays.sort(arr);
		//arr 배열을 오름차 순으로 정렬
		x="";
		//x값을 초기화 시키고
		for(int i=arr.length-1;i>=0;i--) {
			x += arr[i];	
		}
		//뒤에 숫자부터 넣으면서 내림차순
		n=Long.parseLong(x);
		//String 을 Long으로 변환
        return n;
    }
}


def solution(n):
    a=[i for i in str(n)]
    a.sort(reverse=True)
    answer=''
    for i in a:
        answer+=i
    return int(answer)
