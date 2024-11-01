import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your gender: ");
        
        char gender = sc.nextLine().charAt(0);

        if (gender == 'm') {
            System.out.println("Hello Mr.!");
        } else if (gender == 'f') {
            System.out.println("Hello Mrs.!");
        } else {
            System.out.println("Hello!");
        }





        sc.close();
    }
}
