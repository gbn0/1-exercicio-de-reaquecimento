import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int resultado = exercicio1(5, 3);
        System.out.println("Resultado 1: " + resultado);

        int resultado2 = exercicio2(5, 3);
        System.out.println("Resultado 2: " + resultado2);

        double resultado3 = exercicio3(3);
        System.out.println("Resultado 3: " + resultado3);

        String resultado4 = exercicio4("Teste");
        System.out.println("Resultado 4: " + resultado4);

        int resultado5 = michaelNatti(5);
        System.out.println("Resultado 5: " + resultado5);

        int resultado6 = ackerman(3, 3);
        System.out.println("Resultado 6: " + resultado6);

        int[] vetor = {1, 2, 3, 4, 5};
        int resultado7 = soma(vetor);
        System.out.println("Resultado 7: " + resultado7);
    }

    private static int exercicio1(int numeroDeVezes, int multiplicando) {
        if(numeroDeVezes == 0) {
            return 0;
        }
        return exercicio1(numeroDeVezes - 1, multiplicando) + multiplicando;
    }

    private static int exercicio2(int numero1, int numero2) {
        if(numero1 == 0) {
            if(numero2 == 0) {
                return 0;
            }
            return exercicio2(numero1, numero2 - 1) + 1;
        }
        return exercicio2(numero1 - 1, numero2) + 1;
    }

    public static double exercicio3(int numero) {
        return exercicio3(numero, 1);
    }

    private static double exercicio3(int numero, int divisor) {
        if(divisor == numero) {
            return (double) 1/divisor;
        }
        return (double) 1/divisor + (double) exercicio3(numero, divisor + 1);
    }


    public static String exercicio4(String str) {
        return exercicio4(str, str.length() - 1);
    }

    private static String exercicio4(String str, int pos) {
        if(pos == 0) {
            return str.charAt(pos) + "";
        }
        return str.charAt(pos) + exercicio4(str, pos - 1);
    }

    private static int michaelNatti(int numeroUsado){
        if(numeroUsado <= 1) return 1;
        if(numeroUsado == 2) return numeroUsado;
        return 2* michaelNatti(numeroUsado - 1) + 3*michaelNatti(numeroUsado - 2); 
    }

    private static int ackerman(int m, int n) {
        if(m == 0) return n + 1;
        if(n == 0) return ackerman(m - 1, 1);
        return ackerman(m - 1, ackerman(m, n - 1));
    }

    private static int soma(int[] veto){
        return somaAjuda(veto, 0);
    }

    private static int somaAjuda(int[] vetor, int pos){
        if(pos == vetor.length) return 0;
        return vetor[pos] + somaAjuda(vetor, pos + 1);
    }

    public static boolean palindromo(String str){
        return palindromo(str, 0, str.length() - 1);
    }
    
    private static boolean palindromo(String str, int inicio, int fim){
        if(inicio >= fim) return true;
        if(str.charAt(inicio) != str.charAt(fim)) return false;
        return palindromo(str, inicio + 1, fim - 1);
    }

    private static ArrayList<String> subconjuntos(int n){
        if (n > 26) n = 26;

        return subconjuntos(n, 0, new ArrayList<>());
    }

    private static ArrayList<String> subconjuntos(int n, int cont, ArrayList<String> lista){
        if(con) return lista;
        ArrayList<String> novaLista = new ArrayList<>();
        for(String str : lista){
            novaLista.add(str + (char)('a' + cont));
        }
        lista.addAll(novaLista);
        lista.add("" + (char)('a' + cont));
        return subconjuntos(n, cont + 1, lista);
    }
}