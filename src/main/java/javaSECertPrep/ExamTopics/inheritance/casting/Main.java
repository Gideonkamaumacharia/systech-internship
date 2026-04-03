package javaSECertPrep.ExamTopics.inheritance.casting;

public class Main {
    static void main() {
        A b1 = new A();
        A b2 = new C();
        A b3 = (B) b2;
        b1 = (A) b2;
        b1.test();
        b3.test();
    }
}
