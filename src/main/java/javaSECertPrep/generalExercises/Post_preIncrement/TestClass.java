package javaSECertPrep.generalExercises.Post_preIncrement;

public class TestClass{
    public static void main(String args[ ] ){
        int i = 0 ;
        boolean bool1 = true ;
        boolean bool2 = false;
        boolean bool  = false;
        bool = ( bool2 &  method1(++i) ); //1
        System.out.println(i);
        bool = ( bool2 && method1(i++) ); //2
        System.out.println(i);
        bool = ( bool2 |  method1(--i) ); //3
        System.out.println(i);
        bool = ( method1(i++) || bool1); //4
        System.out.println(i);
        System.out.println(bool);
    }
    public static boolean method1(int i){
        return i>0 ? true : false;
    }
}
