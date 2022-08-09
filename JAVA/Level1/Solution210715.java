package Level1;

public class Solution210715 {
    public int solution(String dartResult) {
        String s = dartResult.replace("10", ":");
	
		char[] arr = s.toCharArray();
		 
		double[] answer= new double[s.length()];
		
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr[i]>=48 && arr[i]<=58) {
				answer[i]=arr[i]-48;
			}else if(arr[i]==68) {
				answer[i-1]= Math.pow(answer[i-1], 2);
			}else if(arr[i]==84) {
				answer[i-1]= Math.pow(answer[i-1], 3);
			}else if(arr[i]==42) {
				try {
				for(int k=0;k<6;k++) {
				answer[i-k] *=2;
				}
				}catch(Exception e){
					
				}
			}else if(arr[i]==35) {
				answer[i-2]*=(-1);
			}
		}
		int sum=0;
		for(double d : answer) {
			sum += (int)d; 
		} 
        return sum;
    }
}
