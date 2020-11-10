public class HumanTest {
    public static void main(String[] args){
        Human h = new Human();

        h.setStrength(10);
        h.attack(h);

            //instance of each class
        Wizard w = new Wizard();
        Ninja n = new Ninja();
        Samurai s = new Samurai();
            
            //test wizard settings
        System.out.println("Wizard Intelligence: " + w.getIntelligence());
        System.out.println("Wizard Strength: " + w.getStrength());
        System.out.println("Wizard Stealth: " + w.getStealth());
        System.out.println("Wizard Health: " + w.getHealth());
        System.out.println("\n");

        w.heal(n);
        System.out.println(n + " health is now: " + n.health);
        System.out.println("\n");

        w.fireball(s);

        // steal health
        n.steal(s);
        System.out.println(n + " stole " + s.stealth + " from " + s);
        System.out.println("Ninja stealth is now: " + n.stealth);
        System.out.println(s + " stealth is now: " + s.stealth);
        System.out.println("\n");



        n.runAway(w);

        s.deathBlow(w);
        System.out.println("Samurai health is now: " + s.health);
        w.getHealth();
        
        s.meditate();
        // s.howMany();
    }
}
