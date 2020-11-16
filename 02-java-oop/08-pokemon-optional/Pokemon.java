public class Pokemon {
    private String name;
    private int health;
    private String type;
    private static int count;

        //constructor
    public Pokemon(String nameParam, int HealthParam, String typeParam){
        name = nameParam;
        health = HealthParam;
        type = typeParam;
    }


        //getters
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public String getType(){
        return type;
    }
    public static int getCount(){
        return count;
    }

        //setters
    public void setName(String whoAmI){
        name = whoAmI;
    }
    public void setHealth(int myHealth){
        health = myHealth;
    }
    public void setType(String whatAmI){
        type = whatAmI;
    }
    public static void setCount(int myCount){
        count = myCount;
    }

        //lower the attacked pokemon's health by 10
    void attackPokemon(Pokemon pokemon){
        pokemon.health -=10;
    }


        //implementing interface methods
        //implementing pokemonInfo from the interface
    public String pokemonInfo(Pokemon pokemon){
        // System.out.println("Name: " + pokemon.name + ", Health: " + this.health + " Type: " + this.type);
        return "Name: " + pokemon.name + ", Health: " + this.health + " Type: " + this.type;

    }
        //implementing listPokemon from the interface
    public void listPokemon(){
        this.listPokemon();
    }
        //implementing createPokemon from the interface
    public Pokemon createPokemon(String name, int health, String type){
        count++;
        return new Pokemon(name, health, type);
    }







}
