package arrays;

public class arraysej5 {

	public static void main(String[] args) {
		int[] array1= {2, -3, 4, -1, 6};
		for( int nums : array1) {
			if(nums<0) {
				nums=0;
				
			}
			System.out.print(nums+" ");
		}

	}

}
