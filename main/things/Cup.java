package main.things;

public class Cup extends Entity{
    public Cup() {
        super("чашку", "empty");
    }
    public void fill_with(String smth){
        this.status = smth;
    }
}
