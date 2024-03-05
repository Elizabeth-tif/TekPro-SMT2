import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Musik> musikList = new ArrayList<>();
        List<Film> filmList = new ArrayList<>();

        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline after nextInt()

            switch (choice) {
                case 1:
                    addFilm(scanner, filmList);
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 2:
                    addMusik(scanner, musikList);
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 3:
                    displayFilms(filmList);
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 4:
                    displayMusiks(musikList);
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add Film");
        System.out.println("2. Add Musik");
        System.out.println("3. Display Films");
        System.out.println("4. Display Musiks");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void addFilm(Scanner scanner, List<Film> filmList) {
        System.out.println("Masukkan Jumlah film yang mau ditambah");
        int numberOfFilms = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfFilms; i++) {
            Film newFilm = new Film("Judul Film", "Publisher Film", 0);
            newFilm.addItems(scanner);
            filmList.add(newFilm);
        }
    }

    public static void addMusik(Scanner scanner, List<Musik> musikList) {
        System.out.println("Masukkan Jumlah album yang mau ditambah");
        int numberOfMusik = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfMusik; i++) {
            Musik newMusik = new Musik("Judul Musik", "Publisher Musik", 0);
            newMusik.addItems(scanner);
            musikList.add(newMusik);
        }
    }

    public static void displayFilms(List<Film> filmList) {
        for (Film film : filmList) {
            film.displayInfo();
            System.out.println();
        }
    }

    public static void displayMusiks(List<Musik> musikList) {
        for (Musik musik : musikList) {
            musik.displayInfo();
            System.out.println();
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
