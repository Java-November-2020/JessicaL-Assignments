public class Bat extends Mammal {
    public Bat(){
        super(300);
    }

    public void fly(){
        System.out.println("woosh");
        energyLevel -= 50;
    }
    public void eatHumans(){
        System.out.println("aaaaAAAaaa");
        energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("screams and flames");
        energyLevel -= 100;
    }
}
