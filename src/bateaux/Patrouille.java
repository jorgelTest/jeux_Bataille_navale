package bateaux;


import interfaceBateaux.ConstructionBateau;
import static interfaceBateaux.TAILLES.PATROUILLE;

public class Patrouille extends ConstructionBateau {

    public Patrouille(boolean direction) {
        super(direction);
        super.setTaille(PATROUILLE.getTaille());
    }
}


