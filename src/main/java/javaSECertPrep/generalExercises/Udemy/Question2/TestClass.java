package javaSECertPrep.generalExercises.Udemy.Question2;

public class TestClass implements T1,T2 {

    public void m1() {
//        System.out.println(VALUE);
    }

    static void main() {
//        System.out.println(VALUE);
    }
}
/**
* There is nothing wrong with the code
 * for the interfaces ,any method like void m1(); or field that do not have
 * a body are implicitly public even if the public keyword is omitted.
 * Ambiquity will arise if the fields are referred in ambiqous way eg
 * if we tried to print system.out.print(VALUE) causing an compile time error.
* */
