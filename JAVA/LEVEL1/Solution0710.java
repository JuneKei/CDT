package july;

public class Solution0710 {
    boolean solution(String s) {
        int pCnt=0;
 		int yCnt=0;
 		char[] arr = new char[s.length()];
 	
 		boolean answer = false;
 		
 		for(int i=0; i< s.length();i++) {
 			arr[i]= s.charAt(i);
 			if(arr[i]=='p'||arr[i]=='P') {
 				pCnt++;
 			}else if(arr[i]=='y'||arr[i]=='Y') {
 				yCnt++;
 			}
 		}
 		if(pCnt==yCnt) {
 			answer = true;
 		}

         return answer;
     }
 }