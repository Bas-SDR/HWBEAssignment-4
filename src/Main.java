import pokemon.*;

public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon(5, 20, 10, "Charmander", 150, 4);
        WaterPokemon squirtle = new WaterPokemon(22, 55, 83, "Squirtle", true, 22);
        GrassPokemon bulbasaur = new GrassPokemon(9, 23, 23, "Bulbasaur", 12, 999);
        ElectricPokemon pikachu = new ElectricPokemon(46, 322, 223, "Raichu", 1000000, 285, true);
        FightingPokemon lucario = new FightingPokemon(100, 2000, 3000, "Lucario", 800, "Lucarionite");

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

        System.out.println("-----------------------------");
        System.out.println("Your third choice is: " + bulbasaur.getName());
        bulbasaur.statsOfPokemon();
        bulbasaur.Smell();
        bulbasaur.LeafStorm();
        bulbasaur.attackerOrDefender();

        System.out.println("-----------------------------");
        System.out.println("Your fourth choice is: " + pikachu.getName());
        pikachu.statsOfPokemon();
        pikachu.signatureMove(); //Overridden with Zmove.
        pikachu.nameZMove();
        pikachu.VoltTackle(); //Calculation added for level 50.
        pikachu.attackerOrDefender();

        System.out.println("-----------------------------");
        System.out.println("Your fifth choice is: " + lucario.getName());
        lucario.statsOfPokemon();
        lucario.signatureMove();
        System.out.println(); //To create an enter.
        lucario.megaEvolve();
        lucario.attackerOrDefender(); //Overridden with punching power
    }
}