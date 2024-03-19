package no.hvl.dat102.bilskilt;

public interface HashTabellADT {
	/**
	 * Legger et nytt element til ordboka. Om søkenøkkelen allerede finnes i
	 * ordboken, så vil tilhørende verdi bli erstattet med ny verdi.
	 * 
	 * @param nokkel Nøkkel for det nye elementet (kan være del av verdi).
	 * @param verdi  Verdi knyttet til nøkkelen.
	 * @return Enten null om det nye elementet er lagt til ordboken eller gammel
	 *         verdi om verdien erstattet verdi fra før.
	 * 
	 */
	String leggTil(String s);

	/**
	 * Fjerner et gitt element fra ordboken.
	 * 
	 * @param nokkel Nøkkel til element som skal fjernast.
	 * @return Enten verdien knytta til nøkklelen om den finnes eller null om den
	 *         ikke finnes.
	 */
	String fjern(String s);

	/**
	 * Henter verdien knyttet til gitt søkenøkkel.
	 * 
	 * @param nokkel Nøkkel til elementet som man søker etter.
	 * @return Enten verdien knytta til nøkklelen om den finnes eller null om den
	 *         ikke finnes.
	 */
	String getVerdi(String s);

	/**
	 * Sjekker om element med gitt søkenøkkel finnes i ordboka.
	 * 
	 * @param nokkel Nøkkel til ønsket element.
	 * @return True om elementet med gitt nøkkel finnes i ordboka.
	 */
	boolean inneholder(String s);


	boolean erTom();

	
	int getAntall();

	/** Fjerner alle elementer fra ordboka. */
	void toem();

}
