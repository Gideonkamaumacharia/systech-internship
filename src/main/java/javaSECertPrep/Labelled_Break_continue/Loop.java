package javaSECertPrep.Labelled_Break_continue;

import static java.lang.Boolean.FALSE;

public class Loop {
    public boolean bool= FALSE;

    static class TestClass{
        public static void main(String[] args){
            try{
                System.exit(0);
            }
            finally{
                System.out.println("finally is always executed!");
            }
            TestClass testClass = new TestClass();
            System.out.println(testClass);
        }
    }

    static void main() {
        OUTER_LOOP:
        for(int i = 1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(i*j == 1){
                   // System.out.println("Inner loop stopped");
                    continue OUTER_LOOP;//Inner loop stopped
                                        //Outer loop is still running
                                        //Outer loop is still running
                    //break OUTER_LOOP; prints Inner loop stopped
                }
            }
            //System.out.println("Outer loop is still running");
        }

    }
}
