package com.pluralsight;

public class Demo5
{
    public static void main(String[] args){

        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;
        System.out.println("Total due is: " + String.format("%.2f", totalDue));
        System.out.printf("Total due is: %.4f", totalDue);

        /*Type characters include:
        − d decimal integer (base 10 number)
        − x or X hexadecimal integer (base 16)
        − f floating point number
        − s string
        − c character*/

        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $%.2f", name, id, pay);
    }
}
