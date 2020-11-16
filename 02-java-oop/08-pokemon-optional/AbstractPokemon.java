import java.util.ArrayList; 

public abstract class AbstractPokemon implements PokemonInterface{
        //implements Pokemon and allPokemon list
    // static ArrayList<Pokemon> arrayPokemon = new ArrayList<Pokemon>();
    // public Pokemon createPokemon(String name, int health, String type) {
    //     Pokemon newPokemon = new Pokemon(name, health, type);
    //     arrayPokemon.add(newPokemon);
    //         return newPokemon;
    //     }
    //implements pokemonInfo(Pokemon pokemon)
        // public String pokemonInfo(Pokemon pokemon) {
        //     return null;


    static ArrayList<Pokemon> arrayPokemon = new ArrayList<Pokemon>();

    Pokemon createPokemon(String name, int health, String type){
        Pokemon newPokemon = new Pokemon(nameParam, HealthParam, typeParam);
        this.arrayPokemon.add(newPokemon);
        return newPokemon;
    }        
    // String pokemonInfo(Pokemon pokemon);
    // void listPokemon();


    }

