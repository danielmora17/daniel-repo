package logica;

public class BooleanOP1 {
	 public static void main(String[] args) throws Exception {
	        boolean X= true;
	        boolean Y=false;
	        boolean Z=true;
	        
	        System.out.println("a)(X && Y )||(X && Z)--->"+((X && Y)|| (X&&Z)));//TRUE
	        System.out.println("b)(X && !Y) && (!X || Z)--->"+((X && !Y) && (!X || Z)));//TRUE
	        System.out.println("c)X|| Y && Z --->"+(X|| Y&&Z));//TRUE
	        System.out.println("d)!(X || Y) && Z --->"+(!(X || Y)&&Z));//FALSE
	        System.out.println("e)X||Y||X&& !Z && !Y --->"+(X||Y||X&&!Z&&!Y));//TRUE
	        System.out.println("f)!X || !Y || Z&&X&& !Y --->"+(!X||!Y||Z&&X&&!Y));//TRUE
	        
	    }
}
