import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double s = (a + b + c) / 2;

        System.out.println(Math.sqrt((s * (s - a) * (s - b) * (s - c))));
        
        sc.close();
    }
}
