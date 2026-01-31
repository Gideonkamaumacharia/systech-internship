package Assement3_Gideon_Kamau.Problem2.Exceptions;

public class InvalidTransactionException extends RuntimeException{
    public InvalidTransactionException(String message){
        super(message);
    }
}
