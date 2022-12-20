package ua.hillel.HomeTask2;

public class MyApp {
    /* HomeTask #1.
    Converting Celsius to Fahrenheit and Kelvin
    Formula F = C * 1.8000+ 32.00
    Formula K = C + 273.16
    */
    double calcium = 10;
    double kelvin = calcium + 273.16;
    double fahrenheit = calcium * 1.80 + 32.00;
    /* HomeTask #2.
    Counting Square for the right triangle by formula:
    Square = (a * b) / 2
    */
    double cathetus1 = 10;
    double cathetus2 = 3;
    double square = (cathetus1 * cathetus2) / 2;
    /* HomeTask #3.
    Counting Volume for the parallelepiped by formula:
    V = a * b * h
     */
    int a = 5;
    int b = 5;
    int h = 5;
    int volume = a * b * h;
    int length = a + b + h;

    public static void main(String[] args) {
        MyApp Task = new MyApp();
        System.out.println(Task.calcium + " C; " + Task.fahrenheit + " F; " + Task.kelvin + " K;");
        System.out.println(Task.square);
        System.out.println("Об'єм паралелепіпеда = " + Task.volume);
        System.out.println(Task.length);
    }
}