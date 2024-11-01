import java.util.Scanner;

public class ValidVoterUntilEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are valid voter because you are 18+");
        } else {
            System.out.println("You are not a valid voter after " + (18 - age) + " years become a valid voter");
        }
        sc.close();
    }
}
