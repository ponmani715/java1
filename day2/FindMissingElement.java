
package week1.day2;
import java.util.Arrays;

 public class FindMissingElement {
	public static void main(String[] args) {
		int[] arr= {1,4,3,2,8,6,7};
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
		// TODO Auto-generated method stub

	}

}
