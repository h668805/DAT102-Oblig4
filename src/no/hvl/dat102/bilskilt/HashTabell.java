package no.hvl.dat102.bilskilt;

import java.util.Arrays;

public class HashTabell {
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

	public String leggTil(String s) {
		int index = hashFunksjon(s) % tabell.length;
		if (index < 0) {
			index += tabell.length;
		}
		while(tabell[index] != null) {
			index = (index + 1) % tabell.length;
		}
		tabell[index] = s;
		antall++;
		return s;
	}
	
	public static int hashFunksjon(String s) {
		return Integer.parseInt(s.substring(s.length()-1));
	}

	@Override
	public String toString() {
		return Arrays.toString(tabell);
	}
}