package main.chracters;

import static java.lang.System.out;

public class Person extends Character {
    public Person(){
        super("Кристофер Робин", "male");
    }
    public void look_in(String where){
        out.print(this.getName());
        out.print(" заглянул");
        if (!this.Is_Male()) out.print("а");
        out.print(" ");
        out.println(where);
    }

    public void understand(String smth) {
        out.print(this.getName());
        out.print(" понял");
        if (!this.Is_Male()) out.print("а");
        out.print(", что ");
        out.println(smth);
    }

    public void appear() {
        out.print(this.getName());
        out.print(" появил");
        if (this.Is_Male()) out.println("ся");
        else out.println("ась");
    }
}
