import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String nama;
		String jenisKelamin;
		String alamat;
		int hp;

		Scanner scan = new Scanner(System.in);
		System.out.print("nama: ");
		nama = scan.nextLine();

		System.out.print("jenis Kelamin: ");
		jenisKelamin= scan.nextLine();

		System.out.print("Alamat: ");
		alamat= scan.nextLine();

		System.out.print("No HP: ");
		hp= scan.nextInt();
		Caption caption = new Caption();

		caption.tulis();

		caption.nomer();
	}
}