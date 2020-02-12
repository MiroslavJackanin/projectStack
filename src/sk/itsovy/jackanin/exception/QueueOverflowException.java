package sk.itsovy.jackanin.exception;

public class QueueOverflowException extends Exception{
    public QueueOverflowException(String message){
        super(message);
    }
}
