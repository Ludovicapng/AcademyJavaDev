package SetteMarzo;
import java.util.Scanner;

public class Veicolo {
    
    public String marcaVeicolo;
    public String modelloVeicolo;
    public int annoFabbricazioneVeicolo;

    public Scanner insMarca = new Scanner(System.in);
    public Scanner insModello = new Scanner(System.in);
    public Scanner insAnno = new Scanner(System.in);

    public Veicolo(String marca, String modello, int annoFabbr) {
        this.marcaVeicolo = marca;
        this.modelloVeicolo = modello;
        this.annoFabbricazioneVeicolo = annoFabbr;
    }

    // Getter e Setter
    public void setMarcaVeicolo(String marcaInserita){
        marcaVeicolo = insMarca.nextLine();
    }
    public void setModelloVeicolo(){
        modelloVeicolo = insModello.nextLine();
    }
    public void setAnnoFabbricazione(){
        annoFabbricazioneVeicolo = insAnno.nextInt();
    }
    public String getMarcaVeicolo(){
        return marcaVeicolo;
    }
    public String getModelloVeicolo(){
        return modelloVeicolo;
    }
    public int getAnnoVeicolo(){
        return annoFabbricazioneVeicolo;
    }
}
