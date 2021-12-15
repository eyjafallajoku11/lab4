package main.chracters;

import main.exceptions.WrongMoodException;
import main.general_interface;

public interface character_interface extends general_interface {

    boolean Is_Male();

    boolean equals(Character other);

    void set_mood(String mood) throws WrongMoodException;

}
