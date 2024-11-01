import java.util.Scanner;

public class SurfaceAreaOfSphere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        double surfaceArea = 4 * Math.PI * Math.pow(r, 2);
        System.out.println(surfaceArea);


        sc.close();
    }
}