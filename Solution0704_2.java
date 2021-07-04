package july;

public class Solution0704_2 {
    public String solution(String s) {
		int x= s.length();
		String b ="";
		int cnt= 1;
		
		char[] arr = new char[x];
		
		for(int i=0;i<x;i++,cnt++) {
			arr[i]=s.charAt(i);
			if(arr[i]==' ') {
				System.out.println("ฐ๘น้");
				cnt=0;
			}
			if(cnt%2==1) {
				s=s.toUpperCase();
				arr[i]=s.charAt(i);
			}else if(cnt%2==0) {
				s=s.toLowerCase();
				arr[i]=s.charAt(i);
			}
				b += arr[i];
		}
            
            return b;
		
    }
}