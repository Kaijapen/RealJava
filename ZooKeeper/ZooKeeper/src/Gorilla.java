public class Gorilla extends Mammal{
    
    public Gorilla() {
        super();
    }

    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public void throwBanana() {
        System.out.println("*throws banana*");
        energyLevel -= 5;
    }

    public void eatBananas(){
        System.out.println("*eats banana*");
        energyLevel += 10;
    }

    public void climb(){
        System.out.println("*climb*");
        energyLevel -= 10;
    }


}
