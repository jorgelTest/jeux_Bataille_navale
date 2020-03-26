package interfaceBateaux;
import coordonnees.Coordonnee;

public interface InterfaceBateau {
	
	/**
	 * Cette méthode verifie si le tir a atteint sa cible
	 * @return boolean
	 */
	public boolean verifierTir(Coordonnee tir);


	/**
	 * Cette méthode vérifie si le bateau coule
	 * @return boolean
	 */

	public boolean verifierQueBateauCoule();

}
