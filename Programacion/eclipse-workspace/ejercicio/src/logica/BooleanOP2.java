package logica;

public class BooleanOP2 {
	public static void main(String[] args) throws Exception {
		boolean W=false;
		boolean X=true;
		boolean Y=true;
		boolean Z=false;
		System.out.println("a) W|| Y && X && W || Z --->"+(W||Y && X && W ||Z));//FALSE
		System.out.println("b) X && !Y && !X ||!W && Y --->"+(X&&!Y&&!X||!W&&Y));//TRUE
		System.out.println("c) !(W||!Y)&&X||Z --->"+(!(W||!Y&&X||Z)));//TRUE
		System.out.println("d) X&& Y && W||Z||X --->"+(X&&Y&&W||Z||X));//TRUE
		System.out.println("e) Y || !(Y||Z&&W) --->"+(Y||!(Y||Z&&W)));//TRUE
		System.out.print("f)!X && Y &&(!Z||!X)--->"+(!X&&Y&&(!Z||!X)));//FALSE
		
	}
    /*
a) W || Y && X && W || Z
b) X && !Y && !X || !W && Y
c) !(W || !Y) && X || Z
d) X && Y && W || Z || X
e) Y || !(Y || Z && W)
f) !X && Y && (!Z || !X)
     */
		
		
		
	
	}

