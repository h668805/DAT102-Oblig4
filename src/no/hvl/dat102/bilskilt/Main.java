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

		// C)Gjennomsnitlig antall kall av equals-metoden når vi søker etter et element i
		// tabellen vil være ca. 2, fordi den ikke er for full, og de fleste elementer
		// ligger på første plass den får tildelt av hashCode()

		// d)Gjennomsnitlig antall kall av equals-metoden når vi søker etter et element
		// som ikke er i tabellen, er ca. 4, fordi det er maks 7 og minst 1
		// sammenligning.
		
		//e) Loadfactoren er 0.7 siden det er plass til 10 elementer i tabellen og det er 7 elementer som er lagt til.
		System.out.println(hashTabell);

		// c)Gjennomsnitlig antall kall av equals-metoden når vi søker etter et element i
		// tabellen vil være ca. 1, fordi bare én av listene inneholder 2 elementer.

		// d)Gjennomsnitlig antall kall av equals-metoden når vi søker etter et element
		// som ikke er i tabellen, er ca. 1, fordi vi vet hva liste den vil ligge i, så
		// den kommer mest sannsynlig til en liste med ett element i, eller en
		// null-peker.
		
		//e) Loadfactoren er 0.6 det er 4 ledige plasser og 10 er totalkapatsitet.
		System.out.println(hashTabell2);
	}
	
}
