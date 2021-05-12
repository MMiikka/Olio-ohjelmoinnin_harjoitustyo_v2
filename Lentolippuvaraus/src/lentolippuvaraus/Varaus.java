package lentolippuvaraus;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Varaus{
/**
 * Varaus-luokassa luodaan varaus, jonka tietoihin kuuluu: Lentokone-olio, maa, asiakas-olio, ID ja paikka.
 */
	private File f = new File("varaus.txt");
	
	
	private Lentokone lentokone;
	private Maat maa;
	private Asiakas asiakas;
	private String id;
	private Paikka paikka;
	/**
	 * Varauksen oletuskonstruktori
	 */
	public Varaus() {
		
	}
	/**
	 * Varaus-olion konstruktori.
	 * @param asiakas, Käyttäjästä luotu olio.
	 * @param paikka, Varauksen Paikka-olio lentokoneesta.
	 * @param lentokone, Lentokone, johon varaus sisältyy.
	 * @param maa, Maa johon lentokone lentää.
	 */
	public Varaus(Asiakas asiakas, Paikka paikka, Lentokone lentokone, Maat maa) {
		this.asiakas = asiakas;
		this.paikka = paikka;
		this.lentokone = lentokone;
		this.maa = maa;
		
	}
	/**
	 * Asettaa varaukselle ID:n
	 * @param id, Varauksen ID.
	 */
	public void asetaVarauksenID(String id) {
		this.id = id;
	}
	/**
	 * Palauttaa tietyn asiakkaan ID:n varauksesta
	 * @param asiakas, Käyttäjästä luotu olio
	 * @return ID, merkkijonona
	 */
	public String annaVarauksenID(Asiakas asiakas) {
		return asiakas.annaID();
	}

	
	/**
	 * Metodi, joka helpottaa varauksen perusteella kyseisen koneen tunnistamista
	 * @param f tiedosto, josta varaus luetaan
	 * @return palauttaa koneen mallin merkkijonona
	 * @throws Exception , jos tiedoston luku epäonnistuu
	 */
	public String[] lueVarauksenTiedot(File f) throws Exception{
		List<String> varaus = new ArrayList<>();
		varaus = Files.readAllLines(f.toPath());
		String[] solut = new String[6];
		for(String s : varaus) {
			solut = s.split(",");
		}
		
		return solut;
	}
	/**
	 * Metodi, jolla luetaan vanhoista varauksista paikat koneeseen.
	 * @param f	tiedosto, josta varaus luetaan
	 * @param a Asiakas, eli käyttäjä
	 * @param numero, ID:n numero, jota käytetään Paikka-olion luontiin
	 * @return Paikka, palauttaa Paikan 
	 * @throws Exception , jos tiedoston luku epäonnistuu
	 */
	public Paikka lueVarausTiedostosta(File f,Asiakas a, int numero) throws Exception {
		List<String> varaus = new ArrayList<>();
		varaus = Files.readAllLines(f.toPath());
		String[] solut = new String[6];
		for(String s : varaus) {
			solut = s.split(",");
		}
		
		Paikka p = new Paikka(false,numero);
		
		
		p.asetaAsiakas(a);
		a.asetaPaikka(p);
		
	
		return p;
	}
	/**
	 * Metodin avulla poistetaan aikaisempi varaus. Tämä metodi tyhjentää ohjelman mukana tulevan varaus.txt-tiedoston.
	 * @throws IOException , Jos varauksen poisto epäonnistuu
	 */
	public void poistaVaraus() throws IOException {
		f.delete();
	}

	
	/**
	 * Ylikirjoittaa toString() metodin, jolla palautetaan varaus-olion tiedot merkkijonona.
	 */
	public String toString() {
		
		return annaVarauksenID(asiakas) + "," + asiakas.annaNimi() + "," + this.paikka.annaNumero() 
		+ "," + this.lentokone.toString() + ","+ this.maa.toString();
	}
	
	

	
	
}
