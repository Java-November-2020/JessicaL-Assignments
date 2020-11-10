public class Ninja extends Human{
    public Ninja(){
        this.stealth = 10;
    }
    
    public void steal(Human takeFrom){
        
        takeFrom.stealth -= this.stealth;
        this.stealth = this.stealth + this.stealth;

    }

    public void runAway(Human scary){
        System.out.println("Ninja health is: " + this.health);
        this.health -= 10;
        System.out.println("Ninja ran away.  Health is now: " + this.health);
    }
}
