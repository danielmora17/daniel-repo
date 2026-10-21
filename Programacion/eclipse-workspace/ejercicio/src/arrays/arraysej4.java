package arrays;

public class arraysej4 {

	public static void main(String[] args) {
		double[] array1= {6.5, 8.0, 4.5, 9.0, 7.0};
		double suma=0;
		for(double num: array1) {
			 suma+=num;
			
	
		}
		double media=suma/array1.length;
		System.out.println(media);
	}

}
