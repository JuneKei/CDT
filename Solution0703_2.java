package codingtest;

public class Solution0703_2 {
	    public int[] solution(long n) {
			String x= String.valueOf(n);
			//��Ʈ������ ��ȯ [ String a = "" + n;]
				String[] arr = new String[x.length()];
				//�迭�� ���
				int[] arr2 = new int[x.length()];
		        //��Ʈ�迭�� ���̻���
		for(int i=0;i<arr.length;i++) {
		    arr[i]=Character.toString(x.charAt(i));
		    	//i�� �ش��ϴ� ���� �ϳ��� �ֱ�
		}
		int j=0;
		        for(int i=arr.length-1;i>=0;i--,j++) {
	                
					arr2[j]= Integer.parseInt(arr[i]);
					//��Ʈ�� ��ȯ�ؼ� arr2�迭�� �ֱ�
				}
		
	        return arr2;
	    }
	}
