/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaroop;

/**
 *
 * @author User
 */
public class studentt {
  private String name;
  private double gpa;

   studentt(){
       
   }
   
   studentt(String name){
       this.name =name;
   }
   
    studentt(String name,double gpa){
        this.name =name;
        this.gpa=gpa;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
   public String getName(){
       return name;
   }
   public void setGpa(double gpa){
       this.gpa = gpa;
   }
   
  @Override
   public String toString(){
       String s ="Nama Manusia Ini = "+this.name + "\nIPK = " +this.gpa;
       return s;
   }
}
