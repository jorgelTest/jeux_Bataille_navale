package interfaceBateaux;
import coordonnees.Coordonnee;

import java.util.Arrays;
import java.util.Random;

public abstract class BateauAbstrait {
    private final Integer TAILLE=0;
    private boolean direction;
    private Coordonnee[] coordonnees;
    private Integer vie = TAILLE;
    /**
     * Constructeur qui recoit un boolean qui aidera avec la direction du bateau
     * true = horizontal,
     * false = vertical
     * @param direction
     */
    public BateauAbstrait(boolean direction) {
        this.direction = direction;
        this.genererBateau();
    }
    //------------------------------------------------------------------------------------------------------------------
    /**
     * Position aléatoire d'un bateau
     */
    public void genererBateau() {
        Random r = new Random();
        Integer pos = r.nextInt(10);
        //Integer auxY = r.nextInt(10);
        while (!(pos + TAILLE < 10)) {
            pos = r.nextInt(10);
        }
        //Horizontal X
        if (this.direction) {
            for (int i = pos, j = 0; i < pos + TAILLE; i++, j++) {
                coordonnees[j] = new Coordonnee(i, pos);
            }
        } else {//ou vertical Y
            for (int i = pos, j = 0; i < pos + TAILLE; i++, j++) {
                coordonnees[j] = new Coordonnee(pos, i);
            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public boolean verifierTir(Coordonnee tir) {
        // TODO Auto-generated method stub
        boolean tirReussi = false;
        for (int i = 0; i < this.getCoordonnees().length; i++) {
            if (this.getCoordonnees()[i].equals(tir)) {
                System.out.println("T'as atteint le" + this.getClass().getName());//nom du navire atteint
                this.vie--;
                tirReussi = true;
                break;
            } else {
                System.out.println("t'as échoué");
                tirReussi = false;
            }
        }
        return tirReussi;
    }
    //------------------------------------------------------------------------------------------------------------------
    public boolean verifierQueBateauCoule() {
        if (this.vie == 0) {
            return true;
        } else {
            return false;
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public Integer getVie() {
        return vie;
    }
    //------------------------------------------------------------------------------------------------------------------
    public void setVie(Integer vie) {
        this.vie = vie;
    }
    //------------------------------------------------------------------------------------------------------------------
    public boolean isDireccion() {
        return direction;
    }
    //------------------------------------------------------------------------------------------------------------------
    public void setDireccion(boolean direccion) {
        this.direction = direccion;
    }
    //------------------------------------------------------------------------------------------------------------------
    public Coordonnee[] getCoordonnees() {
        return coordonnees;
    }
    //------------------------------------------------------------------------------------------------------------------
    public void setCoordonnees(Coordonnee[] coordonnees) {
        this.coordonnees = coordonnees;
    }
    //------------------------------------------------------------------------------------------------------------------
    public Integer getTaille() {
        return TAILLE;
    }
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return this.getClass().getName() + "[TAILLE=" + TAILLE + ", direccion=" + direction
                + ", coordonnées=" + Arrays.toString(coordonnees) + "]";
    }
}
