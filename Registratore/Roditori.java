package Registratore;

import java.util.Scanner;
import java.util.ArrayList;

public class Roditori extends Animale {

    private static ArrayList<String> nomiRoditori = new ArrayList<>();
    public static ArrayList<Integer> pesoRoditori = new ArrayList<>();

    // Costruttore
    public Roditori(ArrayList<String> nomiR, ArrayList<Integer> pesiR) {
        Roditori.nomiRoditori = new ArrayList<>();
        Roditori.pesoRoditori = new ArrayList<>();
    }
    
    // Setter e Getter

    public static String getNameRoditore(int indiceAnimale) {
        return nomiRoditori.get(indiceAnimale);
    }

    public static int getPesoRoditore(int indiceAnimale) {
        return pesoRoditori.get(indiceAnimale);
    }

    public static void setNameRoditore(String nomeInserito) {
        nomiRoditori.add(nomeInserito);
    }

    public static void setPesoRoditore(int pesoInserito) {
        pesoRoditori.add(pesoInserito);
    }

    public static ArrayList<String> getAllNamesRoditori() { // restituisce tutti i nomi
        return nomiRoditori;
    }

    public static ArrayList<Integer> getAllRoditoriWeights() { // restituisce tutti i pesi
        return pesoRoditori;
    }

    // Metodo per visualizzare nel Main
    public static void viewNameRoditore() {
        int index = Roditori.nomiRoditori.indexOf(Main.nomeAnimale);
        System.out.println("Nome inserito: " + getNameRoditore(index));
    }

    public static void viewWeightRoditore() {
        int index2 = Roditori.pesoRoditori.indexOf(Main.pesoAnimale);
        System.out.println("Peso inserito: " + getPesoRoditore(index2));
    }

    public static void printVersoRoditore(){
        String verso = "Squit squit";
        System.out.println("Verso dei Roditori: "+verso);
    }

}
