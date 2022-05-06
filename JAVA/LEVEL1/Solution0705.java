package july;

public class Solution0705 {
    public String solution(String s, int n) {
        String answer="";
         char[] arr = new char[s.length()];
       for(int i=0; i<s.length();i++) {
        arr[i]= s.charAt(i);
        if(arr[i]==32) {
            arr[i]=(char)(s.charAt(i));
        }
        if(arr[i]>=97) {
            arr[i]=(char)(s.charAt(i)+n);
            if(arr[i]>122) {
                arr[i]=(char)(s.charAt(i)+n-26);
            }
        }else if(arr[i]>=65) {
            arr[i]=(char)(s.charAt(i)+n);
            if(arr[i]>90) {
                arr[i]=(char)(s.charAt(i)+n-26);
            }
        }
           answer +=arr[i];
        }
    return answer;
    }
}