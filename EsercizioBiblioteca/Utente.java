package EsercizioBiblioteca;

import java.util.Scanner;

import EsercizioFibonacci.Main;

import java.util.Arrays;
import java.util.ArrayList;

public class Utente {

    public static Scanner nomeUtente = new Scanner(System.in);
    public static String username;
    public static Scanner passUtente = new Scanner(System.in);
    private static String password;

    public static String[] listaUtenti = { "admin" };
    public static String[] nuoviUtenti;
    private static String[] passwordUtenti = { "admin" };
    public static String[] nuovePassword;

    public static Boolean registrazioneAvvenuta;
    public static Boolean loginAvvenuto;

    public static void registrazioneUtente() {

        System.out.println("Inserisci il nome utente");
        username = nomeUtente.nextLine();

        // Aggiungi l'username all'array degli username
        String[] nuoviUtenti = new String[listaUtenti.length + 1];
        for (int i = 0; i < listaUtenti.length; i++) {
            nuoviUtenti[i] = listaUtenti[i];
        }
        nuoviUtenti[nuoviUtenti.length - 1] = username;
        listaUtenti = nuoviUtenti;
        System.out.println("Username registrato con successo.");
        // ---------------------------------------------------------------
        System.out.println("Inserisci la password");
        password = passUtente.nextLine();
        // Aggiungi la password all'array delle password
        String[] nuovePassword = new String[passwordUtenti.length + 1];
        for (int i = 0; i < passwordUtenti.length; i++) {
            nuovePassword[i] = passwordUtenti[i];
        }
        nuovePassword[nuovePassword.length - 1] = password;
        passwordUtenti = nuovePassword;
        System.out.println("Password impostata con successo.");
        registrazioneAvvenuta = true;
        System.out.println("Lista utenti aggiornata: " + Arrays.toString(listaUtenti));
        System.out.println("Effettua il login per iniziare a navigare.");
        loginUtente();

    }

    public static void loginUtente() {

        do {
            System.out.println("Inserisci il tuo username");
            username = nomeUtente.nextLine();
            // Controlla che l'username sia registrato e fai completare il login
            int utenteTrovato = controlloUtente(listaUtenti, username);
            if (utenteTrovato != -1) {
                System.out.println("Inserisci la tua password");
                password = passUtente.nextLine();
                controlloPassword(listaUtenti, passwordUtenti, username, password);
                // Controllo che l'utente sia un admin o no
    
            } else {
                System.out.println("Username non registrato.");
                registrazioneUtente();
                loginAvvenuto=true;
            }

        } while(loginAvvenuto=false);
    }

    public static int controlloUtente(String[] listaUsers, String utenteDaTrovare) {
        for (int i = 0; i < listaUsers.length; i++) {
            if (listaUsers[i].equals(utenteDaTrovare)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean controlloPassword(String[] listaUsername, String[] listaPassword, String username, String password) {
        int index = controlloUtente(listaUsername, username);
        if (listaPassword[index].equals(password)) {
            System.out.println("Password corretta!");
            loginAvvenuto=true;
            MainBiblioteca.menuPrincipale();
            return true;
        } else {
            System.out.println("Password errata!");
            loginUtente();
            loginAvvenuto=false;
            return false;
        }
    }

}
