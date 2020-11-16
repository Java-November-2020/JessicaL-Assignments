public class PokemonTest extends Pokedex{
    public static void main(String[] args){
        Pokedex myPokedex = new Pokedex();
        Pokemon myPok1 = new Pokemon("Giraffa", 100, "electric");
        Pokemon myPok2 = new Pokemon("BadPoke", 80, "fire");
        Pokemon myPok3 = new Pokemon("Pikachu", 150, "electric");
        Pokemon myPok4 = new Pokemon("Dolphina", 170, "water");

            // attack pokemon
        myPok4.attackPokemon(myPok2);
        System.out.println(myPok2.getHealth());

            //list pokemon

    }
}
