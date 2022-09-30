public class Mammal {
    public int energyLevel;

    public Mammal(){
        energyLevel = 100;
    }

    public Mammal(int energyLevelP){
        energyLevel = energyLevelP;
    }

    public int displayEnergy(){
        System.out.println(energyLevel);
        return energyLevel;
    }

    
}
