import java.util.Scanner;

public class CircumferenceAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println(circumference);
        System.out.println(area);



        sc.close();
    }
}
