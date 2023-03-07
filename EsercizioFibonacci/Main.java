package EsercizioFibonacci;


public class Main {    
    public static void main (String [] args)
    {
        MenuFibonacci myMenu = new MenuFibonacci();
        Connessione connessione = new Connessione("jdbc:mysql://localhost:3306/fibonacci", "root", "WHdawjkde17263cia!");
        
        connessione.CreaConnessione();

        myMenu.MenuNavigazione();
    }
}