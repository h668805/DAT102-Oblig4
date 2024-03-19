package no.hvl.dat102.bilskilt;

import java.util.Arrays;

public class HashTabell2 {
	private String[] tabell;
	private int antall;
	private static final int STANDARD_KAPASITET = 10;

	public HashTabell2() {
		this(STANDARD_KAPASITET);
	}

	public HashTabell2(int startKapasitet) {
		tabell = new String[startKapasitet];
		antall = 0;
	}

	public String leggTil(String s) {
		int index = s.hashCode() % tabell.length;
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

	@Override
	public String toString() {
		return Arrays.toString(tabell);
	}
}