package Codility;

import java.util.Arrays;

public class exc3 {
	
	
	public boolean check(int[] A) {
		
		int[] A1 = {1,3,5};
		int count = 0;
		int[] B = Arrays.copyOf(A1, A1.length);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i])
				count++;
		}
		if (count > 2)
			return false;
		return true;
	}

	public static void main(String[] args)
	{
		exc3 ex = new exc3();
		int A[]= {1,3,5};
		ex.check(A);
	}
	
}
