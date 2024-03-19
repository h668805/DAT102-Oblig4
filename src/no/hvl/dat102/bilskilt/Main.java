package no.hvl.dat102.bilskilt;

public class Main {
	public static void main(String[] args) {
		HashTabell hashTabell = new HashTabell();
		HashTabell2 hashTabell2 = new HashTabell2();
		String[] tabell = { "EL65431", "TA14374", "ZX87181", "EL47007", "VV50000", "UV14544", "EL32944" };

		for (String s : tabell) {
			hashTabell.leggTil(s);
			hashTabell2.leggTil(s);
		}

		// Gjennomsnitlig antall kall av equals-metoden når vi søker etter et element i
		// tabellen vil være ca. 2, fordi den ikke er for full, og de fleste elementer
		// ligger på første plass den får tildelt av hashCode()

		// Gjennomsnitlig antall kall av equals-metoden når vi søker etter et element
		// som ikke er i tabellen, er ca. 4, fordi det er maks 7 og minst 1
		// sammenligning.
		System.out.println(hashTabell);

		// Gjennomsnitlig antall kall av equals-metoden når vi søker etter et element i
		// tabellen vil være ca. 1, fordi bare én av listene inneholder 2 elementer.

		// Gjennomsnitlig antall kall av equals-metoden når vi søker etter et element
		// som ikke er i tabellen, er ca. 1, fordi vi vet hva liste den vil ligge i, så
		// den kommer mest sannsynlig til en liste med ett element i, eller en
		// null-peker.
		System.out.println(hashTabell2);
	}
}
