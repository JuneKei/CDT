package codingtest;

public class Solution0703_2 {
	    public int[] solution(long n) {
			String x= String.valueOf(n);
			//스트링으로 변환 [ String a = "" + n;]
				String[] arr = new String[x.length()];
				//배열에 담기
				int[] arr2 = new int[x.length()];
		        //인트배열도 같이생성
		for(int i=0;i<arr.length;i++) {
		    arr[i]=Character.toString(x.charAt(i));
		    	//i에 해당하는 글자 하나씩 넣기
		}
		int j=0;
		        for(int i=arr.length-1;i>=0;i--,j++) {
	                
					arr2[j]= Integer.parseInt(arr[i]);
					//인트로 전환해서 arr2배열에 넣기
				}
		
	        return arr2;
	    }
	}
