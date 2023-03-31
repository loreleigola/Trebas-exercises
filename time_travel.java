/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lorel
 */
import java.util.Scanner;
class time_hr 
{
    float hr;
    public void time(float a, float b)
    {
        hr = b/a;
        System.out.println("Time to travel from home to college: " + hr +"hrs");
    }

}

public class time_travel extends time_hr
{
   
    public static void main(String args[])
    {
        int a, b;
        time_travel velocity = new time_travel();
        Scanner scan = new Scanner(System.in);
        System.out.println("Velocity in meters by hr: ");
        a = scan.nextInt();
        System.out.println("Distance in meters: ");
        b = scan.nextInt();
        velocity.time(a, b);
        
    }
    
}
