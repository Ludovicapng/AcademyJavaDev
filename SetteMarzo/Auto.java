package SetteMarzo;

import java.util.Scanner;

public class Auto extends Veicolo {

    public String tipoCarburante;
    public int consumoMedio;
    public int numeroPorte;

    public Scanner insCarb = new Scanner(System.in);
    public Scanner insConsumo = new Scanner(System.in);
    public Scanner insPorte = new Scanner(System.in);

    public Auto(String marca, String modello, int annoFabbr, int numPorte, String tipoCarb, int consMedio) {
        super(marca, modello, annoFabbr);
        this.numeroPorte = numPorte;
        this.tipoCarburante = tipoCarb;
        this.consumoMedio = consMedio;
    }

    // Getter e Setter
    public void setTipoCarburante() {
        tipoCarburante = insCarb.nextLine();
    }
    public void setConsumoMedio() {
        consumoMedio = insConsumo.nextInt();
    }
    public void setNumeroPorte() {
        numeroPorte = insPorte.nextInt();
    }
    public String getTipoCarburante() {
        return marcaVeicolo;
    }
    public int getConsumoMedio() {
        return consumoMedio;
    }
    public int getNumeroPorte() {
        return numeroPorte;
    }
}
