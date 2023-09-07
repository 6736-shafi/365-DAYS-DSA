package recursion;
import java.util.*;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,2};
		int n=3;
		List<Integer> li=new ArrayList<>();	
		print(0,li,arr,n);
	}

	private static void print(int ind, List<Integer> li, int[] arr, int n) {
		if(ind==n) {
			for(int i:li)
				System.out.print(i+" ");
			
			if(li.size()==0)
				System.out.print("{}");
			System.out.println();
			return ;
		}
		
		li.add(arr[ind]);
		print(ind+1,li,arr,n);
		li.remove(li.size()-1	);
		print(ind+1,li,arr,n);
		
		
	}

}
	