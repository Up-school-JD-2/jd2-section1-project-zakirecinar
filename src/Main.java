import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		UserManager userManager = new UserManager();
		addUser(userManager);

		MovieManager movieManager = new MovieManager();
		addMovie(movieManager);

		System.out.println("Hoş geldiniz");
		System.out.println("*************");

		System.out.println("1. Filmleri Yönetin");
		System.out.println("2. Kullanıcı Hesaplarını Yönetin");
		Scanner input = new Scanner(System.in);
		String choose = input.nextLine();
		switch (choose) {
		case "1":
			movieManager = new MovieManager();
			movieManager.listMovies();
			movieManager.movieControl();
			break;
		case "2":
			userManager = new UserManager();
			userManager.listUsers();
			userManager.userControl();
			break;
		default:
			System.out.println("Hatali secim! Menüde bulunan sayılardan seçin..");
			break;

		}

	}

	private static void addUser(UserManager userManager) {
		User user = new User(UserManager.id++, "zakirecinar", "UpSchool", "zakire.cinar@gmail.com");
		userManager.addUser(user);
	}

	private static void addMovie(MovieManager movieManager) {
		Movie movie = new Movie(MovieManager.id++, "Yeşil Yol", "Frank Darabont", "Michael Clarke Duncan", "1:56",
				"Dram",
				"Yeşil Yol, 1999 yılında çekilen ABD yapımı "
						+ "bir dram filmidir. Yönetmeni ve senaristi Frank Darabont'tur. Film, Amerikalı ünlü bilimkurgu yazarı "
						+ "Stephen King'in aynı adlı romanından uyarlanmıştır");
		movieManager.addMovie(movie);
	}

}
