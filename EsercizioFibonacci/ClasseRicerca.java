package EsercizioFibonacci;

public class ClasseRicerca {

    public int calcFibonacci(int n) { // Ricerca numero di Fibonacci
        if (0 == n || 1 == n) {
            return n;
        } else {
            return calcFibonacci(n - 1) + calcFibonacci(n - 2);
        }
    }
    
}
