package sk.itsovy.jackanin.exception;

public class QueueUnderflowException extends Exception{
    public QueueUnderflowException(String message){
        super(message);
    }
}
