package Registratore;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Anfibi extends Animale {

    private static ArrayList<String> nomiAnfibi = new ArrayList<>();
    public static ArrayList<Integer> pesoAnfibi = new ArrayList<>();


    // Costruttore
    public Anfibi(ArrayList<String> nomiA, ArrayList<Integer> pesiA) {
        Anfibi.nomiAnfibi = new ArrayList<>();
        Anfibi.pesoAnfibi = new ArrayList<>();
    }

    // Getter
    public static String getNameAnfibio(int indiceAnimale) {
        return nomiAnfibi.get(indiceAnimale);
    }

    public static ArrayList<String> getAllNamesAnfibi() { // restituisce tutti i nomi
        return nomiAnfibi;
    }

    public static ArrayList<Integer> getAllAnfibiWeights() { // restituisce tutti i pesi
        return pesoAnfibi;
    }

    public static int getPesoAnfibio(int indiceAnimale) {
        return pesoAnfibi.get(indiceAnimale);
    }

    // Setter
    public static void setNameAnfibio(String nomeInserito) {
        nomiAnfibi.add(nomeInserito);
    }

    public static void setPesoAnfibio(int pesoInserito) {
        pesoAnfibi.add(pesoInserito);
    }

    // Metodo per visualizzare nel Main
    public static void viewNameAnfibio() {
        int index = Anfibi.nomiAnfibi.indexOf(Main.nomeAnimale);
        System.out.println("Nome inserito: " + getNameAnfibio(index));
    }

    public static void viewWeightAnfibio() {
        int index2 = Anfibi.pesoAnfibi.indexOf(Main.pesoAnimale);
        System.out.println("Peso inserito: " + getPesoAnfibio(index2));
    }

    public static void printVersoAnfibio(){
        String verso = "Inesistente";
        System.out.println("Verso degli Anfibi: "+verso);
    }
}
