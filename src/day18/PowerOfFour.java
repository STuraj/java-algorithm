package day18;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
            while (n % 4 == 0) {
                n /= 4;
            }
            return n == 1;

    }
    public static void main(String[] args) {
        PowerOfFour pf = new PowerOfFour();
        System.out.println(pf.isPowerOfFour(8));
        System.out.println(pf.isPowerOfFour(16));
    }
}
