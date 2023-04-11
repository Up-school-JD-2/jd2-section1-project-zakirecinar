import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {

	public static List<User> users = new ArrayList<>();

	Scanner input = new Scanner(System.in);
	public static int id = 1;

	public void addUser(User user) {
		users.add(user);
	}

	public void addUser() {
		System.out.println("***Yeni Kullanıcı Kaydı***");

		System.out.println("Kullanıcı Adı: ");
		String userName = input.nextLine();

		System.out.println("Parola: ");
		String password = input.nextLine();

		System.out.println("email");
		String email = input.nextLine();

		User newUser = new User(id++, userName, password, email);
		users.add(newUser);
		System.out.println(userName + " isimli kullanıcı eklendi");
	}

	public void listUsers() {
		System.out.println(users);
	}

	public void deleteUser() {
		System.out.println("Silmek istediğiniz Kullanıcı adı: ");
		String delUser = input.nextLine();
		boolean userFound = false;
		for (User delToUser : this.users) {
			if (delToUser.getUserName().equals(delUser)) {
				userFound = true;
				this.users.remove(delToUser);
				System.out.println("Kullanıcı silindi!");
				id--;
				break;
			}
		}
		if (!userFound) {
			System.out.println("Kullanıcı bulunamadı.");
		}

	}

	public void searchUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Aramak istediğiniz kullanıcı: ");
		String search = input.nextLine();
		boolean found = false;
		for (User user : users) {
			if (user.getUserName().equals(search)) {
				System.out.println(search + " Adlı Kullanıcı Bulundu.");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Kullanıcı bulunamadı......");
		}
	}

	public void userControl() {
		boolean exit = false;
		while (!exit) {
			System.out.println(" ");
			System.out.println("**Kullanıcı Menüsü**");
			System.out.println("1. Kullanıcı girişi: ");
			System.out.println("2. Kullanıcı çıkışı: ");
			System.out.println("3. Kullanıcı Hesabı Oluşturunuz: ");
			System.out.println("4. Kullanıcı Hesabı Siliniz: ");
			System.out.println("5. Kullanıcı Hesabı Arayınız: ");
			System.out.println("6. Kullanıcıları Listele: ");
			String choose = input.nextLine();
			switch (choose) {
			case "1":
				System.out.println("***GİRİŞ EKRANI***:");
				System.out.println("Kullanıcı adı: ");
				String userName = input.nextLine();
				System.out.println("Parola: ");
				input.nextLine();

				for (User user : users) {
					if (user.getUserName().equals(userName)) {
						System.out.println("Kullanıcı girişi başarılı...\n Hoşgeldiniz.." + user.getUserName());

					} else {
						System.out.println("Kullanıcı Adı veya Parola Hatalı.");
					}
				}

				break;
			case "2":
				System.out.println("Sistemden Çıkış yapıldı..");
				exit = true;
				break;
			case "3":
				addUser();
				break;
			case "4":
				deleteUser();
				break;
			case "5":
				searchUser();
				break;
			case "6":
				listUsers();
				break;
			default:
				System.out.println("Hatali secim! Menüde bulunan sayılardan seçin..");
				break;
			}
		}
	}

}
