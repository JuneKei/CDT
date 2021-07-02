package codingtest;

import java.util.Arrays;
public class Solution0702_2 {
    public int[] solution(int[] arr) {

		int temp=arr[0];
		int cnt=0;
        int n=arr.length;
        
        
		
		for(int j=0; j<arr.length;j++) {			
			for(int i=0; i<arr.length;i++) {
				temp=Math.min(arr[i],temp);
			}
		if(arr[j]==temp) {
			break;
		}
			cnt++;
		}
		for(int k=cnt;k<arr.length-1;k++) {
			arr[k]=arr[k+1];
		}
        
        if(n==1){
            n=2;
        }
        int [] arr2 = Arrays.copyOf(arr, n-1);
        if((arr2.length)==1){
            arr2[0]=-1;
        }
        
            
        
     return arr2;
    }
}
