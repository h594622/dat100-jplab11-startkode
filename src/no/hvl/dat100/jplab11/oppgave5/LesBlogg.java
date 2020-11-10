package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	// som leser inn bloggen fra en fil på formatet som i oppgave 4 og returnerer en 
	// samling (blogg) med de Innlegg-objekt som er lest inn.
	
	public static Blogg les(String mappe, String filnavn) {

		Scanner leser = null;
		String melding = "Tabellen er lagret";
		
		try {
		File bloggfil = new File("bloggkorrect.dat");
		leser = new Scanner(bloggfil);
		
		int antInnlegg = Integer.parseInt(leser.nextLine());
		Innlegg[] bloggen = new Innlegg[antInnlegg];
		
		for (int i = 0; i < antInnlegg; i++) {
			bloggen[i] = leser.delimiter()
		}
		
		}
		
		catch (FileNotFoundException e) {
			melding = "Filen finnes ikke";

		}
		
		finally {
		if (leser != null)
			leser.close();
			System.out.println(melding);
		}
		

	}
}
