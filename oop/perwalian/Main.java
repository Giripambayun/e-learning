import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String namaDosen;
		String matkul;

		Scanner scan = new Scanner(System.in);

		System.out.print("a. web1 ");
		System.out.print("b. algoritma ");
		System.out.print("c. kalulus (pilih mata kuliah):");
		matkul= scan.nextLine();

		System.out.print("a. handy ");
		System.out.print("b. ridwan ");
		System.out.print("c. ahmad (Pilih dosen):");
		namaDosen = scan.nextLine();

		Notif notif = new Notif();
		notif.allert();

		notif.mhs();
	}
}