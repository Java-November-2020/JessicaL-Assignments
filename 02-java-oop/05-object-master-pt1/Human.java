public class Human {
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

        //setters
    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setStealth(int stealth){
        this.stealth = stealth;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }
    public void setHealth(int health){
        this.health = health;
    }

        //getters
    public int getStrength(){
        return this.strength;
    }
    public int getStealth(){
        return this.stealth;
    }
    public int getIntelligence(){
        return this.intelligence;
    }
    public int getHealth(){
        return this.health;
    }


        //class interactions
    public void attack(Human target){
        target.health -= this.strength;
        System.out.println("New health value: " + target.health);
    }

}
