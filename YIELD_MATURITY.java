/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lorel
 */
import java.util.Scanner;
class YML 
{
    float yml;
    public void maturity(float C, float F, float P, float n)
    {
        yml = (C + ((F - P) / n)) / ((F + P) / 2);
        System.out.println("The yield to maturity is: " + yml);
    }

}

public class YIELD_MATURITY extends YML
{
   
    public static void main(String args[])
    {
        int a, b,c,d;
        YIELD_MATURITY yield = new YIELD_MATURITY();
        Scanner scan = new Scanner(System.in);
        System.out.println("Coupon/Interest Payment: ");
        a = scan.nextInt();
        System.out.println("Face value: ");
        b = scan.nextInt();
        System.out.println("Price: ");
        c = scan.nextInt();
        System.out.println("years to maturity: ");
        d = scan.nextInt();
        yield.maturity(a, b,c,d);
        
    }
    
}
