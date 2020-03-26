package bateaux;


import coordonnees.Coordonnee;
import interfaceBateaux.InterfaceBateau;

import java.util.Arrays;
import java.util.Random;

public class Patrouille implements InterfaceBateau {

    private final Integer TAILLE = 1;
    private boolean direction;
    private Coordonnee[] coordonnees;
    private Integer vie = TAILLE;


    public Patrouille(boolean direccion) {
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

	@Override
	public boolean verifierTir(Coordonnee tir) {
		// TODO Auto-generated method stub
		boolean atino = false;
		for (int i = 0; i < this.getCoordonnees().length; i++) {
			if (this.getCoordonnees()[i].equals(tir)) {
				System.out.println("La patrouille a été atteinte");
				this.vie--;
				atino = true;
				break;
			} else {
				System.out.println("échec");
				atino = false;
			}
		}
		return atino;
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

    public Integer getVie() {
        return vie;
    }

    public void setVie(Integer vie) {
        this.vie = vie;
    }

    public Integer getTAILLE() {
        return TAILLE;
    }

    @Override
    public String toString() {
        return "Patrouille [Taille=" + TAILLE + ", direction=" + direction
                + ", coordonnees=" + Arrays.toString(coordonnees) + "]";
    }


}
