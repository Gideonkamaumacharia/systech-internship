package javaSECertPrep.ExamTopics.inheritance.base;

public class Main {
    static void main() {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
    }
}
//Polymorphy: the most specific available overridden method for
// the object type is used => take from the bottom (lowest Child) DerivedB DerivedB