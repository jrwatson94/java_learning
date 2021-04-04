package encapsulation;


public class Dog {
    private int energy = 10;
    private int hunger = 10;

    public static void main(String[] args) {
        new Dog();
    }

    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
}




