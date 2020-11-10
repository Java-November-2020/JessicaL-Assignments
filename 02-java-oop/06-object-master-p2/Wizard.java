public class Wizard extends Human{
    public Wizard(){
        this.health = 50;
        this.intelligence = 8;

    }
        //heal the other human by wizard intelligence value
    public void heal(Human healThee){
        healThee.health += this.intelligence;
        
    }

        //decrease the humans health by wizard intelligence *3
    public void fireball(Human fireballYou){
        fireballYou.health -= this.intelligence * 3;
        System.out.println(fireballYou + " health is now: " + fireballYou.health);
    }
}
