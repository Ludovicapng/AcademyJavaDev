package Registratore;

import java.util.Scanner;
import java.util.ArrayList;

public class Canidi extends Animale {

    private static ArrayList<String> nomiCanidi = new ArrayList<>();
    public static ArrayList<Integer> pesoCanidi = new ArrayList<>();

    // Costruttore
    public Canidi(ArrayList<String> nomiC, ArrayList<Integer> pesiC) {
        Canidi.nomiCanidi = new ArrayList<>();
        Canidi.pesoCanidi = new ArrayList<>();
    }

    // Getter
    public static String getNameCanide(int indiceAnimale) {
        return nomiCanidi.get(indiceAnimale);
    }

    public static int getPesoCanide(int indiceAnimale) {
        return pesoCanidi.get(indiceAnimale);
    }

    public static ArrayList<String> getAllNamesCanidi() { // restituisce tutti i nomi
        return nomiCanidi;
    }

    public static ArrayList<Integer> getAllCanidiWeights() { // restituisce tutti i pesi
        return pesoCanidi;
    }
    // Setter

    public static void setNameCanide(String nomeInserito) {
        nomiCanidi.add(nomeInserito);
    }

    public static void setPesoCanide(int pesoInserito) {
        pesoCanidi.add(pesoInserito);
    }

    // Metodo per visualizzare nel Main
    public static void viewNameCanide() {
        int index = Canidi.nomiCanidi.indexOf(Main.nomeAnimale);
        System.out.println("Nome inserito: " + getNameCanide(index));
    }

    public static void viewWeightCanide() {
        int index2 = Canidi.pesoCanidi.indexOf(Main.pesoAnimale);
        System.out.println("Peso inserito: " + getPesoCanide(index2));
    }

    public static void printVersoCanide(){
        String verso = "Bau bau";
        System.out.println("Verso dei Canidi: "+verso);
    }

}
