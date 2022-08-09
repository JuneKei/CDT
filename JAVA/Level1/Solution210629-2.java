package Level1;

public class Solution {
    public double solution(int[] arr) {
    	 int tot=0;
    	for(int a: arr) {
			tot += a;
		}
    	double avg=tot/(double)arr.length;
    
        return avg;
    }
}

def solution(arr):
    return sum(arr)/len(arr)
