import java.util.Scanner;

public class Main {
public static void announceDeveloperTeaTime() {
    System.out.println("Waiting for Developer Tea time");
    System.out.println("Type in A random word and press enter to start developer tea time");
    Scanner input = new Scanner(System.in);
    input.next();
    System.out.println("It's developer tea time");

}
    public static void main(String[] args) {
    System.out.println("Welcome to your new job");

    announceDeveloperTeaTime();

    System.out.println("Write code");
    System.out.println("Review code");

    announceDeveloperTeaTime();

    System.out.println("Get promoted!!");

    }

}
