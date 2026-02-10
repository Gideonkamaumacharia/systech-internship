package javaSECertPrep.Gratis.Inheritance;

public class A {
    public A(){
        System.out.println("A");
    }
}
/**
 * When you create an object of a subclass, Java ALWAYS calls the constructor of its parent first.
 *
 * Even if you don’t write it.
 *
 * Java secretly inserts super() as the first line of every constructor
 *
 * **/
class B extends A{
    public B(){
        System.out.println("B");
    }
}
class C extends B{
    public C(){
        System.out.println("C");
    }

    static void main() {
        C c = new C();   //ABC is printed
    }
}

/**
 * Java builds objects from top (parent) to bottom (child)
 *
 * Parent constructors always run before child constructors
 *
 * super() is automatic if you don’t write it
 *
 * That’s why output is A → B → C
 *
 * **/
