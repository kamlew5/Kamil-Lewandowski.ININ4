import java.io.File;

public class Animal {
    final String species;
    private Double weight;
    public String name;
    private Boolean alive;
    File pic;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 0.1;
    public static final Double DEFAULT_LION_WEIGHT = 100.0;

    public Animal(String species) {
        this.species = species;
        switch(species) {
            case "dog": this.weight = DEFAULT_DOG_WEIGHT; break;
            case "mouse": this.weight = DEFAULT_MOUSE_WEIGHT; break;
            case "lion": this.weight = DEFAULT_LION_WEIGHT; break;
        }
        this.alive = true;
    }

    boolean isAlive() {
        if (this.weight > 0 && this.alive) {
            System.out.println("STATUS: Awesome :D");
            return true;
        }
        else {
            this.alive = false;
            System.out.println("STATUS: Dead :(");
            return false;
        }
    }

    void feed() {
        System.out.print("<feed> ");
        if (this.alive) {
            weight++;
            System.out.println("thx for food bro, my weight is now " + this.weight);
        }
        else System.out.println("Not gonna work...");
    }

    void walk() {
        System.out.print("<walk> ");
        if (this.alive) {
            weight--;
            System.out.println("been walkin, my weight is now " + this.weight);
        }
        else System.out.println("Walking Dead is so last decade...");
    }
}
