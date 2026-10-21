package MoraPerezDaniel;

public class triangulo {
	public static void main(String[] args) {
	double a=3;
	double b=2;
	double c=2;
	if(a+b>c) {
	System.out.println("Triángulo válido");
	if(a==b&&b==c) {
		System.out.println("Triángulo equilátero");
	}else if(a==b||b==c||a==c){
		System.out.println("Triángulo isósceles");
	}else {
		System.out.println("Triángulo escaleno");
	}
		
	}
	}
}

