package main.chracters;

import main.things.Basket;
import main.things.Cup;

import static java.lang.System.out;

public class Tiger extends Character implements throw_cone{
    public Tiger() {
        super("Тигра", "male");
    }

    public void drink(Cup cup) {
        out.print(this.getName());
        out.print(" выпил");
        if (!this.Is_Male()) out.println("а");
        out.print(" ");
        out.println(cup.getStatus());

    }

    public void forget(Basket basket,String where) {
        basket.forget(where);
        out.print(this.getName());
        out.print(" забыл");
        if (!this.Is_Male()) out.print("а");
        out.print(" корзинку ");
        out.println(where);
    }
    @Override
    public void throw_cone(Character in_whom) {
        out.print(this.getName());
        out.print(" кинул");
        if (!this.Is_Male()) {
            out.print("а");
        }
        out.print(" шишку в ");
        out.println(in_whom.getName());
    }

    public void run_around(String where) {
        out.print(this.getName());
        out.print(" носил");
        if (this.Is_Male()) {
            out.print("ся ");
        }
        else {out.print("ась ");}
        out.println(where);

    }

    public void roar() {
        out.print(this.getName());
        out.print(" ");
        out.print(this.MOOD.toString());
        out.print("рычал");
        if (!this.Is_Male()) {
            out.print("а");
        }
        out.println();
    }
}
