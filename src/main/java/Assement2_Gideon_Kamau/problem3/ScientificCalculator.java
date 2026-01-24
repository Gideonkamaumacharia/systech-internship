package Assement2_Gideon_Kamau.problem3;

import java.math.BigDecimal;

public class ScientificCalculator extends Calculator{

    public static void main(String[] args) {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        scientificCalculator.add(14,65);
        scientificCalculator.add(14.0,65.9,3.7);
        scientificCalculator.add(14000L,69000900L);

        double base =10.0;
        double exponent = -2.0;
        System.out.println("++++++ Power() method ++++++");
        System.out.println("The power of "+ base +" raised to power "+ exponent + " is " +scientificCalculator.power(base,exponent));

        double input = 81.0;
        System.out.println("------ squareRoot() method ------");
        System.out.println("The squareRoot of "+ input + " is " +scientificCalculator.squareRoot(input));
    }
    //Showing the difference between overloading and overriding

    //This is overriding
    @Override
    public int add(int a, int b) {
        System.out.println("======  Overriding add() method to add integers  ======");
        System.out.println("The sum of adding integers "+ a + " and "+ b+ " is "+ super.add(a, b));
        return super.add(a, b);
    }

    //this is overloading
    public double add(double a,double b,double c){
        double sumOfDoubles = a + b + c;
        System.out.println("======  Overloading add() method to add double elements  ======");
        System.out.println("The sum of adding doubles "+ a +" ,"+b + " and "+c + " is "+sumOfDoubles);
        return sumOfDoubles;
    }

    public long add(long a,long b){
        long sumOfLongElements = a + b;
        System.out.println("======  Overloading add() method to add long elements  ======");
        System.out.println("The sum of adding long "+ a + " and "+ b+sumOfLongElements);
        return sumOfLongElements;
    }

    public double power(double base,double exponent){
        return Math.pow(base,exponent);
    }

    public double squareRoot(double num){
        return Math.sqrt(num);
    }
}
