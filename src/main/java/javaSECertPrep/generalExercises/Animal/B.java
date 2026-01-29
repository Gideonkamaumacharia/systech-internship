package javaSECertPrep.generalExercises.Animal;

import org.w3c.dom.ls.LSOutput;

public class B extends A{
   public static void main (String[] args){
       B obj = new B();
      obj.printB();
   }
   public void printB(){
      // A obj = new A();
       System.out.print(super.getB());
   }
}
