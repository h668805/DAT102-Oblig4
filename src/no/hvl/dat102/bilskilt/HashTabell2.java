package no.hvl.dat102.bilskilt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashTabell2 {
	private List<String>[] tabell;
	private int antall;
	private static final int STANDARD_KAPASITET = 10;

	public HashTabell2() {
		this(STANDARD_KAPASITET);
	}

	@SuppressWarnings("unchecked")
	public HashTabell2(int startKapasitet) {
		tabell = (ArrayList<String>[]) new ArrayList[startKapasitet];
		antall = 0;
	}

	public String leggTil(String s) {
		int index = s.hashCode() % tabell.length;
		if (index < 0) {
			index += tabell.length;
		}
		if (tabell[index] == null) {
			List<String> liste = new ArrayList<>();
			liste.add(s);
			tabell[index] = liste;
		} else {
			tabell[index].add(s);
		}
		antall++;
		return s;
	}

	@Override
	public String toString() {
		return Arrays.toString(tabell);
	}
}