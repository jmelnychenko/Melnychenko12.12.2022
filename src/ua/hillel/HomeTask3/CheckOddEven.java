package ua.hillel.HomeTask3;

public class CheckOddEven {


    public static Boolean checkOddEven(int number){

        return (number % 2 == 0);
    }
    public static void main(String[] args){

        if (CheckOddEven.checkOddEven(89)) {
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE");

    }

}