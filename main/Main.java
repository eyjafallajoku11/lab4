package main;

import main.chracters.*;
import main.chracters.Character;
import main.exceptions.WrongMoodException;
import main.things.Basket;
import main.things.Chair;
import main.things.Cup;

import java.util.Random;
public class Main {
    public interface Characters_lost {
        String toString();
    }

    public interface Hole_with_sand {
        String chase(String smb);

        String show_up_from_fog();
    }

    public static void main(String[] args) throws WrongMoodException {
        Pig pig = new Pig();
        Rabbit rabbit = new Rabbit();
        Person person = new Person();
        Bear bear = new Bear();
        Kangaroo kenga = new Kangaroo();
        Tiger tiger = new Tiger();
        Chair chair1 = new Chair();
        Chair chair2 = new Chair();
        Chair chair3 = new Chair();

        Cup cup = new Cup();
        kenga.poor_tea(tiger, cup);
        kenga.baby.set_mood("гордый");
        kenga.baby.say_something("А я уже принял");
        kenga.baby.set_mood("нейтральный");
        tiger.drink(cup);
        tiger.say_something("И я тоже");
        tiger.push(kenga.baby);
        kenga.baby.push(tiger);
        tiger.roll_over_chair(chair1, false);
        tiger.roll_over_chair(chair2, false);
        kenga.baby.roll_over_chair(chair3, true);
        tiger.go_somewhere("к Шести Соснам");
        kenga.baby.go_somewhere("к Шести Соснам");
        tiger.throw_cone(kenga.baby);
        kenga.baby.throw_cone(tiger);
        Basket basket = new Basket(tiger);
        tiger.forget(basket, "под деревом в лесу");
        tiger.go_somewhere("домой обедать");
        kenga.baby.go_somewhere("домой обедать");
        person.look_in("в дверь");
        rabbit.say_something("что произошло", speachenum.EXPLAIN, false);
        kenga.baby.say_something("про свой бисквитный Кашель", speachenum.EXPLAIN, false);
        kenga.say_something("их не говорить одновременно", speachenum.PERSUADE, false);
        Characters_lost characters_lost = new Characters_lost() {
            final Character[] lost = {bear, pig, rabbit};
            @Override
            public String toString() {
                StringBuilder string = new StringBuilder();
                for (Character i : lost) string.append(i.getName()).append(' ');
                return string.append("потерялись в лесной чаще").toString();
            }
        };
        person.understand(characters_lost.toString());
        bear.rest("в яме с песком");
        pig.rest("в яме с песком");
        rabbit.rest("в яме с песком");
        bear.get_annoyed_by("это яма");
        Hole_with_sand hole = new Hole_with_sand() {
            @Override
            public String chase(String smb) {
                return "яма бегает за " + smb;
            }

            @Override
            public String show_up_from_fog() {
                return "яма появлялась из тумана";
            }
        };

        bear.suspect(hole.chase("ними"));
        rabbit.say_something_when("Теперь я знаю где мы!", hole.show_up_from_fog());
        bear.say_something("Я тоже");
        pig.say_something("");
        pig.try_to_come_up_with_smth("что бы ему сказать");
        pig.have_ideas("кричать \"Помогите, спасите!\"");
        bear.say_something("");
        pig.say_something("");
        rabbit.say_something("");
        rabbit.snort(pig, "показать какой тот глупый");
        rabbit.go_somewhere("в туман");
        rabbit.go_somewhere("обратно");
        Random random = new Random();
        bear.wait_for_smn(rabbit, random.nextInt()*-1000+10);
        pig.wait_for_smn(rabbit, 20);
        bear.get_up();
        bear.go_somewhere("");
        pig.go_somewhere("");
        pig.say_something("");
        pig.squeak();
        pig.recognise(" где, они находится");
        pig.say_something("О-о");
        pig.set_mood("уверенный");
        Character.Somebody.call_out();
        person.appear();
        tiger.set_mood("громкий");
        tiger.roar();
        tiger.run_around("по лесу");
        tiger.set_mood("horny");
    }
}
