package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		PrintWriter skriver = null;
		String melding = "Tabellen er lagret";
		
		try {
		File bloggfil = new File("blogg.dat");
		skriver = new PrintWriter(bloggfil);
		skriver.println(samling.toString());
		}
		
		catch (FileNotFoundException e) {
			melding = "Filen finnes ikke";
			return false;
		}
		
		finally {
		if (skriver != null)
			skriver.close();
			System.out.println(melding);
		}
		
		return true;
	}
}
