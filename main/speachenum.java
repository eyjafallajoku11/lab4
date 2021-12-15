package main;

public enum speachenum {
    ASK("сросил"), EXPLAIN("объяснял"), PERSUADE("уговаривал"), SAY("сказал"), SHOUT("крикнул");
    private String string;

    speachenum(String how) {
        string = how;
    }

    @Override
    public String toString() {
        return string;
    }
}
