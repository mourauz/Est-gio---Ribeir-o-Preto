//Programa para verificar a existência da letra 'a' em uma string

import java.util.Scanner;

public class ContarLetrasA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int contador = contarLetrasA(input);
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
        scanner.close();
    }

    public static int contarLetrasA(String str) {
        int contador = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
