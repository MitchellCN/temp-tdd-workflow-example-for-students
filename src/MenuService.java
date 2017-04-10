import java.util.Scanner;

/**
 * Created by doug on 4/10/17.
 */
public class MenuService {

    private final Scanner scanner;

    public MenuService(Scanner scanner) {
        this.scanner = scanner;
    }

    public int showMenu() {
        System.out.println("-- Main Menu --");

        System.out.println("1) List animals");
        System.out.println("2) Create animals");
        System.out.println("3) View animal");
        System.out.println("4) Edit animal");
        System.out.println("5) Delete animal");
        System.out.println("6) Quit");

        return scanner.nextInt();
    }
}
