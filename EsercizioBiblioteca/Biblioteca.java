package EsercizioBiblioteca;

import java.util.Scanner;

import EsercizioFibonacci.Main;

import java.util.Arrays;
import java.util.ArrayList;

public class Biblioteca {

    // Dichiarazione Array e ArrayList
    public static String[] listaLibri = { "La gabbianella e il gatto", "Biancaneve", "Taylor Swift Biografia" };
    public static int[] copieDisponibili = { 3, 2, 1 };
    public static int[] copiePrestate = { 1, 0, 2 };
    public static String[] libriAggiornati;
    public static int[] copieAggiornate;
    public static int[] copiePrestateAggiornate;


    // Dichiarazione Scanner
    public static Scanner inserimentoTitolo = new Scanner(System.in);
    public static String titoloInserito;
    public static Scanner confermaScelta = new Scanner(System.in);
    public static String sceltaConfermata;
    public static Scanner copieInserite = new Scanner(System.in);
    public static int copieNuove;

    public static int index;

    // Dichiarazione Boolean
    public static Boolean libroPrestato;
    public static Boolean libroAggiunto;

    public static void prestaLibro() {
        System.out.println("Scegli fra i seguenti libri e digita il nome del libro che vuoi prendere in prestito.");
        System.out.println(Arrays.asList(listaLibri));
        titoloInserito = inserimentoTitolo.nextLine();

        int index = trovaLibro(listaLibri, titoloInserito);
        if (index != -1) {
            System.out.println("Libro esistente.");

            do {
                // Chiedi conferma prestito e controlla che ci siano copie disponibili
                System.out.println("Vuoi chiedere il libro: " + titoloInserito + " in prestito?\nDigita 'Si' o 'No'");
                sceltaConfermata = confermaScelta.nextLine();

                if (sceltaConfermata.equalsIgnoreCase("Si")) {
                    // Controllo disponibilità
                    int copieLibere = controllaDispLibro(listaLibri, copieDisponibili, titoloInserito);
                    if (copieLibere != -1) {
                        copieDisponibili[index] -= 1;
                        copiePrestate[index] += 1;
                        System.out.println("Hai preso in prestito il libro: " + titoloInserito);
                        libroPrestato = true;
                    } else {
                        System.out.println("Siamo spiacenti, non ci sono copie disponibili.");
                        prestaLibro();
                    }

                } else if (sceltaConfermata.equalsIgnoreCase("No")) {
                    // Torna alla scelta
                    prestaLibro();

                } else {
                    System.out.println("Inserimento errato");
                    // Torna alla scelta
                    prestaLibro();
                }

            } while (libroPrestato = false);

        } else {
            System.out.println("Libro inesistente.");
            prestaLibro();
        }
        MainBiblioteca.menuPrincipale();
    }

    public static void resituisciLibro() {
        System.out.println("Digita il nome del libro che vuoi restituire");
        titoloInserito = inserimentoTitolo.nextLine();

        int index = trovaLibro(listaLibri, titoloInserito);

        if (index != -1) {
            System.out.println("Libro trovato, confermi di volerlo restituire? Digita 'Si' o 'No'");
            sceltaConfermata = confermaScelta.nextLine();

            if (sceltaConfermata.equalsIgnoreCase("Si")) {
                copieDisponibili[index] += 1;
                copiePrestate[index] -= 1;
                System.out.println("Grazie per aver restituito il libro: " + titoloInserito);

            } else if (sceltaConfermata.equalsIgnoreCase("No")) {
                MainBiblioteca.menuPrincipale();

            } else {
                System.out.println("Inserimento errato");
                resituisciLibro();
            }
        } else {
            System.out.println("Libro non trovato.");
            MainBiblioteca.menuPrincipale();
        }

    }

    public static void aggiungiLibro() {
        System.out.println("Attenzione! Questa operazione è riservata agli Amministratori...");
        Admin.autenticazioneAdmin();

        do {
            System.out.println("Digita il nome del libro che vuoi aggiungere.");
            titoloInserito = inserimentoTitolo.nextLine();

            String[] libriAggiornati = new String[listaLibri.length + 1];
            for (int i = 0; i < listaLibri.length; i++) {
                libriAggiornati[i] = listaLibri[i];
            }
            libriAggiornati[libriAggiornati.length - 1] = titoloInserito;
            listaLibri = libriAggiornati;
            System.out.println("Libro aggiunto con successo!");
            System.out.println("Lista libri aggiornata: " + Arrays.toString(listaLibri));

            System.out.println("Digita il numero di copie disponibili del libro che vuoi aggiungere.");
            copieNuove = copieInserite.nextInt();
            int[] copieAggiornate = new int[copieDisponibili.length + 1];
            for (int i = 0; i < copieDisponibili.length; i++) {
                copieAggiornate[i] = copieDisponibili[i];
            }
            copieAggiornate[copieAggiornate.length - 1] = copieNuove;
            copieDisponibili = copieAggiornate;
            System.out.println("Copie inserite con successo!");
            MainBiblioteca.menuPrincipale();
            libroAggiunto = true;

        } while (libroAggiunto = false);
    }

    public static void rimuoviLibro() {
        System.out.println("Attenzione! Questa operazione è riservata agli Amministratori...");
        Admin.autenticazioneAdmin();

        System.out.println("Inserisci il titolo del libro che desideri rimuovere");
        titoloInserito = inserimentoTitolo.nextLine();
        int index = -1;
        for (int i = 0; i < listaLibri.length; i++) {
            if (listaLibri[i].equals(titoloInserito)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Libro non trovato. ");
            return;
        }
        String[] libriAggiornati = new String[listaLibri.length - 1];
        int j = 0;
        for (int i = 0; i < listaLibri.length; i++) {
            if (i == index) {
                continue;
            }

            libriAggiornati[j++] = listaLibri[i];
        }
        listaLibri = libriAggiornati;

        int[] copieAggiornate = new int[copieDisponibili.length - 1];
        int[] copiePrestateAggiornate = new int[copiePrestate.length - 1];
        j = 0;
        for (int i = 0; i < copieDisponibili.length; i++) {
            if (i == index) {
                continue;
            }
            copieAggiornate[j] = copieDisponibili[i]; 
            copiePrestateAggiornate[j] = copiePrestate[i];
            j++;
        }
        copieDisponibili = copieAggiornate;
        copiePrestate = copiePrestateAggiornate;

        System.out.println("Libro rimosso con successo. \nLista dei libri aggiornata: " + Arrays.toString(listaLibri));
        System.out.println("Lista aggiornata dei libri con le rispettive copie disponibili:\n");
        stampaLibriDisponibili();
        MainBiblioteca.menuPrincipale();
        }

    public static void stampaLibriDisponibili() {
        System.out.println("Titolo Libro\t\t\t|\tCopie disponibili");
        for (int i = 0; i < listaLibri.length; i++) {
            System.out.printf("%-30s\t|\t%d\n", listaLibri[i], copieDisponibili[i]);
        }
        MainBiblioteca.menuPrincipale();
    }

    public static int trovaLibro(String[] titoliLibri, String titoloDaTrovare) {
        for (int i = 0; i < titoliLibri.length; i++) {
            if (titoliLibri[i].equals(titoloDaTrovare)) {
                return i;
            }
        }
        return -1;
    }

    public static int controllaDispLibro(String[] titoliLibri, int[] copieDispOra, String titoloDaTrovare) {
        for (int i = 0; i < titoliLibri.length; i++) {
            if (titoliLibri[i].equals(titoloDaTrovare)) {
                return copieDispOra[i];
            }
        }
        return -1;
    }

}
