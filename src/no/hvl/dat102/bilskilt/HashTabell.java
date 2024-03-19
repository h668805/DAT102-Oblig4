package no.hvl.dat102.bilskilt;

public class HashTabell implements HashTabellADT {
	private String[] tabell;
	private int antall;
	private static final int STANDARD_KAPASITET = 10;

	public HashTabell() {
		this(STANDARD_KAPASITET);
	}

	public HashTabell(int startKapasitet) {
		tabell = new String[startKapasitet];
		antall = 0;
	}

	@Override
	public String leggTil(String s) {
		int index = s.hashCode() % tabell.length;
		while(tabell[index] != null) {
			index = (index + 1) % tabell.length;
		}
		tabell[index] = s;
		antall++;
		return s;
	}

	@Override
	public String fjern(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVerdi(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean inneholder(String s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean erTom() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getAntall() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void toem() {
		// TODO Auto-generated method stub
		
	}
}