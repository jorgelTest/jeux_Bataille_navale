package bateaux;

import interfaceBateaux.ConstructionBateau;
import static interfaceBateaux.TAILLES.INTERCEPTEUR;

public class Intercepteur extends ConstructionBateau {

    public Intercepteur(boolean direction) {
        super(direction);
        super.setTaille(INTERCEPTEUR.getTaille());
    }
}
