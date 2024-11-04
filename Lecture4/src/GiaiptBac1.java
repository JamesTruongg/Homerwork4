import java.util.Scanner;

public class GiaiptBac1 {
    public static void main(String[] args) {
        int x,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao he so a: ");
        a = sc.nextInt();
        System.out.print("Nhap vao he so b: ");
        b = sc.nextInt();
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem!");
            }
            else {
                System.out.println("Phương trinh vo nghiem!");
            }
        }
        else{
            x = -b / a;
            System.out.println("Nghiem cua phuong trinh "+ a + "x + " + b + " = 0 la: " + "x = " + x);
    }


    }
}
