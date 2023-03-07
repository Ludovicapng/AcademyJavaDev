package SetteMarzo;

import java.util.Scanner;

public class Moto extends Veicolo {

    public String tipoMoto;
    public int cilindrataMoto;
    public int potenzaMoto;

    public Scanner insTipo = new Scanner(System.in);
    public Scanner insCilindrata = new Scanner(System.in);
    public Scanner insPotenza = new Scanner(System.in);

    public Moto(String marca, String modello, int annoFabbr, int cilindrata, String tipologia, int potenza) {
        super(marca, modello, annoFabbr);
        this.cilindrataMoto = cilindrata;
        this.tipoMoto = tipologia;
        this.potenzaMoto = potenza;
    }

    // Getter e Setter
    public void setTipoMoto() {
        tipoMoto = insTipo.nextLine();
    }
    public void setCilindrata() {
        cilindrataMoto = insCilindrata.nextInt();
    }
    public void setPotenza() {
        potenzaMoto = insPotenza.nextInt();
    }
    public String getTipoMoto() {
        return tipoMoto;
    }
    public int getCilindrata() {
        return cilindrataMoto;
    }
    public int getPotenza() {
        return potenzaMoto;
    }
}
