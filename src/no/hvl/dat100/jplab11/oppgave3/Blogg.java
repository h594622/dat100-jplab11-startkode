package no.hvl.dat100.jplab11.oppgave3;
import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {

		this(20);
		nesteledig = 0;

	}

	public Blogg(int lengde) {

		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;

	}

	public int getAntall() {

		return nesteledig;

	}

	public Innlegg[] getSamling() {

		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteledig; i++) {
			if (innlegg.erLik(innleggtabell[i])) {
				return i;
			}
		}
		return -1;
	}

	// En metode public boolean finnes(Innlegg innlegg) som returnerer true
	// om der finnes et innlegg i samlingen med samme id som innlegget gitt ved
	// parameteren innlegg.

	public boolean finnes(Innlegg innlegg) {

		boolean finnes = false;

		for (int i = 0; i < nesteledig; i++) {
			if (innlegg.erLik(innleggtabell[i])) {
				finnes = true;
				return finnes;
			}
		}

		return finnes;
	}

	// En metode public boolean ledigPlass() som returnerer true om der er ledig
	// plass i samlingen og false ellers.

	public boolean ledigPlass() {
		
		return nesteledig < innleggtabell.length;
	}
	
	// En metode public boolean leggTil(Innlegg innlegg) som legger innlegg inn i tabellen. 
	// Dersom der ikke finnes et innlegg i tabellen med samme id som innlegg skal metoden 
	// legge til innlegget på neste ledige plass i tabellen. Ellers skal ikke metoden legge 
	// inn innlegg i tabellen. Metoden skal returnere true om innlegget blev lagt til og 
	// false ellers.
	
	public boolean leggTil(Innlegg innlegg) {

		boolean ny = finnes(innlegg) == false;

		if (ny && nesteledig < innleggtabell.length) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}	else {
			return false;
		}
		
	}

	// 2\nTEKST\n1\nOle Olsen\n23-10-2019\n0\nen tekst\nBILDE\n2\nOline Olsen\n24-10-2019\n0\net bilde\nhttp://www.picture.com/oo.jpg\n
	
	public String toString() {
	
		String svar = getAntall() + "\n";
		for (int i = 0; i < nesteledig; i++) {
			svar += innleggtabell[i].toString();
		}
		return svar;
		
	}

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}