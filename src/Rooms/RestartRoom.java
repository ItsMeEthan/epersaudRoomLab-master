package Rooms;

import Game.Runner;
import People.Person;

public class RestartRoom extends Room {
    public RestartRoom(int x1, int y1) {
        super(x1, y1);

    }


    /**
     * Triggers the game ending conditions.
     *
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the wrong room. gotta restart!");
        x.setxLoc(0);
        x.setyLoc(0);
    }
}