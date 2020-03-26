import bateaux.*;
import champDeBataille.ChampsDeBataille;
import coordonnees.Coordonnee;
import org.omg.PortableInterceptor.Interceptor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int corX = 0;
        int corY = 0;
        Coordonnee tir;
        ChampsDeBataille champs = new ChampsDeBataille();

        //Bateau 1
        Bateau bb = new Bateau(true);
        //Bateau 2
        Intercepteur inter = new Intercepteur(false);
        //Bateau 3
        Patrouille pat = new Patrouille(false);
        //Bateau 4
        Porteavions porta = new Porteavions(true);
        //Bateau 5
        Sousmarin sub = new Sousmarin(true);

        //Ajouter les bateaux
        champs.ajouterBateau(bb);
        champs.ajouterBateau(inter);
        champs.ajouterBateau(pat);
        champs.ajouterBateau(porta);
        champs.ajouterBateau(sub);

        //Imprimer les bateaux
        champs.afficherBateaux();

        while(!(bb.verifierQueBateauCoule() && inter.verifierQueBateauCoule() && pat.verifierQueBateauCoule() &&
                porta.verifierQueBateauCoule() && sub.verifierQueBateauCoule())){
            System.out.println("Donne coordonnee X");
            corX = t.nextInt();
            System.out.println("Donne coordonnee Y");
            corY = t.nextInt();
            tir = new Coordonnee(corX,corY);
            System.out.println("Le tir était en : " + tir);

            champs.tirer(tir);


        }

    }
}
