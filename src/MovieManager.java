import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieManager {
	public static List<Movie> movies = new ArrayList<>();// her yerden ulaşılabilir olması için static tanımladık
	Scanner input = new Scanner(System.in);
	public static int id = 1; // otomatik olarak artacak

	public void addMovie(Movie movie) { // ikisi overloading yapmış oluyor
		movies.add(movie);
	}

	public void addMovie() {
		System.out.println("***Film Ekleme Menüsü***");

		System.out.println("Film Adı: ");
		String movieName = input.nextLine();

		System.out.println("Film Türü: ");
		String movieType = input.nextLine();

		System.out.println("Film Yönetmeni: ");
		String movieDirector = input.nextLine();

		System.out.println("Filmin Başrol Oyuncusu: ");
		String movieArtist = input.nextLine();

		System.out.println("Film Süresi: ");
		String time = input.nextLine();

		System.out.println("Film Açıklaması");
		String explanation = input.nextLine();

		Movie newMovie = new Movie(id++, movieName, movieDirector, movieArtist, time, movieType, explanation);
		movies.add(newMovie);
		System.out.println(movieName + " isimli film eklendi");
	}

	public void deleteMovie() {
		System.out.println("Silmek istediğiniz Film adı: ");
		String delMovie = input.nextLine();
		boolean movieFound = false;
		for (Movie delToMovie : this.movies) {
			if (delToMovie.getMovieName().equals(delMovie)) {
				movieFound = true;
				this.movies.remove(delToMovie);
				System.out.println("Film silindi!");
				id--;
				break;
			}
		}
		if (!movieFound) {
			System.out.println("Film bulunamadı.");
		}

	}

	public void searchMovie() {
		System.out.println("Aramak istediğiniz film nedir: ");
		String search = input.nextLine();
		boolean found = false;
		for (Movie movie : movies) {
			if (movie.getMovieName().equals(search)) {
				System.out.println("Aradığınız film: " + search);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Aradığınız film bulunamadı......");
		}
	}

	public void listMovies() {
		System.out.println(movies);
	}

	public void movieControl() {
		boolean exit = false;
		while (!exit) {
			System.out.println(" ");
			System.out.println("**Film Menüsü**");
			System.out.println("1. Film Ekle: ");
			System.out.println("2. Film Sil: ");
			System.out.println("3. Film Ara: ");
			System.out.println("4. Filmleri Listele: ");
			System.out.println("5. Sistemden Çıkış");
			String choose = input.nextLine();
			switch (choose) {
			case "1":
				addMovie();
				break;
			case "2":
				deleteMovie();
				break;
			case "3":
				searchMovie();
				break;
			case "4":
				listMovies();
				break;
			case "5":
				System.out.println("Sistemden Çıkış yapıldı..");
				exit = true;
				break;
			default:
				System.out.println("Hatali secim! Menüde bulunan sayılardan seçin..");
				break;
			}
		}
	}
}
