package arrays;

public class arrayej8 {
    public static void main(String[] args) {
        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            if (i % 2 == 0) { // posición par
                valores[i] = i + 2;
            } else {
                valores[i] = i - 2;
            }
        }
        for (int valor : valores) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
