/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lorel
 */
class Employee {
    
    private int empno;
    private String name;
    private double salary;
    
    public int getempno()
    {
        return empno;
    }
    
    public String getname()
    {
        return name;
    }
    
    public double getsalary()
    {
        return salary;
    }
    
    public void setempno(int a)
    {
        empno=a;
    }
    
    public void setname(String b)
    {
        name=b;
        
    }
    
    public void setsalary(double c)
    {
        this.salary=c;
    }
}

class Ocupation {
    
    private String ocup;
    private String dept;
    
    public String getocup()
    {
        return ocup;
    }
    
    public String getdept()
    {
        return dept;
    }
    
    public void setocup(String b)
    {
        ocup=b;
        
    }
    
    public void setdept(String c)
    {
        dept=c;
    }
    
} 

public class Encapsulation {
    public static void main (String args[])
    {
        Employee empl = new Employee();
        empl.setempno(52145);
        empl.setname("Jhon");
        empl.setsalary(100000);
        System.out.println("Employee No:"+empl.getempno()
    +"\tEmployee Name:"+empl.getname()+"\tEmployee salary:"+empl.getsalary());
        Employee emp2 = new Employee();
        emp2.setempno(65214);
        emp2.setname("David");
        emp2.setsalary(25000);
        System.out.println("Employee No:"+emp2.getempno()
    +"\tEmployee Name:"+emp2.getname()+"\tEmployee salary:"+emp2.getsalary());          
        Ocupation emp3 = new Ocupation();
        emp3.setocup("Doctor");
        emp3.setdept("Urgencies");
        System.out.println("Ocupation:"+emp3.getocup() +"\tDepartment:"+emp3.getdept());   
    }
}

