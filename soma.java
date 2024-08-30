//Valor final da variável SOMA no trecho de código:

public class SomaCalculada {
    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;
        
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor da variável SOMA será: " + SOMA);
    }
}
