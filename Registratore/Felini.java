package Registratore;
import java.util.Scanner;
import java.util.ArrayList;

public class Felini extends Animale {

    private static ArrayList<String> nomiFelini = new ArrayList<>();
    public static ArrayList<Integer> pesoFelini = new ArrayList<>();
    
    // Costruttore
    public Felini (ArrayList<String> nomiF, ArrayList<Integer> pesiF){
        Felini.nomiFelini = new ArrayList<>();
        Felini.pesoFelini = new ArrayList<>();
    }

        // Getter
        public static String getNameFelino(int indiceAnimale){
            return nomiFelini.get(indiceAnimale);
        }
        public static int getPesoFelino(int indiceAnimale){
            return pesoFelini.get(indiceAnimale);
        }

        public static ArrayList<String> getAllNamesFelini(){  // restituisce tutti i nomi
            return nomiFelini;
        }

        public static ArrayList<Integer> getAllFeliniWeights(){ // restituisce tutti i pesi
            return pesoFelini;
        }
        // Setter
        public static void setNameFelino(String nomeInserito){
            nomiFelini.add(nomeInserito);
        }

        public static void setPesoFelino(int pesoInserito){
            pesoFelini.add(pesoInserito);
        }

        // Metodo per visualizzare nel Main
        public static void viewNameFelino(){
            int index = Felini.nomiFelini.indexOf(Main.nomeAnimale);
            System.out.println("Nome inserito: " + getNameFelino(index));
        }

        public static void viewWeightFelino(){
            int index2 = Felini.pesoFelini.indexOf(Main.pesoAnimale);
            System.out.println("Peso inserito: " + getPesoFelino(index2));
        }

        public static void printVersoFelino(){
            String verso = "Miao";
            System.out.println("Verso dei Canidi: "+verso);
        }
}
