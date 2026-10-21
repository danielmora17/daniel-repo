package arrays;

public class arrayej9 {

	  public static void main(String[] args) {
	        int[] original = {1, 3, 5, 7};
	        int[] doble = new int[original.length];
	        for (int i = 0; i < original.length; i++) {
	            doble[i] = original[i] * 2;
	        }
	        for (int valor : doble) {
	            System.out.print(valor + " ");
	        }
	        System.out.println();
	    }
	}