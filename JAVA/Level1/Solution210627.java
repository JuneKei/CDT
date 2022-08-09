package Level1;

public class Solution210627 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
    	
    	int[][] answer = new int[arr1.length][arr1[0].length];
    	//arr1.length �̸�  ���� ������ �˼��ְ�
    	//arr1[n].length �̸� n��° ���� ��� ���� ����� �˼��ִ�.
    	

    	for(int i=0; i<arr1.length;i++) {
    		//i:���� ���̸�ŭ
    		for(int j=0; j<arr1[0].length;j++) {
    			//j:���� ���̸�ŭ
    		answer[i][j]=arr1[i][j]+arr2[i][j];
    		/*��:����� 1��° 
    		 	answer[1][1] �϶�
    			arr1[1][1] = 3
    			arr2[2][3] = 6 �̹Ƿ�
    			answer[1][1]=9
    		*/
        	}
    	}

    	return answer;
    }
}