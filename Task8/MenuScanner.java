import java.util.Scanner;

public class MenuScanner {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    for (int i = 1; i <=2; i++)
    System.out.println(i + "Number" +i);
    System.out.println("0. Quit");
    boolean quit = false;
    int menu;
    do {
        System.out.println("Add the animals and number of descendants");
        menu = in.nextInt();
        switch (menu) {
            case (1):
                System.out.println("Animals");
                break;
            case 2 :
                System.out.println("Add Number of descendants");
                break;
            default:
                System.out.println("choose from 1 to 3");
        }
    } while (!quit);
    System.out.println("Thank`s");

}
}
