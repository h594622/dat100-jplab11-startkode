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
		
		File bloggfil = new File(mappe + filnavn);
		leser = new Scanner(bloggfil);
		
		int antInnlegg = Integer.parseInt(leser.nextLine());
		Innlegg[] bloggen = new Innlegg[antInnlegg];
		
		
		if (leser.nextLine() == TEKST) {
		int id = Integer.parseInt(leser.next());
		String bruker = leser.next();
		String dato = leser.next();
		int likes = Integer.parseInt(leser.next());
		String tekst = leser.next();

		{
			
		if (leser.nextLine() == BILDE) {
		int id = Integer.parseInt(leser.next());
		String bruker = leser.next();
		String dato = leser.next();
		int tekst = Integer.parseInt(leser.next());
		
				
				{
		}

		}

		
		for (int i = 0; i < antInnlegg; i++) {

		}
	
			leser.close();
	}
}
