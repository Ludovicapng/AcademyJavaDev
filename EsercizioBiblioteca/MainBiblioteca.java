package EsercizioBiblioteca;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class MainBiblioteca {
    public static void main(String[] args){

        Scanner sceltaOperazione = new Scanner(System.in);
        int scelta;

        System.out.println("Benvenuto. Scegli quale operazione compiere:\n[1] Prendi in prestito un libro\n[2] Restituisci un libro\n[3] Aggiungi un libro alla lista libri disponibili\n[4] Rimuovi libro dalla lista libri disponibili\n[5] Visualizza tutti i libri disponibili");
        scelta=sceltaOperazione.nextInt();
        switch(scelta){

            case 1:
            Biblioteca.prestaLibro();
            break;

            case 2:
            Biblioteca.resituisciLibro();
            break;

            case 3:
            Biblioteca.aggiungiLibro();
            break;

            case 4:
            Biblioteca.rimuoviLibro();
            break;

            case 5:
            Biblioteca.stampaLibriDisponibili();
            break;

            default:
            System.out.println("Inserimento errato");
            
        }
    
    }
}
