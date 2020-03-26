package bateaux;


import interfaceBateaux.BateauGenerique;
import static interfaceBateaux.TAILLES.PATROUILLE;

public class Patrouille extends BateauGenerique {

    public Patrouille(boolean direction) {
        super(direction);
        this.setTaille(PATROUILLE.getTaille());
    }
}


