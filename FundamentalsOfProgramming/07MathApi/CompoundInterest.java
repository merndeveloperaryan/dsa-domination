import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int p = sc.nextInt(); 
        double r = sc.nextDouble(); 
        int t = sc.nextInt(); 
        int n = sc.nextInt(); 

        
        double amount = p * Math.pow(1 + (r / n), n * t);
        double compoundInterest = amount - p;

        
        System.out.printf("%.2f%n", compoundInterest);

        sc.close();
    }
}
