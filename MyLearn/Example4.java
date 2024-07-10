/*
    File : Example4
    Description : Print I am 30 years old and 5.8 feet tall.
    Programmer : Kasidet S.
    Date : 04 Sep 2023
 */

public class Example4 
{
    public static void main(String[] args)
    {
    int age = 30;
    double height = 5.8; 
    String message= String.format ("I am %d years old and %.2f feet tall." ,age,height);
    System.out.println(message);
    }
}
