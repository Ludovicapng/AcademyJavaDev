import java.util.Scanner;

import javax.tools.OptionChecker;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;

public class Autenticazione {

    // Dichiarazione variabili, scanner, arraylist globali
    public static ArrayList<String> usersList = new ArrayList<String>();
    public static ArrayList<String> passList = new ArrayList<String>();
    public static ArrayList<String> datiUtente = new ArrayList<String>();
    public static Scanner username = new Scanner(System.in);
    public static String userName;
    public static Scanner password = new Scanner(System.in);
    public static String userPass;
    public static Scanner login1 = new Scanner(System.in);
    public static String loginUsername;
    public static Scanner login2 = new Scanner(System.in);
    public static String loginPassword;
    public static Boolean registrationCompleted;
    public static Boolean userLoggedIn;
    public static Scanner choicelogout = new Scanner(System.in);
    public static String logOutchoice;
    public static Scanner generalChoice = new Scanner(System.in);
    public static int optionChoice;
    public static Scanner dim = new Scanner(System.in);
    public static int dataNumber;
    public static Scanner userInjection = new Scanner(System.in);
    public static String userDataInj;

    public static void main(String[] args){
        menuPrincipale(); // esecuzione del menù principale
    }

    public static void menuPrincipale(){

        Scanner choice = new Scanner(System.in);
        int menuChoice;

        System.out.println("Scegli se [1]Registrarti, [2]Loggarti");
        menuChoice = choice.nextInt(); // inserimento scelta dall'utente

        if(menuChoice==1) {
            userCreation();
            menuPrincipale();
        } else if(menuChoice==2) {
            userLogin();
        } else {
            System.out.println("Inserimento errato!");
            menuPrincipale();
        }

    }
    public static void userCreation(){ // registrazione utente
        do{
            System.out.println("Inserisci l'username: ");
            userName = username.nextLine();
            usersList.add(userName);
            System.out.println("Inserisci la password: ");
            userPass = password.nextLine();
            passList.add(userPass);
            System.out.println("Registrazione effettuata con successo.");
            registrationCompleted=true;

        } while(registrationCompleted!=true);
        menuPrincipale();
    }

    public static void userLogin(){ //login utente
        do{
            System.out.println("Inserisci l'username: ");
            loginUsername = login1.nextLine();
            if (usersList.contains(loginUsername)){
                System.out.println("Inserisci la password: ");
                loginPassword = login2.nextLine();
                if (passList.contains(loginPassword)) {
                    userLoggedIn=true;
                    System.out.println("Login effettuato con successo.");
                    secondoMenu();

                } else {
                    System.out.println("Password errata!");
                    userLogin(); // in caso di password errata riporta al login
                }
            } else {
                System.out.println("Username non registrato o errato.");
                menuPrincipale(); // se l'username non è registrato o errato riporta al menu principale
            }

        } while(userLoggedIn!=true);

    }
    public static void logOut(){
        System.out.println("Desideri effettuare il log-out? Digita 'Y' per sloggare o 'N' per inserire dati");
        logOutchoice = choicelogout.nextLine();
        switch(logOutchoice){
            case "Y":
            System.out.println("Grazie e arrivederci."); //scelta logout riporta al menù principale
            menuPrincipale();
            break;

            case "N":
            inserimentoDati(); //scelta inserimento dati
            break;
        }
    }

    public static void inserimentoDati(){
        System.out.println("Quanti dati vuoi inserire?");
        dataNumber = dim.nextInt();
        for(int i=0;i<dataNumber;i++){
            System.out.println("Inserisci l'informazione:");
            userDataInj = userInjection.nextLine();
            datiUtente.add(userDataInj);
        }
        logOut();
    }

    public static void secondoMenu(){
        System.out.println("Vuoi effettuare il [1]log-out o [2]inserire dati?");
        optionChoice = generalChoice.nextInt();
        if (optionChoice==1){
            logOut();
        } else if(optionChoice==2){
            inserimentoDati();
        } else {
            System.out.println("Errore");
            menuPrincipale();
        }
    }
}
