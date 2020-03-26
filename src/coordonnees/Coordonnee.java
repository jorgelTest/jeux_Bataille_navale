package coordonnees;

public class Coordonnee {
	private Integer coordX;
	private Integer coordY;
	/**
	 * Methode qui recoit 2 parametrès, ils recevront comme arguments "x" et "y" d'une coordonnee
	 * @param coordX
	 * @param coordY
	 */
	
	public Coordonnee(Integer coordX, Integer coordY) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
	}
	/**
	 * Surcharge de la méthode equals, qui recevra un objet. la méthode ser à comparer si 2 coordonnees sont égales
	 * @param coordonee
	 */
	public boolean equals(Object coordonee){
		if( (coordonee instanceof Coordonnee) && (((Coordonnee) coordonee).getCoordX().equals(this.coordX) &&  ((Coordonnee) coordonee).getCoordY() == this.coordY) ){
			return true;
		}else{
			return false;
		}
	}
    //------------------------------------------------------------------------------------------------------------------
	public Integer getCoordX() {
		return coordX;
	}
	//------------------------------------------------------------------------------------------------------------------
	public void setCoordX(Integer coordX) {
		this.coordX = coordX;
	}
	//------------------------------------------------------------------------------------------------------------------
	public Integer getCoordY() {
		return coordY;
	}
	//------------------------------------------------------------------------------------------------------------------
	public void setCoordY(Integer coordY) {
		this.coordY = coordY;
	}
	//------------------------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Coordonnee [coordX=" + coordX + ", coordY=" + coordY + "]";
	}
}
