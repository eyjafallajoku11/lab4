package main.exceptions;

import java.io.IOException;

//checked exception
public class WrongMoodException extends IOException {
    public WrongMoodException(String mood){
        super("неправильное значение стостояния персонажа: \""+ mood+"\"");
    }
}
