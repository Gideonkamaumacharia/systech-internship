package javaSECert;

public class HelloWorld {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        int A = 20;
        String D = "Hello";

        System.out.println(stringBuilder.equals(D)); //This prints false coz stringBuilder is a StringBuilder
        //object and we are trying to compare a StringBuilder object to a String object
        System.out.println(stringBuilder.toString().equals(D));//This prints true coz we have converted the stringBuilder
        //object to string object and now we are comparing the contents ie "Hello" vs "Hello"
    }
}
