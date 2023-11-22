public class SwapVariables {
    public static void main(String[] args) {
        int A = 20;
        int B = 31;
        System.out.println("Sebelum dipindahkan: ");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        int temp = A;
        A = B;
        B = temp;
        System.out.println("Setelah dipindahkan: ");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
