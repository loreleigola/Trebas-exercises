/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lorel
 */

public class Gender_Garbage {
    
    public static void main(String[]args){
    
    int porc_fem = 25;
    int porc_mal = 75;
    int total_depo = 60;
    int total_lit = 40;
    
    int Fem_no_dep =(total_depo*porc_fem)/100;
    System.out.println("Percentage of females who do not deposit: " + Fem_no_dep);
    
    int Fem_no_lit =(total_lit*porc_fem)/100;
    System.out.println("Percentage of females who do not litter: " + Fem_no_lit);
    
    int Mal_no_dep =(total_depo*porc_mal)/100;
    System.out.println("Percentage of males who do not deposit: " + Mal_no_dep);
    
    int Mal_no_lit =(total_lit*porc_mal)/100;
    System.out.println("Percentage of males who do not litter: " + Mal_no_lit);
     
    }
}



    

