package main.things;

import main.chracters.Character;

public class Basket extends Entity {
    public Basket(Character whos) {
        super("корзинка", String.format("у %s", whos.getName()));
    }
    public void forget(String where){
        this.status="забыта "+where;

    }
}
