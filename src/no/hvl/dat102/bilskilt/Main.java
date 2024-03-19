package no.hvl.dat102.bilskilt;

public class Main {
	public static void main(String[] args) {
		HashTabell hashTabell = new HashTabell();
		String[] tabell = {"EL65431", "TA14374", "ZX87181", "EL47007", "VV50000", "UV14544", "EL32944"};
		
		for (String s : tabell) {
			hashTabell.leggTil(s);
		}
		
		System.out.println(hashTabell);
	}
}
