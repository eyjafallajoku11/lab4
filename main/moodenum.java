package main;

public enum moodenum {
    CONFIDENT("увренно "),
    DENY("отрицательно "),
    LOUD("громко "),
    NEUTRAL(""),
    PROUD("гордо "),
    STRICT("строго ");
    private String string;
    moodenum(String how) {string = how;}
    @Override
    public String toString(){return string;}

}
