package main.chracters;

import main.exceptions.WrongMoodException;
import main.things.Chair;
import main.moodenum;
import main.speachenum;

import static java.lang.System.out;

public abstract class Character implements character_interface {
    final private String name;
    private final boolean male;
    public moodenum MOOD;

    public Character(String name, String gender) {
        this.name = name;
        this.male = gender.equals("male");
        this.MOOD = moodenum.NEUTRAL;
    }

    public void say_something(String text) {
        this.say_something(text, speachenum.SAY, true);
    }

    public void say_something(String text, speachenum how) {
        this.say_something(text, how, true);
    }

    public void say_something(String text, speachenum how, boolean quots) {
        out.print(this.getName());
        if (text.equals("")) {
            out.print(" молчал");
            if (this.Is_Male()) {
                out.println();
            } else {
                out.println("а");
            }
        } else {
            out.print(" ");
            out.print(this.MOOD.toString());
            out.print(how.toString());
            if (!this.Is_Male()) out.print("а");
            if (quots) {
                out.print(": \"");
                out.print(text);
                out.println("\"");
            } else {
                out.print(" ");
                out.println(text);
            }
        }
    }

    public void go_somewhere(String where) {
        class Somewhere{
            private String where;
            private Character who;
            Somewhere(String destination, Character who){
                this.where=destination;
                this.who=who;
            }
            public void getWhere() {
                out.print(this.who.getName());
                if (this.who.Is_Male()) {
                    out.print(" пошёл ");
                } else {
                    out.print(" пошла ");
                }
                out.println(where);
            }
        }
        Somewhere place=new Somewhere(where,this);
        place.getWhere();
    }

    public void push(Character whom) {
        out.print(this.getName());
        out.print(" подтолкнул");
        if (!this.Is_Male()) {
            out.print("а");
        }
        out.print(" локтём ");
        out.println(whom.getName());
    }

    public void roll_over_chair(Chair chair, boolean on_purpose) {
        out.print(this.getName());
        if (on_purpose) {
            out.print(" нарошно");
        } else {
            out.print(" случайно");
        }
        out.print(" перевернул");
        if (!this.Is_Male()) {
            out.print("а");
        }
        out.println(" стул");
        chair.roll_over();

    }

    public static class Somebody {
        public static void call_out() {
            out.println("послышался оклик");
        }
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Character other) {
        return this.getClass().equals(other.getClass())
                && this.toString().equals(other.toString())
                && this.Is_Male() == other.Is_Male();
    }

    @Override
    public boolean Is_Male() {
        return male;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void set_mood(String mood) throws WrongMoodException {
        switch (mood) {
            case "строгая":
            case "строгий":
                this.MOOD = moodenum.STRICT;
                break;
            case "отрицание":
                this.MOOD = moodenum.DENY;
                break;
            case "нейтральный":
            case "нейтральная":
                this.MOOD = moodenum.NEUTRAL;
                break;
            case "гордая":
            case "гордый":
                this.MOOD = moodenum.PROUD;
                break;
            case "уверенный":
            case "уверенная":
                this.MOOD = moodenum.CONFIDENT;
                break;
            case "громкий":
            case "громкая":
                this.MOOD = moodenum.LOUD;
                break;
            default:
                throw new WrongMoodException(mood);
        }
    }
}
