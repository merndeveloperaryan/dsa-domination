public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;

        System.out.println("Before swapping, a = " + a + " and b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping, a = " + a + " and b = " + b);
    }
}
