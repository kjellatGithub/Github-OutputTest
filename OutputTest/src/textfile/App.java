package textfile;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		long input, mode;
		String fname = ""; //Testart GIT för första gången
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Beräkning av fakulteter: ");
		System.out.println("========================\n");
		System.out.println("Ange upp till vilket värde du beräkna fakulteter: ");
		input = scanner.nextLong();
		
		System.out.println("Ange ett önskat filnamn: ");
		fname = scanner.next(); //Detta funkar ej om inget tecken ges
		
		
		if (input < 50) {
			mode = 0;
			System.out.println("Resultat för Fakultet(49) och mindre skrivs ut på console!");
		}else {
			System.out.println("Resultat för Fakuletet(50) och större skrivs ut på fil!");
			mode =1;
		}
		scanner.close();
		
		CalcFaculty tfile = new CalcFaculty(input, fname);
		tfile.fillBigIntList();
	}

}
