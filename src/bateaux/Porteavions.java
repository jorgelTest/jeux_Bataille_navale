package bateaux;


import interfaceBateaux.ConstructionBateau;
import static interfaceBateaux.TAILLES.PORTAVION;

public class Porteavions extends ConstructionBateau {

    public Porteavions(boolean direction) {
        super(direction);
        super.setTaille(PORTAVION.getTaille());
    }
}

