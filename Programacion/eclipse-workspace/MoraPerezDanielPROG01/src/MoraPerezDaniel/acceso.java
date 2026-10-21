package MoraPerezDaniel;

public class acceso {
	public static void main(String[] args) {
	int edad=14;
	boolean esSocio=true;
	boolean vaConAdulto=true;
	boolean puedeEntrar= edad>=18||(edad>=14&&esSocio&&vaConAdulto);
	System.out.println(puedeEntrar?"Acceso permitido "+edad:"Acceso denegado "+edad);
		
	}
	}


