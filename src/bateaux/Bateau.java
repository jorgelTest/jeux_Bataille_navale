package bateaux;

import interfaceBateaux.ConstructionBateau;
import static interfaceBateaux.TAILLES.BATEAU;

public class Bateau extends ConstructionBateau {

    public Bateau(boolean direction) {
        super(direction);
        super.setTaille(BATEAU.getTaille());
    }



}
