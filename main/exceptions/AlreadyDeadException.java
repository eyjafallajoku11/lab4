package main.exceptions;
//unchecked exception
public class AlreadyDeadException extends RuntimeException{
    public AlreadyDeadException(){
        super("он ждал слишком долго и умер");
    }
}
