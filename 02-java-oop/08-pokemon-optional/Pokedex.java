public class Pokedex extends AbstractPokemon{
        //attribute for myPokemon to store all pokemon created
    public void pokemonInfo(Pokemon pokemon){
        System.out.println("Name: " + pokemon.getName());
        System.out.println("Type: " + pokemon.getType());
        System.out.println("Health: " + pokemon.getHealth());
    }

        //implements listPokemon()
    public void listPokemon(){
        for(int i = 0; i <pokemon.size(); i++){
            System.out.println(AbstractPokemon.allPokemon.get(i).getName());
        }
    }
}
