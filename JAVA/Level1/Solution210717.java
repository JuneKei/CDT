package Level1;

public class Solution210717 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] a1= new String[n];
		String[] a2= new String[n];
		
		for(int i=0;i<n;i++) {
			a1[i]= Integer.toBinaryString(arr1[i]);
			a1[i]= String.format("%"+n+"s", a1[i]);
			a1[i]= a1[i].replaceAll(" ", "0");
			a2[i]= Integer.toBinaryString(arr2[i]);
			a2[i]= String.format("%"+n+"s", a2[i]);
			a2[i]= a2[i].replaceAll(" ", "0");
		}

		String[] array= new String[n];
		for(int i=0;i<n;i++){
			array[i]="";
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a1[i].charAt(j)=='1' || a2[i].charAt(j)=='1') {
					array[i] +="1";
					array[i] = array[i].replaceAll("1", "#");
				}else {
					array[i] +="0";
					array[i] = array[i].replaceAll("0", " ");
				}
			}
		}
        return array;
    }
}