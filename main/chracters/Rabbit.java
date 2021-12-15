package main.chracters;

public class Rabbit extends Character implements have_rest{
    public Rabbit() {
        super("Кролик", "male");
    }
    @Override
    public void rest(String where) {
        System.out.print(this.getName());
        System.out.print(" отдыхал");
        if (!this.Is_Male()) System.out.print("а");
        System.out.print(" ");
        System.out.println(where);
    }
    public void say_something_when(String text, String when){
        System.out.print("Когда ");
        System.out.print(when);
        System.out.print(" ");
        this.say_something(text);
    }

    public void snort(Character target, String intention) {
        System.out.print(this.getName());
        System.out.print(" фыркнул");
        if (!this.Is_Male()) System.out.print("а");
        System.out.print(" на ");
        System.out.print(target.getName());
        System.out.print(", чтобы ");
        System.out.println(intention);
    }
}
