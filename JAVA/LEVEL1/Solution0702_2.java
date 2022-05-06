package codingtest;

import java.util.Arrays;
public class Solution0702_2 {
    public int[] solution(int[] arr) {

		int temp=arr[0];
		//0을 담지 않고 배열중 하나의 값을 받아야 최솟값 정할수있음
	    	int cnt=0;
        	int n=arr.length;
       		
		for(int j=0; j<arr.length;j++) {			
			for(int i=0; i<arr.length;i++) {
				temp=Math.min(arr[i],temp);
				//arr돌면서 최솟값 구하기
			}
		if(arr[j]==temp) {
			break;
		} //최솟값이 배열번호와 같을때 
			cnt++;
		 //cnt 에 넣어서 배열 번호를 구하는 데 [비효율적 ] if()문 없애고 최솟값 i 일때 값을 받음
			
		}
		for(int k=cnt;k<arr.length-1;k++) {
			arr[k]=arr[k+1];
		}
	    	//배열 하나씩 덮어쓰기
        
        if(n==1){
            n=2;
        }
	    //배열이 1개일경우 n을 2로 만들어 다음 n-1일때 오류가 발생하지 않도록함
        int [] arr2 = Arrays.copyOf(arr, n-1);
        if((arr2.length)==1){
            arr2[0]=-1;
        }
        
            
        
     return arr2;
    }
}


def solution(arr):
    if len(arr) == 1:
        return [-1]
    else:
        arr.remove(min(arr))
        return arr
