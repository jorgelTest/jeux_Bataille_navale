package bateaux;

import coordonnees.Coordonnee;
import interfaceBateaux.BateauGenerique;

import static interfaceBateaux.TAILLES.BATEAU;
import static interfaceBateaux.TAILLES.INTERCEPTEUR;

public class Intercepteur extends BateauGenerique {

    public Intercepteur(boolean direction) {
        super(direction);

    }
}
