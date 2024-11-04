public class PrimeNumbers {
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumbers primeChecker = new PrimeNumbers();
        System.out.println("Cac so nguyen to tu 1 - 100:");
        for (int i = 1; i <= 100; i++) {
            if (primeChecker.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
