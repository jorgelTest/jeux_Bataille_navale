package bateaux;

import interfaceBateaux.ConstructionBateau;
import static interfaceBateaux.TAILLES.SOUSMARIN;

public class Sousmarin extends ConstructionBateau {

    public Sousmarin(boolean direction) {
        super(direction);
        super.setTaille(SOUSMARIN.getTaille());
    }
}
