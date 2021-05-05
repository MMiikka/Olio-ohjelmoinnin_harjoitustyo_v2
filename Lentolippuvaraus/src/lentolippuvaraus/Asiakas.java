package lentolippuvaraus;

import java.io.File;
import java.util.Random;

public class Asiakas {
/**
 * Asiakas luokassa luodaan varausjärjestelmälle asiakas. Asiakaan ominaisuuksiin kuuluvat ID, etunimi, sukunimi ja paikka
 */
	private String id;
	private String etunimi;
	private String sukunimi;
	private Paikka paikka;
	/**
	 * Asiakas-luokan konstruktori. Asiakkaan muut ominaisuudent luodaan ohjelman kuluessa.
	 * @param etunimi, asiaakkaan etunimi
	 * @param sukunimi, asiakkaan sukunimi
	 */
	public Asiakas(String etunimi, String sukunimi) {
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		
	}
	/**
	 * Metodi poistaa asiakkaalta paikan.
	 */
	public void poistaPaikka() {
		this.paikka = null;
	}
	/**
	 * annaNimi() metodissa luodaan asiakkaalle koko nimi tulostusta varten.
	 * @return palauttaa asiakkaan etunimen ja sukunimen
	 */
	public String annaNimi() {
		
		return  etunimi + " " + sukunimi; 
	}
	/**
	 * asetaPaikka() metodissa asetetaan asiakkaalle paikka varauksen jälkeen
	 * @param paikka, asiakkaan paikka lentokoneessa
	 */
	public void asetaPaikka(Paikka paikka) {
	  this.paikka = paikka;
  }
  	/**
  	 * Metodi palauttaa asiakkan paikan
  	 * @return paikka, palauttaa paikan
  	 */
	public Paikka annaPaikka() {
	  return paikka;
  }
	/**
	 * onkoPaikka() palauttaa totuus-arvon siitä, onko tietty paikka vapaa vai ei
	 * @return totuusarvo paikan ollessa varattu tai vapaa.
	 */
  	public boolean onkoPaikka() {
	  if(this.paikka == null) {
		  return false;
	  }else {return true;
	  }
  }
  /**
   * asetaID() antaa asiakkaalle ID:n kun asiakas on luoto
   * @param asiakas, parametrina asiakas, jolle ID halutaan luoda
   */
  	public void asetaID(Asiakas asiakas){
	  
	  Random r = new Random();
	  int rdn = r.nextInt(100);
	  this.id = "" + rdn;
  }
  	/**
  	 * asetaID() antaa asiakkaalle ID:n vanhan varauksen pohjalta.
  	 * @param id, edellisen varauksen ID.
  	 */
  	public void asetaID(String id) {
	  this.id = id;
  }
 /**
  * annaID() palauttaa asiakkaan id:n.
  * @return id, palauttaa asiakkaan ID:n
  */
	public String annaID() {
	  return id;
  }
	/**
	 * Metodi ylikirjoittaa toString() metodin ja palauttaa asiakkaan nimen, paikan numeron, ja id:n merkkijonona.
	 * @return merkkijono, jossa asiakkaan nimi, paikan numero ja ID.
	 */
	public String toString() {
		
		return "Asiakas: " + annaNimi() + " Paikan numero " + annaPaikka().annaNumero() + " ID: " + annaID();
	}
}
