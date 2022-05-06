package codingtest;

public class Solution0627 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
    	
    	int[][] answer = new int[arr1.length][arr1[0].length];
    	//arr1.length 이면  행의 갯수를 알수있고
    	//arr1[n].length 이면 n번째 행을 골라 열이 몇개인지 알수있다.
    	

    	for(int i=0; i<arr1.length;i++) {
    		//i:행의 길이만큼
    		for(int j=0; j<arr1[0].length;j++) {
    			//j:열의 길이만큼
    		answer[i][j]=arr1[i][j]+arr2[i][j];
    		/*예:입출력 1번째 
    		 	answer[1][1] 일때
    			arr1[1][1] = 3
    			arr2[2][3] = 6 이므로
    			answer[1][1]=9
    		*/
        	}
    	}

    	return answer;
    }
}