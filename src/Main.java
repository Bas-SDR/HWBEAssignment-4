import pokemon.*;

public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon(5, 20, 10, "Charmander", 150, 4);
        WaterPokemon squirtle = new WaterPokemon(22, 55, 83, "Squirtle", true, 22);

        System.out.println("-----------------------------");
        System.out.println("Your first choice is: " + charmander.getName());
        charmander.statsOfPokemon();
        charmander.burn();
        charmander.additionalEffect();
        charmander.attackerOrDefender();

        System.out.println("-----------------------------");
        System.out.println("Your second choice is: " + squirtle.getName());
        squirtle.statsOfPokemon();
        squirtle.whereToFind();
        squirtle.additionalEffect();
        squirtle.attackerOrDefender();
    }
}