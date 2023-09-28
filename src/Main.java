import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int age;

        System.out.println("Enter your age: ");
        if (scan.hasNextInt()) {
            age = scan.nextInt();
            if (age >= 21) {
                System.out.println("You get a wristband!!");
            } else {
                System.out.println("GO AWAY YOU CANNOT HAVE A WRIST BAND!!!!!");
            }
        } else {
            System.out.println("THAT'S NOT EVEN A NUMBER!!!!!!!!");
        }
    }
}