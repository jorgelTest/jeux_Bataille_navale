package bateaux;


import coordonnees.Coordonnee;
import interfaceBateaux.BateauAbstrait;
import interfaceBateaux.InterfaceBateau;

import java.util.Arrays;
import java.util.Random;

public class Bateau extends BateauAbstrait {

    private final Integer TAILLE = 5;

    public Bateau(boolean direction) {
        super(direction);
        this.setCoordonnees(new Coordonnee[this.TAILLE]);
    }

}
