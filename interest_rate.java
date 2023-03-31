/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lorel
 */
import java.util.Scanner;
class simple 
{
    float simple_rate;
    public void s_rate(float x, float y, float z)
    {
        simple_rate = (x*y*z)/100;
        System.out.println("The siemple rate is: " + simple_rate);
    }

}

class compound extends simple
{
    float compound_rate;
    public void c_rate(float x, float y, float z)
    {
        compound_rate = (float) (x * Math.pow(1 + (y/100), z) - x);
        System.out.println("The compound rate is: " + compound_rate);
    }

}

public class interest_rate extends compound 
{
   
    public static void main(String args[])
    {
        float a, b, c;
        interest_rate simple_interest = new interest_rate();
        interest_rate compound_interest = new interest_rate();
        Scanner scan = new Scanner(System.in);
        System.out.println("Total amount: ");
        a = scan.nextInt();
        System.out.println("Anual Interest Rate: ");
        b = scan.nextInt();
        System.out.println("Time in years: ");
        c = scan.nextInt();
        
        simple_interest.s_rate(a, b,c);
        compound_interest.c_rate(a, b,c);
        
    }
    
}