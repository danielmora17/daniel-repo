package arrays;

public class arrayej10 {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 2, 8};
        int maximo = numeros[0]; 
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero; 
            }
        }
        System.out.println("El máximo es " + maximo + ".");
    }
}