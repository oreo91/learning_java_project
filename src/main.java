import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double studentGPA = 3.4;
        String studentFirstName = "Joseph";
        String studentLaststName = "Owenby";
        System.out.println(studentFirstName +" "+ studentLaststName +" "+ "has a GPA of" +" "+ studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
                System.out.println(studentFirstName +" "+ studentLaststName +" "+
                        "now has a GPA of" +" "+ studentGPA);
    }
}
