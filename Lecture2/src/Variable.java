
public static  void main(String[] args) {
    /*
    int x = 3;
    System.out.println(x);
    System.out.println("x = " + x);
    System.out.println("2 + x = "+ x);
    double myGPA;
    myGPA = 10 + 2.25;
    System.out.println("MyGPA = "+myGPA);

     */
    int x = 1;
    int y = x++ + --x + x + x-- + x++ + --x;
    //      1      1    1   1
    System.out.println("x = " + x);
    System.out.println("y = " + y);
}

