package bateaux;


import coordonnees.Coordonnee;
import interfaceBateaux.InterfaceBateau;

import java.util.Arrays;
import java.util.Random;

public class Porteavions implements InterfaceBateau {
    private final Integer TAILLE = 4;
    private boolean direction;
    private Coordonnee[] coordonnees;
    private Integer vie = TAILLE;

    public Porteavions(boolean direccion) {
        this.direction = direccion;
        this.coordonnees = new Coordonnee[this.TAILLE];
        this.genererBateau();
    }

    public void genererBateau() {
        Random r = new Random();
        Integer pos = r.nextInt(10);
        //Integer auxY = r.nextInt(10);

        while (!(pos + TAILLE < 10)) {
            pos = r.nextInt(10);
        }

        //Horizontal
        if (this.direction) {
            for (int i = pos, j = 0; i < pos + TAILLE; i++, j++) {
                coordonnees[j] = new Coordonnee(i, pos);
            }
        } else {
            for (int i = pos, j = 0; i < pos + TAILLE; i++, j++) {
                coordonnees[j] = new Coordonnee(pos, i);
            }
        }
    }


    public Integer getVie() {
        return vie;
    }


    public void setVie(Integer vie) {
        this.vie = vie;
    }


    public boolean isDirection() {
        return direction;
    }


    public void setDirection(boolean direction) {
        this.direction = direction;
    }


    public Coordonnee[] getCoordonnees() {
        return coordonnees;
    }


    public void setCoordonnees(Coordonnee[] coordonnees) {
        this.coordonnees = coordonnees;
    }


    public Integer getTAILLE() {
        return TAILLE;
    }


    @Override
    public String toString() {
        return "Portavions [Taille=" + TAILLE + ", direccion=" + direction
                + ", coordenadas=" + Arrays.toString(coordonnees) + "]";
    }


    @Override
    public boolean verifierTir(Coordonnee tir) {
        // TODO Auto-generated method stub
        boolean tirReussi = false;
        for (int i = 0; i < this.getCoordonnees().length; i++) {
            if (this.getCoordonnees()[i].equals(tir)) {
                System.out.println("T'as atteint le portavion");
                this.vie--;
                tirReussi = true;
                break;
            } else {
                System.out.println("T'as échoué");
                tirReussi = false;
            }
        }
        return tirReussi;
    }

    @Override
    public boolean verifierQueBateauCoule() {
        // TODO Auto-generated method stub
        if (this.vie == 0) {
            return true;
        } else {
            return false;
        }
    }
}
