package EsercizioFibonacci;

public class ClasseSerie {

    public void fibonacciSerie(int count) { // Calcolo della serie di Fibonacci
        // Stampa di 0, 1, 1
        int n1 = 0, n2 = 1, n3, i;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            // Controllo pari | dispari con stampa
            if (n3 % 2 == 0) {
                System.out.println("\t| Pari");
            } else {
                System.out.println("\t| Dispari");
            }
        }
    }
}
