package champDeBataille;

import coordonnees.Coordonnee;
import interfaceBateaux.BateauGenerique;

import java.util.ArrayList;

public class ChampsDeBataille {

    private ArrayList<BateauGenerique> bateauxSurLeChamp;
    private ArrayList<Coordonnee> tirsReussis;
    private Coordonnee coordoneeTir;

    public ChampsDeBataille() {
        bateauxSurLeChamp = new ArrayList<BateauGenerique>();
        tirsReussis = new ArrayList<Coordonnee>();
    }

    public void ajouterBateau(BateauGenerique bateau) {
        this.bateauxSurLeChamp.add(bateau);
    }

    public void tirer(Coordonnee coordoneeTir) {
        this.coordoneeTir = coordoneeTir;
        boolean disp = false;

        if (this.getTirsReussis().size() == 0) {
            this.getTirsReussis().add(coordoneeTir);
            disp = true;
        } else {
            for (int i = 0; i < this.getTirsReussis().size(); i++) {
                if (getCoordoneeTir().equals(this.getTirsReussis().get(i))) {
                    System.out.println("Le tir a été effectué");
                    disp = false;
                    break;
                } else {
                    System.out.println("Nouveau tir");
                    disp = true;
                    this.getTirsReussis().add(coordoneeTir);
                    break;
                }
            }
        }

        if (disp) {
            for (int i = 0; i < bateauxSurLeChamp.size(); i++) {
                this.bateauxSurLeChamp.get(i).verifierQueBateauCoule();
                if (bateauxSurLeChamp.get(i).verifierTir(this.getCoordoneeTir())) {
                    System.out.println("Tir réussi");
                    break;
                } else {
                    System.out.println("Tir raté");
                }
            }
            System.out.println("Tir effectué");
        } else {
            System.out.println("Le tir n'a pas été effectué car il avait déjà été réalisé");
        }
    }

    public void afficherBateaux() {
        for (int i = 0; i < bateauxSurLeChamp.size(); i++) {
            System.out.println(bateauxSurLeChamp.get(i));
        }
    }

    public ArrayList<BateauGenerique> getBateauxSurLeChamp() {
        return bateauxSurLeChamp;
    }

    public void setBateauxSurLeChamp(ArrayList<BateauGenerique> bateauxSurLeChamp) {
        this.bateauxSurLeChamp = bateauxSurLeChamp;
    }

    public ArrayList<Coordonnee> getTirsReussis() {
        return tirsReussis;
    }

    public void setTirsReussis(ArrayList<Coordonnee> tirsReussis) {
        this.tirsReussis = tirsReussis;
    }

    public Coordonnee getCoordoneeTir() {
        return coordoneeTir;
    }

    public void setCoordoneeTir(Coordonnee coordoneeTir) {
        this.coordoneeTir = coordoneeTir;
    }


}
