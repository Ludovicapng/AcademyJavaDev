package EsercizioFibonacci;

import java.util.Scanner;

import EsercizioFibonacci.Connessione;
import EsercizioFibonacci.Main;

public class MenuFibonacci {

    Scanner myScelta = new Scanner(System.in);

    public void MenuNavigazione() {

        // Scanner per l'inserimento del numero e della scelta nel menù
        Scanner inserimentoNumerico = new Scanner(System.in);
        int numeroRicerca;
        int numeroTrovato;
        Scanner contatore = new Scanner(System.in);

        ClasseSerie mySerieF = new ClasseSerie();
        ClasseRicerca myRicercaF = new ClasseRicerca();

        boolean verificaScelta=true;
        String messMenu="Digita 1 per calcolare la Serie di Fibonacci e stampare Controllo Pari|Dispari\nDigita 2 per effettuare la ricerca nella serie di Fibonacci";

        do {
            switch (rilevaInputUtente(messMenu)) {
                case 1:
                    int count = rilevaInputUtente("Digita il numero per calcolare la serie di Fibonacci");
                    mySerieF.fibonacciSerie(count);
                    break;
                case 2:
                    numeroRicerca = rilevaInputUtente("Inserisci un numero");
                    numeroTrovato = myRicercaF.calcFibonacci(numeroRicerca);

                    System.out.println("Hai inserito " + numeroRicerca + "che nella serie di Fibonacci è pari a: "+ numeroTrovato);
                    
                    int secondaScelta = rilevaInputUtente("Digita [1] per continuare; [2] per terminare");

                    switch (secondaScelta) {
                        case 1:
                            verificaScelta = false;
                            break;
                        case 2:
                            System.out.println("\nGrazie e arrivederci");
                            //verificaScelta = true;
                            return;
                        default:
                            System.out.println("Inserimento errato");
                            break;
                    }
                    break;
                case 3:
                    System.out.print("\nFine");
                    return; // Il return esce dal ciclo while 
                    // verificaScelta = true;
                default:
                    System.out.println("Inserimento errato");
                    break;
            }
        } while (true);
    }

    public int rilevaInputUtente(String frase){
        System.out.print(frase);
        int sceltaMenu = myScelta.nextInt();
        myScelta.nextLine();
        return sceltaMenu;
    }
}