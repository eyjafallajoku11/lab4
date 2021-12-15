package main.chracters;
import main.exceptions.AlreadyDeadException;

import static java.lang.System.out;

public class Bear extends Character implements have_rest, wait_for{
    public Bear() {
        super("Винни Пух", "male");
    }

    @Override
    public void rest(String where) {
        out.print(this.getName());
        out.print(" отдыхал");
        if (!this.Is_Male()) out.print("а");
        out.print(" ");
        out.println(where);
    }
    public void get_annoyed_by(String smth){
        out.print(smth);
        out.print(" надоела");
        out.print(" ");
        out.print(this.getName());
        out.println("у");
    }
    public void suspect(String smth){
        out.print(this.getName());
        out.print(" подозревал");
        if (!this.Is_Male()) out.print("а");
        out.print(", что ");
        out.println(smth);
    }
    @Override
    public void wait_for_smn(Character smn, int minutes) throws AlreadyDeadException{
        if (minutes>40) {
            throw new AlreadyDeadException();
        }
        out.print(this.getName());
        out.print(" ждал");
        if (!this.Is_Male()) out.print("а");
        out.print(" ");
        out.print(smn);
        out.print(" ");
        out.print(minutes);
        out.println(" минут");
    }

    public void get_up() {
        out.print(this.getName());
        out.print(" встал");
        if (!this.Is_Male()) out.print("а");
        out.println();

    }
}
