import java.text.DecimalFormat;
import java.util.Scanner;

public class kalulators {

	public static void main(String[] args) {
		int studSk, kritSk;
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.#");
		
		do {
			System.out.println("Cik studentiem aprekinat gala vertejumu?");
			while(!scan.hasNext()) {
				System.out.println("Cik studentiem aprekinat gala vertejumu?");
				scan.next();
			}
			studSk = scan.nextInt();
		} while(studSk<1);
		String[] studenti = new String[studSk];
		
		do {
			System.out.println("Kads bus kriteriju skaits?");
			while(!scan.hasNextInt()) {
				System.out.println("Kads bus kriteriju skaits?");
				scan.next();
			}
			kritSk = scan.nextInt();
		} while(kritSk<1);
		String[] kriteriji = new String[kritSk];
		int[] svars = new int[kritSk];
		int[][] vertejums = new int[studSk][kritSk];
		double[] semestrs = new double[studSk];
		
		scan.nextLine();
		for(int i=0; i<studenti.length; i++) {
			do {
				System.out.println("Ievadi "+(i+1)+". studenta vardu");
				studenti[i] = scan.nextLine().trim();
			}while(!studenti[i].matches("^[\\p{L} ]+$"));
			
		}
		// Perakstit masivu
		// vel komentars
		
	
	for(int i=0; i<kriteriji.length; i++) {
		do {
			System.out.println("Ievadi "+(i+1)+". kriteriju");
			kriteriji[i] = scan.nextLine().trim();
		}while(!kriteriji[i].matches("^[\\p{L} ]+$"));
		
		System.out.println("Ievadi "+(i+1)+". kriterija svaru");
		while(!scan.hasNextInt()) {
			System.out.println("Ievadi "+(i+1)+". kriterija svaru");
			scan.next();
		}
		svars[i] = scan.nextInt();
		
	}
}
}
