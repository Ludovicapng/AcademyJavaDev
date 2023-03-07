package SetteMarzo;

import java.util.Scanner;

public class Principale {

    public static Scanner myChoice = new Scanner(System.in);

    public static Scanner insIntero = new Scanner(System.in);
    public static Scanner insStringa = new Scanner(System.in);

    public static Boolean fine;

    public static void main(String[] args) {
        do {
            System.out.println("| Digita 1 per scegliere Automobile\n| Digita 2 per scegliere Moto\n| Digita 3 per terminare");
            int scelta = myChoice.nextInt();

            if (scelta == 1) {
                inserisciPrimaAuto();
                proseguiScelta();

            } else if (scelta == 2) {
                inserisciPrimaMoto();
                proseguiScelta();

            } else {
                fine = true;
            }

        } while (fine = false);
    }
    public static void proseguiScelta() {
        System.out.println(
                "Scegli:\n| Digita 1 per inserire un'AUTOMOBILE\n| Digita 2 per inserire una MOTO\n| Digita 3 per terminare");
        int sceltaSec = myChoice.nextInt();
        switch (sceltaSec) {
            case 1:
                inserisciSecondaAuto();
                break;

            case 2:
                inserisciSecondaMoto();
                break;

            case 3:
                break;

            default:
                System.out.println("Inserimento errato!");
        }
    }
    public static void inserisciPrimaAuto() {
        System.out.println("Insersci la marca dell'Automobile");
        String marcaInserita = inserimentoStringa();
        System.out.println("Insersci il modello dell'Automobile");
        String modelloInserito = inserimentoStringa();
        System.out.println("Insersci anno di fabbricazione dell'Automobile");
        int annoInserito = inserimentoIntero();
        System.out.println("Insersci il numero di Porte");
        int porteInserite = inserimentoIntero();
        System.out.println("Insersci il tipo di Carburante");
        String tipoCarbInserito = inserimentoStringa();
        System.out.println("Insersci il consumo Medio");
        int consumoInserito = inserimentoIntero();
        Auto myCar = new Auto(marcaInserita, modelloInserito, annoInserito, porteInserite, tipoCarbInserito,
                consumoInserito);
    }
    public static void inserisciSecondaAuto() {
        System.out.println("Insersci la marca dell'Automobile");
        String marcaInserita = inserimentoStringa();
        System.out.println("Insersci il modello dell'Automobile");
        String modelloInserito = inserimentoStringa();
        System.out.println("Insersci anno di fabbricazione dell'Automobile");
        int annoInserito = inserimentoIntero();
        System.out.println("Insersci il numero di Porte");
        int porteInserite = inserimentoIntero();
        System.out.println("Insersci il tipo di Carburante");
        String tipoCarbInserito = inserimentoStringa();
        System.out.println("Insersci il consumo Medio");
        int consumoInserito = inserimentoIntero();
        Auto mySecondCar = new Auto(marcaInserita, modelloInserito, annoInserito, porteInserite, tipoCarbInserito,
                consumoInserito);
    }
    public static void inserisciPrimaMoto() {
        System.out.println("Insersci la marca della moto");
        String marcaInserita = inserimentoStringa();
        System.out.println("Insersci il modello della moto");
        String modelloInserito = inserimentoStringa();
        System.out.println("Insersci anno di fabbricazione della moto");
        int annoInserito = inserimentoIntero();
        System.out.println("Insersci la cilindrata");
        int cilindrataInserita = inserimentoIntero();
        System.out.println("Insersci la potenza");
        int potenzaInserita = inserimentoIntero();
        System.out.println("Insersci il tipo di moto");
        String tipoMotoInserito = inserimentoStringa();
        Moto myMoto = new Moto(marcaInserita, modelloInserito, annoInserito, cilindrataInserita, tipoMotoInserito,
                potenzaInserita);
    }
    public static void inserisciSecondaMoto() {
        System.out.println("Insersci la marca della moto");
        String marcaInserita = inserimentoStringa();
        System.out.println("Insersci il modello della moto");
        String modelloInserito = inserimentoStringa();
        System.out.println("Insersci anno di fabbricazione della moto");
        int annoInserito = inserimentoIntero();
        System.out.println("Insersci la cilindrata");
        int cilindrataInserita = inserimentoIntero();
        System.out.println("Insersci la potenza");
        int potenzaInserita = inserimentoIntero();
        System.out.println("Insersci il tipo di moto");
        String tipoMotoInserito = inserimentoStringa();
        Moto mySecondMoto = new Moto(marcaInserita, modelloInserito, annoInserito, cilindrataInserita, tipoMotoInserito,
                potenzaInserita);
    }
    public static int inserimentoIntero() {
        int insUtente = insIntero.nextInt();
        return insUtente;
    }
    public static String inserimentoStringa() {
        String insUtente = insStringa.nextLine();
        return insUtente;
    }

}
