package bateaux;

import interfaceBateaux.BateauGenerique;
import static interfaceBateaux.TAILLES.INTERCEPTEUR;

public class Intercepteur extends BateauGenerique {

    public Intercepteur(boolean direction) {
        super(direction);
        super.setTaille(INTERCEPTEUR.getTaille());
    }
}
