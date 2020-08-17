import java.util.Arrays;

public class ForPractice 
{
	public static void main(String[] args) {
		int[] a  = {12, 5 ,2,35,99,102};
		Arrays.sort(a);
		//System.out.println(a);
		for (int x : a) {
			System.out.println(x);
		}
		
		System.out.println(a[a.length - 2]);
		
	}
	 
 
}
