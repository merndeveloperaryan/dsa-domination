import java.util.Scanner;

public class AreaParameterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        
        System.out.println(length * width);
        System.out.println(2 * (length + width));


        sc.close();
    }
}
