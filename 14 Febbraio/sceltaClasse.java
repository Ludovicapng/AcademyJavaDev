import java.util.Scanner;

public class sceltaClasse {
    public static void main(String[] args) {

        Scanner scelta = new Scanner(System.in);
        String sceltaOpzione;

        System.out.println("Inserisci la scelta per la classe:\nA -> Calcolatrice\nB -> Calendario");
        sceltaOpzione = scelta.nextLine();
        switch(sceltaOpzione){

            case "A": // Classe Calcolatrice

            Scanner num = new Scanner(System.in);  // Scanner primo numero
            double primoNumero;
    
            Scanner num2 = new Scanner(System.in); // Scanner secondo numero
            double secondoNumero;
    
            Scanner str1 = new Scanner(System.in); // Scanner stringa
            String operazione;
    
            System.out.println("Inserisci il primo numero"); // Inserimento primo numero
            primoNumero = num.nextDouble();
    
            System.out.println("Inserisci il secondo numero"); // Inserimento secondo numero
            secondoNumero = num2.nextDouble();
    
            System.out.println("Inserisci l'operazione\n+ per addizione\n- per sottrazione\n* per moltiplicazione\n: per divisione\nsqr per radice quadrata.");
            operazione = str1.nextLine(); // Inserimento stringa scelta
    
            // -------- Condizioni per le operazioni -------
            if(operazione.equals("+")) {                             // if addizione
                double somma = primoNumero + secondoNumero;
                System.out.println("La somma è pari a: " +somma);
            } else if(operazione.equals("-")){                       // if sottrazione
                double sottrazione = primoNumero - secondoNumero;
                System.out.println("La sottrazione è pari a: " +sottrazione);
            } else if(operazione.equals("*")){                       // if moltiplicazione
                double moltiplicazione = primoNumero * secondoNumero;
                System.out.println("La moltiplicazione è: " +moltiplicazione);
            } else if(operazione.equals(":")){                       // if divisione
                double divisione = primoNumero/secondoNumero;
                System.out.println("La divisione è: " +divisione);
            } else if(operazione.equals("sqr")) {                    // if radice quadrata
                double sqr1 = Math.abs(primoNumero);
                double sqr2 = Math.abs(secondoNumero);
                System.out.println("La radice quadrata del primo numero è: " +sqr1);
                System.out.println("La radice quadrata del secondo numero è: " +sqr2);
            } else {
                System.out.println("Inserisci un operatore corretto."); // caso di stringa non riconosciuta|operatore errato
            }
    
                num.close();
                num2.close();
                str1.close();
            
            break;

            case "B": // Classe Calendario

            Scanner day = new Scanner(System.in);
            int chosenDay;
            System.out.println("Inserisci il giorno: "); // Inserimento numerico del giorno
            chosenDay = day.nextInt();

             switch (chosenDay) {
              case 1:
                System.out.println("Monday");
                break;
              case 2:
                System.out.println("Tuesday");
                break;
              case 3:
                System.out.println("Wednesday");
                break;
              case 4:
                System.out.println("Thursday");
                break;
              case 5:
                System.out.println("Friday");
                break;
              case 6:
                System.out.println("Saturday");
                break;
              case 7:
                System.out.println("Sunday");
                break;
}
            break;
        }

    }
}
