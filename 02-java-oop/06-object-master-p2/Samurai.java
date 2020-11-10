public class Samurai extends Human{
    public Samurai(){
        this.health = 200;
    }
    
    public void deathBlow(Human dying){
        dying.health = 0;
        this.health = this.health / 2;
    }

    public void meditate(){
        this.health = (int)(this.health * 1.5);
    }

    // public void howMany(){

    // }
}
