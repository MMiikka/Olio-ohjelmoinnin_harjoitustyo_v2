package lentolippuvaraus;

import java.util.ArrayList;

public class Lentokone {
/**
 * Lentokone luokasta luodaan ohjelman lentokone-oliot. Oliot sisältävät merkkijonon malli, listan lentokoneen sisältämistä paikoista. Ja enum arvon siitä mihin kyseinen kone lentää.
 */
	private String malli;
	private ArrayList<Paikka> paikat;
	private Maat maa;
	/**
	 * Lentokone-luokan konstruktori. Luontivaiheessa koneelle annetaan istumapaikat ja maa.
	 * @param paikat Lista paikoista, johon voidaan asettaa asiakas-olio
	 * @param maa	Maa, johon kyseinen kone lentää.
	 */
	public Lentokone(ArrayList<Paikka> paikat, Maat maa) {
		this.paikat = paikat;
		this.maa = maa;
		
	}
	/**
	 * Metodissa asetetaan merkkijonona koneen malli.
	 * @param malli, Koneen malli.
	 */
	public void asetaMalli(String malli) {
		this.malli = malli;
	}
	/**
	 * Palauttaa listana koneen Paikka-oliot.
	 * @return ArrayList, jossa paikka-oliot kyseisellä koneella.
	 */
	public ArrayList<Paikka> annaPaikat(){
		
		return this.paikat;
	}
	/**
	 * Palauttaa Maan.
	 * @return Maat maa, maa johon kone lentää
	 */
	public Maat annaMaa() {
		return maa;
	}
	/**
	 * Metodia käytetään silloin kun pitää vertailla koneiden malleja keskenään
	 * @return malli, palauttaa koneen mallin
	 */
	public String annaMalli() {
		return this.malli;
	}
	
	/**
	 * toString() metodin ylikirjoitus, joka palauttaa koneen mallin merkkijonona
	 * @return malli, merkkijonona
	 */
	public String toString() {
		return malli;
	}

}
