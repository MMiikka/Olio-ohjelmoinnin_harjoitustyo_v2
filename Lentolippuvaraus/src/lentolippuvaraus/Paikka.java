package lentolippuvaraus;

public class Paikka {

	/**
	 * Paikka-luokka sisältää asiakkaan, totuusarvon siitä onko paikka vapaa ja paikan numeron.
	 */
	private Asiakas asiakas;
	private boolean vapaa;
	private int numero;
	/**
	 * Paikka-luokan konstruktori.
	 * @param vapaa,	jos paikka on vapaa asetetaan arvoksi true
	 * @param numero,	paikan numero koneessa.
	 */
	public Paikka(boolean vapaa, int numero) {
		this.vapaa = vapaa;
		this.numero = numero;
	}
	/**
	 * Metodilla voidaan kysellä kyseisen paikan omistajaa.
	 * @return Asiakas, palauttaa kyseisen paikan asiakkaan
	 */
	public Asiakas annaAsiakas() {
		return asiakas;
	}
	/**
	 * asetaAsiakas()-metodissa asetetaan paikkaan asiakas.
	 * @param asiakas, tässä tapauksessa ohjelman käyttäjä.
	 * @throws Exception aiheuttaa poikkeuksen, jos asiakasta ei ole luotu.
	 */
	public void asetaAsiakas(Asiakas asiakas) throws Exception {
		
		if(vapaa == true) {
			this.asiakas = asiakas;

		}
		vapaa = false;
		
	}
	/**
	 * Metodi palauttaa koneen vapaat paikat.
	 * @return vapaiden paikkojen lukumäärän.
	 */
	public int annaVapaatPaikat() {
		if(this.vapaa == true) {
			return numero;
		}
		else {
			return 0;
		}
		
	}
	/**
	 * Asettaa Paikka-olion varatuksi
	 * @param vapaa, totuusarvoa käytetetään tässä ohjelmassa paikan määrittelemiseen vapaaksi tai varatuksi
	 */
	public void asetaVarattu(boolean vapaa) {
		this.vapaa = false;
	}
	/**
	 * annaNumero()-metodi palauttaa paikan numeron
	 * @return numero, paikan numero
	 */
	public int annaNumero() {
		return this.numero;
	}
	/**
	 * Metodilla voidaan tiedustella tietyn Paikka-olion tilaa.
	 * @return vapaa, palauttaa tiedon, onko paikka vapaa.
	 */
	public boolean vapaa() {
		return vapaa;
	}
}
