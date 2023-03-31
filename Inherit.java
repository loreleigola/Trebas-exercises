/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vicen
 */
import java.util.Scanner;
class calculate 
{
    int z;
    public void sumnumber(int x, int y)
    {
        z = x + y;
        System.out.println("The sum of two numbers are: " + z);
    }
    public void subnumber(int x, int y)
    {
            z = x - y;
            System.out.println("The subtraction of two numbers is: " + z);
    }  
}
class calculate2 extends calculate
{
    public void divnumber(int x, int y)
    {
    z = x/y;
    System.out.println("The div of number is: " + z);
    }
}
public class Inherit extends calculate2
{
    public void multnumber(int x, int y)
    {
        z = x * y;
        System.out.println("The multiplication of two numbers is: " + z);
    }
    public static void main(String args[])
    {
        int a, b;
        Inherit myobj = new Inherit();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        a = scan.nextInt();
        System.out.println("Enter number 2: ");
        b = scan.nextInt();
        myobj.sumnumber(a, b);
        myobj.subnumber(a, b);
        myobj.multnumber(a, b);
        myobj.divnumber(a, b); 
    }
}