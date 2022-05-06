package july;

import java.util.Calendar;

public class Solution0719 {
    public String solution(int a, int b) {
       
        Calendar cal = Calendar.getInstance();
		cal.set(2016, a-1, b);
        int n = cal.get(Calendar.DAY_OF_WEEK)-1;
		String[] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT","SUN"};
        return arr[n];
    }
}
