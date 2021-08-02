package august;
import java.util.ArrayList;
public class Solution0803 {
    public ArrayList<Integer> solution(int[] answers) {
		int[] s1= new int[answers.length];
		int[] s2= new int[answers.length];
		int[] s3= new int[answers.length];
		
		int a1=1; int a1cnt=0;
		int a2=1; int a2cnt=0;
		int a3=1; int a3cnt=0;
		for(int i=0;i<answers.length;i++) {
			s1[i]=a1;
			a1++;
			if(a1>5) a1=1;
			
			if(i%2==0) s2[i]=2;
			else {
				s2[i]=a2;
				a2++;
				if(a2==2)a2++;
				if(a2>5) a2=1;
			}
			if(i%10==0 || i%10==1) s3[i]= 3;
			else {
				s3[i]=a3;
				if(i%2==1)a3++;
				if(a3==3)a3++;
				if(a3>5) a3=1;
			}
		}
		
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==s1[i]) a1cnt++;
			if(answers[i]==s2[i]) a2cnt++;
			if(answers[i]==s3[i]) a3cnt++;
		}
	ArrayList<Integer> list = new ArrayList<>();	
	int max=Math.max(Math.max(a1cnt,a2cnt),a3cnt);
	if(a1cnt==max) list.add(1);
	if(a2cnt==max) list.add(2);
	if(a3cnt==max) list.add(3);
        return list;
    }
}
