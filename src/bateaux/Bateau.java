package bateaux;

import interfaceBateaux.BateauGenerique;
import static interfaceBateaux.TAILLES.BATEAU;

public class Bateau extends BateauGenerique {

    public Bateau(boolean direction) {
        super(direction);
        super.setTaille(BATEAU.getTaille());
    }
}
