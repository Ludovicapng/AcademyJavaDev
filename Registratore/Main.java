package Registratore;

import java.util.Scanner;

public class Main {

    public static Scanner sceltaIniziale = new Scanner(System.in);
    public static int sceltaMenu;

    public static Scanner nome = new Scanner(System.in);
    public static Scanner peso = new Scanner(System.in);
    public static String nomeAnimale;
    public static int pesoAnimale;

    public static Boolean fine;

    public static Scanner confermaScelta = new Scanner(System.in);
    public static String confermaInserimento;

    public static Canidi esemplareCanide = new Canidi(null, null);
    public static Felini esemplareFelino = new Felini(null, null);
    public static Roditori esemplareRoditore = new Roditori(null, null);
    public static Anfibi esemplareAnfibio = new Anfibi(null, null);

    public static int countFelini, countCanidi, countAnfibi, countRoditori;

    public static void main(String[] args) {
        do {
            System.out.println("Digita 1 per proseguire.\nDigita 2 per terminare.");
        sceltaMenu = sceltaIniziale.nextInt();
        if (sceltaMenu == 1) {
            registraIngresso();
        } else if (sceltaMenu == 2) {
            printNamesAndWeights();
            break;
        } else {
            System.out.println("Inserimento errato!");
        }
        }while(fine=true);
    }

    public static void registraIngresso() {

            System.out.println("Scegli il tipo di animale da registrare e digita la tua scelta fra:\n[1] Felino\n[2] Canide\n[3] Anfibio\n[4] Roditore\n[5] Termina");
        int sceltaSpecie = sceltaIniziale.nextInt();

        switch (sceltaSpecie) {

            case 1: // Scelta Felino
                System.out.println("Inserisci il nome del Felino");
                nomeAnimale = nome.nextLine();
                Felini.setNameFelino(nomeAnimale);
                Felini.viewNameFelino();

                System.out.println("Inserisci il peso del Felino");
                pesoAnimale = peso.nextInt();
                Felini.setPesoFelino(pesoAnimale);
                Felini.viewWeightFelino();
                Felini.printVersoFelino();
                countFelini++;
                fine=false;
                break;

            case 2: // Scelta Canide
                System.out.println("Inserisci il nome del Canide");
                nomeAnimale = nome.nextLine();
                Canidi.setNameCanide(nomeAnimale);
                Canidi.viewNameCanide();

                System.out.println("Inserisci il peso del Canide");
                pesoAnimale = peso.nextInt();
                Canidi.setPesoCanide(pesoAnimale);
                Canidi.viewWeightCanide();
                Canidi.printVersoCanide();
                countCanidi++;
                fine=false;
                break;

            case 3: // Scelta Anfibio
                System.out.println("Inserisci il nome dell'Anfibio");
                nomeAnimale = nome.nextLine();
                Anfibi.setNameAnfibio(nomeAnimale);
                Anfibi.viewNameAnfibio();

                System.out.println("Inserisci il peso dell'Anfibio");
                pesoAnimale = peso.nextInt();
                Anfibi.setPesoAnfibio(pesoAnimale);
                Anfibi.viewWeightAnfibio();
                Anfibi.printVersoAnfibio();
                countAnfibi++;
                fine=false;
                break;

            case 4: // Scelta Roditore
                System.out.println("Inserisci il nome del Roditore");
                nomeAnimale = nome.nextLine();
                Roditori.setNameRoditore(nomeAnimale);
                Roditori.viewNameRoditore();

                System.out.println("Inserisci il peso del Roditore");
                pesoAnimale = peso.nextInt();
                Roditori.setPesoRoditore(pesoAnimale);
                Roditori.viewWeightRoditore();
                Roditori.printVersoRoditore();
                countRoditori++;
                fine=false;
                break;

            case 5:
                fine=true;
                break;

            default:
                System.out.println("Inserimento sbagliato!");
                registraIngresso();

        }
    }

    public static void printNamesAndWeights () {
        System.out.println("\nI nomi dei felini sono: " + Felini.getAllNamesFelini());
        System.out.println("Il peso di tutti i felini è di: " + Felini.getAllFeliniWeights());
        System.out.println("Numero Felini registrati: "+countFelini);

        System.out.println("\nI nomi dei Canidi sono: " + Canidi.getAllNamesCanidi());
        System.out.println("Il peso di tutti i Canidi è di: " + Canidi.getAllCanidiWeights());
        System.out.println("Numero Canidi registrati: "+countCanidi);

        System.out.println("\nI nomi dei Anfibi sono: " + Anfibi.getAllNamesAnfibi());
        System.out.println("Il peso di tutti i Anfibi è di: " + Anfibi.getAllAnfibiWeights());
        System.out.println("Numero Anfibi registrati: "+countAnfibi);

        System.out.println("\nI nomi dei Roditori sono: " + Roditori.getAllNamesRoditori());
        System.out.println("Il peso di tutti i Roditori è di: " + Roditori.getAllRoditoriWeights());
        System.out.println("Numero Roditori registrati: "+countRoditori);
    }

}
