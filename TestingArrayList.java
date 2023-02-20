import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.NumberUp;

public class TestingArrayList {


    public static Scanner answer = new Scanner(System.in);
    public static int numericAnswer;

    public static Scanner list = new Scanner(System.in);
    public static String chooseList;

    public static String album[]={"Folklore","Evermore","1989","Speak Now","Midnights","Taylor Swift (2006)","Fearless","Reputation","Red","Lover"};
    public static String songs[]={"Tim McGraw","End Game","Don't Blame Me","Call It What You Want"};

    public static Scanner inserimento = new Scanner(System.in);
    public static String nomeDaInserire;

    public static void main(String[] args){


        menuPrincipale();

    }

    public static void menuPrincipale(){
        System.out.println("Digita 1 per VISUALIZZARE.\nDigita 2 per AGGIUNGERE\nDigita 3 per TERMINARE");
        numericAnswer = answer.nextInt();
        if (numericAnswer==1) {
            Visualizzazione();
    } else if (numericAnswer==2) {
        Modifica();
    } else if (numericAnswer==3) {

    } else {
        System.out.println("Inserimento errato!");
        menuPrincipale();
    }
}

    public static void Visualizzazione(){
        
        System.out.println("Cosa vuoi visualizzare?\nDigita 'album' per visualizzare la lista di Album disponibili\nDigita 'songs' per visualizzare la lista di singoli disponibili.");
        chooseList = list.nextLine();
        if (chooseList.equalsIgnoreCase("album")){
            System.out.println("Lista album: "+Arrays.toString(album));
            menuPrincipale();

        } else if (chooseList.equalsIgnoreCase("songs")) {
                System.out.println("Lista singoli: "+Arrays.toString(songs));
                menuPrincipale();

        } else{
            Visualizzazione();
        }
        

}
    public static void Modifica(){
        System.out.println("Quale lista vuoi modificare?\nDigita 'album' per modificare la lista degli album\nDigita 'songs' per modificare la lista dei singoli");
            chooseList = list.nextLine();

            if (chooseList.equalsIgnoreCase("album")){
                System.out.println("Inserisci l'album da aggiungere: ");
                nomeDaInserire = inserimento.nextLine();

                ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(album));
                arrayList .add(nomeDaInserire);
                album = arrayList.toArray(album);
                System.out.println("Lista dopo aver aggiunto l'elemento: "+Arrays.toString(album));
                menuPrincipale();


            } else if (chooseList.equalsIgnoreCase("songs")) {
                System.out.println("Inserisci il singolo da aggiungere: ");
                nomeDaInserire = inserimento.nextLine();

                ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(songs));
                arrayList .add(nomeDaInserire);
                songs = arrayList.toArray(songs);
                System.out.println("Lista dopo aver aggiunto l'elemento: "+Arrays.toString(songs));
                menuPrincipale();

            } else {
                System.out.println("Errore.");
            }
}

}
