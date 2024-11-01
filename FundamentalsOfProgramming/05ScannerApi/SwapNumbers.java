public class SwapNumbers {
    public static void main(String[] args) {
        int a = 12;
        int b = 45;
        
        System.out.println("Before swapping, the values of a and b are: " + a + " and " + b);

        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping, the values of a and b are: " + a + " and " + b);
    }
}
