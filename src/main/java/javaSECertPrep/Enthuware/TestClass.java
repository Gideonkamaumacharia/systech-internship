package javaSECertPrep.Enthuware;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Set;

public class TestClass{
    public static void main(String[] args) {
        System.out.println(getMsg((char)10));      }

    @NotNull
    public static String getMsg(char x){
        String msg = "Input value must be ";
        msg = msg.concat("smaller than X");
        msg.replace('X', x);
        String rest = " and larger than 0";
        msg.concat(rest);
        return msg;
    }
}