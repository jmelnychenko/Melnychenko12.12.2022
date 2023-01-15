package ua.hillel.HomeTask3;

public class CheckOddEven {

    public static void main(String[] args){

        CheckOddEven.checkOddEven(0);

    }
    public static void checkOddEven(int number) {

        if (number % 2 == 0) {
            System.out.println("Even Number");
            }else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE");
    }

}