import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

// Test connessione al Database

import java.util.Scanner;

class Prova {

    public static Scanner ricerca = new Scanner(System.in);
    public static int searchNumber;

    public static void main(String args[]) {

        // Dichiarazione Scanner
        Scanner contatore = new Scanner(System.in);
        int count;

        // Inserimento contatore
        System.out.println("Inserisci un numero");
        count = contatore.nextInt();

        // Stampa di 0, 1, 1
        int n1 = 0, n2 = 1, n3, i;
        System.out.print(n1 + " " + n2);

        for (i = 2; i < count; ++i) {

            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

            // Controllo pari | dispari con stampa
            if (n3 % 2 == 0) {
                System.out.println("\t| Pari");
            } else {
                System.out.println("\t| Dispari");
            }

        }

        System.out.println("Inserisci il numero che stai cercando");
        searchNumber=ricerca.nextInt();
        ricercaNumero(searchNumber);

        String url = "jdbc:mysql://localhost:3306/world";
        Connection myConnection = null;
        try {
            myConnection = DriverManager.getConnection(url, "root", "WHdawjkde17263cia!");
            if (myConnection != null) {
                System.out.println("Connessione avvenuta.");
            } else {
                System.out.println("Connessione fallita.");
            }
            // Prova lettura db
            String query = "SELECT * FROM city LIMIT 5";
            Statement stm = myConnection.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
            String tableFormat = String.format("ID: %s Name: %s CountryCode: %s District: %s Population: %s",
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5));
            System.out.println(tableFormat);

             }
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int ricercaNumero(int num) {
        if (num < 2) {
            return num;
        } else {
            return ricercaNumero(num - 1) + ricercaNumero(num - 2);
        }
    }
}
