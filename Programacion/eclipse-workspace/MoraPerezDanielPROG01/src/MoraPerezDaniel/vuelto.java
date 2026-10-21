package MoraPerezDaniel;

public class vuelto {

	public static void main(String[] args) {
		double precio=20;
		double pagoe=37.5;
		double cambio=pagoe-precio;
		double billetes10=((cambio)/10);
		
		System.out.println("El precio es de "+precio+" el pago es de"+pagoe);
		System.out.println("El cambio es de"+ (cambio));
		System.out.printf("Billetes de 10= %d%n",(int) billetes10);
		double cambioeuros=cambio-(10*(int) billetes10);
		System.out.println("Monedas un euro="+(int)cambioeuros);
		double cambiocentimos=(cambioeuros-(int)cambioeuros);
		System.out.println("Monedas centimos"+cambiocentimos);
	}

}
