public class sumEvent_Odd {
    public static void main(String[] args) {
        int SumOdd = 0;
        int SumEven = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                SumEven += i;
            }else{
                SumOdd += i;
            }
        }
        System.out.println("Tong cac so chan tu 1 den 100: " + SumEven);
        System.out.println("Tong cac so le tu 1 den 100: " + SumOdd);
    }
}
