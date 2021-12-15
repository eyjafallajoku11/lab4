package main.things;

import main.things.Entity;

public class Chair extends Entity {

    public Chair() {
        super("стул", "стоит");
    }

    public void roll_over(){this.status="перевёрнут";
    }
}
