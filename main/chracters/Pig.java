package main.chracters;

import main.exceptions.AlreadyDeadException;

import static java.lang.System.out;

public class Pig extends Character implements have_rest, wait_for{
    public Pig() {
        super("Пятачок", "male");
    }
    @Override
    public void rest(String where) {
        System.out.print(this.getName());
        System.out.print(" отдыхал");
        if (!this.Is_Male()) System.out.print("а");
        System.out.print(" ");
        System.out.println(where);
    }

    public void try_to_come_up_with_smth(String smth) {
        System.out.print(this.getName());
        System.out.print(" пытал");
        if (this.Is_Male()) System.out.print("ся придумать ");
        else System.out.print("ась придумать ");
        System.out.println(smth);
    }

    public void have_ideas(String ideas) {
        System.out.print(this.getName());
        System.out.print(" придумал");
        if (!this.Is_Male()) System.out.print("а");
        System.out.print(" только ");
        System.out.println(ideas);

    }
    @Override
    public void wait_for_smn(Character smn, int minutes) throws AlreadyDeadException {
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

    public void squeak() {
        System.out.print(this.getName());
        System.out.print(" пискнул");
        if (!this.Is_Male()) System.out.print("а");
        System.out.println();
    }

    public void recognise(String smth) {
        System.out.print(this.getName());
        System.out.print(" понял ");
        System.out.print(smth);
    }
}
