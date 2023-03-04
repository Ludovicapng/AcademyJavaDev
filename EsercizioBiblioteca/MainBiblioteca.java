package EsercizioBiblioteca;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class MainBiblioteca {

    public static Scanner sceltaOperazione = new Scanner(System.in);
    public static int scelta;
    public static Boolean cicloLogin;
    public static void main(String[] args){

        do {
            System.out.println("Vuoi [1]REGISTRARTI o [2]EFFETTUARE IL LOGIN?");
            scelta=sceltaOperazione.nextInt();
            if (scelta==1) {
                Utente.registrazioneUtente();
                cicloLogin=true;
            } else if (scelta==2){
                Utente.loginUtente();
                cicloLogin=true;
            } else {
                System.out.println("Inserimento errato!");
                cicloLogin=false;
            }
        } while (cicloLogin=false);

    
    }

    public static void menuPrincipale(){
        System.out.println("Scegli quale operazione compiere:\n[1] Prendi in prestito un libro\n[2] Restituisci un libro\n[3] Aggiungi un libro alla lista libri disponibili\n[4] Rimuovi libro dalla lista libri disponibili\n[5] Visualizza tutti i libri disponibili\n[6]Termina");
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

            case 6:
            break;

            default:
            System.out.println("Inserimento errato");
            
        }
    }
}
