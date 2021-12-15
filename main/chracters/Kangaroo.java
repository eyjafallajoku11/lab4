package main.chracters;

import main.exceptions.WrongMoodException;
import main.moodenum;
import main.things.Cup;

public class Kangaroo extends Character {
    public Baby_kangoroo baby;

    public Kangaroo(String name, String gender) {
        super(name, gender);
    }

    public Kangaroo() {
        super("Кенга", "female");
        baby = new Baby_kangoroo("Ру", "male");
    }

    public Kangaroo(String name, String gender, String baby_name, String baby_gender) {
        super(name, gender);
        baby = new Baby_kangoroo(baby_name, baby_gender);
    }

    public void poor_tea(Character whom, Cup cup) {
        System.out.print(this.getName());
        System.out.print(" налил");
        if (!this.Is_Male()) {
            System.out.print("а");
        }
        System.out.print(" чашку чая ");
        System.out.println(whom.getName());
        cup.fill_with("чай");
    }

    public class Baby_kangoroo extends Character implements throw_cone {
        public Baby_kangoroo(String name, String gender) {
            super(name, gender);
        }

        @Override
        public void throw_cone(Character in_whom) {
            System.out.print(this.getName());
            System.out.print(" кинул");
            if (!this.Is_Male()) {
                System.out.print("а");
            }
            System.out.print(" шишку в ");
            System.out.println(in_whom.getName());
        }
    }
}
