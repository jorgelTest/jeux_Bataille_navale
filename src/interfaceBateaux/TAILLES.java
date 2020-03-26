package interfaceBateaux;

public enum TAILLES {
    BATEAU(5), INTERCEPTEUR(2), PATROUILLE(1), PORTAVION(4), SOUSMARIN(3);

    int taille;

    TAILLES(int taille) {
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }
    public int getSizz() {
        return 5;
    }
}
