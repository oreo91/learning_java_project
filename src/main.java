import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("Pick A number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you.");
        } else {
            System.out.println("Your shoe selection will make you very hapy today");
        }
    }
}
