import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int n , total = 0;
        System.out.println("Nhap vao so n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("So da nhap vao la: " + n);
        while (n > 0){
            int Digit = n % 10;
            total += Digit;
            n /= 10;
        }
        System.out.println("Tong cac chu so cua n = " + total);
    }
}
