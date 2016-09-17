package textfile;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		long input, mode;
		String fname = ""; //Testart GIT f�r f�rsta g�ngen
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ber�kning av fakulteter: ");
		System.out.println("========================\n");
		System.out.println("Ange upp till vilket v�rde du ber�kna fakulteter: ");
		input = scanner.nextLong();
		
		System.out.println("Ange ett �nskat filnamn: ");
		fname = scanner.next(); //Detta funkar ej om inget tecken ges
		
		
		if (input < 50) {
			mode = 0;
			System.out.println("Resultat f�r Fakultet(49) och mindre skrivs ut p� console!");
		}else {
			System.out.println("Resultat f�r Fakuletet(50) och st�rre skrivs ut p� fil!");
			mode =1;
		}
		scanner.close();
		
		CalcFaculty tfile = new CalcFaculty(input, fname);
		tfile.fillBigIntList();
	}

}
