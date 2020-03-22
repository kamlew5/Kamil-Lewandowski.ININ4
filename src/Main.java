public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Akita";

        dog.feed();
        dog.feed();
        dog.feed();

        Human me = new Human();
        me.firstName = "Kamil";
        me.lastName = "Lewandowski";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";
        me.pet.feed();

        System.out.println(dog.name);
        System.out.println(me.pet.name);

        me.pet = dog;

        System.out.println("\n---- TASK 1 ----\n");

        me.pet.feed();
        me.pet.walk();
        me.pet.feed();
        me.pet.walk();
        me.pet.feed();
        me.pet.walk();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        while (me.pet.isAlive()) {
            me.pet.walk();
        }
        me.pet.walk();
        me.pet.feed();

        me.car = new Car("Ferrari", "488 Spider", 2016, 3902, "V8");

		System.out.println("Just bought a " + me.car.make + " " + me.car.model + " form " + me.car.year + " with a " + me.car.displacement + "cc " + me.car.engine + " engine.");
    }
}
