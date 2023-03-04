package EsercizioBiblioteca;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Admin {

    public static Scanner inserimentoCodice = new Scanner(System.in);
    public static int codiceInserito;
    private static int codiceSegreto = 819231342;
    public static Boolean accessoAdmin;


    public static void autenticazioneAdmin(){

        do {
            System.out.println("Se sei un admin e desideri autenticarti digita il codice segreto. Altrimenti digita 1.");
            codiceInserito=inserimentoCodice.nextInt();
            if (codiceInserito==codiceSegreto) {
                System.out.println("Autenticazione come Amministratore effettuata correttamente.");
                accessoAdmin=true;
            } else if (codiceInserito==1 || codiceInserito!=codiceSegreto) {
                System.out.println("Il codice inserito non è corretto.");
                MainBiblioteca.menuPrincipale();
            }   
        } while (accessoAdmin=false);

    }
}
