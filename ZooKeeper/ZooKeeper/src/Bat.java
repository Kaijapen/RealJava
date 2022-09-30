public class Bat extends Mammal{

    public Bat() {
        super(300);
    }

    public Bat(int energyLevel){
        super(energyLevel);
    }

    public void fly() {
        System.out.println("*flaps wings* *WHOOOOOOOOOSH*");
        energyLevel -= 50;
    }

    public void eatHumans() {
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("*town on fire*");
        energyLevel -= 100;
    }
}
