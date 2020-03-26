package bateaux;

import interfaceBateaux.BateauGenerique;
import static interfaceBateaux.TAILLES.SOUSMARIN;

public class Sousmarin extends BateauGenerique {

    public Sousmarin(boolean direction) {
        super(direction);
        super.setTaille(SOUSMARIN.getTaille());
    }
}
